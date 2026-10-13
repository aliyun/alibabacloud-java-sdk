// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyJobGroupRequest extends TeaModel {
    /**
     * <p>The caller number.</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>Modified job group</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration parameters for flash message push in JSON format, including the configuration information of third-party flash messages.</p>
     * <p>templateId: the flash message template ID.<br>configId: the flash message configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;templateId&quot;:&quot;10471&quot;,&quot;configId&quot;:&quot;8037f524-6ff2-4dbe-bb28-f59234ea7a64&quot;}</p>
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
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3edc0260-6f7c-4de4-8535-09372240618b</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Draft: draft.</li>
     * <li>Paused: paused.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Draft</p>
     */
    @NameInMap("JobGroupStatus")
    public String jobGroupStatus;

    /**
     * <p>The guaranteed concurrency.
     * When a job starts, a minimum of N concurrent calls are guaranteed.
     * The sum of guaranteed concurrency values for jobs of the same priority cannot exceed the instance concurrency.
     * If the guaranteed concurrency is set to 0, the system intelligently allocates idle concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>The job name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Modified job group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The job group priority. Valid values:</p>
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
     * <p>The list of caller numbers for recall.</p>
     */
    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <p>The JSON string of the recall strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;emptyNumberIgnore&quot;:false,&quot;inArrearsIgnore&quot;:false,&quot;outOfServiceIgnore&quot;:false}</p>
     */
    @NameInMap("RecallStrategyJson")
    public String recallStrategyJson;

    /**
     * <p>The optimal ringing duration.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RingingDuration")
    public Long ringingDuration;

    /**
     * <p>The scenario ID. This is a legacy parameter. Use ScriptId instead.</p>
     * <blockquote>
     * <p>This parameter is a legacy parameter. You can pass any value. Keep it consistent with the ScriptId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5a3940ce-a12f-4222-9f0f-605a9b89ea7c</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The job execution strategy.</p>
     * <ul>
     * <li>id: the job group strategy ID. You can obtain it from the StrategyId response parameter of the DescribeJobGroup operation.</li>
     * <li>repeatBy: the recurrence type. Valid values: Once (no recurrence), Day (daily), Week (weekly), and Month (monthly).</li>
     * <li>startTime: the start time of the strategy.</li>
     * <li>endTime: the end time of the strategy.</li>
     * <li>workingTime: the time period during which outbound calls are allowed.</li>
     * <li>maxAttemptsPerDay: the maximum number of call attempts per day for a phone number under this job.</li>
     * <li>minAttemptInterval: the retry interval for a phone number, in minutes.</li>
     * <li>routingStrategy: the phone number strategy. Valid values: None (not specified), LocalFirst (local numbers first), and LocalProvinceFirst (local province numbers first).</li>
     * <li>repeatDays: the execution days corresponding to the recurrence type. If RepeatBy is Week, 0 indicates Sunday, and 1 to 6 indicate Monday to Saturday. If RepeatBy is Month, 1 to 31 indicate the 1st to the 31st day of the month. If a month does not have the specified day, the job is not executed in that month. For example, if the 30th is selected, the job is not executed in February.</li>
     * <li>repeatable: specifies whether to enable recurring jobs. Valid values: true and false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},&quot;id&quot;:&quot;cdca9ed7-6470-42d0-afb3-a41e08b41383&quot;,{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    public static ModifyJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobGroupRequest self = new ModifyJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyJobGroupRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public ModifyJobGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyJobGroupRequest setFlashSmsExtras(String flashSmsExtras) {
        this.flashSmsExtras = flashSmsExtras;
        return this;
    }
    public String getFlashSmsExtras() {
        return this.flashSmsExtras;
    }

    public ModifyJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyJobGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public ModifyJobGroupRequest setJobGroupStatus(String jobGroupStatus) {
        this.jobGroupStatus = jobGroupStatus;
        return this;
    }
    public String getJobGroupStatus() {
        return this.jobGroupStatus;
    }

    public ModifyJobGroupRequest setMinConcurrency(Long minConcurrency) {
        this.minConcurrency = minConcurrency;
        return this;
    }
    public Long getMinConcurrency() {
        return this.minConcurrency;
    }

    public ModifyJobGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyJobGroupRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifyJobGroupRequest setRecallCallingNumber(java.util.List<String> recallCallingNumber) {
        this.recallCallingNumber = recallCallingNumber;
        return this;
    }
    public java.util.List<String> getRecallCallingNumber() {
        return this.recallCallingNumber;
    }

    public ModifyJobGroupRequest setRecallStrategyJson(String recallStrategyJson) {
        this.recallStrategyJson = recallStrategyJson;
        return this;
    }
    public String getRecallStrategyJson() {
        return this.recallStrategyJson;
    }

    public ModifyJobGroupRequest setRingingDuration(Long ringingDuration) {
        this.ringingDuration = ringingDuration;
        return this;
    }
    public Long getRingingDuration() {
        return this.ringingDuration;
    }

    public ModifyJobGroupRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public ModifyJobGroupRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyJobGroupRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

}
