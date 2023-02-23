// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunsResponseBody extends TeaModel {
    @NameInMap("PipelineRuns")
    public java.util.List<ListPipelineRunsResponseBodyPipelineRuns> pipelineRuns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPipelineRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsResponseBody self = new ListPipelineRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsResponseBody setPipelineRuns(java.util.List<ListPipelineRunsResponseBodyPipelineRuns> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
        return this;
    }
    public java.util.List<ListPipelineRunsResponseBodyPipelineRuns> getPipelineRuns() {
        return this.pipelineRuns;
    }

    public ListPipelineRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRunsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelineRunsResponseBodyPipelineRuns extends TeaModel {
        @NameInMap("Accessibility")
        public String accessibility;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("ParentUserId")
        public String parentUserId;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        @NameInMap("PipelineRunUri")
        public String pipelineRunUri;

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

        public static ListPipelineRunsResponseBodyPipelineRuns build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsResponseBodyPipelineRuns self = new ListPipelineRunsResponseBodyPipelineRuns();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsResponseBodyPipelineRuns setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setParentUserId(String parentUserId) {
            this.parentUserId = parentUserId;
            return this;
        }
        public String getParentUserId() {
            return this.parentUserId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineRunUri(String pipelineRunUri) {
            this.pipelineRunUri = pipelineRunUri;
            return this;
        }
        public String getPipelineRunUri() {
            return this.pipelineRunUri;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
