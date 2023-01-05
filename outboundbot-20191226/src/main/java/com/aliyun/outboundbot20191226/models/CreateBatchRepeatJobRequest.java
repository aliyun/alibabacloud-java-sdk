// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchRepeatJobRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    @NameInMap("Description")
    public String description;

    @NameInMap("FilterStatus")
    public String filterStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MinConcurrency")
    public Long minConcurrency;

    @NameInMap("Name")
    public String name;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("RecallStrategyJson")
    public String recallStrategyJson;

    @NameInMap("RingingDuration")
    public Long ringingDuration;

    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("SourceGroupId")
    public String sourceGroupId;

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
