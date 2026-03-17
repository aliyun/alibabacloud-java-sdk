// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosCarRequest extends TeaModel {
    /**
     * <p>The description of the traffic throttling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Qostest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the traffic throttling rule. Valid values:</p>
     * <ul>
     * <li><strong>Absolute</strong>: throttles traffic based on a specific range of bandwidth.</li>
     * <li><strong>Percent</strong>: throttles traffic based on a specific range of bandwidth percentage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Absolute</p>
     */
    @NameInMap("LimitType")
    public String limitType;

    /**
     * <p>The maximum bandwidth value. The value must be an integer. Unit: Mbit /s.</p>
     * <p>This parameter is required when you set <strong>LimitType</strong> to <strong>Absolute</strong>.</p>
     * <blockquote>
     * <p> The maximum bandwidth value must be greater than the minimum bandwidth value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("MaxBandwidthAbs")
    public Integer maxBandwidthAbs;

    /**
     * <p>The maximum bandwidth percentage. Unit: percent (%). Valid values: <strong>1 to 100</strong>.</p>
     * <p>This parameter is required when you set <strong>LimitType</strong> to <strong>Percent</strong>.</p>
     * <blockquote>
     * <p> The maximum bandwidth percentage must be greater than the minimum bandwidth percentage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("MaxBandwidthPercent")
    public Integer maxBandwidthPercent;

    /**
     * <p>The minimum bandwidth value. The value must be an integer. Unit: Mbit/s.</p>
     * <p>This parameter is required when you set <strong>LimitType</strong> to <strong>Absolute</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinBandwidthAbs")
    public Integer minBandwidthAbs;

    /**
     * <p>The minimum bandwidth percentage. Unit: percent (%). Valid values: <strong>1 to 100</strong>.</p>
     * <p>This parameter is required when you set <strong>LimitType</strong> to <strong>Percent</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MinBandwidthPercent")
    public Integer minBandwidthPercent;

    /**
     * <p>The name of the traffic throttling rule.</p>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of bandwidth when traffic is throttled based on bandwidth percentage. Valid values:</p>
     * <ul>
     * <li><strong>CcnBandwidth</strong>: Cloud Connect Network (CCN) bandwidth</li>
     * <li><strong>InternetUpBandwidth</strong>: total Internet bandwidth</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CcnBandwidth</p>
     */
    @NameInMap("PercentSourceType")
    public String percentSourceType;

    /**
     * <p>The priority value of the traffic throttling rule. A smaller value specifies a higher priority. If multiple rules have the same priority, the rule that is applied first takes effect. Valid values: <strong>1 to 7</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the traffic throttling rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qoscar-n5k8g97lihlph****</p>
     */
    @NameInMap("QosCarId")
    public String qosCarId;

    /**
     * <p>The ID of the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-awfxl1adxeqyk****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The ID of the region to which the QoS policy belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyQosCarRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosCarRequest self = new ModifyQosCarRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQosCarRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyQosCarRequest setLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }
    public String getLimitType() {
        return this.limitType;
    }

    public ModifyQosCarRequest setMaxBandwidthAbs(Integer maxBandwidthAbs) {
        this.maxBandwidthAbs = maxBandwidthAbs;
        return this;
    }
    public Integer getMaxBandwidthAbs() {
        return this.maxBandwidthAbs;
    }

    public ModifyQosCarRequest setMaxBandwidthPercent(Integer maxBandwidthPercent) {
        this.maxBandwidthPercent = maxBandwidthPercent;
        return this;
    }
    public Integer getMaxBandwidthPercent() {
        return this.maxBandwidthPercent;
    }

    public ModifyQosCarRequest setMinBandwidthAbs(Integer minBandwidthAbs) {
        this.minBandwidthAbs = minBandwidthAbs;
        return this;
    }
    public Integer getMinBandwidthAbs() {
        return this.minBandwidthAbs;
    }

    public ModifyQosCarRequest setMinBandwidthPercent(Integer minBandwidthPercent) {
        this.minBandwidthPercent = minBandwidthPercent;
        return this;
    }
    public Integer getMinBandwidthPercent() {
        return this.minBandwidthPercent;
    }

    public ModifyQosCarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyQosCarRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyQosCarRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyQosCarRequest setPercentSourceType(String percentSourceType) {
        this.percentSourceType = percentSourceType;
        return this;
    }
    public String getPercentSourceType() {
        return this.percentSourceType;
    }

    public ModifyQosCarRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyQosCarRequest setQosCarId(String qosCarId) {
        this.qosCarId = qosCarId;
        return this;
    }
    public String getQosCarId() {
        return this.qosCarId;
    }

    public ModifyQosCarRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public ModifyQosCarRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyQosCarRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyQosCarRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
