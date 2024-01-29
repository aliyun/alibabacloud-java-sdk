// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false**: disables auto-renewal. If you set this parameter to **false**, the instance must be manually renewed before it expires. For more information, see [Renew an instance](~~26352~~).</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the promotional event or business information.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The time when to change the configurations. Default value: Immediately. Valid values:</p>
     * <br>
     * <p>*   **Immediately**: The configurations are immediately changed.</p>
     * <p>*   **MaintainTime**: The configurations are changed within the maintenance window. You can call the [ModifyInstanceMaintainTime](~~61000~~) operation to change the maintenance window.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Specifies whether to enable forced transmission during a configuration change. Valid values:</p>
     * <br>
     * <p>*   **false** (default): Before the configuration change, the system checks the minor version of the instance. If the minor version of the instance is outdated, an error is reported. You must update the minor version of the instance and try again.</p>
     * <p>*   **true**: The system skips the version check and directly performs the configuration change.</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>Specifies whether to forcefully change the configurations of the instance. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **false**: The system does not forcefully change the configurations.</p>
     * <p>*   **true**: The system forcefully changes the configurations.</p>
     */
    @NameInMap("ForceUpgrade")
    public Boolean forceUpgrade;

    /**
     * <p>The new instance type. You can call the [DescribeAvailableResource](~~120580~~) operation to query the instance types available for configuration change within the zone to which the instance belongs.</p>
     * <br>
     * <p>>  For more information about the instance types, see [Overview](~~26350~~).</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The major version to which you want to upgrade. When you change the configurations of an instance, you can upgrade the major version of the instance by setting this parameter. Valid values: **4.0** and **5.0**.</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>The change type. This parameter is required when you change the configurations of a subscription instance. Default value: UPGRADE. Valid values:</p>
     * <br>
     * <p>*   **UPGRADE**: upgrades the configurations of a subscription instance.</p>
     * <p>*   **DOWNGRADE**: downgrades the configurations of a subscription instance.</p>
     * <br>
     * <p>> *   To downgrade a subscription instance, you must set this parameter to **DOWNGRADE**.</p>
     * <p>> *   If the price of an instance increases after its configurations are changed, the instance is upgraded. If the price decreases, the instance is downgraded. For example, the price of an 8 GB read/write splitting instance with five read replicas is higher than that of a 16 GB cluster instance. If you want to change a 16 GB cluster instance to an 8 GB read/write splitting instance with five read replicas, you must upgrade the instance.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes. This parameter is available only for read/write splitting instances that use cloud disks. Valid values: 1 to 5.</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of shards. This parameter is available only for cluster instances that use cloud disks.</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The source of the operation. This parameter is used only for internal maintenance. You do not need to specify this parameter.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceSpecRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceSpecRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyInstanceSpecRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyInstanceSpecRequest setForceTrans(Boolean forceTrans) {
        this.forceTrans = forceTrans;
        return this;
    }
    public Boolean getForceTrans() {
        return this.forceTrans;
    }

    public ModifyInstanceSpecRequest setForceUpgrade(Boolean forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
        return this;
    }
    public Boolean getForceUpgrade() {
        return this.forceUpgrade;
    }

    public ModifyInstanceSpecRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public ModifyInstanceSpecRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyInstanceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceSpecRequest setReadOnlyCount(Integer readOnlyCount) {
        this.readOnlyCount = readOnlyCount;
        return this;
    }
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
    }

    public ModifyInstanceSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceSpecRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyInstanceSpecRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public ModifyInstanceSpecRequest setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
        this.slaveReadOnlyCount = slaveReadOnlyCount;
        return this;
    }
    public Integer getSlaveReadOnlyCount() {
        return this.slaveReadOnlyCount;
    }

    public ModifyInstanceSpecRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

}
