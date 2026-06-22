// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorAccountAKRequest extends TeaModel {
    /**
     * <p>The unique ID of the AccessKey pair.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2832</p>
     */
    @NameInMap("AuthIds")
    public String authIds;

    /**
     * <p>The list of module codes associated with the AccessKey pair. Valid values:</p>
     * <ul>
     * <li><strong>HOST</strong>: host</li>
     * <li><strong>CSPM</strong>: cloud product configuration check</li>
     * <li><strong>SIEM</strong>: Cloud Threat Detection and Response (CTDR)</li>
     * <li><strong>TRIAL</strong>: log audit<blockquote>
     * <p>Call the <a href="~~GetSupportedModules~~">GetSupportedModules</a> operation to obtain the supported modules.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("AuthModules")
    public java.util.List<String> authModules;

    /**
     * <p>The account ID.</p>
     * <blockquote>
     * <p>The account ID of the connected cloud vendor. This parameter is required when the permission description includes Cloud Threat Detection and Response (CTDR).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>azure_demo_1</p>
     */
    @NameInMap("CtdrCloudUserId")
    public String ctdrCloudUserId;

    /**
     * <p>The domain of the connected account. Valid values:</p>
     * <ul>
     * <li><strong>china</strong>: China</li>
     * <li><strong>global</strong>: global</li>
     * <li><strong>europe</strong>: Huawei Cloud Europe</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when <strong>Vendor</strong> is set to <strong>HUAWEICLOUD</strong>, <strong>Azure</strong>, <strong>AWS</strong>, or <strong>VOLCENGINE</strong>, and is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The extended information.</p>
     * <blockquote>
     * <p>Used to store extended information for different vendors.
     * Google Cloud is accessed through a service account. ExtendInfo stores the JSON-formatted service key file, excluding the private_key_id and zprivate_key fields. The file contains the following fields: type, project_id, client_email, client_id, auth_uri, token_uri, auth_provider_x509_cert_url, client_x509_cert_url, and universe_domain.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;product\&quot;:\&quot;webFirewall\&quot;,\&quot;remark\&quot;:\&quot;remark\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of regions used for AccessKey information verification.</p>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The AccessKey parameter ID. Valid values:</p>
     * <ol>
     * <li>If AkType is set to primary:</li>
     * </ol>
     * <ul>
     * <li><strong>Tencent</strong>: AccessKeyId of the primary account</li>
     * <li><strong>HUAWEICLOUD</strong>: AccessKeyId of the primary account</li>
     * <li><strong>Azure</strong>: ClientId</li>
     * <li><strong>AWS</strong>: AccessKeyId of the primary account</li>
     * <li><strong>VOLCENGINE</strong>: AccessKeyId of the primary account</li>
     * </ul>
     * <ol start="2">
     * <li>If AkType is set to sub:</li>
     * </ol>
     * <ul>
     * <li><strong>Tencent</strong>: AccessKeyId of the RAM user</li>
     * <li><strong>HUAWEICLOUD</strong>: AccessKeyId of the RAM user</li>
     * <li><strong>Azure</strong>: ClientId</li>
     * <li><strong>AWS</strong>: AccessKeyId of the RAM user</li>
     * <li><strong>VOLCENGINE</strong>: AccessKeyId of the RAM user</li>
     * <li><strong>google</strong>: private_key_id</li>
     * </ul>
     * <blockquote>
     * <p>If AkType is set to <strong>primary</strong>, this value is the SecretID of the primary account on the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Access Key ID of the RAM user on the third-party cloud. For <strong>Azure</strong>, no distinction is made, and this value is the <strong>appId</strong> of the authentication information. Google Cloud is accessed through a service account. AkType is set to sub by default, and this value is the private_key_id property value from the JSON-formatted service key file.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>S3D6c4O***</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The AccessKey parameter secret.</p>
     * <blockquote>
     * <p>If AkType is set to <strong>primary</strong>, this value is the Secret Access Key of the primary account on the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Secret Access Key of the RAM user on the third-party cloud. For <strong>Azure</strong>, no distinction is made, and this value is the <strong>password</strong> of the authentication information. Google Cloud is accessed through a service account. AkType is set to sub by default, and this value is the private_key property value from the JSON-formatted service key file.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AE6SLd****</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The usage status of the AccessKey pair. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: enabled</li>
     * <li><strong>1</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The list of subscription IDs.</p>
     * <blockquote>
     * <p>This parameter is no longer valid.</p>
     * </blockquote>
     */
    @NameInMap("SubscriptionIds")
    public java.util.List<String> subscriptionIds;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>This parameter is valid only when Vendor is set to Azure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>95304a97-339b-4de5-9a7d-cdbffaf****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The name of the AccessKey account.</p>
     * <blockquote>
     * <p>Used to identify the account to which third-party host assets belong.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VendorAuthAlias")
    public String vendorAuthAlias;

    public static ModifyCloudVendorAccountAKRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudVendorAccountAKRequest self = new ModifyCloudVendorAccountAKRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudVendorAccountAKRequest setAuthIds(String authIds) {
        this.authIds = authIds;
        return this;
    }
    public String getAuthIds() {
        return this.authIds;
    }

    public ModifyCloudVendorAccountAKRequest setAuthModules(java.util.List<String> authModules) {
        this.authModules = authModules;
        return this;
    }
    public java.util.List<String> getAuthModules() {
        return this.authModules;
    }

    public ModifyCloudVendorAccountAKRequest setCtdrCloudUserId(String ctdrCloudUserId) {
        this.ctdrCloudUserId = ctdrCloudUserId;
        return this;
    }
    public String getCtdrCloudUserId() {
        return this.ctdrCloudUserId;
    }

    public ModifyCloudVendorAccountAKRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyCloudVendorAccountAKRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public ModifyCloudVendorAccountAKRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyCloudVendorAccountAKRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public ModifyCloudVendorAccountAKRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public ModifyCloudVendorAccountAKRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public ModifyCloudVendorAccountAKRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModifyCloudVendorAccountAKRequest setSubscriptionIds(java.util.List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }
    public java.util.List<String> getSubscriptionIds() {
        return this.subscriptionIds;
    }

    public ModifyCloudVendorAccountAKRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyCloudVendorAccountAKRequest setVendorAuthAlias(String vendorAuthAlias) {
        this.vendorAuthAlias = vendorAuthAlias;
        return this;
    }
    public String getVendorAuthAlias() {
        return this.vendorAuthAlias;
    }

}
