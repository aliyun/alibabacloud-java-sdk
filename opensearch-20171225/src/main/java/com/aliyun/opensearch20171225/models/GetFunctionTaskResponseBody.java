// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Long httpCode;

    @NameInMap("Latency")
    public Long latency;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetFunctionTaskResponseBodyResult result;

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
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Generation")
        public String generation;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("RunId")
        public String runId;

        @NameInMap("StartTime")
        public Long startTime;

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
