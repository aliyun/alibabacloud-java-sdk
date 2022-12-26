// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCycleTaskRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("FirstDateStr")
    public Long firstDateStr;

    @NameInMap("IntervalPeriod")
    public Integer intervalPeriod;

    @NameInMap("Param")
    public String param;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("TargetEndTime")
    public Integer targetEndTime;

    @NameInMap("TargetStartTime")
    public Integer targetStartTime;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public String taskType;

    public static ModifyCycleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCycleTaskRequest self = new ModifyCycleTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCycleTaskRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ModifyCycleTaskRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public ModifyCycleTaskRequest setFirstDateStr(Long firstDateStr) {
        this.firstDateStr = firstDateStr;
        return this;
    }
    public Long getFirstDateStr() {
        return this.firstDateStr;
    }

    public ModifyCycleTaskRequest setIntervalPeriod(Integer intervalPeriod) {
        this.intervalPeriod = intervalPeriod;
        return this;
    }
    public Integer getIntervalPeriod() {
        return this.intervalPeriod;
    }

    public ModifyCycleTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public ModifyCycleTaskRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyCycleTaskRequest setTargetEndTime(Integer targetEndTime) {
        this.targetEndTime = targetEndTime;
        return this;
    }
    public Integer getTargetEndTime() {
        return this.targetEndTime;
    }

    public ModifyCycleTaskRequest setTargetStartTime(Integer targetStartTime) {
        this.targetStartTime = targetStartTime;
        return this;
    }
    public Integer getTargetStartTime() {
        return this.targetStartTime;
    }

    public ModifyCycleTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyCycleTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
