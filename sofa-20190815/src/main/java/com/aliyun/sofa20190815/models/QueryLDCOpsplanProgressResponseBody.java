// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanProgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AppExecuteProgress")
    public java.util.List<QueryLDCOpsplanProgressResponseBodyAppExecuteProgress> appExecuteProgress;

    @NameInMap("ExecuteProgress")
    public QueryLDCOpsplanProgressResponseBodyExecuteProgress executeProgress;

    public static QueryLDCOpsplanProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanProgressResponseBody self = new QueryLDCOpsplanProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCOpsplanProgressResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCOpsplanProgressResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCOpsplanProgressResponseBody setAppExecuteProgress(java.util.List<QueryLDCOpsplanProgressResponseBodyAppExecuteProgress> appExecuteProgress) {
        this.appExecuteProgress = appExecuteProgress;
        return this;
    }
    public java.util.List<QueryLDCOpsplanProgressResponseBodyAppExecuteProgress> getAppExecuteProgress() {
        return this.appExecuteProgress;
    }

    public QueryLDCOpsplanProgressResponseBody setExecuteProgress(QueryLDCOpsplanProgressResponseBodyExecuteProgress executeProgress) {
        this.executeProgress = executeProgress;
        return this;
    }
    public QueryLDCOpsplanProgressResponseBodyExecuteProgress getExecuteProgress() {
        return this.executeProgress;
    }

    public static class QueryLDCOpsplanProgressResponseBodyAppExecuteProgress extends TeaModel {
        @NameInMap("Blocked")
        public Long blocked;

        @NameInMap("Executing")
        public Long executing;

        @NameInMap("Failed")
        public Long failed;

        @NameInMap("Id")
        public String id;

        @NameInMap("Inited")
        public Long inited;

        @NameInMap("State")
        public String state;

        @NameInMap("Success")
        public Long success;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Waiting")
        public Long waiting;

        public static QueryLDCOpsplanProgressResponseBodyAppExecuteProgress build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanProgressResponseBodyAppExecuteProgress self = new QueryLDCOpsplanProgressResponseBodyAppExecuteProgress();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setBlocked(Long blocked) {
            this.blocked = blocked;
            return this;
        }
        public Long getBlocked() {
            return this.blocked;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setExecuting(Long executing) {
            this.executing = executing;
            return this;
        }
        public Long getExecuting() {
            return this.executing;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setInited(Long inited) {
            this.inited = inited;
            return this;
        }
        public Long getInited() {
            return this.inited;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLDCOpsplanProgressResponseBodyAppExecuteProgress setWaiting(Long waiting) {
            this.waiting = waiting;
            return this;
        }
        public Long getWaiting() {
            return this.waiting;
        }

    }

    public static class QueryLDCOpsplanProgressResponseBodyExecuteProgress extends TeaModel {
        @NameInMap("Blocked")
        public Long blocked;

        @NameInMap("Executing")
        public Long executing;

        @NameInMap("Failed")
        public Long failed;

        @NameInMap("Id")
        public String id;

        @NameInMap("Inited")
        public Long inited;

        @NameInMap("State")
        public String state;

        @NameInMap("Success")
        public Long success;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Waiting")
        public Long waiting;

        public static QueryLDCOpsplanProgressResponseBodyExecuteProgress build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanProgressResponseBodyExecuteProgress self = new QueryLDCOpsplanProgressResponseBodyExecuteProgress();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setBlocked(Long blocked) {
            this.blocked = blocked;
            return this;
        }
        public Long getBlocked() {
            return this.blocked;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setExecuting(Long executing) {
            this.executing = executing;
            return this;
        }
        public Long getExecuting() {
            return this.executing;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setInited(Long inited) {
            this.inited = inited;
            return this;
        }
        public Long getInited() {
            return this.inited;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLDCOpsplanProgressResponseBodyExecuteProgress setWaiting(Long waiting) {
            this.waiting = waiting;
            return this;
        }
        public Long getWaiting() {
            return this.waiting;
        }

    }

}
