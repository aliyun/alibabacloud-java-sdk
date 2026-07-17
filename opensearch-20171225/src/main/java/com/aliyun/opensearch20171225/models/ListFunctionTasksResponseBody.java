// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionTasksResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed by the request, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>fail</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1638157479281</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>[         {             &quot;functionName&quot;: &quot;ctr&quot;,             &quot;progress&quot;: 100,             &quot;status&quot;: &quot;success&quot;,             &quot;startTime&quot;: 100010,             &quot;endTime&quot;: 200020,             &quot;extendInfo&quot;: &quot;{\&quot;recall\&quot;:91,\&quot;errors\&quot;:[]}&quot;,             &quot;runId&quot;: &quot;trigger__2021-03-05T12:18:41&quot;         }     ]</p>
     */
    @NameInMap("Result")
    public java.util.List<ListFunctionTasksResponseBodyResult> result;

    /**
     * <p>The status of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of records that meet the requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The time when the task ended. This is a UNIX timestamp in milliseconds. A value of 0 indicates that the task has not ended.</p>
         * 
         * <strong>example:</strong>
         * <p>100010</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>A JSON string that contains information such as model evaluation results and training errors.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;recall\&quot;:91,\&quot;errors\&quot;:[]}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>ctr</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The iteration number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Generation")
        public String generation;

        /**
         * <p>The progress of the task. For example, a value of 90 indicates that the task is 90% complete.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger__2021-03-05T12:18:41</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The time when the task started. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100010</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li><p>success</p>
         * </li>
         * <li><p>failed</p>
         * </li>
         * <li><p>running</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
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

        public ListFunctionTasksResponseBodyResult setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
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
