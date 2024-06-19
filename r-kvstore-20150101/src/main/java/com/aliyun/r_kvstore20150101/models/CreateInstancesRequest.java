// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default).</li>
     * <li><strong>false</strong>. If automatic payment is disabled, you must perform the following steps to complete the payment in the ApsaraDB for Redis console: In the top navigation bar, choose <strong>Expenses</strong> &gt; <strong>Renewal Management</strong>. In the left-side navigation pane, click <strong>Orders</strong>. On the <strong>Orders</strong> page, find the order and complete the payment.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is valid only if the value of the <strong>ChargeType</strong> field in the <strong>Instances</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only if <strong>ChargeType</strong> in the <strong>Instances</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The additional business information about the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The coupon code. Default value: <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The database engine version of the instance. Valid values: <strong>4.0</strong> and <strong>5.0</strong>.</p>
     * <blockquote>
     * <p> The default value is <strong>5.0</strong>.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>2.8</li>
     * <li>4.0</li>
     * <li>5.0</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The JSON-formatted configurations of the instance. For more information, see the &quot;Description of the Instances parameter&quot; section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{	&quot;RegionId&quot;: &quot;cn-hangzhou&quot;,	&quot;izNo&quot;: &quot;cn-hangzhou-b&quot;,	&quot;quantity&quot;: 2,	&quot;instanceType&quot;: &quot;Redis&quot;,	&quot;instanceClass&quot;: &quot;redis.master.small.default&quot;,	&quot;EngineVersion&quot;: &quot;5.0&quot;,	&quot;ChargeType&quot;: &quot;PostPaid&quot;}]</p>
     */
    @NameInMap("Instances")
    public String instances;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to restore the source instance from the recycle bin. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is valid only if the <strong>SrcDBInstanceId</strong> field in the <strong>Instances</strong> parameter is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RebuildInstance")
    public Boolean rebuildInstance;

    /**
     * <p>The ID of the resource group to which to assign the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-resourcegroupid1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("Token")
    public String token;

    public static CreateInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancesRequest self = new CreateInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstancesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateInstancesRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstancesRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateInstancesRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateInstancesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateInstancesRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

    public CreateInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstancesRequest setRebuildInstance(Boolean rebuildInstance) {
        this.rebuildInstance = rebuildInstance;
        return this;
    }
    public Boolean getRebuildInstance() {
        return this.rebuildInstance;
    }

    public CreateInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateInstancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateInstancesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
