// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceStepsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryTSExecuteInstanceStepsResponseBodyData> data;

    public static QueryTSExecuteInstanceStepsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceStepsResponseBody self = new QueryTSExecuteInstanceStepsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceStepsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSExecuteInstanceStepsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSExecuteInstanceStepsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSExecuteInstanceStepsResponseBody setData(java.util.List<QueryTSExecuteInstanceStepsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTSExecuteInstanceStepsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryTSExecuteInstanceStepsResponseBodyData extends TeaModel {
        @NameInMap("Consume")
        public Long consume;

        @NameInMap("GmtBegin")
        public String gmtBegin;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("Handler")
        public String handler;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Sharding")
        public Long sharding;

        @NameInMap("Status")
        public String status;

        public static QueryTSExecuteInstanceStepsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSExecuteInstanceStepsResponseBodyData self = new QueryTSExecuteInstanceStepsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setSharding(Long sharding) {
            this.sharding = sharding;
            return this;
        }
        public Long getSharding() {
            return this.sharding;
        }

        public QueryTSExecuteInstanceStepsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
