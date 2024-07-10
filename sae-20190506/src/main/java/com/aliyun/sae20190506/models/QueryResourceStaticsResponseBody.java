// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The resource usage.</p>
     */
    @NameInMap("Data")
    public QueryResourceStaticsResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <ul>
     * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
     * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><strong>success</strong> is returned when the request succeeds.</li>
     * <li>An error code is returned when the request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7CCF7092-72CA-4431-90D6-C7D98752****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the resource usage of an application was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: indicates that the resource usage was obtained.</li>
     * <li><strong>false</strong>: indicates that the resource usage could not be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a08a015623098794277264e****</p>
     */
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
        /**
         * <p>The CPU usage. Unit: core per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The memory usage. Unit: GiB per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
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
        /**
         * <p>The CPU usage. Unit: core per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>3354</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The memory usage. Unit: GiB per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>6708</p>
         */
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
        /**
         * <p>The real-time resource usage.</p>
         */
        @NameInMap("RealTimeRes")
        public QueryResourceStaticsResponseBodyDataRealTimeRes realTimeRes;

        /**
         * <p>The resource usage of the current month.</p>
         */
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
