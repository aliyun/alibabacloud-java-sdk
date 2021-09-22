// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListRunsStatusRequest extends TeaModel {
    @NameInMap("Runs")
    public java.util.List<String> runs;

    @NameInMap("Nodes")
    public java.util.List<ListRunsStatusRequestNodes> nodes;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListRunsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRunsStatusRequest self = new ListRunsStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListRunsStatusRequest setRuns(java.util.List<String> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<String> getRuns() {
        return this.runs;
    }

    public ListRunsStatusRequest setNodes(java.util.List<ListRunsStatusRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListRunsStatusRequestNodes> getNodes() {
        return this.nodes;
    }

    public ListRunsStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListRunsStatusRequestNodes extends TeaModel {
        @NameInMap("RunId")
        public String runId;

        @NameInMap("NodeId")
        public String nodeId;

        public static ListRunsStatusRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            ListRunsStatusRequestNodes self = new ListRunsStatusRequestNodes();
            return TeaModel.build(map, self);
        }

        public ListRunsStatusRequestNodes setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListRunsStatusRequestNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
