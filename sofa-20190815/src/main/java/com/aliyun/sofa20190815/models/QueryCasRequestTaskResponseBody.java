// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasRequestTaskResponseBodyData> data;

    public static QueryCasRequestTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestTaskResponseBody self = new QueryCasRequestTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasRequestTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasRequestTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasRequestTaskResponseBody setData(java.util.List<QueryCasRequestTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasRequestTaskResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasRequestTaskResponseBodyDataRequest extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        public static QueryCasRequestTaskResponseBodyDataRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestTaskResponseBodyDataRequest self = new QueryCasRequestTaskResponseBodyDataRequest();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestTaskResponseBodyDataRequest setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestTaskResponseBodyDataRequest setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryCasRequestTaskResponseBodyDataRequest setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public QueryCasRequestTaskResponseBodyDataRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryCasRequestTaskResponseBodyData extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("ExecutionTimes")
        public Long executionTimes;

        @NameInMap("Id")
        public String id;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Request")
        public QueryCasRequestTaskResponseBodyDataRequest request;

        public static QueryCasRequestTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestTaskResponseBodyData self = new QueryCasRequestTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestTaskResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryCasRequestTaskResponseBodyData setExecutionTimes(Long executionTimes) {
            this.executionTimes = executionTimes;
            return this;
        }
        public Long getExecutionTimes() {
            return this.executionTimes;
        }

        public QueryCasRequestTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestTaskResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCasRequestTaskResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCasRequestTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasRequestTaskResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasRequestTaskResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasRequestTaskResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasRequestTaskResponseBodyData setRequest(QueryCasRequestTaskResponseBodyDataRequest request) {
            this.request = request;
            return this;
        }
        public QueryCasRequestTaskResponseBodyDataRequest getRequest() {
            return this.request;
        }

    }

}
