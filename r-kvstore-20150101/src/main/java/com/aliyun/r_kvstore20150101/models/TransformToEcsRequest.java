// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToEcsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-renewal feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: does not enable auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The subscription duration that is supported by auto-renewal. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Long autoRenewPeriod;

    /**
     * <p>The new billing method. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid:</strong> pay-as-you-go</li>
     * <li><strong>PrePaid</strong>: subscription. If you set this parameter to PrePaid, you must also specify the <strong>Period</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to perform a precheck before the system creates the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system performs a dry run and does not create the cloud-native instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The time when a database switchover is performed after data is migrated. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: A database switchover is performed immediately after data is migrated.</li>
     * <li><strong>MaintainTime</strong>: A database switchover is performed during the maintenance window.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: Immediately.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance. Valid values: <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance specification of the cloud-native instance. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair.rdb.1g</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the instance that you want to convert.</p>
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

    /**
     * <p>The subscription duration of the instance. Unit: months. Valid values: <strong>1</strong>, 2, 3, 4, 5, 6, 7, 8, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>.</p>
     * <blockquote>
     * <p>This parameter is available and required only if the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
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
     * <p>The number of data shards in the cloud-native cluster instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShardCount")
    public Long shardCount;

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

    public TransformToEcsRequest setShardCount(Long shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Long getShardCount() {
        return this.shardCount;
    }

}
