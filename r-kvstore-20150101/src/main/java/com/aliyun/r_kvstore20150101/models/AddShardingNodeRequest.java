// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AddShardingNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **true**: enables automatic payment. Make sure that you have sufficient balance within your account.</p>
     * <p>*   **false**: disables automatic payment. In this case, you must manually renew the instance in the console before the instance expires. For more information, see [Renewal](~~26352~~).</p>
     * <br>
     * <p>> The default value is **true**.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The business information. This is an additional parameter.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The ID of the coupon.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to enable forced transmission during a configuration change. Valid values:</p>
     * <br>
     * <p>*   **false** (default): Before the configuration change, the system checks the minor version of the instance. If the minor version of the instance is outdated, an error is reported. You must update the minor version of the instance and try again.</p>
     * <p>*   **true**: The system skips the version check and directly performs the configuration change.</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>The ID of the instance.</p>
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
     * <p>The number of data shards that you want to add. Default value: **1**.</p>
     * <br>
     * <p>>  The instance can contain 2 to 256 data shards. You can add up to 64 data shards at a time. Make sure that the number of shards does not exceed this limit.</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The source of the operation. This parameter is used only for internal maintenance. You do not need to specify this parameter.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The vSwitch ID. You can specify a different vSwitch within the same virtual private cloud (VPC). In this case, the new data shards are created in the specified vSwitch. If you do not specify this parameter, the new data shards are created in the original vSwitch.</p>
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
