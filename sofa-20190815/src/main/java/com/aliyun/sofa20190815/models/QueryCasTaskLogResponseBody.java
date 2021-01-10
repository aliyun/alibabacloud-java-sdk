// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasTaskLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasTaskLogResponseBodyData> data;

    public static QueryCasTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasTaskLogResponseBody self = new QueryCasTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasTaskLogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasTaskLogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasTaskLogResponseBody setData(java.util.List<QueryCasTaskLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasTaskLogResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasTaskLogResponseBodyDataIaasErrorInfo extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("StatusCode")
        public Long statusCode;

        public static QueryCasTaskLogResponseBodyDataIaasErrorInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCasTaskLogResponseBodyDataIaasErrorInfo self = new QueryCasTaskLogResponseBodyDataIaasErrorInfo();
            return TeaModel.build(map, self);
        }

        public QueryCasTaskLogResponseBodyDataIaasErrorInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryCasTaskLogResponseBodyDataIaasErrorInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryCasTaskLogResponseBodyDataIaasErrorInfo setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryCasTaskLogResponseBodyDataIaasErrorInfo setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryCasTaskLogResponseBodyDataIaasErrorInfo setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Long getStatusCode() {
            return this.statusCode;
        }

    }

    public static class QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders self = new QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders();
            return TeaModel.build(map, self);
        }

        public QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryCasTaskLogResponseBodyDataIaasRequest extends TeaModel {
        @NameInMap("RequestBody")
        public String requestBody;

        @NameInMap("RequestMethod")
        public String requestMethod;

        @NameInMap("RequestUrl")
        public String requestUrl;

        @NameInMap("RequestHeaders")
        public java.util.List<QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders> requestHeaders;

        public static QueryCasTaskLogResponseBodyDataIaasRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryCasTaskLogResponseBodyDataIaasRequest self = new QueryCasTaskLogResponseBodyDataIaasRequest();
            return TeaModel.build(map, self);
        }

        public QueryCasTaskLogResponseBodyDataIaasRequest setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public QueryCasTaskLogResponseBodyDataIaasRequest setRequestMethod(String requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public String getRequestMethod() {
            return this.requestMethod;
        }

        public QueryCasTaskLogResponseBodyDataIaasRequest setRequestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            return this;
        }
        public String getRequestUrl() {
            return this.requestUrl;
        }

        public QueryCasTaskLogResponseBodyDataIaasRequest setRequestHeaders(java.util.List<QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<QueryCasTaskLogResponseBodyDataIaasRequestRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

    }

    public static class QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders build(java.util.Map<String, ?> map) throws Exception {
            QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders self = new QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders();
            return TeaModel.build(map, self);
        }

        public QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryCasTaskLogResponseBodyDataIaasResponse extends TeaModel {
        @NameInMap("ResponseBody")
        public String responseBody;

        @NameInMap("ResponseHeaders")
        public java.util.List<QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders> responseHeaders;

        public static QueryCasTaskLogResponseBodyDataIaasResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryCasTaskLogResponseBodyDataIaasResponse self = new QueryCasTaskLogResponseBodyDataIaasResponse();
            return TeaModel.build(map, self);
        }

        public QueryCasTaskLogResponseBodyDataIaasResponse setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public String getResponseBody() {
            return this.responseBody;
        }

        public QueryCasTaskLogResponseBodyDataIaasResponse setResponseHeaders(java.util.List<QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public java.util.List<QueryCasTaskLogResponseBodyDataIaasResponseResponseHeaders> getResponseHeaders() {
            return this.responseHeaders;
        }

    }

    public static class QueryCasTaskLogResponseBodyData extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("LogTime")
        public String logTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Source")
        public String source;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskTimes")
        public Long taskTimes;

        @NameInMap("Type")
        public String type;

        @NameInMap("IaasErrorInfo")
        public QueryCasTaskLogResponseBodyDataIaasErrorInfo iaasErrorInfo;

        @NameInMap("IaasRequest")
        public QueryCasTaskLogResponseBodyDataIaasRequest iaasRequest;

        @NameInMap("IaasResponse")
        public QueryCasTaskLogResponseBodyDataIaasResponse iaasResponse;

        public static QueryCasTaskLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasTaskLogResponseBodyData self = new QueryCasTaskLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasTaskLogResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryCasTaskLogResponseBodyData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public QueryCasTaskLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCasTaskLogResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCasTaskLogResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCasTaskLogResponseBodyData setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public QueryCasTaskLogResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryCasTaskLogResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryCasTaskLogResponseBodyData setTaskTimes(Long taskTimes) {
            this.taskTimes = taskTimes;
            return this;
        }
        public Long getTaskTimes() {
            return this.taskTimes;
        }

        public QueryCasTaskLogResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasTaskLogResponseBodyData setIaasErrorInfo(QueryCasTaskLogResponseBodyDataIaasErrorInfo iaasErrorInfo) {
            this.iaasErrorInfo = iaasErrorInfo;
            return this;
        }
        public QueryCasTaskLogResponseBodyDataIaasErrorInfo getIaasErrorInfo() {
            return this.iaasErrorInfo;
        }

        public QueryCasTaskLogResponseBodyData setIaasRequest(QueryCasTaskLogResponseBodyDataIaasRequest iaasRequest) {
            this.iaasRequest = iaasRequest;
            return this;
        }
        public QueryCasTaskLogResponseBodyDataIaasRequest getIaasRequest() {
            return this.iaasRequest;
        }

        public QueryCasTaskLogResponseBodyData setIaasResponse(QueryCasTaskLogResponseBodyDataIaasResponse iaasResponse) {
            this.iaasResponse = iaasResponse;
            return this;
        }
        public QueryCasTaskLogResponseBodyDataIaasResponse getIaasResponse() {
            return this.iaasResponse;
        }

    }

}
