// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorAccountAKRequest extends TeaModel {
    /**
     * <p>The unique ID of the AccessKey pair.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to query the unique ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2832</p>
     */
    @NameInMap("AuthIds")
    public String authIds;

    /**
     * <p>The modules that are associated with the AccessKey pair. Valid values:</p>
     * <ul>
     * <li><strong>HOST</strong>: host.</li>
     * <li><strong>CSPM</strong>: configuration assessment.</li>
     * <li><strong>SIEM</strong>: Cloud Threat Detection and Response (CTDR).</li>
     * <li><strong>TRIAL</strong>: log audit.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~GetSupportedModules~~">GetSupportedModules</a> operation to query the supported modules.</p>
     * </blockquote>
     */
    @NameInMap("AuthModules")
    public java.util.List<String> authModules;

    /**
     * <p>The Active Directory (AD) domain. Valid values:</p>
     * <ul>
     * <li><strong>china</strong></li>
     * <li><strong>global</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when Vendor is set to Azure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The regions that are examined during AccessKey pair authentication.</p>
     * <blockquote>
     * <p> This parameter takes effect only when Vendor is set to AWS. You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to query regions.</p>
     * </blockquote>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The AccessKey ID.</p>
     * <blockquote>
     * <p> If AkType is set to <strong>primary</strong>, you must set SecretId to the AccessKey ID of the third-party master account. If AkType is set to <strong>sub</strong>, you must set SecretId to the AccessKey ID of the third-party sub-account. This parameter value does not change for a <strong>Microsoft Azure account</strong>. For an Azure account, set this parameter to the <strong>app ID</strong> that is used for authentication.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>S3D6c4O***</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The AccessKey secret.</p>
     * <blockquote>
     * <p> If AkType is set to <strong>primary</strong>, you must set SecretKey to the AccessKey secret of the third-party master account. If AkType is set to <strong>sub</strong>, you must set SecretKey to the AccessKey secret of the third-party sub-account. This parameter value does not change for a <strong>Microsoft Azure account</strong>. For an Azure account, set this parameter to the <strong>password</strong> that is used for authentication.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AE6SLd****</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The status of the AccessKey pair. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: enabled.</li>
     * <li><strong>1</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The IDs of subscriptions.</p>
     * <blockquote>
     * <p> This parameter takes effect only when Vendor is set to Azure.</p>
     * </blockquote>
     */
    @NameInMap("SubscriptionIds")
    public java.util.List<String> subscriptionIds;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p> This parameter takes effect only when Vendor is set to Azure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>95304a97-339b-4de5-9a7d-cdbffaf****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

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

    public ModifyCloudVendorAccountAKRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
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

}
