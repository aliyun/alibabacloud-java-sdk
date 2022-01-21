// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosCarRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("LimitType")
    public String limitType;

    @NameInMap("MaxBandwidthAbs")
    public Integer maxBandwidthAbs;

    @NameInMap("MaxBandwidthPercent")
    public Integer maxBandwidthPercent;

    @NameInMap("MinBandwidthAbs")
    public Integer minBandwidthAbs;

    @NameInMap("MinBandwidthPercent")
    public Integer minBandwidthPercent;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PercentSourceType")
    public String percentSourceType;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("QosCarId")
    public String qosCarId;

    @NameInMap("QosId")
    public String qosId;

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
