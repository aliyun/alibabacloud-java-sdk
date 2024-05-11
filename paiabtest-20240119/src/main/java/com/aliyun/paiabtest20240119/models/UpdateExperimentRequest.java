// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateExperimentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    @NameInMap("Condition")
    public String condition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CoreMetricId")
    public String coreMetricId;

    @NameInMap("CrowdIds")
    public String crowdIds;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Flow")
    public Integer flow;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FocusMetricIds")
    public String focusMetricIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static UpdateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentRequest self = new UpdateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public UpdateExperimentRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public UpdateExperimentRequest setCoreMetricId(String coreMetricId) {
        this.coreMetricId = coreMetricId;
        return this;
    }
    public String getCoreMetricId() {
        return this.coreMetricId;
    }

    public UpdateExperimentRequest setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
        return this;
    }
    public String getCrowdIds() {
        return this.crowdIds;
    }

    public UpdateExperimentRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public UpdateExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateExperimentRequest setFlow(Integer flow) {
        this.flow = flow;
        return this;
    }
    public Integer getFlow() {
        return this.flow;
    }

    public UpdateExperimentRequest setFocusMetricIds(String focusMetricIds) {
        this.focusMetricIds = focusMetricIds;
        return this;
    }
    public String getFocusMetricIds() {
        return this.focusMetricIds;
    }

    public UpdateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
