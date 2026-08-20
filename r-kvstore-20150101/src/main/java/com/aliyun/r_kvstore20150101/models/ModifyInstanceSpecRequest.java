// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic payment is enabled. This is the default value.</li>
     * <li><strong>false</strong>: Automatic payment is disabled. If you set this parameter to <strong>false</strong>, you must manually renew the instance before the instance expires in the console. For details, see <a href="https://help.aliyun.com/document_detail/26352.html">Manual renewal</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The activity ID and business information.</p>
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
     * <p>The time when the specification change takes effect. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: The specification change takes effect immediately. This is the default value.</li>
     * <li><strong>MaintainTime</strong>: The specification change takes effect during the maintenance window of the instance. You can call <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> to modify the maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Specifies whether to enable forced transmission. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Before the specification change, the system checks the current minor engine version of the instance. If the minor engine version is too old, an error is returned. You must upgrade the minor engine version and retry.</li>
     * <li><strong>true</strong>: Skips the check and directly executes the specification change operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>Specifies whether to forcibly change the specifications. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: does not forcibly change the specifications.</li>
     * <li><strong>true</strong>: forcibly changes the specifications. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceUpgrade")
    public Boolean forceUpgrade;

    /**
     * <p>The new instance type. You can call <a href="https://help.aliyun.com/document_detail/473765.html">DescribeAvailableResource</a> to query the instance types available for specification changes in the zone where the instance resides.</p>
     * <blockquote>
     * <p>For more information about instance types, see <a href="https://help.aliyun.com/document_detail/26350.html">Instance type navigation</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The major engine version for upgrading a classic instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
     * <blockquote>
     * <p>When you upgrade the version, the <strong>InstanceClass</strong> parameter is required. This indicates that this operation supports version upgrades only when the instance specifications are also changed. To upgrade only the instance version, call <a href="https://help.aliyun.com/document_detail/473776.html">ModifyInstanceMajorVersion</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>MASTER_SLAVE</strong>: high availability (dual-replica)</li>
     * <li><strong>STAND_ALONE</strong>: single replica</li>
     * <li><strong>double</strong>: dual-replica</li>
     * <li><strong>single</strong>: single replica<blockquote>
     * <p>For cloud-native instances, select <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. For classic instances, select <strong>double</strong> or <strong>single</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The type of specification change. This parameter is required when you change the specifications of a subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>UPGRADE</strong>: Upgrade. This is the default value.</li>
     * <li><strong>DOWNGRADE</strong>: Downgrade.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must set this parameter to <strong>DOWNGRADE</strong> when you downgrade a subscription instance.</li>
     * <li>If the price of the target instance type is higher than that of the current instance type, the change is an upgrade. Otherwise, the change is a downgrade. For example, the price of the read/write splitting 8 GB edition (5 read-only nodes) is higher than that of the 16 GB cluster edition. Changing from the latter to the former is an upgrade.</li>
     * </ul>
     * </blockquote>
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
     * <p>The number of read-only nodes in the primary zone. This parameter is applicable only to cloud-native read/write splitting instances.</p>
     * <ul>
     * <li>For standard architecture instances, valid values are 0 to 9. A value of 0 indicates that read/write splitting is shutdown and the instance is switched to the standard architecture.</li>
     * <li>For cluster architecture instances, valid values are 1 to 4, which specifies the number of read-only nodes per data shard.<blockquote>
     * <p>For multi-zone instances, you can use this parameter together with the SlaveReadOnlyCount parameter to specify the number of read-only nodes in the primary and secondary zones.</p>
     * <ul>
     * <li>For standard architecture instances, the sum of this parameter and SlaveReadOnlyCount cannot exceed 9.</li>
     * <li>For cluster architecture instances, the sum of this parameter and SlaveReadOnlyCount cannot exceed 4.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> to query available regions. Use this parameter to specify the region of the instance whose specifications you want to change.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of replica nodes in the primary zone. This parameter is applicable only to cloud-native cluster multi-replica instances. You can use this parameter to specify a custom number of replica nodes. Valid values: 1 to 4.</p>
     * <blockquote>
     * <p>For multi-zone instances, you can use this parameter together with the SlaveReplicaCount parameter to specify the number of replica nodes in the primary and secondary zones. The sum of this parameter and the SlaveReplicaCount parameter cannot exceed 4.</p>
     * </blockquote>
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

    /**
     * <p>The secondary zone ID. This parameter is required when you change the specifications of a single-zone instance and migrate it to a multi-zone deployment. You can call <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> to query available zones.</p>
     * <blockquote>
     * <p>The value of this parameter must be different from the value of the ZoneId parameter. Do not set this parameter to the ID of a multi-zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of shards. This parameter is applicable only to cloud-native cluster instances. You can use this parameter to specify a custom number of shards.</p>
     * <blockquote>
     * <ul>
     * <li>To change a cloud-native cluster instance to a standard architecture, set ShardCount to 1 and set the instance type to a standard instance type.</li>
     * <li>To change a cloud-native standard instance to a cluster architecture, set ShardCount to a value greater than 1 and set the instance type to a cluster instance type.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The number of read-only nodes in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The number of replica nodes in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SlaveReplicaCount")
    public Integer slaveReplicaCount;

    /**
     * <p>The source of the request. This parameter is used only for internal maintenance and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The storage capacity of a cloud disk instance. The valid values vary based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/2527111.html">Cloud disk-based instance types</a>.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>InstanceType</strong> is set to <strong>tair_essd</strong> and you are creating a Tair ESSD-based cloud disk instance. For Tair SSD-based cloud disk instances, the storage capacity is a fixed value based on the instance type, and you do not need to specify this parameter.</p>
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
     * <p>This parameter is required only when <strong>InstanceType</strong> is set to <strong>tair_essd</strong> and the instance is a Tair ESSD-based cloud disk instance.</p>
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

    public ModifyInstanceSpecRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
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
