// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupRequest extends TeaModel {
    /**
     * <p>The list of caller numbers. If not specified, all numbers bound to the instance are selected by default.</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The configuration parameters for flash SMS push in JSON format, including the configuration information of third-party flash SMS.  </p>
     * <ul>
     * <li>templateId: the flash SMS template ID.  </li>
     * <li>configId: the flash SMS configuration ID.</li>
     * <li>templateContent: the flash SMS content.</li>
     * </ul>
     * <blockquote>
     * <p>The value of templateContent must be obtained from the corresponding flash SMS capability partner.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;templateId&quot;:&quot;104xx&quot;,&quot;configId&quot;:&quot;8037f524-6fxxxxx&quot;, &quot;templateContent&quot;: &quot;[Outbound Robot] is calling you. Please answer!&quot;}</p>
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
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>Job description</p>
     */
    @NameInMap("JobGroupDescription")
    public String jobGroupDescription;

    /**
     * <p>The name of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>First job</p>
     */
    @NameInMap("JobGroupName")
    public String jobGroupName;

    /**
     * <p>The guaranteed concurrency.  </p>
     * <ul>
     * <li>When the job starts, a minimum of N concurrent calls are guaranteed.</li>
     * <li>The sum of guaranteed concurrency for jobs of the same priority cannot exceed the instance concurrency.  </li>
     * <li>If the guaranteed concurrency is set to 0, the system intelligently allocates idle concurrency.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>The priority of the job group. Valid values:</p>
     * <ul>
     * <li><strong>Urgent</strong>: urgent job.</li>
     * <li><strong>Daily</strong>: daily job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The list of caller numbers for redialing.</p>
     */
    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <p>The redial strategy in JSON format. The default value of the parameters in the JSON object is false.</p>
     * <ul>
     * <li><strong>emptyNumberIgnore</strong>: specifies whether to skip nonexistent numbers.</li>
     * <li><strong>inArrearsIgnore</strong>: specifies whether to skip numbers with overdue payments.</li>
     * <li><strong>outOfServiceIgnore</strong>: specifies whether to skip suspended numbers.</li>
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
     * <p><strong>[Deprecated]</strong></p>
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
     * <p>The execution strategy of the job.  </p>
     * <ul>
     * <li>repeatBy: the repetition type. Valid values: Once (no repetition), Week (weekly repetition), and Month (monthly repetition).  </li>
     * <li>startTime: the start time of the time-based strategy.</li>
     * <li>endTime: the end time of the time-based strategy.  <blockquote>
     * <p>Execution methods:</p>
     * <ul>
     * <li>If the start and end times of the strategy are not specified, the execution method is immediate execution.</li>
     * <li>If the strategy time is specified, the job is executed based on the time, and the repetition type repeatBy must be selected.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>workingTime: the time period during which outbound calls can be made.</li>
     * <li>maxAttemptsPerDay: the maximum number of call attempts per day for numbers under this job.</li>
     * <li>minAttemptInterval: the retry interval for numbers, in minutes.</li>
     * <li>routingStrategy: the number strategy. Valid values: None (not specified), LocalFirst (local numbers first), and LocalProvinceFirst (local province numbers first).</li>
     * <li>repeatDays: the execution days corresponding to the repetition type. If the repetition type RepeatBy is Week, 0 represents Sunday, and 1 to 6 represent Monday to Saturday. If the repetition cycle RepeatBy is Month, 1 to 31 represent the 1st to the 31st day. Months without the specified date are not executed. For example, if the 30th is selected, the job is not executed in February.</li>
     * <li>repeatable: specifies whether to enable cyclic jobs. Valid values: true and false.</li>
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
