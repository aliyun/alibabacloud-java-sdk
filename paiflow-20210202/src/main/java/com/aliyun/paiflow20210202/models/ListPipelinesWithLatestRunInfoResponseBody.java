// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinesWithLatestRunInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipelines")
    public java.util.List<ListPipelinesWithLatestRunInfoResponseBodyPipelines> pipelines;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPipelinesWithLatestRunInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesWithLatestRunInfoResponseBody self = new ListPipelinesWithLatestRunInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesWithLatestRunInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinesWithLatestRunInfoResponseBody setPipelines(java.util.List<ListPipelinesWithLatestRunInfoResponseBodyPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
    public java.util.List<ListPipelinesWithLatestRunInfoResponseBodyPipelines> getPipelines() {
        return this.pipelines;
    }

    public ListPipelinesWithLatestRunInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelinesWithLatestRunInfoResponseBodyPipelines extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Version")
        public String version;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListPipelinesWithLatestRunInfoResponseBodyPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesWithLatestRunInfoResponseBodyPipelines self = new ListPipelinesWithLatestRunInfoResponseBodyPipelines();
            return TeaModel.build(map, self);
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListPipelinesWithLatestRunInfoResponseBodyPipelines setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
