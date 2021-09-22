// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetRunResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // pipeline的id
    @NameInMap("PipelineId")
    public String pipelineId;

    // run的id
    @NameInMap("RunId")
    public String runId;

    // run的名字
    @NameInMap("Name")
    public String name;

    // run的状态
    @NameInMap("Status")
    public String status;

    // run的manifest
    @NameInMap("Manifest")
    public String manifest;

    // run的参数
    @NameInMap("Arguments")
    public String arguments;

    // 用户uid
    @NameInMap("UserId")
    public String userId;

    // 用户主账户的uid
    @NameInMap("ParentUserId")
    public String parentUserId;

    // run的开始 UTC 时间，格式 iso8601
    @NameInMap("StartedAt")
    public String startedAt;

    // run的结束 UTC 时间，格式 iso8601
    @NameInMap("FinishedAt")
    public String finishedAt;

    // run的根节点id
    @NameInMap("NodeId")
    public String nodeId;

    // run的运行时长，以s为单位
    @NameInMap("Duration")
    public Long duration;

    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // run的来源
    @NameInMap("Source")
    public String source;

    // run关联的实验id
    @NameInMap("ExperimentId")
    public String experimentId;

    // 选项
    @NameInMap("Options")
    public String options;

    // RuntimeManifest
    @NameInMap("RuntimeManifest")
    public String runtimeManifest;

    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    public static GetRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunResponseBody self = new GetRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public GetRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetRunResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRunResponseBody setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    public String getManifest() {
        return this.manifest;
    }

    public GetRunResponseBody setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public GetRunResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetRunResponseBody setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public String getParentUserId() {
        return this.parentUserId;
    }

    public GetRunResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetRunResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetRunResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetRunResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetRunResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRunResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetRunResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetRunResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public GetRunResponseBody setRuntimeManifest(String runtimeManifest) {
        this.runtimeManifest = runtimeManifest;
        return this;
    }
    public String getRuntimeManifest() {
        return this.runtimeManifest;
    }

    public GetRunResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetRunResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

}
