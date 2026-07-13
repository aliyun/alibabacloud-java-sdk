// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class QueryTaskConcurrencyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTaskConcurrencyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public String timestamp;

    @NameInMap("TraceId")
    public String traceId;

    public static QueryTaskConcurrencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskConcurrencyResponseBody self = new QueryTaskConcurrencyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskConcurrencyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskConcurrencyResponseBody setData(QueryTaskConcurrencyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskConcurrencyResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskConcurrencyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTaskConcurrencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskConcurrencyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTaskConcurrencyResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryTaskConcurrencyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryTaskConcurrencyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableConcurrency")
        public Long availableConcurrency;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CurrentConcurrency")
        public Long currentConcurrency;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConcurrency")
        public Long maxConcurrency;

        public static QueryTaskConcurrencyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskConcurrencyResponseBodyData self = new QueryTaskConcurrencyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskConcurrencyResponseBodyData setAvailableConcurrency(Long availableConcurrency) {
            this.availableConcurrency = availableConcurrency;
            return this;
        }
        public Long getAvailableConcurrency() {
            return this.availableConcurrency;
        }

        public QueryTaskConcurrencyResponseBodyData setCurrentConcurrency(Long currentConcurrency) {
            this.currentConcurrency = currentConcurrency;
            return this;
        }
        public Long getCurrentConcurrency() {
            return this.currentConcurrency;
        }

        public QueryTaskConcurrencyResponseBodyData setMaxConcurrency(Long maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Long getMaxConcurrency() {
            return this.maxConcurrency;
        }

    }

}
