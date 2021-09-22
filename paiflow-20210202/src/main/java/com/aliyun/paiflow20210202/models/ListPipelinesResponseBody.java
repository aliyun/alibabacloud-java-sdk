// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipelines")
    public java.util.List<ListPipelinesResponseBodyPipelines> pipelines;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponseBody self = new ListPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinesResponseBody setPipelines(java.util.List<ListPipelinesResponseBodyPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
    public java.util.List<ListPipelinesResponseBodyPipelines> getPipelines() {
        return this.pipelines;
    }

    public ListPipelinesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelinesResponseBodyPipelines extends TeaModel {
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

        public static ListPipelinesResponseBodyPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelines self = new ListPipelinesResponseBodyPipelines();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelines setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelinesResponseBodyPipelines setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListPipelinesResponseBodyPipelines setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListPipelinesResponseBodyPipelines setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListPipelinesResponseBodyPipelines setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListPipelinesResponseBodyPipelines setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPipelinesResponseBodyPipelines setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListPipelinesResponseBodyPipelines setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
