// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setJobs(java.util.List<ListJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("ExecuteType")
        public String executeType;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PaiflowNodeId")
        public String paiflowNodeId;

        @NameInMap("RunId")
        public String runId;

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListJobsResponseBodyJobs setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public ListJobsResponseBodyJobs setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListJobsResponseBodyJobs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListJobsResponseBodyJobs setPaiflowNodeId(String paiflowNodeId) {
            this.paiflowNodeId = paiflowNodeId;
            return this;
        }
        public String getPaiflowNodeId() {
            return this.paiflowNodeId;
        }

        public ListJobsResponseBodyJobs setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyJobs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
