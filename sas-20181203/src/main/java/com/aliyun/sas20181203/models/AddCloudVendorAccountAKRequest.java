// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorAccountAKRequest extends TeaModel {
    /**
     * <p>The AccessKey (AK) type. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong>: Primary account.</li>
     * <li><strong>sub</strong>: Sub-account.</li>
     * <li><strong>ctdr</strong>: Agentic SOC.<blockquote>
     * <p>Warning: If the vendor is <strong>CHAITIN</strong>, <strong>FORTINET</strong>, <strong>THREATBOOK</strong>, or <strong>WIZ</strong>, set this parameter to ctdr.</warning></p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("AkType")
    public String akType;

    /**
     * <p>The list of AK-associated modules.</p>
     * <p>If AkType is set to ctdr, this parameter is required. Specify at least one module, such as SIEM, HOST, or CSPM. If this parameter is not specified, the API returns HTTP 400 with error code -101.</p>
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
     * <p>The account domain for connection. Valid values:</p>
     * <ul>
     * <li><strong>china</strong>: China</li>
     * <li><strong>global</strong>: Global</li>
     * <li><strong>europe</strong>: Huawei Cloud Europe</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when <strong>Vendor</strong> is set to <strong>HUAWEICLOUD</strong>, <strong>Azure</strong>, <strong>AWS</strong>, <strong>VOLCENGINE</strong>, <strong>KingsoftCloud</strong>, <strong>UCloud</strong>, or <strong>BaiduCloud</strong>, and is required. For KingsoftCloud and BaiduCloud, set this parameter to <strong>china</strong>. For UCloud, set this parameter to <strong>global</strong>.</p>
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
     * Google Cloud is connected through a service account. ExtendInfo stores the JSON-formatted service key file, excluding the private_key_id and private_key fields. The file contains the following fields: type, project_id, client_email, client_id, auth_uri, token_uri, auth_provider_x509_cert_url, client_x509_cert_url, and universe_domain.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;product\&quot;:\&quot;webFirewall\&quot;,\&quot;remark\&quot;:\&quot;remark\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The list of regions used for AK information verification. This parameter is valid only when Vendor is set to AWS.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The AK parameter ID. Valid values:</p>
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
     * <li><strong>Tencent</strong>: AccessKeyId of the sub-account</li>
     * <li><strong>HUAWEICLOUD</strong>: AccessKeyId of the sub-account</li>
     * <li><strong>Azure</strong>: ClientId</li>
     * <li><strong>AWS</strong>: AccessKeyId of the sub-account</li>
     * <li><strong>VOLCENGINE</strong>: AccessKeyId of the sub-account</li>
     * <li><strong>google</strong>: private_key_id</li>
     * </ul>
     * <blockquote>
     * <p>If AkType is set to <strong>primary</strong>, this value is the SecretID of the primary account on the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Access Key ID of the sub-account on the third-party cloud. For <strong>Azure</strong>, no distinction is made. This value is the <strong>appId</strong> in the authentication information. Google Cloud is connected through a service account. AkType defaults to sub, and this value is the private_key_id property value from the JSON-formatted service key file.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45GLRV4SOT0YFB****</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The AK parameter secret. Valid values:</p>
     * <ol>
     * <li>If AkType is set to primary:</li>
     * </ol>
     * <ul>
     * <li><strong>Tencent</strong>: SecretAccessKey of the primary account</li>
     * <li><strong>HUAWEICLOUD</strong>: SecretAccessKey of the primary account</li>
     * <li><strong>Azure</strong>: ClientSecret</li>
     * <li><strong>AWS</strong>: SecretAccessKey of the primary account</li>
     * </ul>
     * <ol start="2">
     * <li>If AkType is set to sub:</li>
     * </ol>
     * <ul>
     * <li><strong>Tencent</strong>: SecretAccessKey of the sub-account</li>
     * <li><strong>HUAWEICLOUD</strong>: SecretAccessKey of the sub-account</li>
     * <li><strong>Azure</strong>: ClientSecret</li>
     * <li><strong>AWS</strong>: SecretAccessKey of the sub-account</li>
     * <li><strong>google</strong>: private_key<blockquote>
     * <p>If AkType is set to <strong>primary</strong>, this value is the Secret Access Key of the primary account on the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Secret Access Key of the sub-account on the third-party cloud. For <strong>Azure</strong>, no distinction is made. This value is the <strong>password</strong> in the authentication information. Google Cloud is connected through a service account. AkType defaults to sub, and this value is the private_key property value from the JSON-formatted service key file.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE6SLd****</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The list of subscription IDs.</p>
     * <blockquote>
     * <p>This parameter is no longer valid.</p>
     * </blockquote>
     */
    @NameInMap("SubscriptionIds")
    public java.util.List<String> subscriptionIds;

    /**
     * <p>The tenant ID. This parameter is valid only when Vendor is set to Azure.</p>
     * 
     * <strong>example:</strong>
     * <p>95304a97-339b-4de5-9a7d-cdbffaf****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The cloud asset vendor. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
     * <li><strong>Azure</strong>: Azure</li>
     * <li><strong>AWS</strong>: AWS</li>
     * <li><strong>VOLCENGINE</strong>: Volcengine</li>
     * <li><strong>google</strong>: Google Cloud</li>
     * <li><strong>CHAITIN</strong>: Chaitin Technology</li>
     * <li><strong>FORTINET</strong>: Fortinet</li>
     * <li><strong>THREATBOOK</strong>: ThreatBook</li>
     * <li><strong>KingsoftCloud</strong>: Kingsoft Cloud</li>
     * <li><strong>UCloud</strong>: UCloud</li>
     * <li><strong>BaiduCloud</strong>: Baidu AI Cloud</li>
     * <li><strong>WIZ</strong>: Wiz Security</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AWS</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    /**
     * <p>The AK account name.</p>
     * <blockquote>
     * <p>Used to identify the account to which third-party host assets belong.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VendorAuthAlias")
    public String vendorAuthAlias;

    public static AddCloudVendorAccountAKRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCloudVendorAccountAKRequest self = new AddCloudVendorAccountAKRequest();
        return TeaModel.build(map, self);
    }

    public AddCloudVendorAccountAKRequest setAkType(String akType) {
        this.akType = akType;
        return this;
    }
    public String getAkType() {
        return this.akType;
    }

    public AddCloudVendorAccountAKRequest setAuthModules(java.util.List<String> authModules) {
        this.authModules = authModules;
        return this;
    }
    public java.util.List<String> getAuthModules() {
        return this.authModules;
    }

    public AddCloudVendorAccountAKRequest setCtdrCloudUserId(String ctdrCloudUserId) {
        this.ctdrCloudUserId = ctdrCloudUserId;
        return this;
    }
    public String getCtdrCloudUserId() {
        return this.ctdrCloudUserId;
    }

    public AddCloudVendorAccountAKRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddCloudVendorAccountAKRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public AddCloudVendorAccountAKRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddCloudVendorAccountAKRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public AddCloudVendorAccountAKRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public AddCloudVendorAccountAKRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public AddCloudVendorAccountAKRequest setSubscriptionIds(java.util.List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }
    public java.util.List<String> getSubscriptionIds() {
        return this.subscriptionIds;
    }

    public AddCloudVendorAccountAKRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddCloudVendorAccountAKRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public AddCloudVendorAccountAKRequest setVendorAuthAlias(String vendorAuthAlias) {
        this.vendorAuthAlias = vendorAuthAlias;
        return this;
    }
    public String getVendorAuthAlias() {
        return this.vendorAuthAlias;
    }

}
