// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCycleTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values: true: performs only a dry run without performing the actual operation. false: performs the actual request. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable the task. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enable.</li>
     * <li><strong>0</strong>: Disable.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The time of the first execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1650556800000</p>
     */
    @NameInMap("FirstDateStr")
    public Long firstDateStr;

    /**
     * <p>The interval period.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("IntervalPeriod")
    public Integer intervalPeriod;

    /**
     * <p>The extended information field.</p>
     * <blockquote>
     * <p>Note: This parameter is required. If you do not specify this parameter, the API returns an error. The value is a JSON-formatted string that must contain at least the targetInfo array.</p>
     * </blockquote>
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
     * <p>The unit of the scan period. Valid values:</p>
     * <ul>
     * <li><strong>day</strong>: day.</li>
     * <li><strong>hour</strong>: hour.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The source from which the task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>console_batch</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The end time of the task, in hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TargetEndTime")
    public Integer targetEndTime;

    /**
     * <p>The start time of the task, in hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TargetStartTime")
    public Integer targetStartTime;

    /**
     * <p>The task name. This is a custom string used to identify the periodic scan task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_virus_scan</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan.</li>
     * <li><strong>IMAGE_SCAN</strong>: image scan.</li>
     * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: emergency vulnerability scan.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateCycleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCycleTaskRequest self = new CreateCycleTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCycleTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCycleTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
