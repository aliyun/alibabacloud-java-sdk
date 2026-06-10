// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchRepeatJobRequest extends TeaModel {
    /**
     * <p>Calling number</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>Job group description</p>
     * 
     * <strong>example:</strong>
     * <p>测试3</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Job group status</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded,NoInteraction,Failed,Cancelled</p>
     */
    @NameInMap("FilterStatus")
    public String filterStatus;

    /**
     * <p>Configuration parameters for flash SMS push, in JSON format, including configuration information for third-party flash SMS.</p>
     * <ul>
     * <li><p>Template ID: Flash SMS template ID.</p>
     * </li>
     * <li><p>Config ID: Flash SMS configuration ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;templateId&quot;:&quot;10471&quot;,&quot;configId&quot;:&quot;8037f524-6ff2-4dbe-bb28-f59234ea7a64&quot;}</p>
     */
    @NameInMap("FlashSmsExtras")
    public String flashSmsExtras;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2bfa5ae4-7185-4227-a3b8-328f26f11be1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Minimum concurrency</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    /**
     * <p>Job name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Job priority</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>Redial calling number list</p>
     */
    @NameInMap("RecallCallingNumber")
    public java.util.List<String> recallCallingNumber;

    /**
     * <p>Redial policy JSON</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;emptyNumberIgnore\&quot;:false,\&quot;inArrearsIgnore\&quot;:false,\&quot;outOfServiceIgnore\&quot;:false}</p>
     */
    @NameInMap("RecallStrategyJson")
    public String recallStrategyJson;

    /**
     * <p>Ringing duration</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RingingDuration")
    public Long ringingDuration;

    /**
     * <p>Script ID</p>
     * 
     * <strong>example:</strong>
     * <p>0fe7f71c-8771-42ef-9bb1-19aa16ae7120</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>Job group ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c4f8a3d3-2e94-4bd4-aef8-e35f663d4847</p>
     */
    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    /**
     * <p>Job execution policy</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;maxAttemptsPerDay\&quot;:1,\&quot;minAttemptInterval\&quot;:1,\&quot;routingStrategy\&quot;:\&quot;LocalFirst\&quot;}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    public static CreateBatchRepeatJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchRepeatJobRequest self = new CreateBatchRepeatJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchRepeatJobRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public CreateBatchRepeatJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBatchRepeatJobRequest setFilterStatus(String filterStatus) {
        this.filterStatus = filterStatus;
        return this;
    }
    public String getFilterStatus() {
        return this.filterStatus;
    }

    public CreateBatchRepeatJobRequest setFlashSmsExtras(String flashSmsExtras) {
        this.flashSmsExtras = flashSmsExtras;
        return this;
    }
    public String getFlashSmsExtras() {
        return this.flashSmsExtras;
    }

    public CreateBatchRepeatJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBatchRepeatJobRequest setMinConcurrency(Long minConcurrency) {
        this.minConcurrency = minConcurrency;
        return this;
    }
    public Long getMinConcurrency() {
        return this.minConcurrency;
    }

    public CreateBatchRepeatJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBatchRepeatJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateBatchRepeatJobRequest setRecallCallingNumber(java.util.List<String> recallCallingNumber) {
        this.recallCallingNumber = recallCallingNumber;
        return this;
    }
    public java.util.List<String> getRecallCallingNumber() {
        return this.recallCallingNumber;
    }

    public CreateBatchRepeatJobRequest setRecallStrategyJson(String recallStrategyJson) {
        this.recallStrategyJson = recallStrategyJson;
        return this;
    }
    public String getRecallStrategyJson() {
        return this.recallStrategyJson;
    }

    public CreateBatchRepeatJobRequest setRingingDuration(Long ringingDuration) {
        this.ringingDuration = ringingDuration;
        return this;
    }
    public Long getRingingDuration() {
        return this.ringingDuration;
    }

    public CreateBatchRepeatJobRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateBatchRepeatJobRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public CreateBatchRepeatJobRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

}
