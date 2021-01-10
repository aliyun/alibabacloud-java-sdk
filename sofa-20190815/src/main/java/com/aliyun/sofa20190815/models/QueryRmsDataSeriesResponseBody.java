// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsDataSeriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsDataSeriesResponseBodyResponse response;

    public static QueryRmsDataSeriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsDataSeriesResponseBody self = new QueryRmsDataSeriesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsDataSeriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsDataSeriesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsDataSeriesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsDataSeriesResponseBody setResponse(QueryRmsDataSeriesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsDataSeriesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsDataSeriesResponseBodyResponseDataResult extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsDataSeriesResponseBodyResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsDataSeriesResponseBodyResponseDataResult self = new QueryRmsDataSeriesResponseBodyResponseDataResult();
            return TeaModel.build(map, self);
        }

        public QueryRmsDataSeriesResponseBodyResponseDataResult setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsDataSeriesResponseBodyResponseDataResult setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsDataSeriesResponseBodyResponseData extends TeaModel {
        @NameInMap("ResultType")
        public String resultType;

        @NameInMap("Result")
        public java.util.List<QueryRmsDataSeriesResponseBodyResponseDataResult> result;

        public static QueryRmsDataSeriesResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsDataSeriesResponseBodyResponseData self = new QueryRmsDataSeriesResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsDataSeriesResponseBodyResponseData setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

        public QueryRmsDataSeriesResponseBodyResponseData setResult(java.util.List<QueryRmsDataSeriesResponseBodyResponseDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryRmsDataSeriesResponseBodyResponseDataResult> getResult() {
            return this.result;
        }

    }

    public static class QueryRmsDataSeriesResponseBodyResponse extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("Query")
        public String query;

        @NameInMap("Status")
        public String status;

        @NameInMap("Data")
        public QueryRmsDataSeriesResponseBodyResponseData data;

        public static QueryRmsDataSeriesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsDataSeriesResponseBodyResponse self = new QueryRmsDataSeriesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsDataSeriesResponseBodyResponse setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public QueryRmsDataSeriesResponseBodyResponse setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public QueryRmsDataSeriesResponseBodyResponse setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public QueryRmsDataSeriesResponseBodyResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRmsDataSeriesResponseBodyResponse setData(QueryRmsDataSeriesResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsDataSeriesResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
