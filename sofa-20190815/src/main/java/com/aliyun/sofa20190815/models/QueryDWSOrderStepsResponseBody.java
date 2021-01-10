// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSOrderStepsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryDWSOrderStepsResponseBodyData> data;

    public static QueryDWSOrderStepsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSOrderStepsResponseBody self = new QueryDWSOrderStepsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDWSOrderStepsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDWSOrderStepsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDWSOrderStepsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDWSOrderStepsResponseBody setData(java.util.List<QueryDWSOrderStepsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDWSOrderStepsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryDWSOrderStepsResponseBodyData extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExecutionNode")
        public String executionNode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public Long level;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("RetryCount")
        public Long retryCount;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static QueryDWSOrderStepsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDWSOrderStepsResponseBodyData self = new QueryDWSOrderStepsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDWSOrderStepsResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryDWSOrderStepsResponseBodyData setExecutionNode(String executionNode) {
            this.executionNode = executionNode;
            return this;
        }
        public String getExecutionNode() {
            return this.executionNode;
        }

        public QueryDWSOrderStepsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDWSOrderStepsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDWSOrderStepsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDWSOrderStepsResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryDWSOrderStepsResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public QueryDWSOrderStepsResponseBodyData setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public QueryDWSOrderStepsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryDWSOrderStepsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDWSOrderStepsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
