// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyJobGroupRequest extends TeaModel {
    /**
     * <p>The calling numbers for the job group.</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The description of the job group.</p>
     * 
     * <strong>example:</strong>
     * <p>修改后的作业组</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The flash SMS configuration, specified as a JSON string. This may include settings for third-party flash SMS services.</p>
     * <p><code>templateId</code>: The flash SMS template ID.<br>
     * <code>configId</code>: The flash SMS configuration ID.<br></p>
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
     * <p>The job group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3edc0260-6f7c-4de4-8535-09372240618b</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>The status of the job group. Valid values:</p>
     * <ul>
     * <li><p><code>Draft</code>: The job group is in a draft state.</p>
     * </li>
     * <li><p><code>Paused</code>: The job group is paused.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Draft</p>
     */
    @NameInMap("JobGroupStatus")
    public String jobGroupStatus;

    /**
     * <p>The guaranteed minimum number of concurrent calls for the job group. The sum of this value for all job groups with the same priority cannot exceed the instance\&quot;s total concurrency. If you set this parameter to <code>0</code>, the system dynamically allocates available lines from a shared pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>The name of the job group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>修改后的作业组</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority of the job group. Valid values:</p>
     * <ul>
     * <li><p><strong>Urgent</strong>: An urgent job.</p>
     * </li>
     * <li><p><strong>Daily</strong>: A routine job.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The recall calling numbers.</p>
     */
    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <p>A JSON string that defines the recall strategy.</p>
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
     * <p>The scenario ID. (This is a legacy parameter. Use <code>ScriptId</code> instead.)</p>
     * <blockquote>
     * <p>You can pass any value for this legacy parameter, but we recommend using the same value as <code>ScriptId</code> for consistency.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>The ID of the script for the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>5a3940ce-a12f-4222-9f0f-605a9b89ea7c</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>A JSON string that defines the execution strategy for the job group.</p>
     * <ul>
     * <li><p><code>id</code>: The ID of the job group strategy. You can obtain this ID from the <code>StrategyId</code> parameter returned by the <code>DescribeJobGroup</code> operation.</p>
     * </li>
     * <li><p><code>repeatBy</code>: The frequency of the job. Valid values: <code>Once</code> (does not repeat), <code>Day</code> (repeats daily), <code>Week</code> (repeats weekly), and <code>Month</code> (repeats monthly).</p>
     * </li>
     * <li><p><code>startTime</code>: The start time of the strategy.</p>
     * </li>
     * <li><p><code>endTime</code>: The end time of the strategy.</p>
     * </li>
     * <li><p><code>workingTime</code>: The time windows for making outbound calls.</p>
     * </li>
     * <li><p><code>maxAttemptsPerDay</code>: The maximum number of call attempts per day for a number in this job group.</p>
     * </li>
     * <li><p><code>minAttemptInterval</code>: The minimum interval, in minutes, between call retries to the same number.</p>
     * </li>
     * <li><p><code>routingStrategy</code>: The number routing strategy. Valid values: <code>None</code> (not specified), <code>LocalFirst</code> (prioritizes numbers in the same city), and <code>LocalProvinceFirst</code> (prioritizes numbers in the same province).</p>
     * </li>
     * <li><p><code>repeatDays</code>: The specific days to run the job, based on the <code>repeatBy</code> value. If <code>repeatBy</code> is <code>Week</code>, <code>0</code> indicates Sunday, and <code>1</code> through <code>6</code> indicate Monday through Saturday. If <code>repeatBy</code> is <code>Month</code>, valid values are <code>1</code> through <code>31</code>. If a month does not have the specified day (for example, day 30 in February), the job does not run on that day.</p>
     * </li>
     * <li><p><code>repeatable</code>: Whether the job is recurring. Valid values are <code>true</code> and <code>false</code>.</p>
     * </li>
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
