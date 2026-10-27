// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorAccountAKRequest extends TeaModel {
    /**
     * <p>The unique ID of the AccessKey (AK).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2832</p>
     */
    @NameInMap("AuthIds")
    public String authIds;

    /**
     * <p>The list of codes for the modules associated with the AK. Valid values:</p>
     * <ul>
     * <li><strong>HOST</strong>: host</li>
     * <li><strong>CSPM</strong>: cloud product configuration check</li>
     * <li><strong>SIEM</strong>: threat analysis and response</li>
     * <li><strong>TRIAL</strong>: log audit<blockquote>
     * <p>You can call the <a href="~~GetSupportedModules~~">GetSupportedModules</a> operation to obtain the supported modules.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("AuthModules")
    public java.util.List<String> authModules;

    /**
     * <p>The account ID.</p>
     * <blockquote>
     * <p>The account ID of the connected cloud vendor. This parameter is required when the permission description includes threat analysis and response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>azure_demo_1</p>
     */
    @NameInMap("CtdrCloudUserId")
    public String ctdrCloudUserId;

    /**
     * <p>The domain to which the connected account belongs. Valid values:</p>
     * <ul>
     * <li><strong>china</strong>: China</li>
     * <li><strong>global</strong>: global</li>
     * <li><strong>europe</strong>: Huawei Cloud Europe site</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when <strong>Vendor</strong> is set to <strong>HUAWEICLOUD</strong>, <strong>Azure</strong>, <strong>AWS</strong>, <strong>VOLCENGINE</strong>, <strong>KingsoftCloud</strong>, <strong>UCloud</strong>, <strong>BaiduCloud</strong>, or <strong>OracleCloud</strong>. For <strong>KingsoftCloud</strong> and <strong>BaiduCloud</strong>, this parameter is fixed to <strong>china</strong>. For <strong>OracleCloud</strong>, this parameter is fixed to <strong>global</strong>.</p>
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
     * <p>This parameter is used to record the extended information of different vendors.
     * Google Cloud is accessed through a service account. ExtendInfo stores the JSON-formatted service key file, excluding the private_key_id and zprivate_key fields. The file contains the following fields: type, project_id, client_email, client_id, auth_uri, token_uri, auth_provider_x509_cert_url, client_x509_cert_url, and universe_domain. If the vendor is <strong>OracleCloud</strong>, this parameter contains the <strong>fingerprint</strong> key, which indicates the fingerprint.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;product\&quot;:\&quot;webFirewall\&quot;,\&quot;remark\&quot;:\&quot;remark\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The language type of the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of regions used for AK information verification. This parameter is valid only when <strong>Vendor</strong> is set to <strong>AWS</strong> or <strong>OracleCloud</strong>.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The ID of the AK parameter. Valid values:</p>
     * <ul>
     * <li>If AkType is set to primary:</li>
     * <li><ul>
     * <li><strong>Tencent</strong>: the AccessKey ID of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>HUAWEICLOUD</strong>: the AccessKey ID of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>Azure</strong>: the client ID</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>AWS</strong>: the AccessKey ID of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>VOLCENGINE</strong>: the AccessKey ID of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>KingsoftCloud</strong>: the AccessKey ID of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>UCloud</strong>: the AccessKey ID of the primary account</li>
     * </ul>
     * </li>
     * <li>If AkType is set to sub:</li>
     * <li><ul>
     * <li><strong>Tencent</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>HUAWEICLOUD</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>Azure</strong>: the client ID</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>AWS</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>VOLCENGINE</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>google</strong>: the private key ID</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>OracleCloud</strong>: the Oracle Cloud Identifier (OCID) of the sub-user</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>BaiduCloud</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>KingsoftCloud</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>UCloud</strong>: the AccessKey ID of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>StateCloud</strong>: the AccessKey ID of the sub-account<blockquote>
     * <p>If AkType is set to <strong>primary</strong>, this value is the SecretID of the primary account of the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the AccessKey ID of the sub-account of the third-party cloud. For <strong>Azure</strong>, no distinction is made, and this value is the <strong>appId</strong> of the authentication information. Google Cloud is accessed through a service account. By default, AkType is set to sub, and this value is obtained from the private_key_id property of the JSON-formatted service key file. If the vendor is <strong>OracleCloud</strong>, this value is the OCID of the sub-user.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>S3D6c4O***</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The secret of the AK parameter. Valid values:</p>
     * <ul>
     * <li>If AkType is set to primary:</li>
     * <li><ul>
     * <li><strong>Tencent</strong>: the SecretAccessKey of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>Azure</strong>: the client secret</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>AWS</strong>: the SecretAccessKey of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>VOLCENGINE</strong>: the SecretAccessKey of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>KingsoftCloud</strong>: the SecretAccessKey of the primary account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>UCloud</strong>: the SecretAccessKey of the primary account</li>
     * </ul>
     * </li>
     * <li>If AkType is set to sub:</li>
     * <li><ul>
     * <li><strong>Tencent</strong>: the SecretAccessKey of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>Azure</strong>: the client secret</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>AWS</strong>: the SecretAccessKey of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>google</strong>: the private key</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>OracleCloud</strong>: the private key of the sub-user</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>BaiduCloud</strong>: the SecretAccessKey of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>KingsoftCloud</strong>: the SecretAccessKey of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>UCloud</strong>: the SecretAccessKey of the sub-account</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li><strong>StateCloud</strong>: the SecretAccessKey of the sub-account<blockquote>
     * <p>If AkType is set to <strong>primary</strong>, this value is the Secret Access Key of the primary account of the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Secret Access Key of the sub-account of the third-party cloud. For <strong>Azure</strong>, no distinction is made, and this value is the <strong>password</strong> of the authentication information. Google Cloud is accessed through a service account. By default, AkType is set to sub, and this value is obtained from the private_key property of the JSON-formatted service key file. For <strong>OracleCloud</strong>, this value is obtained from the content of the corresponding private key file.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AE6SLd****</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The usage status of the AK. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: enabled</li>
     * <li><strong>1</strong>: disabled</li>
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
     * <p><strong>[Deprecated]</strong> This parameter is no longer valid.</p>
     * </blockquote>
     */
    @NameInMap("SubscriptionIds")
    public java.util.List<String> subscriptionIds;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>This parameter is valid only when Vendor is set to <strong>Azure</strong> or <strong>OracleCloud</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>95304a97-339b-4de5-9a7d-cdbffaf****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The name of the AK account.</p>
     * <blockquote>
     * <p>This parameter is used to identify the account information to which the third-party host assets belong.</p>
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
