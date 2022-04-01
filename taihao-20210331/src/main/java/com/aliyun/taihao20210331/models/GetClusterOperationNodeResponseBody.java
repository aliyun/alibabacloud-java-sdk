// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationNodeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetClusterOperationNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationNodeResponseBody self = new GetClusterOperationNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterOperationNodeResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetClusterOperationNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterOperationNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterOperationNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        // endTime
        @NameInMap("endTime")
        public Long endTime;

        // hasChildOperationNodes
        @NameInMap("hasChildOperationNodes")
        public Boolean hasChildOperationNodes;

        // hasOperationTask
        @NameInMap("hasOperationTask")
        public Boolean hasOperationTask;

        // operationId
        @NameInMap("operationId")
        public String operationId;

        // operationNodeId
        @NameInMap("operationNodeId")
        public String operationNodeId;

        // operationNodeName
        @NameInMap("operationNodeName")
        public String operationNodeName;

        // startTime
        @NameInMap("startTime")
        public Long startTime;

        // status
        @NameInMap("status")
        public String status;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Data setHasChildOperationNodes(Boolean hasChildOperationNodes) {
            this.hasChildOperationNodes = hasChildOperationNodes;
            return this;
        }
        public Boolean getHasChildOperationNodes() {
            return this.hasChildOperationNodes;
        }

        public Data setHasOperationTask(Boolean hasOperationTask) {
            this.hasOperationTask = hasOperationTask;
            return this;
        }
        public Boolean getHasOperationTask() {
            return this.hasOperationTask;
        }

        public Data setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public Data setOperationNodeId(String operationNodeId) {
            this.operationNodeId = operationNodeId;
            return this;
        }
        public String getOperationNodeId() {
            return this.operationNodeId;
        }

        public Data setOperationNodeName(String operationNodeName) {
            this.operationNodeName = operationNodeName;
            return this;
        }
        public String getOperationNodeName() {
            return this.operationNodeName;
        }

        public Data setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public Data setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
