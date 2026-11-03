// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The resource usage information.</p>
     */
    @NameInMap("Data")
    public QueryResourceStaticsResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidServerlessRegion.Unsupported</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If an exception occurs, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7CCF7092-72CA-4431-90D6-C7D98752****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application resource usage was retrieved successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The retrieval was successful.</li>
     * <li><strong>false</strong>: The retrieval failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query invocation details.</p>
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
         * <p>The CPU usage. Unit: Core*min.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The ephemeral storage usage. Unit: GiB·min.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EphemeralStorage")
        public Float ephemeralStorage;

        /**
         * <p>The memory usage. Unit: GiB*min.</p>
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

        public QueryResourceStaticsResponseBodyDataRealTimeRes setEphemeralStorage(Float ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Float getEphemeralStorage() {
            return this.ephemeralStorage;
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
         * <p>The active vCPU usage. Unit: Core·min.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ActiveCpu")
        public Float activeCpu;

        /**
         * <p>The CPU usage. Unit: Core*min.</p>
         * 
         * <strong>example:</strong>
         * <p>3354</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The amount of used compute units (CUs).</p>
         * 
         * <strong>example:</strong>
         * <p>2312145</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The ephemeral storage usage. Unit: GiB·min.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EphemeralStorage")
        public Float ephemeralStorage;

        /**
         * <p>GpuA10</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GpuA10")
        public Float gpuA10;

        /**
         * <p>GpuPpu810e</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GpuPpu810e")
        public Float gpuPpu810e;

        /**
         * <p>The idle vCPU usage. Unit: Core·min.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IdleCpu")
        public Float idleCpu;

        /**
         * <p>The memory usage. Unit: GiB*min.</p>
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

        public QueryResourceStaticsResponseBodyDataSummary setActiveCpu(Float activeCpu) {
            this.activeCpu = activeCpu;
            return this;
        }
        public Float getActiveCpu() {
            return this.activeCpu;
        }

        public QueryResourceStaticsResponseBodyDataSummary setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryResourceStaticsResponseBodyDataSummary setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public QueryResourceStaticsResponseBodyDataSummary setEphemeralStorage(Float ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Float getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public QueryResourceStaticsResponseBodyDataSummary setGpuA10(Float gpuA10) {
            this.gpuA10 = gpuA10;
            return this;
        }
        public Float getGpuA10() {
            return this.gpuA10;
        }

        public QueryResourceStaticsResponseBodyDataSummary setGpuPpu810e(Float gpuPpu810e) {
            this.gpuPpu810e = gpuPpu810e;
            return this;
        }
        public Float getGpuPpu810e() {
            return this.gpuPpu810e;
        }

        public QueryResourceStaticsResponseBodyDataSummary setIdleCpu(Float idleCpu) {
            this.idleCpu = idleCpu;
            return this;
        }
        public Float getIdleCpu() {
            return this.idleCpu;
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
         * <p>The resource usage information for the current month.</p>
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
