// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCycleTaskRequest extends TeaModel {
    /**
     * <p>The ID of the configuration.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCycleTaskList~~">DescribeCycleTaskList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00cfa8161da093089e6804ba6a33****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>Specifies whether to enable the task. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled.</li>
     * <li><strong>0</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The first execution time.</p>
     * 
     * <strong>example:</strong>
     * <p>1664380800000</p>
     */
    @NameInMap("FirstDateStr")
    public Long firstDateStr;

    /**
     * <p>The interval period.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("IntervalPeriod")
    public Integer intervalPeriod;

    /**
     * <p>The extended information field.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;targetInfo&quot;: [
     *             {
     *                   &quot;type&quot;: &quot;groupId&quot;,
     *                   &quot;name&quot;: &quot;TI HOST&quot;,
     *                   &quot;target&quot;: 10597***
     *             },
     *             {
     *                   &quot;type&quot;: &quot;groupId&quot;,
     *                   &quot;name&quot;: &quot;expense HOST&quot;,
     *                   &quot;target&quot;: 10597***
     *             }
     *       ]
     * }</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The unit of the scan cycle. Valid values:</p>
     * <ul>
     * <li><strong>day</strong>: day.</li>
     * <li><strong>hour</strong>: hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The task end time, in hours.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TargetEndTime")
    public Integer targetEndTime;

    /**
     * <p>The task start time, in hours.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TargetStartTime")
    public Integer targetStartTime;

    /**
     * <p>The node name. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan.</li>
     * <li><strong>IMAGE_SCAN</strong>: image scan.</li>
     * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: emergency vulnerability scanning.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EMG_VUL_SCHEDULE_SCAN</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan.</li>
     * <li><strong>IMAGE_SCAN</strong>: image scan.</li>
     * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: emergency vulnerability scanning.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
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
