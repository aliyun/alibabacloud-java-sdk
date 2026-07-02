// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToEcsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong>: disables auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal cycle. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required if you set <strong>AutoRenew</strong> to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Long autoRenewPeriod;

    /**
     * <p>The billing method of the target instance. Valid values:</p>
     * <ul>
     * <li><p><strong>PostPaid</strong>: pay-as-you-go</p>
     * </li>
     * <li><p><strong>PrePaid</strong>: subscription. If you set this parameter to PrePaid, you must also specify the <strong>Period</strong> parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run to check the request. The check items include the required parameters, request format, service limits, and available resources. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request and creates an instance after the request passes the check.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The time when to switch the database after data migration. Valid values:</p>
     * <ul>
     * <li><p><strong>Immediately</strong>: The database is immediately switched after the migration is complete.</p>
     * </li>
     * <li><p><strong>MaintainTime</strong>: The database is switched within the maintenance window.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>Immediately</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The Redis-compatible version of the instance. Valid values: <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance type of the target cloud-native instance. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Instance types</a>.</p>
     * <blockquote>
     * <p>If you want to convert a cluster instance, you must specify the corresponding cloud-native cluster instance type that includes .with.proxy in its name and specify the ShardCount parameter.</p>
     * <ul>
     * <li>For a cluster instance, you must provide the corresponding cloud-native cluster specification that includes <code>.proxy</code>. You must also specify the number of shards by using the <code>ShardCount</code> parameter.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair.rdb.1g
     * tair.rdb.with.proxy.1g</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the classic instance that you want to convert.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to deploy the instance across availability zones. This feature is supported only for cluster instances.</p>
     */
    @NameInMap("IsAcrossZone")
    public Boolean isAcrossZone;

    /**
     * <p>The ID of the availability zone.</p>
     */
    @NameInMap("IzNo")
    public String izNo;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, 6, 7, 8, 9, 12, 24, and 36.</p>
     * <blockquote>
     * <p>This parameter is available and required only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the secondary availability zone.</p>
     */
    @NameInMap("SecondaryIzNo")
    public String secondaryIzNo;

    /**
     * <p>The number of data shards in the cloud-native cluster instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShardCount")
    public Long shardCount;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static TransformToEcsRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformToEcsRequest self = new TransformToEcsRequest();
        return TeaModel.build(map, self);
    }

    public TransformToEcsRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public TransformToEcsRequest setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public TransformToEcsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public TransformToEcsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public TransformToEcsRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public TransformToEcsRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public TransformToEcsRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public TransformToEcsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransformToEcsRequest setIsAcrossZone(Boolean isAcrossZone) {
        this.isAcrossZone = isAcrossZone;
        return this;
    }
    public Boolean getIsAcrossZone() {
        return this.isAcrossZone;
    }

    public TransformToEcsRequest setIzNo(String izNo) {
        this.izNo = izNo;
        return this;
    }
    public String getIzNo() {
        return this.izNo;
    }

    public TransformToEcsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TransformToEcsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TransformToEcsRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public TransformToEcsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TransformToEcsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TransformToEcsRequest setSecondaryIzNo(String secondaryIzNo) {
        this.secondaryIzNo = secondaryIzNo;
        return this;
    }
    public String getSecondaryIzNo() {
        return this.secondaryIzNo;
    }

    public TransformToEcsRequest setShardCount(Long shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Long getShardCount() {
        return this.shardCount;
    }

    public TransformToEcsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
