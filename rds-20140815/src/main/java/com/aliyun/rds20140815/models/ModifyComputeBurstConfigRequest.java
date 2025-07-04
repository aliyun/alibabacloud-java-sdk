// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyComputeBurstConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("BurstStatus")
    public String burstStatus;

    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCziJZNwH****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("CpuEnlargeThreshold")
    public String cpuEnlargeThreshold;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("CpuShrinkThreshold")
    public String cpuShrinkThreshold;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("CrontabJobId")
    public String crontabJobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze63v2p3o3k****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("MemoryEnlargeThreshold")
    public String memoryEnlargeThreshold;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MemoryShrinkThreshold")
    public String memoryShrinkThreshold;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleMaxCpus")
    public String scaleMaxCpus;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleMaxMemory")
    public String scaleMaxMemory;

    /**
     * <strong>example:</strong>
     * <p>2025-05-06T09:24:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyComputeBurstConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyComputeBurstConfigRequest self = new ModifyComputeBurstConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyComputeBurstConfigRequest setBurstStatus(String burstStatus) {
        this.burstStatus = burstStatus;
        return this;
    }
    public String getBurstStatus() {
        return this.burstStatus;
    }

    public ModifyComputeBurstConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyComputeBurstConfigRequest setCpuEnlargeThreshold(String cpuEnlargeThreshold) {
        this.cpuEnlargeThreshold = cpuEnlargeThreshold;
        return this;
    }
    public String getCpuEnlargeThreshold() {
        return this.cpuEnlargeThreshold;
    }

    public ModifyComputeBurstConfigRequest setCpuShrinkThreshold(String cpuShrinkThreshold) {
        this.cpuShrinkThreshold = cpuShrinkThreshold;
        return this;
    }
    public String getCpuShrinkThreshold() {
        return this.cpuShrinkThreshold;
    }

    public ModifyComputeBurstConfigRequest setCrontabJobId(String crontabJobId) {
        this.crontabJobId = crontabJobId;
        return this;
    }
    public String getCrontabJobId() {
        return this.crontabJobId;
    }

    public ModifyComputeBurstConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyComputeBurstConfigRequest setMemoryEnlargeThreshold(String memoryEnlargeThreshold) {
        this.memoryEnlargeThreshold = memoryEnlargeThreshold;
        return this;
    }
    public String getMemoryEnlargeThreshold() {
        return this.memoryEnlargeThreshold;
    }

    public ModifyComputeBurstConfigRequest setMemoryShrinkThreshold(String memoryShrinkThreshold) {
        this.memoryShrinkThreshold = memoryShrinkThreshold;
        return this;
    }
    public String getMemoryShrinkThreshold() {
        return this.memoryShrinkThreshold;
    }

    public ModifyComputeBurstConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyComputeBurstConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyComputeBurstConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyComputeBurstConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyComputeBurstConfigRequest setScaleMaxCpus(String scaleMaxCpus) {
        this.scaleMaxCpus = scaleMaxCpus;
        return this;
    }
    public String getScaleMaxCpus() {
        return this.scaleMaxCpus;
    }

    public ModifyComputeBurstConfigRequest setScaleMaxMemory(String scaleMaxMemory) {
        this.scaleMaxMemory = scaleMaxMemory;
        return this;
    }
    public String getScaleMaxMemory() {
        return this.scaleMaxMemory;
    }

    public ModifyComputeBurstConfigRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyComputeBurstConfigRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public ModifyComputeBurstConfigRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
