// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:
     * \* <strong>true</strong>: Enables automatic payment. This is the default value.
     * \* <strong>false</strong>: Disables automatic payment. You must go to the console to complete the payment. In the top navigation bar, choose <strong>Expenses</strong> &gt; <strong>Renewal Management</strong>. In the navigation pane on the left, click <strong>Or*er Management</strong> &gt; <strong>My Or*ers</strong>, find the or*er, and then complete the payment.
     * \&gt; This parameter is valid only when <strong>ChargeType</strong> is set to <strong>PrePaid</strong> in <strong>Instances</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:
     * \* <strong>true</strong>: Enables auto-renewal.
     * \* <strong>false</strong>: Disables auto-renewal. This is the default value.
     * \&gt; This parameter is valid only when <strong>ChargeType</strong> is set to <strong>PrePaid</strong> in <strong>Instances</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>Additional business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The coupon code. The default value is <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The Redis-compatible engine version for the instance. Valid values: <strong>4.0</strong> and <strong>5.0</strong>. The default value is <strong>5.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The configurations of the new instances, specified in JSON format. For more information, see the details of the Instances parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,
     *     &quot;izNo&quot;: &quot;cn-hangzhou-b&quot;,
     *     &quot;quantity&quot;: 1,
     *     &quot;instanceType&quot;: &quot;Redis&quot;,
     *     &quot;instanceClass&quot;: &quot;redis.logic.sharding.1g.2db.0rodb.4proxy.default&quot;,
     *     &quot;EngineVersion&quot;: &quot;5.0&quot;, 
     *     &quot;ChargeType&quot;:&quot;PrePaid&quot;,
     *     &quot;Period&quot;:&quot;1&quot;,
     *     &quot;networkType&quot;: &quot;VPC&quot; ,
     *     &quot;vpcId&quot;: &quot;vpc-2zex6u1nu32k3ux35oxxx&quot;, 
     *     &quot;vSwitchId&quot;: &quot;vsw-2zesk464e647104kw3xxx&quot;
     * }]</p>
     */
    @NameInMap("Instances")
    public String instances;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to rebuild an instance from the recycle bin. Valid values:
     * \* <strong>true</strong>: Rebuilds the instance.
     * \* <strong>false</strong>: Does not rebuild the instance. This is the default value.
     * \&gt; This parameter is valid only when <strong>SrcDBInstanceId</strong> is specified in <strong>Instances</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RebuildInstance")
    public Boolean rebuildInstance;

    /**
     * <p>The resource group ID.</p>
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
     * <p>A client-generated token to ensure request idempotence. The value must be unique across requests, case-sensitive, and up to 64 ASCII characters long.</p>
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
