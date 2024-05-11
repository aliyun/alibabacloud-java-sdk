// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateExperimentRequest extends TeaModel {
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
    @NameInMap("LayerId")
    public String layerId;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRequest self = new CreateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public CreateExperimentRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public CreateExperimentRequest setCoreMetricId(String coreMetricId) {
        this.coreMetricId = coreMetricId;
        return this;
    }
    public String getCoreMetricId() {
        return this.coreMetricId;
    }

    public CreateExperimentRequest setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
        return this;
    }
    public String getCrowdIds() {
        return this.crowdIds;
    }

    public CreateExperimentRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public CreateExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExperimentRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateExperimentRequest setFlow(Integer flow) {
        this.flow = flow;
        return this;
    }
    public Integer getFlow() {
        return this.flow;
    }

    public CreateExperimentRequest setFocusMetricIds(String focusMetricIds) {
        this.focusMetricIds = focusMetricIds;
        return this;
    }
    public String getFocusMetricIds() {
        return this.focusMetricIds;
    }

    public CreateExperimentRequest setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public CreateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
