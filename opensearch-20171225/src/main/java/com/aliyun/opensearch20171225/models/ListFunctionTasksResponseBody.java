// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionTasksResponseBody extends TeaModel {
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
    public java.util.List<ListFunctionTasksResponseBodyResult> result;

    @NameInMap("Status")
    public String status;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFunctionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionTasksResponseBody self = new ListFunctionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFunctionTasksResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListFunctionTasksResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public ListFunctionTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFunctionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionTasksResponseBody setResult(java.util.List<ListFunctionTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFunctionTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public ListFunctionTasksResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFunctionTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFunctionTasksResponseBodyResult extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("RunId")
        public String runId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static ListFunctionTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionTasksResponseBodyResult self = new ListFunctionTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFunctionTasksResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListFunctionTasksResponseBodyResult setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListFunctionTasksResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListFunctionTasksResponseBodyResult setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ListFunctionTasksResponseBodyResult setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListFunctionTasksResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListFunctionTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
