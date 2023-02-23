// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponseBody extends TeaModel {
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

    @NameInMap("PipelineRunUri")
    public String pipelineRunUri;

    @NameInMap("RequestId")
    public String requestId;

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

    public static GetPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunResponseBody self = new GetPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetPipelineRunResponseBody setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public GetPipelineRunResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetPipelineRunResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetPipelineRunResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetPipelineRunResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetPipelineRunResponseBody setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    public String getManifest() {
        return this.manifest;
    }

    public GetPipelineRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPipelineRunResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPipelineRunResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPipelineRunResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public GetPipelineRunResponseBody setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public String getParentUserId() {
        return this.parentUserId;
    }

    public GetPipelineRunResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineRunResponseBody setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public GetPipelineRunResponseBody setPipelineRunUri(String pipelineRunUri) {
        this.pipelineRunUri = pipelineRunUri;
        return this;
    }
    public String getPipelineRunUri() {
        return this.pipelineRunUri;
    }

    public GetPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineRunResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetPipelineRunResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetPipelineRunResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetPipelineRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetPipelineRunResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetPipelineRunResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
