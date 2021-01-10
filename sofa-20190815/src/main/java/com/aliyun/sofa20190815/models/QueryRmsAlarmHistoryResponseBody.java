// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public java.util.List<QueryRmsAlarmHistoryResponseBodyResponse> response;

    public static QueryRmsAlarmHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmHistoryResponseBody self = new QueryRmsAlarmHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlarmHistoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlarmHistoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlarmHistoryResponseBody setResponse(java.util.List<QueryRmsAlarmHistoryResponseBodyResponse> response) {
        this.response = response;
        return this;
    }
    public java.util.List<QueryRmsAlarmHistoryResponseBodyResponse> getResponse() {
        return this.response;
    }

    public static class QueryRmsAlarmHistoryResponseBodyResponse extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("MetricGroupId")
        public String metricGroupId;

        @NameInMap("Period")
        public Long period;

        public static QueryRmsAlarmHistoryResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmHistoryResponseBodyResponse self = new QueryRmsAlarmHistoryResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmHistoryResponseBodyResponse setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryRmsAlarmHistoryResponseBodyResponse setMetricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }
        public String getMetricGroupId() {
            return this.metricGroupId;
        }

        public QueryRmsAlarmHistoryResponseBodyResponse setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

}
