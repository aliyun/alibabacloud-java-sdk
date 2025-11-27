// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyComputeBurstConfigRequest extends TeaModel {
    /**
     * <p>This parameter is set to <strong>disabled</strong> if the assured serverless feature is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("BurstStatus")
    public String burstStatus;

    /**
     * <p>The client token that is used to ensure the idempotence of requests and prevent repeated requests from being submitted. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCziJZNwH****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The CPU utilization threshold for <strong>scale-out</strong>. Valid values: 60 to 90. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("CpuEnlargeThreshold")
    public String cpuEnlargeThreshold;

    /**
     * <p>The CPU utilization threshold for <strong>scale-in</strong>. Valid values: 30 to 55. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("CpuShrinkThreshold")
    public String cpuShrinkThreshold;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("CrontabJobId")
    public String crontabJobId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze63v2p3o3k****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The memory usage threshold for <strong>scale-out</strong>. Valid values: 60 to 90. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("MemoryEnlargeThreshold")
    public String memoryEnlargeThreshold;

    /**
     * <p>The memory usage threshold for <strong>scale-in</strong>. Valid values: 30 to 55. Unit: %.</p>
     * 
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The maximum number of CPU cores for elastic scaling. The maximum value cannot exceed twice the initial CPU configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleMaxCpus")
    public String scaleMaxCpus;

    /**
     * <p>The maximum memory for elastic scaling. The value cannot exceed twice the instance\&quot;s initial memory size. Unit: GB. Step size: 2 GB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleMaxMemory")
    public String scaleMaxMemory;

    /**
     * <p>The time when the specified entry takes effect. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p> This parameter is required only if <strong>SwitchTimeMode</strong> is set to <strong>2</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-05-06T09:24:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The effective policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Immediately takes effect.</li>
     * <li><strong>1</strong>: Takes effect within the maintenance window. You can call the <strong>ModifyDBInstanceMaintainTime</strong> operation to change the maintenance window of an instance.</li>
     * <li><strong>2</strong>: Takes effect at a specified point in time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
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
