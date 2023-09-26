// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCycleTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task configuration.</p>
     * <br>
     * <p>>  You can call the [DescribeCycleTaskList](~~DescribeCycleTaskList~~) operation to query the IDs of task configurations.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>Specifies whether to enable the task. Valid values:</p>
     * <br>
     * <p>*   **1**: enables the task.</p>
     * <p>*   **0**: disables the task.</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The time when the task first started.</p>
     */
    @NameInMap("FirstDateStr")
    public Long firstDateStr;

    /**
     * <p>The interval at which the task is run.</p>
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
     * <p>*   **day**</p>
     * <p>*   **hour**</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The end time of the task. The time must be a time frame.</p>
     */
    @NameInMap("TargetEndTime")
    public Integer targetEndTime;

    /**
     * <p>The start time of the task. The start time must be a time frame.</p>
     */
    @NameInMap("TargetStartTime")
    public Integer targetStartTime;

    /**
     * <p>The name of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: virus detection task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <p>*   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   VIRUS_VUL_SCHEDULE_SCAN</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    virus detection task</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   IMAGE_SCAN</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    image scan task</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   EMG_VUL_SCHEDULE_SCAN</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    urgent vulnerability scan task</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: virus detection task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <p>*   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   VIRUS_VUL_SCHEDULE_SCAN</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    virus detection task</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   IMAGE_SCAN</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    image scan task</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   EMG_VUL_SCHEDULE_SCAN</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    urgent vulnerability scan task</p>
     * <br>
     * <p>    <!-- --></p>
     */
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
