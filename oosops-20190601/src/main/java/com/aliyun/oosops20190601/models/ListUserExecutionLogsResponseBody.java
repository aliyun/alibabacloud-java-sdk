// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserExecutionLogsResponseBody extends TeaModel {
    @NameInMap("ExecutionLogs")
    public java.util.List<ListUserExecutionLogsResponseBodyExecutionLogs> executionLogs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserExecutionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserExecutionLogsResponseBody self = new ListUserExecutionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserExecutionLogsResponseBody setExecutionLogs(java.util.List<ListUserExecutionLogsResponseBodyExecutionLogs> executionLogs) {
        this.executionLogs = executionLogs;
        return this;
    }
    public java.util.List<ListUserExecutionLogsResponseBodyExecutionLogs> getExecutionLogs() {
        return this.executionLogs;
    }

    public ListUserExecutionLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserExecutionLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserExecutionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserExecutionLogsResponseBodyExecutionLogs extends TeaModel {
        @NameInMap("LogType")
        public String logType;

        @NameInMap("Message")
        public String message;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListUserExecutionLogsResponseBodyExecutionLogs build(java.util.Map<String, ?> map) throws Exception {
            ListUserExecutionLogsResponseBodyExecutionLogs self = new ListUserExecutionLogsResponseBodyExecutionLogs();
            return TeaModel.build(map, self);
        }

        public ListUserExecutionLogsResponseBodyExecutionLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListUserExecutionLogsResponseBodyExecutionLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListUserExecutionLogsResponseBodyExecutionLogs setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public ListUserExecutionLogsResponseBodyExecutionLogs setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
