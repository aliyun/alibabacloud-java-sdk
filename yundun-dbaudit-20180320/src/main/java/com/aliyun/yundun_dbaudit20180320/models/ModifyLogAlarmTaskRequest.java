// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyLogAlarmTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("ToMailList")
    public java.util.List<String> toMailList;

    @NameInMap("DbIdList")
    public java.util.List<String> dbIdList;

    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    public static ModifyLogAlarmTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogAlarmTaskRequest self = new ModifyLogAlarmTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogAlarmTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLogAlarmTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLogAlarmTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyLogAlarmTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public ModifyLogAlarmTaskRequest setToMailList(java.util.List<String> toMailList) {
        this.toMailList = toMailList;
        return this;
    }
    public java.util.List<String> getToMailList() {
        return this.toMailList;
    }

    public ModifyLogAlarmTaskRequest setDbIdList(java.util.List<String> dbIdList) {
        this.dbIdList = dbIdList;
        return this;
    }
    public java.util.List<String> getDbIdList() {
        return this.dbIdList;
    }

    public ModifyLogAlarmTaskRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

}
