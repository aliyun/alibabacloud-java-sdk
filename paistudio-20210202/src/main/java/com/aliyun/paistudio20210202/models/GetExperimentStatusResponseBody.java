// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentStatusResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<GetExperimentStatusResponseBodyNodes> nodes;

    /**
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetExperimentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentStatusResponseBody self = new GetExperimentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentStatusResponseBody setNodes(java.util.List<GetExperimentStatusResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<GetExperimentStatusResponseBodyNodes> getNodes() {
        return this.nodes;
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

    public static class GetExperimentStatusResponseBodyNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-01-21T18:12:35.232Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <strong>example:</strong>
         * <p>job-mewqhd72nsrqujn1px</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>id-2317-1608984201281-74996</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>flow-wayrh3k605s7i51wey</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>node-6hc0eocnmzf4pk9njc</p>
         */
        @NameInMap("RunNodeId")
        public String runNodeId;

        /**
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetExperimentStatusResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentStatusResponseBodyNodes self = new GetExperimentStatusResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public GetExperimentStatusResponseBodyNodes setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetExperimentStatusResponseBodyNodes setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetExperimentStatusResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
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

        public GetExperimentStatusResponseBodyNodes setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetExperimentStatusResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
