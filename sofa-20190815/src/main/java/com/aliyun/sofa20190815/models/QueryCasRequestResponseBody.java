// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasRequestResponseBodyData> data;

    public static QueryCasRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestResponseBody self = new QueryCasRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasRequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasRequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasRequestResponseBody setData(java.util.List<QueryCasRequestResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasRequestResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasRequestResponseBodyDataTasksRequest extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Token")
        public String token;

        public static QueryCasRequestResponseBodyDataTasksRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestResponseBodyDataTasksRequest self = new QueryCasRequestResponseBodyDataTasksRequest();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestResponseBodyDataTasksRequest setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestResponseBodyDataTasksRequest setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryCasRequestResponseBodyDataTasksRequest setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class QueryCasRequestResponseBodyDataTasks extends TeaModel {
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
        public QueryCasRequestResponseBodyDataTasksRequest request;

        public static QueryCasRequestResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestResponseBodyDataTasks self = new QueryCasRequestResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestResponseBodyDataTasks setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryCasRequestResponseBodyDataTasks setExecutionTimes(Long executionTimes) {
            this.executionTimes = executionTimes;
            return this;
        }
        public Long getExecutionTimes() {
            return this.executionTimes;
        }

        public QueryCasRequestResponseBodyDataTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestResponseBodyDataTasks setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCasRequestResponseBodyDataTasks setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCasRequestResponseBodyDataTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasRequestResponseBodyDataTasks setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasRequestResponseBodyDataTasks setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasRequestResponseBodyDataTasks setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasRequestResponseBodyDataTasks setRequest(QueryCasRequestResponseBodyDataTasksRequest request) {
            this.request = request;
            return this;
        }
        public QueryCasRequestResponseBodyDataTasksRequest getRequest() {
            return this.request;
        }

    }

    public static class QueryCasRequestResponseBodyData extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("Id")
        public String id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Tasks")
        public java.util.List<QueryCasRequestResponseBodyDataTasks> tasks;

        public static QueryCasRequestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasRequestResponseBodyData self = new QueryCasRequestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasRequestResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryCasRequestResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasRequestResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryCasRequestResponseBodyData setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public QueryCasRequestResponseBodyData setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public QueryCasRequestResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasRequestResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public QueryCasRequestResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasRequestResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasRequestResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasRequestResponseBodyData setTasks(java.util.List<QueryCasRequestResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<QueryCasRequestResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
