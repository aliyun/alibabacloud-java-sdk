// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables automatic payment.</li>
     * <li><strong>false</strong>: disables automatic payment. If you set this parameter to <strong>false</strong>, the instance must be manually renewed before it expires. For more information, see <a href="https://help.aliyun.com/document_detail/26352.html">Renew an instance</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the promotional event or the business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000001</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The coupon code. Default value: <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The time when you want the configurations to be changed. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong> (default): immediately changes the configurations.</li>
     * <li><strong>MaintainTime</strong>: changes the configurations within the maintenance window. You can call the <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> operation to change the maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Specifies whether to enable forced transmission during a configuration change. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Before the configuration change, the system checks the minor version of the instance. If the minor version of the instance is outdated, an error is reported. You must update the minor version of the instance and try again.</li>
     * <li><strong>true</strong>: The system skips the version check and directly performs the configuration change.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>Specifies whether to forcibly change the configurations. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: The system does not forcefully change the configurations.</li>
     * <li><strong>true</strong> (default): The system forcefully changes the configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceUpgrade")
    public Boolean forceUpgrade;

    /**
     * <p>The new instance type. You can call the <a href="https://help.aliyun.com/document_detail/473765.html">DescribeAvailableResource</a> operation to query the instance types available for configuration change within the zone to which the instance belongs.</p>
     * <blockquote>
     * <p> For more information about the instance types, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The major version of the classic instance that you want to upgrade. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
     * <blockquote>
     * <p> The <strong>InstanceClass</strong> parameter is required when you upgrade the instance version. This parameter indicates that you can upgrade the instance version only when you update the instance specifications. If you only need to upgrade the instance version, call the <a href="https://help.aliyun.com/document_detail/473776.html">ModifyInstanceMajorVersion</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li><strong>MASTER_SLAVE</strong>: high availability (master-replica)</li>
     * <li><strong>STAND_ALONE</strong>: standalone</li>
     * <li><strong>double</strong>: master-replica</li>
     * <li><strong>single</strong>: standalone</li>
     * </ul>
     * <blockquote>
     * <p> To create a cloud-native instance, set this parameter to <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. To create a classic instance, set this parameter to <strong>double</strong> or <strong>single</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The change type. This parameter is required when you change the configurations of a subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>UPGRADE</strong> (default): upgrades the configurations of the subscription instance.</li>
     * <li><strong>DOWNGRADE</strong>: downgrades the configurations of the subscription instance.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>To downgrade a subscription instance, you must set this parameter to <strong>DOWNGRADE</strong>.</p>
     * </li>
     * <li><p>If the price of an instance increases after its configurations are changed, the instance is upgraded. If the price decreases, the instance is downgraded. For example, the price of an 8 GB read/write splitting instance with five read replicas is higher than that of a 16 GB cluster instance. If you want to change a 16 GB cluster instance to an 8 GB read/write splitting instance with five read replicas, you must upgrade the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DOWNGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read replicas in the primary zone. Valid values: 0 to 5. This parameter applies only to the following scenarios:</p>
     * <ul>
     * <li>If the instance is a cloud-native standard instance, you can set this parameter to a value greater than 0 to enable the read/write splitting architecture.</li>
     * <li>If the instance is a cloud-native read/write splitting instance, you can use this parameter to customize the number of read replicas. You can also set this parameter to 0 to disable the read/write splitting architecture and switch the instance to the standard architecture.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of replica nodes in the primary zone. This parameter is applicable only to cloud-native multi-replica cluster instances. Valid values: 1 to 4.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The sum of the values of this parameter and the SlaveReplicaCount parameter cannot be greater than 4.</p>
     * </li>
     * <li><p>You can specify either ReplicaCount or ReadOnlyCount.</p>
     * </li>
     * <li><p>A master-replica instance cannot contain multiple replica nodes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReplicaCount")
    public Integer replicaCount;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of shards. This parameter is applicable only to cloud-native cluster instances.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you want to change a cloud-native cluster instance to a standard instance, you must explicitly set the ShardCount parameter to 1 and specify the specifications of the master-replica instance.</p>
     * </li>
     * <li><p>To change a cloud-native standard instance to a cluster instance, you must explicitly set the ShardCount parameter to a value greater than 1 and specify the specifications of the cluster instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The number of read replicas in the secondary zone when you create a read/write splitting instance that is deployed across multiple zones. Valid values: 1 to 9. The sum of the values of this parameter and the ReadOnlyCount parameter cannot be greater than 9.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The number of replica nodes in the secondary zone when you create a cloud-native multi-replica cluster instance that is deployed across multiple zones. The sum of the values of this parameter and the ReplicaCount parameter cannot be greater than 4.</p>
     * <blockquote>
     * <p> When you create a cloud-native multi-replica cluster instance that is deployed across multiple zones, you must specify both SlaveReplicaCount and SecondaryZoneId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SlaveReplicaCount")
    public Integer slaveReplicaCount;

    /**
     * <p>The source of the operation. This parameter is used only for internal maintenance. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The storage capacity of the ESSD/SSD-based instance. The valid values vary based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/2527111.html">ESSD/SSD-based instances</a>.</p>
     * <blockquote>
     * <p> This parameter is required only when you set the <strong>InstanceType</strong> parameter to <strong>tair_essd</strong> to create an ESSD-based instance. If you create a Tair <strong>SSD</strong>-based instance, the Storage parameter is automatically specified based on predefined specifications. You do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>The storage type. Valid values: <strong>essd_pl1</strong>, <strong>essd_pl2</strong>, and <strong>essd_pl3</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only when you set the <strong>InstanceType</strong> parameter to <strong>tair_essd</strong> to create an ESSD-based instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>essd_pl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

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

    public ModifyInstanceSpecRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
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

    public ModifyInstanceSpecRequest setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }
    public Integer getReplicaCount() {
        return this.replicaCount;
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

    public ModifyInstanceSpecRequest setSlaveReplicaCount(Integer slaveReplicaCount) {
        this.slaveReplicaCount = slaveReplicaCount;
        return this;
    }
    public Integer getSlaveReplicaCount() {
        return this.slaveReplicaCount;
    }

    public ModifyInstanceSpecRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

    public ModifyInstanceSpecRequest setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }
    public Integer getStorage() {
        return this.storage;
    }

    public ModifyInstanceSpecRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
