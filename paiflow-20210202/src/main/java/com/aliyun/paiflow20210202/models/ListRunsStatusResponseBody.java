// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListRunsStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Runs")
    public java.util.List<ListRunsStatusResponseBodyRuns> runs;

    @NameInMap("Nodes")
    public java.util.List<ListRunsStatusResponseBodyNodes> nodes;

    public static ListRunsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunsStatusResponseBody self = new ListRunsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRunsStatusResponseBody setRuns(java.util.List<ListRunsStatusResponseBodyRuns> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<ListRunsStatusResponseBodyRuns> getRuns() {
        return this.runs;
    }

    public ListRunsStatusResponseBody setNodes(java.util.List<ListRunsStatusResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListRunsStatusResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public static class ListRunsStatusResponseBodyRuns extends TeaModel {
        // run的id
        @NameInMap("RunId")
        public String runId;

        // run状态
        @NameInMap("Status")
        public String status;

        // run名字
        @NameInMap("Name")
        public String name;

        // 用户id
        @NameInMap("UserId")
        public String userId;

        // 父账户id
        @NameInMap("ParentUserId")
        public String parentUserId;

        // 节点id
        @NameInMap("NodeId")
        public String nodeId;

        // 实验id
        @NameInMap("ExperimentId")
        public String experimentId;

        // 是否被删除
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        public static ListRunsStatusResponseBodyRuns build(java.util.Map<String, ?> map) throws Exception {
            ListRunsStatusResponseBodyRuns self = new ListRunsStatusResponseBodyRuns();
            return TeaModel.build(map, self);
        }

        public ListRunsStatusResponseBodyRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListRunsStatusResponseBodyRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRunsStatusResponseBodyRuns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRunsStatusResponseBodyRuns setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListRunsStatusResponseBodyRuns setParentUserId(String parentUserId) {
            this.parentUserId = parentUserId;
            return this;
        }
        public String getParentUserId() {
            return this.parentUserId;
        }

        public ListRunsStatusResponseBodyRuns setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListRunsStatusResponseBodyRuns setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListRunsStatusResponseBodyRuns setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

    }

    public static class ListRunsStatusResponseBodyNodes extends TeaModel {
        // 运行Id
        @NameInMap("RunId")
        public String runId;

        // 节点Id
        @NameInMap("NodeId")
        public String nodeId;

        // 状态
        @NameInMap("Status")
        public String status;

        // 输入artifact是否已保存
        @NameInMap("InputArtifactArchived")
        public Boolean inputArtifactArchived;

        // 输出artifact是否已保存
        @NameInMap("OutputArtifactArchived")
        public Boolean outputArtifactArchived;

        // 修改 UTC 时间，日期格式 iso8601
        @NameInMap("StartedAt")
        public String startedAt;

        // 修改 UTC 时间，日期格式 iso8601
        @NameInMap("FinishedAt")
        public String finishedAt;

        // 节点名
        @NameInMap("NodeName")
        public String nodeName;

        public static ListRunsStatusResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListRunsStatusResponseBodyNodes self = new ListRunsStatusResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListRunsStatusResponseBodyNodes setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListRunsStatusResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListRunsStatusResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRunsStatusResponseBodyNodes setInputArtifactArchived(Boolean inputArtifactArchived) {
            this.inputArtifactArchived = inputArtifactArchived;
            return this;
        }
        public Boolean getInputArtifactArchived() {
            return this.inputArtifactArchived;
        }

        public ListRunsStatusResponseBodyNodes setOutputArtifactArchived(Boolean outputArtifactArchived) {
            this.outputArtifactArchived = outputArtifactArchived;
            return this;
        }
        public Boolean getOutputArtifactArchived() {
            return this.outputArtifactArchived;
        }

        public ListRunsStatusResponseBodyNodes setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListRunsStatusResponseBodyNodes setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListRunsStatusResponseBodyNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
