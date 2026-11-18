// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AddShardingNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account has sufficient balance.</li>
     * <li><strong>false</strong>: disables automatic payment. You must manually renew the instance in the console. For more information, see <a href="https://help.aliyun.com/document_detail/26352.html">Manual renewal</a>.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The additional parameter that contains business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to enable forced transition. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Before the upgrade/downgrade, the system checks the current minor engine version of the instance. If the engine version is too low, an error is reported. You must upgrade the minor engine version and retry.</li>
     * <li><strong>true</strong>: skips the check to directly execute the upgrade/downgrade operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of shards to add. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>The total number of shards in the instance must be at least 2. The maximum number of shards that can be added in a single operation is 64, and the maximum total number of shards for an instance is 256. Make sure that the number of shards does not exceed these limits.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The source of the call. This parameter is used only for internal maintenance and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The ID of a different vSwitch in the same VPC. The new data shards are created in the specified vSwitch.
     * If you do not specify this parameter, the new data shards are created in the original vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static AddShardingNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShardingNodeRequest self = new AddShardingNodeRequest();
        return TeaModel.build(map, self);
    }

    public AddShardingNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public AddShardingNodeRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public AddShardingNodeRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public AddShardingNodeRequest setForceTrans(Boolean forceTrans) {
        this.forceTrans = forceTrans;
        return this;
    }
    public Boolean getForceTrans() {
        return this.forceTrans;
    }

    public AddShardingNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddShardingNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddShardingNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddShardingNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddShardingNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddShardingNodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddShardingNodeRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public AddShardingNodeRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

    public AddShardingNodeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
