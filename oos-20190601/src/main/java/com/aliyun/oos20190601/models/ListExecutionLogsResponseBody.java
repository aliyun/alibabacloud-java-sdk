// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionLogsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExecutionLogs")
    public java.util.List<ListExecutionLogsResponseBodyExecutionLogs> executionLogs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    public static ListExecutionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionLogsResponseBody self = new ListExecutionLogsResponseBody();
        return TeaModel.build(map, self);
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

    public ListExecutionLogsResponseBody setExecutionLogs(java.util.List<ListExecutionLogsResponseBodyExecutionLogs> executionLogs) {
        this.executionLogs = executionLogs;
        return this;
    }
    public java.util.List<ListExecutionLogsResponseBodyExecutionLogs> getExecutionLogs() {
        return this.executionLogs;
    }

    public ListExecutionLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionLogsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public static class ListExecutionLogsResponseBodyExecutionLogs extends TeaModel {
        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("Message")
        public String message;

        @NameInMap("LogType")
        public String logType;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListExecutionLogsResponseBodyExecutionLogs build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionLogsResponseBodyExecutionLogs self = new ListExecutionLogsResponseBodyExecutionLogs();
            return TeaModel.build(map, self);
        }

        public ListExecutionLogsResponseBodyExecutionLogs setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListExecutionLogsResponseBodyExecutionLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListExecutionLogsResponseBodyExecutionLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
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
