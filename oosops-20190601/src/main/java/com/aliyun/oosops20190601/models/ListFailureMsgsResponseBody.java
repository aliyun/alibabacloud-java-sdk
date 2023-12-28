// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListFailureMsgsResponseBody extends TeaModel {
    @NameInMap("FailureMsgs")
    public java.util.List<ListFailureMsgsResponseBodyFailureMsgs> failureMsgs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFailureMsgsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFailureMsgsResponseBody self = new ListFailureMsgsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFailureMsgsResponseBody setFailureMsgs(java.util.List<ListFailureMsgsResponseBodyFailureMsgs> failureMsgs) {
        this.failureMsgs = failureMsgs;
        return this;
    }
    public java.util.List<ListFailureMsgsResponseBodyFailureMsgs> getFailureMsgs() {
        return this.failureMsgs;
    }

    public ListFailureMsgsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFailureMsgsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFailureMsgsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFailureMsgsResponseBodyFailureMsgs extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("MessageBody")
        public String messageBody;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("TaskExecutionId")
        public String taskExecutionId;

        public static ListFailureMsgsResponseBodyFailureMsgs build(java.util.Map<String, ?> map) throws Exception {
            ListFailureMsgsResponseBodyFailureMsgs self = new ListFailureMsgsResponseBodyFailureMsgs();
            return TeaModel.build(map, self);
        }

        public ListFailureMsgsResponseBodyFailureMsgs setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListFailureMsgsResponseBodyFailureMsgs setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListFailureMsgsResponseBodyFailureMsgs setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public ListFailureMsgsResponseBodyFailureMsgs setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListFailureMsgsResponseBodyFailureMsgs setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

    }

}
