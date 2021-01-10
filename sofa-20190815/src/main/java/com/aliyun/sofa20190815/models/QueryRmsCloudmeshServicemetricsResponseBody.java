// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshServicemetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshServicemetricsResponseBodyResponse response;

    public static QueryRmsCloudmeshServicemetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshServicemetricsResponseBody self = new QueryRmsCloudmeshServicemetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshServicemetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshServicemetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshServicemetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshServicemetricsResponseBody setResponse(QueryRmsCloudmeshServicemetricsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshServicemetricsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate self = new QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime self = new QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps self = new QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshServicemetricsResponseBodyResponseData extends TeaModel {
        @NameInMap("ErrorRate")
        public java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate> errorRate;

        @NameInMap("ResTime")
        public java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime> resTime;

        @NameInMap("Rps")
        public java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps> rps;

        public static QueryRmsCloudmeshServicemetricsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshServicemetricsResponseBodyResponseData self = new QueryRmsCloudmeshServicemetricsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseData setErrorRate(java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate> errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataErrorRate> getErrorRate() {
            return this.errorRate;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseData setResTime(java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime> resTime) {
            this.resTime = resTime;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataResTime> getResTime() {
            return this.resTime;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponseData setRps(java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps> rps) {
            this.rps = rps;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshServicemetricsResponseBodyResponseDataRps> getRps() {
            return this.rps;
        }

    }

    public static class QueryRmsCloudmeshServicemetricsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshServicemetricsResponseBodyResponseData data;

        public static QueryRmsCloudmeshServicemetricsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshServicemetricsResponseBodyResponse self = new QueryRmsCloudmeshServicemetricsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshServicemetricsResponseBodyResponse setData(QueryRmsCloudmeshServicemetricsResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshServicemetricsResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
