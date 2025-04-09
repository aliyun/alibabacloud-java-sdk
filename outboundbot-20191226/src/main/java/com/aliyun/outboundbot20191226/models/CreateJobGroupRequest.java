// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

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

    @NameInMap("JobGroupDescription")
    public String jobGroupDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobGroupName")
    public String jobGroupName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;emptyNumberIgnore\&quot;:true,\&quot;inArrearsIgnore\&quot;:true,\&quot;outOfServiceIgnore\&quot;:true}</p>
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
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;maxAttemptsPerDay\&quot;:1,\&quot;name\&quot;:\&quot;fa16dc2e-f778-44ab-8f25-54b7901df82a\&quot;,\&quot;startTime\&quot;:1640157314127,\&quot;endTime\&quot;:1640160914127,\&quot;minAttemptInterval\&quot;:10}</p>
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
