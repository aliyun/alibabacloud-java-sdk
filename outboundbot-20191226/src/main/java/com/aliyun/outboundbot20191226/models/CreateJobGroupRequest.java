// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupRequest extends TeaModel {
    /**
     * <p>The list of calling numbers. If not specified, all numbers bound to the instance are selected by default.</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The configuration parameters for flash SMS in JSON format, including third-party flash SMS configuration information.  </p>
     * <ul>
     * <li>templateId: the flash SMS template ID.  </li>
     * <li>configId: the flash SMS configuration ID.</li>
     * <li>templateContent: the flash SMS content.</li>
     * </ul>
     * <blockquote>
     * <p>Obtain the value of templateContent from the corresponding flash SMS capability provider.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;templateId&quot;:&quot;104xx&quot;,&quot;configId&quot;:&quot;8037f524-6fxxxxx&quot;, &quot;templateContent&quot;: &quot;【智能外呼机器人】给您来电，敬请接听！&quot;}</p>
     */
    @NameInMap("FlashSmsExtras")
    public String flashSmsExtras;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>任务描述</p>
     */
    @NameInMap("JobGroupDescription")
    public String jobGroupDescription;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>第一个任务</p>
     */
    @NameInMap("JobGroupName")
    public String jobGroupName;

    /**
     * <p>The guaranteed concurrency value.  </p>
     * <ul>
     * <li>When the task starts, a minimum of N concurrent calls are guaranteed.</li>
     * <li>The sum of guaranteed concurrency values for tasks with the same priority cannot exceed the instance concurrency.  </li>
     * <li>If the guaranteed concurrency value is set to 0, the system intelligently allocates idle concurrency.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>The job group priority. Valid values:</p>
     * <ul>
     * <li><strong>Urgent</strong>: urgent task.</li>
     * <li><strong>Daily</strong>: daily task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The list of redial calling numbers.</p>
     */
    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <p>The redial strategy in JSON format. Parameter values default to false.</p>
     * <ul>
     * <li><strong>emptyNumberIgnore</strong>: does not call nonexistent numbers.</li>
     * <li><strong>inArrearsIgnore</strong>: does not call numbers with overdue payments.</li>
     * <li><strong>outOfServiceIgnore</strong>: does not call numbers that are out of service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;emptyNumberIgnore&quot;:true,&quot;inArrearsIgnore&quot;:true,&quot;outOfServiceIgnore&quot;:true}</p>
     */
    @NameInMap("RecallStrategyJson")
    public String recallStrategyJson;

    /**
     * <p>The optimal ringing duration. Default value: 25.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RingingDuration")
    public Long ringingDuration;

    /**
     * <p>Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The task execution strategy.  </p>
     * <ul>
     * <li>repeatBy: the repeat type. Valid values: Once (no repeat), Week (repeat weekly), and Month (repeat monthly).  </li>
     * <li>startTime: the strategy start time for time-based execution.</li>
     * <li>endTime: the strategy end time for time-based execution.  <blockquote>
     * <p>The execution mode is determined as follows:</p>
     * <ul>
     * <li>If no strategy start time or end time is specified, the task is executed immediately.</li>
     * <li>If a strategy time is specified, the task is executed based on the schedule. You must also specify the repeat type repeatBy.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>workingTime: the time window during which outbound calls can be made.</li>
     * <li>maxAttemptsPerDay: the maximum number of call attempts per day for each number in the task.</li>
     * <li>minAttemptInterval: the retry interval for a number, in minutes.</li>
     * <li>routingStrategy: the number strategy. Valid values: None (not specified), LocalFirst (local city numbers preferred), and LocalProvinceFirst (local province numbers preferred).</li>
     * <li>repeatDays: the execution days corresponding to the repeat type. If RepeatBy is set to Week, 0 indicates Sunday and 1-6 indicate Monday through Saturday. If RepeatBy is set to Month, 1-31 indicate the 1st through 31st day. The task is not executed in months that do not have the specified day. For example, if the 30th is selected, the task is not executed in February.</li>
     * <li>repeatable: specifies whether to enable cyclic tasks. Valid values: true and false.</li>
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
