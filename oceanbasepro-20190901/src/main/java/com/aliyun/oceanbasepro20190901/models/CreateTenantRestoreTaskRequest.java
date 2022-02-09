// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantRestoreTaskRequest extends TeaModel {
    // 白名单恢复类型
    @NameInMap("BackupWhiteMode")
    public String backupWhiteMode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("Method")
    public String method;

    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    @NameInMap("TargetTenantDescription")
    public String targetTenantDescription;

    @NameInMap("TargetTenantName")
    public String targetTenantName;

    @NameInMap("TargetTenantPrimaryZone")
    public String targetTenantPrimaryZone;

    @NameInMap("TargetTenantUserVSwitchId")
    public String targetTenantUserVSwitchId;

    @NameInMap("TargetTenantUserVpcId")
    public String targetTenantUserVpcId;

    @NameInMap("TargetTime")
    public String targetTime;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UnitNum")
    public Integer unitNum;

    public static CreateTenantRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantRestoreTaskRequest self = new CreateTenantRestoreTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantRestoreTaskRequest setBackupWhiteMode(String backupWhiteMode) {
        this.backupWhiteMode = backupWhiteMode;
        return this;
    }
    public String getBackupWhiteMode() {
        return this.backupWhiteMode;
    }

    public CreateTenantRestoreTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTenantRestoreTaskRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateTenantRestoreTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantRestoreTaskRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateTenantRestoreTaskRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateTenantRestoreTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateTenantRestoreTaskRequest setTargetTenantDescription(String targetTenantDescription) {
        this.targetTenantDescription = targetTenantDescription;
        return this;
    }
    public String getTargetTenantDescription() {
        return this.targetTenantDescription;
    }

    public CreateTenantRestoreTaskRequest setTargetTenantName(String targetTenantName) {
        this.targetTenantName = targetTenantName;
        return this;
    }
    public String getTargetTenantName() {
        return this.targetTenantName;
    }

    public CreateTenantRestoreTaskRequest setTargetTenantPrimaryZone(String targetTenantPrimaryZone) {
        this.targetTenantPrimaryZone = targetTenantPrimaryZone;
        return this;
    }
    public String getTargetTenantPrimaryZone() {
        return this.targetTenantPrimaryZone;
    }

    public CreateTenantRestoreTaskRequest setTargetTenantUserVSwitchId(String targetTenantUserVSwitchId) {
        this.targetTenantUserVSwitchId = targetTenantUserVSwitchId;
        return this;
    }
    public String getTargetTenantUserVSwitchId() {
        return this.targetTenantUserVSwitchId;
    }

    public CreateTenantRestoreTaskRequest setTargetTenantUserVpcId(String targetTenantUserVpcId) {
        this.targetTenantUserVpcId = targetTenantUserVpcId;
        return this;
    }
    public String getTargetTenantUserVpcId() {
        return this.targetTenantUserVpcId;
    }

    public CreateTenantRestoreTaskRequest setTargetTime(String targetTime) {
        this.targetTime = targetTime;
        return this;
    }
    public String getTargetTime() {
        return this.targetTime;
    }

    public CreateTenantRestoreTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTenantRestoreTaskRequest setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Integer getUnitNum() {
        return this.unitNum;
    }

}
