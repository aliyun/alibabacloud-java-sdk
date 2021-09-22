// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListRunsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Runs")
    public java.util.List<ListRunsResponseBodyRuns> runs;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunsResponseBody self = new ListRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRunsResponseBody setRuns(java.util.List<ListRunsResponseBodyRuns> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<ListRunsResponseBodyRuns> getRuns() {
        return this.runs;
    }

    public ListRunsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRunsResponseBodyRuns extends TeaModel {
        @NameInMap("RunId")
        public String runId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ParentUserId")
        public String parentUserId;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Source")
        public String source;

        @NameInMap("ExperimentId")
        public String experimentId;

        // 创建时间
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 修改时间
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        public static ListRunsResponseBodyRuns build(java.util.Map<String, ?> map) throws Exception {
            ListRunsResponseBodyRuns self = new ListRunsResponseBodyRuns();
            return TeaModel.build(map, self);
        }

        public ListRunsResponseBodyRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListRunsResponseBodyRuns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRunsResponseBodyRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRunsResponseBodyRuns setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListRunsResponseBodyRuns setParentUserId(String parentUserId) {
            this.parentUserId = parentUserId;
            return this;
        }
        public String getParentUserId() {
            return this.parentUserId;
        }

        public ListRunsResponseBodyRuns setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListRunsResponseBodyRuns setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListRunsResponseBodyRuns setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListRunsResponseBodyRuns setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListRunsResponseBodyRuns setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListRunsResponseBodyRuns setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRunsResponseBodyRuns setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRunsResponseBodyRuns setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListRunsResponseBodyRuns setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListRunsResponseBodyRuns setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

    }

}
