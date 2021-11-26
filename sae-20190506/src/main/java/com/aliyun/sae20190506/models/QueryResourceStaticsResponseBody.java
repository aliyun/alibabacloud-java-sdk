// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryResourceStaticsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static QueryResourceStaticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceStaticsResponseBody self = new QueryResourceStaticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResourceStaticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryResourceStaticsResponseBody setData(QueryResourceStaticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryResourceStaticsResponseBodyData getData() {
        return this.data;
    }

    public QueryResourceStaticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryResourceStaticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryResourceStaticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourceStaticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryResourceStaticsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryResourceStaticsResponseBodyDataRealTimeRes extends TeaModel {
        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("Memory")
        public Float memory;

        public static QueryResourceStaticsResponseBodyDataRealTimeRes build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceStaticsResponseBodyDataRealTimeRes self = new QueryResourceStaticsResponseBodyDataRealTimeRes();
            return TeaModel.build(map, self);
        }

        public QueryResourceStaticsResponseBodyDataRealTimeRes setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryResourceStaticsResponseBodyDataRealTimeRes setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class QueryResourceStaticsResponseBodyDataSummary extends TeaModel {
        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("Memory")
        public Float memory;

        public static QueryResourceStaticsResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceStaticsResponseBodyDataSummary self = new QueryResourceStaticsResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public QueryResourceStaticsResponseBodyDataSummary setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryResourceStaticsResponseBodyDataSummary setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class QueryResourceStaticsResponseBodyData extends TeaModel {
        @NameInMap("RealTimeRes")
        public QueryResourceStaticsResponseBodyDataRealTimeRes realTimeRes;

        @NameInMap("Summary")
        public QueryResourceStaticsResponseBodyDataSummary summary;

        public static QueryResourceStaticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceStaticsResponseBodyData self = new QueryResourceStaticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryResourceStaticsResponseBodyData setRealTimeRes(QueryResourceStaticsResponseBodyDataRealTimeRes realTimeRes) {
            this.realTimeRes = realTimeRes;
            return this;
        }
        public QueryResourceStaticsResponseBodyDataRealTimeRes getRealTimeRes() {
            return this.realTimeRes;
        }

        public QueryResourceStaticsResponseBodyData setSummary(QueryResourceStaticsResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public QueryResourceStaticsResponseBodyDataSummary getSummary() {
            return this.summary;
        }

    }

}
