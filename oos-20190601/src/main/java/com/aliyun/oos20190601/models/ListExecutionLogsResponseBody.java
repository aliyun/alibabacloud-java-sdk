// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionLogsResponseBody extends TeaModel {
    /**
     * <p>The logs of the execution.</p>
     */
    @NameInMap("ExecutionLogs")
    public java.util.List<ListExecutionLogsResponseBodyExecutionLogs> executionLogs;

    /**
     * <p>Indicates whether the log is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABdpsGWjX8dJ-a6dl_pvoS7AFxNHSNJKHLCAJJ0ylgA53nWW5V4HTEZKCYTaEPNOrxFir4z43UTOjE150cFr8AGTifA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListExecutionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionLogsResponseBody self = new ListExecutionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutionLogsResponseBody setExecutionLogs(java.util.List<ListExecutionLogsResponseBodyExecutionLogs> executionLogs) {
        this.executionLogs = executionLogs;
        return this;
    }
    public java.util.List<ListExecutionLogsResponseBodyExecutionLogs> getExecutionLogs() {
        return this.executionLogs;
    }

    public ListExecutionLogsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListExecutionLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExecutionLogsResponseBodyExecutionLogs extends TeaModel {
        /**
         * <p>The log type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The details of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>The task CheckDiskCategory completed.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The task execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-1234567zxcvb.t0010</p>
         */
        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        /**
         * <p>The timestamp when the task was run.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-24T:02:29:07Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static ListExecutionLogsResponseBodyExecutionLogs build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionLogsResponseBodyExecutionLogs self = new ListExecutionLogsResponseBodyExecutionLogs();
            return TeaModel.build(map, self);
        }

        public ListExecutionLogsResponseBodyExecutionLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListExecutionLogsResponseBodyExecutionLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListExecutionLogsResponseBodyExecutionLogs setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListExecutionLogsResponseBodyExecutionLogs setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
