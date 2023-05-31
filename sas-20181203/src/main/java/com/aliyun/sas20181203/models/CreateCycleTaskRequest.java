// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCycleTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the task. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The first time when the task is performed.</p>
     */
    @NameInMap("FirstDateStr")
    public Long firstDateStr;

    /**
     * <p>The interval of the task.</p>
     */
    @NameInMap("IntervalPeriod")
    public Integer intervalPeriod;

    /**
     * <p>The additional information.</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The unit of the scan interval. Valid values:</p>
     * <br>
     * <p>*   **day**: days</p>
     * <p>*   **hour**: hours</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The additional source for the task.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The time when the task ends. Unit: hours.</p>
     */
    @NameInMap("TargetEndTime")
    public Integer targetEndTime;

    /**
     * <p>The time when the task is started. Unit: hours.</p>
     */
    @NameInMap("TargetStartTime")
    public Integer targetStartTime;

    /**
     * <p>The name of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: virus scan task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <p>*   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: virus scan task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <p>*   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateCycleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCycleTaskRequest self = new CreateCycleTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCycleTaskRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public CreateCycleTaskRequest setFirstDateStr(Long firstDateStr) {
        this.firstDateStr = firstDateStr;
        return this;
    }
    public Long getFirstDateStr() {
        return this.firstDateStr;
    }

    public CreateCycleTaskRequest setIntervalPeriod(Integer intervalPeriod) {
        this.intervalPeriod = intervalPeriod;
        return this;
    }
    public Integer getIntervalPeriod() {
        return this.intervalPeriod;
    }

    public CreateCycleTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateCycleTaskRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCycleTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateCycleTaskRequest setTargetEndTime(Integer targetEndTime) {
        this.targetEndTime = targetEndTime;
        return this;
    }
    public Integer getTargetEndTime() {
        return this.targetEndTime;
    }

    public CreateCycleTaskRequest setTargetStartTime(Integer targetStartTime) {
        this.targetStartTime = targetStartTime;
        return this;
    }
    public Integer getTargetStartTime() {
        return this.targetStartTime;
    }

    public CreateCycleTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateCycleTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
