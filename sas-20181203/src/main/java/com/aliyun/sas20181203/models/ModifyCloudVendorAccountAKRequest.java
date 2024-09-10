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
     * <p>The regions that are examined during AccessKey pair authentication. This parameter takes effect only when Vendor is set to AWS.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to query regions.</p>
     * </blockquote>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The AccessKey ID.</p>
     * 
     * <strong>example:</strong>
     * <p>S3D6c4O***</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The AccessKey secret. Valid values:</p>
     * <p>1\. If AkType is set to primary, specify this parameter based on the following description:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Specify the AccessKey secret of a primary account on Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Specify the AccessKey secret of a primary account on Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Specify the AccessKey secret of a primary account on Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Specifythe AccessKey secret of a primary account on Amazon Web Services (AWS).</li>
     * </ul>
     * <p>2\. If AkType is set to sub, specify this parameter based on the following description:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Specify the AccessKey secret of a sub-account on Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Specify the AccessKey secret of a sub-account on Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Specify the AccessKey secret of a sub-account on Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Specify the AccessKey secret of a sub-account on AWS.</li>
     * </ul>
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
