// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorAccountAKRequest extends TeaModel {
    /**
     * <p>The type of the account to which the AccessKey pair belongs. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong>: a primary account</li>
     * <li><strong>sub</strong>: a sub-account</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("AkType")
    public String akType;

    /**
     * <p>The modules that are associated with the AccessKey pair.</p>
     */
    @NameInMap("AuthModules")
    public java.util.List<String> authModules;

    /**
     * <p>The Active Directory (AD) domain. This parameter takes effect only when Vendor is set to Azure. Valid values:</p>
     * <ul>
     * <li><strong>china</strong></li>
     * <li><strong>global</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The language of the content in the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The regions that are examined during AccessKey pair authentication. This parameter takes effect only when Vendor is set to AWS.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to query regions.</p>
     * </blockquote>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The AccessKey ID. Valid values:</p>
     * <p>1\. If AkType is set to primary, specify this parameter based on the following description:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Enter the AccessKey ID of a primary account on Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey ID of a primary account on Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Enter the AccessKey ID of a primary account on Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Enter the AccessKey ID of a primary account on AWS.</li>
     * </ul>
     * <p>2\. If AkType is set to sub, specify this parameter based on the following description:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Enter the AccessKey ID of a sub-account on Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey ID of a sub-account on Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Enter the AccessKey ID of a sub-account on Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Enter the AccessKey ID of a sub-account on AWS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45GLRV4SOT0YFB****</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The AccessKey secret. Valid values:</p>
     * <p>1\. If AkType is set to primary, specify this parameter based on the following description:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Enter the AccessKey secret of a primary account on Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey secret of a primary account on Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Enter the AccessKey secret of a primary account on Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Enter the AccessKey secret of a primary account on AWS.</li>
     * </ul>
     * <p>2\. If AkType is set to sub, specify this parameter based on the following description:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Enter the AccessKey secret of a sub-account on Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey secret of a sub-account on Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Enter the AccessKey secret of a sub-account on Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Enter the AccessKey secret of a sub-account on AWS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE6SLd****</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The subscription IDs. This parameter takes effect only when Vendor is set to Azure.</p>
     */
    @NameInMap("SubscriptionIds")
    public java.util.List<String> subscriptionIds;

    /**
     * <p>The tenant ID. This parameter takes effect only when Vendor is set to Azure.</p>
     * 
     * <strong>example:</strong>
     * <p>95304a97-339b-4de5-9a7d-cdbffaf****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The cloud service provider. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
     * <li><strong>Azure</strong>: Microsoft Azure</li>
     * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AWS</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    /**
     * <p>The name of the AccessKey pair.</p>
     * <blockquote>
     * <p> The account information of the third-party cloud servers.</p>
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

    public AddCloudVendorAccountAKRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
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
