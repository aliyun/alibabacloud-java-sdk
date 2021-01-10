// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasRequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetCasRequestResponseBodyData data;

    public static GetCasRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCasRequestResponseBody self = new GetCasRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCasRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCasRequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCasRequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCasRequestResponseBody setData(GetCasRequestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCasRequestResponseBodyData getData() {
        return this.data;
    }

    public static class GetCasRequestResponseBodyDataTasksRequest extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Token")
        public String token;

        public static GetCasRequestResponseBodyDataTasksRequest build(java.util.Map<String, ?> map) throws Exception {
            GetCasRequestResponseBodyDataTasksRequest self = new GetCasRequestResponseBodyDataTasksRequest();
            return TeaModel.build(map, self);
        }

        public GetCasRequestResponseBodyDataTasksRequest setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCasRequestResponseBodyDataTasksRequest setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetCasRequestResponseBodyDataTasksRequest setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class GetCasRequestResponseBodyDataTasks extends TeaModel {
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
        public GetCasRequestResponseBodyDataTasksRequest request;

        public static GetCasRequestResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            GetCasRequestResponseBodyDataTasks self = new GetCasRequestResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public GetCasRequestResponseBodyDataTasks setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetCasRequestResponseBodyDataTasks setExecutionTimes(Long executionTimes) {
            this.executionTimes = executionTimes;
            return this;
        }
        public Long getExecutionTimes() {
            return this.executionTimes;
        }

        public GetCasRequestResponseBodyDataTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCasRequestResponseBodyDataTasks setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetCasRequestResponseBodyDataTasks setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetCasRequestResponseBodyDataTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCasRequestResponseBodyDataTasks setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCasRequestResponseBodyDataTasks setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetCasRequestResponseBodyDataTasks setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetCasRequestResponseBodyDataTasks setRequest(GetCasRequestResponseBodyDataTasksRequest request) {
            this.request = request;
            return this;
        }
        public GetCasRequestResponseBodyDataTasksRequest getRequest() {
            return this.request;
        }

    }

    public static class GetCasRequestResponseBodyData extends TeaModel {
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
        public java.util.List<GetCasRequestResponseBodyDataTasks> tasks;

        public static GetCasRequestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCasRequestResponseBodyData self = new GetCasRequestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCasRequestResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetCasRequestResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCasRequestResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetCasRequestResponseBodyData setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetCasRequestResponseBodyData setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public GetCasRequestResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCasRequestResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetCasRequestResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCasRequestResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCasRequestResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetCasRequestResponseBodyData setTasks(java.util.List<GetCasRequestResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetCasRequestResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
