// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionTaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed for the request, in milliseconds.</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Result")
    public GetFunctionTaskResponseBodyResult result;

    /**
     * <p>The status of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetFunctionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionTaskResponseBody self = new GetFunctionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionTaskResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public GetFunctionTaskResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public GetFunctionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionTaskResponseBody setResult(GetFunctionTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFunctionTaskResponseBodyResult getResult() {
        return this.result;
    }

    public GetFunctionTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetFunctionTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The timestamp that indicates the end time of the task. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The extended information, which is a JSON string.</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The name of the feature.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The number of iterations.</p>
         */
        @NameInMap("Generation")
        public String generation;

        /**
         * <p>The progress. 90 indicates 90%.</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The timestamp that indicates the start time of the task. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   success</p>
         * <p>*   failed</p>
         * <p>*   running</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetFunctionTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionTaskResponseBodyResult self = new GetFunctionTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFunctionTaskResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetFunctionTaskResponseBodyResult setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public GetFunctionTaskResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetFunctionTaskResponseBodyResult setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public GetFunctionTaskResponseBodyResult setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetFunctionTaskResponseBodyResult setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetFunctionTaskResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetFunctionTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
