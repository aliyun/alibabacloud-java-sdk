// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public java.util.List<ListPipelineRunNodeStatusResponseBodyStatus> status;

    public static ListPipelineRunNodeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeStatusResponseBody self = new ListPipelineRunNodeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRunNodeStatusResponseBody setStatus(java.util.List<ListPipelineRunNodeStatusResponseBodyStatus> status) {
        this.status = status;
        return this;
    }
    public java.util.List<ListPipelineRunNodeStatusResponseBodyStatus> getStatus() {
        return this.status;
    }

    public static class ListPipelineRunNodeStatusResponseBodyStatus extends TeaModel {
        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("RuntimeInfo")
        public String runtimeInfo;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("Status")
        public String status;

        public static ListPipelineRunNodeStatusResponseBodyStatus build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunNodeStatusResponseBodyStatus self = new ListPipelineRunNodeStatusResponseBodyStatus();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunNodeStatusResponseBodyStatus setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListPipelineRunNodeStatusResponseBodyStatus setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunNodeStatusResponseBodyStatus setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListPipelineRunNodeStatusResponseBodyStatus setRuntimeInfo(String runtimeInfo) {
            this.runtimeInfo = runtimeInfo;
            return this;
        }
        public String getRuntimeInfo() {
            return this.runtimeInfo;
        }

        public ListPipelineRunNodeStatusResponseBodyStatus setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListPipelineRunNodeStatusResponseBodyStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
