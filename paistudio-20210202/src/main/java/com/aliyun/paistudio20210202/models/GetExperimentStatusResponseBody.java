// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Nodes")
    public java.util.List<GetExperimentStatusResponseBodyNodes> nodes;

    public static GetExperimentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentStatusResponseBody self = new GetExperimentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetExperimentStatusResponseBody setNodes(java.util.List<GetExperimentStatusResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<GetExperimentStatusResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public static class GetExperimentStatusResponseBodyNodes extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("RunId")
        public String runId;

        @NameInMap("RunNodeId")
        public String runNodeId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("FinishedAt")
        public String finishedAt;

        public static GetExperimentStatusResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentStatusResponseBodyNodes self = new GetExperimentStatusResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public GetExperimentStatusResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetExperimentStatusResponseBodyNodes setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetExperimentStatusResponseBodyNodes setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetExperimentStatusResponseBodyNodes setRunNodeId(String runNodeId) {
            this.runNodeId = runNodeId;
            return this;
        }
        public String getRunNodeId() {
            return this.runNodeId;
        }

        public GetExperimentStatusResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetExperimentStatusResponseBodyNodes setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetExperimentStatusResponseBodyNodes setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

    }

}
