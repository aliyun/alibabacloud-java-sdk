// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsDataTopksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsDataTopksResponseBodyResponse response;

    public static QueryRmsDataTopksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsDataTopksResponseBody self = new QueryRmsDataTopksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsDataTopksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsDataTopksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsDataTopksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsDataTopksResponseBody setResponse(QueryRmsDataTopksResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsDataTopksResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsDataTopksResponseBodyResponseDataResult extends TeaModel {
        @NameInMap("Port")
        public String port;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Value")
        public Long value;

        public static QueryRmsDataTopksResponseBodyResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsDataTopksResponseBodyResponseDataResult self = new QueryRmsDataTopksResponseBodyResponseDataResult();
            return TeaModel.build(map, self);
        }

        public QueryRmsDataTopksResponseBodyResponseDataResult setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryRmsDataTopksResponseBodyResponseDataResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public QueryRmsDataTopksResponseBodyResponseDataResult setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public QueryRmsDataTopksResponseBodyResponseDataResult setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsDataTopksResponseBodyResponseDataResult setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class QueryRmsDataTopksResponseBodyResponseData extends TeaModel {
        @NameInMap("ResultType")
        public String resultType;

        @NameInMap("Result")
        public java.util.List<QueryRmsDataTopksResponseBodyResponseDataResult> result;

        public static QueryRmsDataTopksResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsDataTopksResponseBodyResponseData self = new QueryRmsDataTopksResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsDataTopksResponseBodyResponseData setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

        public QueryRmsDataTopksResponseBodyResponseData setResult(java.util.List<QueryRmsDataTopksResponseBodyResponseDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryRmsDataTopksResponseBodyResponseDataResult> getResult() {
            return this.result;
        }

    }

    public static class QueryRmsDataTopksResponseBodyResponse extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("Query")
        public String query;

        @NameInMap("Status")
        public String status;

        @NameInMap("Data")
        public QueryRmsDataTopksResponseBodyResponseData data;

        public static QueryRmsDataTopksResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsDataTopksResponseBodyResponse self = new QueryRmsDataTopksResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsDataTopksResponseBodyResponse setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public QueryRmsDataTopksResponseBodyResponse setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public QueryRmsDataTopksResponseBodyResponse setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public QueryRmsDataTopksResponseBodyResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRmsDataTopksResponseBodyResponse setData(QueryRmsDataTopksResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsDataTopksResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
