// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTriggerInstanceNewestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSTriggerInstanceNewestResponseBodyList> list;

    public static QueryTSTriggerInstanceNewestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTriggerInstanceNewestResponseBody self = new QueryTSTriggerInstanceNewestResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTriggerInstanceNewestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTriggerInstanceNewestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTriggerInstanceNewestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTriggerInstanceNewestResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSTriggerInstanceNewestResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryTSTriggerInstanceNewestResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSTriggerInstanceNewestResponseBody setList(java.util.List<QueryTSTriggerInstanceNewestResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSTriggerInstanceNewestResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig extends TeaModel {
        @NameInMap("MaxExecutingChunks")
        public String maxExecutingChunks;

        @NameInMap("MaxExecutingChunksPerClient")
        public Long maxExecutingChunksPerClient;

        @NameInMap("PermitsPerSecond")
        public Long permitsPerSecond;

        @NameInMap("TolerateProcessFailedCount")
        public Long tolerateProcessFailedCount;

        public static QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig self = new QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig();
            return TeaModel.build(map, self);
        }

        public QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig setMaxExecutingChunks(String maxExecutingChunks) {
            this.maxExecutingChunks = maxExecutingChunks;
            return this;
        }
        public String getMaxExecutingChunks() {
            return this.maxExecutingChunks;
        }

        public QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
            this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
            return this;
        }
        public Long getMaxExecutingChunksPerClient() {
            return this.maxExecutingChunksPerClient;
        }

        public QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig setPermitsPerSecond(Long permitsPerSecond) {
            this.permitsPerSecond = permitsPerSecond;
            return this;
        }
        public Long getPermitsPerSecond() {
            return this.permitsPerSecond;
        }

        public QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
            this.tolerateProcessFailedCount = tolerateProcessFailedCount;
            return this;
        }
        public Long getTolerateProcessFailedCount() {
            return this.tolerateProcessFailedCount;
        }

    }

    public static class QueryTSTriggerInstanceNewestResponseBodyList extends TeaModel {
        @NameInMap("ActivityInstanceId")
        public String activityInstanceId;

        @NameInMap("Consume")
        public Long consume;

        @NameInMap("Context")
        public String context;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("GmtExpectTrigger")
        public String gmtExpectTrigger;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("GmtTrigger")
        public String gmtTrigger;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobItemId")
        public Long jobItemId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("JobZone")
        public String jobZone;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ShardingCount")
        public Long shardingCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Handlers")
        public java.util.List<String> handlers;

        @NameInMap("RuntimeConfig")
        public QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig runtimeConfig;

        public static QueryTSTriggerInstanceNewestResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTriggerInstanceNewestResponseBodyList self = new QueryTSTriggerInstanceNewestResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setActivityInstanceId(String activityInstanceId) {
            this.activityInstanceId = activityInstanceId;
            return this;
        }
        public String getActivityInstanceId() {
            return this.activityInstanceId;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setGmtExpectTrigger(String gmtExpectTrigger) {
            this.gmtExpectTrigger = gmtExpectTrigger;
            return this;
        }
        public String getGmtExpectTrigger() {
            return this.gmtExpectTrigger;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setGmtTrigger(String gmtTrigger) {
            this.gmtTrigger = gmtTrigger;
            return this;
        }
        public String getGmtTrigger() {
            return this.gmtTrigger;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setShardingCount(Long shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Long getShardingCount() {
            return this.shardingCount;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

        public QueryTSTriggerInstanceNewestResponseBodyList setRuntimeConfig(QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }
        public QueryTSTriggerInstanceNewestResponseBodyListRuntimeConfig getRuntimeConfig() {
            return this.runtimeConfig;
        }

    }

}
