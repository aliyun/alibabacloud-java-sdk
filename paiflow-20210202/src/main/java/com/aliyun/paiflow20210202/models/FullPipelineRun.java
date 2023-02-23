// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class FullPipelineRun extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Arguments")
    public String arguments;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("FinishedAt")
    public String finishedAt;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Manifest")
    public String manifest;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Options")
    public String options;

    @NameInMap("ParentUserId")
    public String parentUserId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("PipelineRunId")
    public String pipelineRunId;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StartedAt")
    public String startedAt;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FullPipelineRun build(java.util.Map<String, ?> map) throws Exception {
        FullPipelineRun self = new FullPipelineRun();
        return TeaModel.build(map, self);
    }

    public FullPipelineRun setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public FullPipelineRun setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public FullPipelineRun setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public FullPipelineRun setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public FullPipelineRun setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public FullPipelineRun setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public FullPipelineRun setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    public String getManifest() {
        return this.manifest;
    }

    public FullPipelineRun setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FullPipelineRun setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FullPipelineRun setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public FullPipelineRun setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public FullPipelineRun setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public String getParentUserId() {
        return this.parentUserId;
    }

    public FullPipelineRun setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public FullPipelineRun setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public FullPipelineRun setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public FullPipelineRun setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public FullPipelineRun setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public FullPipelineRun setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FullPipelineRun setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public FullPipelineRun setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
