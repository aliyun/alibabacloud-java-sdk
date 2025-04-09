// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyJobGroupRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    @NameInMap("Description")
    public String description;

    @NameInMap("FlashSmsExtras")
    public String flashSmsExtras;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3edc0260-6f7c-4de4-8535-09372240618b</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>Draft</p>
     */
    @NameInMap("JobGroupStatus")
    public String jobGroupStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;emptyNumberIgnore\&quot;:false,\&quot;inArrearsIgnore\&quot;:false,\&quot;outOfServiceIgnore\&quot;:false}</p>
     */
    @NameInMap("RecallStrategyJson")
    public String recallStrategyJson;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RingingDuration")
    public Long ringingDuration;

    /**
     * <strong>example:</strong>
     * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <strong>example:</strong>
     * <p>5a3940ce-a12f-4222-9f0f-605a9b89ea7c</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;maxAttemptsPerDay\&quot;:\&quot;0\&quot;,\&quot;minAttemptInterval\&quot;:\&quot;5\&quot;,\&quot;Id\&quot;:\&quot;689fc584-7f9f-4dc2-933d-8711beef7b15\&quot;}</p>
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
