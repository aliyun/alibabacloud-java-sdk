// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunsStatusRequest extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<ListPipelineRunsStatusRequestNodes> nodes;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("PipelineRuns")
    public java.util.List<String> pipelineRuns;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListPipelineRunsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsStatusRequest self = new ListPipelineRunsStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsStatusRequest setNodes(java.util.List<ListPipelineRunsStatusRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListPipelineRunsStatusRequestNodes> getNodes() {
        return this.nodes;
    }

    public ListPipelineRunsStatusRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public ListPipelineRunsStatusRequest setPipelineRuns(java.util.List<String> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
        return this;
    }
    public java.util.List<String> getPipelineRuns() {
        return this.pipelineRuns;
    }

    public ListPipelineRunsStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListPipelineRunsStatusRequestNodes extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        public static ListPipelineRunsStatusRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsStatusRequestNodes self = new ListPipelineRunsStatusRequestNodes();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsStatusRequestNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunsStatusRequestNodes setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

    }

}
