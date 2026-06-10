// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupRequest extends TeaModel {
    /**
     * <p>List of caller numbers. If not specified, all numbers attached to the instance are selected by default.</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>Configuration parameters for flash SMS push, in JSON format, containing third-party flash SMS configuration information.  </p>
     * <ul>
     * <li>templateId: Flash SMS Template ID.  </li>
     * <li>configId: Flash SMS configuration ID.  </li>
     * <li>templateContent: Flash SMS Content.</li>
     * </ul>
     * <blockquote>
     * <p>Obtain the value of templateContent from the partner providing the flash SMS capability.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;templateId&quot;:&quot;104xx&quot;,&quot;configId&quot;:&quot;8037f524-6fxxxxx&quot;, &quot;templateContent&quot;: &quot;【智能外呼机器人】给您来电，敬请接听！&quot;}</p>
     */
    @NameInMap("FlashSmsExtras")
    public String flashSmsExtras;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Task description.</p>
     * 
     * <strong>example:</strong>
     * <p>任务描述</p>
     */
    @NameInMap("JobGroupDescription")
    public String jobGroupDescription;

    /**
     * <p>Task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>第一个任务</p>
     */
    @NameInMap("JobGroupName")
    public String jobGroupName;

    /**
     * <p>Concurrent guarantee value.  </p>
     * <ul>
     * <li>When a job starts, it is guaranteed a minimum of N concurrent executions.  </li>
     * <li>The sum of concurrent guarantee values for jobs with the same priority must not exceed the instance concurrency limit.  </li>
     * <li>If the concurrent guarantee value is configured as 0, the system intelligently assigns idle concurrency resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>Job group priority. Valid values:</p>
     * <ul>
     * <li><strong>Urgent</strong>: Urgent job.</li>
     * <li><strong>Daily</strong>: Daily job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>List of caller numbers for redial.</p>
     */
    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <p>Redial policy in JSON format. The default value of parameters in the JSON is false.</p>
     * <ul>
     * <li><strong>emptyNumberIgnore</strong>: Do not make outbound calls to nonexistent numbers.</li>
     * <li><strong>inArrearsIgnore</strong>: Do not make outbound calls for overdue payments.</li>
     * <li><strong>outOfServiceIgnore</strong>: Do not make outbound calls to out-of-service numbers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;emptyNumberIgnore&quot;:true,&quot;inArrearsIgnore&quot;:true,&quot;outOfServiceIgnore&quot;:true}</p>
     */
    @NameInMap("RecallStrategyJson")
    public String recallStrategyJson;

    /**
     * <p>Optimal ringing duration. Default value is 25.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RingingDuration")
    public Long ringingDuration;

    /**
     * <p>Deprecated</p>
     * 
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>Scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>Job execution policy.  </p>
     * <ul>
     * <li>repeatBy: Recurrence type. Options are Once (no recurrence), Week (weekly recurrence), and Month (monthly recurrence).  </li>
     * <li>startTime: Policy start time for time-based execution.  </li>
     * <li>endTime: Policy end time for time-based execution.  <blockquote>
     * <p>Execution modes are as follows:  </p>
     * <ul>
     * <li>If no start or end time is specified, the job executes immediately.  </li>
     * <li>If start and end times are provided, the job executes based on the schedule, and a recurrence type (repeatBy) must be selected.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>workingTime: Allowed outbound calling time segment.  </li>
     * <li>maxAttemptsPerDay: Maximum number of call attempts per day for numbers under this job.  </li>
     * <li>minAttemptInterval: Minimum time interval between retry calls for a number, in minutes.  </li>
     * <li>routingStrategy: Number routing strategy. Options are None (not specified), LocalFirst (local city numbers prioritized), and LocalProvinceFirst (local province numbers prioritized).  </li>
     * <li>repeatDays: Execution dates corresponding to the recurrence type. If repeatBy is Week, 0 represents Sunday and 1–6 represent Monday through Saturday. If repeatBy is Month, values 1–31 represent the 1st through the 31st day of the month; months without the specified date skip execution (for example, if the 30th is selected, February skips execution).  </li>
     * <li>repeatable: Whether loop task is enabled, true/false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    public static CreateJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobGroupRequest self = new CreateJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobGroupRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public CreateJobGroupRequest setFlashSmsExtras(String flashSmsExtras) {
        this.flashSmsExtras = flashSmsExtras;
        return this;
    }
    public String getFlashSmsExtras() {
        return this.flashSmsExtras;
    }

    public CreateJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateJobGroupRequest setJobGroupDescription(String jobGroupDescription) {
        this.jobGroupDescription = jobGroupDescription;
        return this;
    }
    public String getJobGroupDescription() {
        return this.jobGroupDescription;
    }

    public CreateJobGroupRequest setJobGroupName(String jobGroupName) {
        this.jobGroupName = jobGroupName;
        return this;
    }
    public String getJobGroupName() {
        return this.jobGroupName;
    }

    public CreateJobGroupRequest setMinConcurrency(Long minConcurrency) {
        this.minConcurrency = minConcurrency;
        return this;
    }
    public Long getMinConcurrency() {
        return this.minConcurrency;
    }

    public CreateJobGroupRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateJobGroupRequest setRecallCallingNumber(java.util.List<String> recallCallingNumber) {
        this.recallCallingNumber = recallCallingNumber;
        return this;
    }
    public java.util.List<String> getRecallCallingNumber() {
        return this.recallCallingNumber;
    }

    public CreateJobGroupRequest setRecallStrategyJson(String recallStrategyJson) {
        this.recallStrategyJson = recallStrategyJson;
        return this;
    }
    public String getRecallStrategyJson() {
        return this.recallStrategyJson;
    }

    public CreateJobGroupRequest setRingingDuration(Long ringingDuration) {
        this.ringingDuration = ringingDuration;
        return this;
    }
    public Long getRingingDuration() {
        return this.ringingDuration;
    }

    public CreateJobGroupRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public CreateJobGroupRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateJobGroupRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

}
