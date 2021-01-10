// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTriggerInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSTriggerInstancesResponseBodyList> list;

    public static QueryTSTriggerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTriggerInstancesResponseBody self = new QueryTSTriggerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTriggerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTriggerInstancesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTriggerInstancesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTriggerInstancesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSTriggerInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSTriggerInstancesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public QueryTSTriggerInstancesResponseBody setList(java.util.List<QueryTSTriggerInstancesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSTriggerInstancesResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSTriggerInstancesResponseBodyListRuntimeConfig extends TeaModel {
        @NameInMap("MaxExecutingChunks")
        public String maxExecutingChunks;

        @NameInMap("MaxExecutingChunksPerClient")
        public Long maxExecutingChunksPerClient;

        @NameInMap("PermitsPerSecond")
        public Long permitsPerSecond;

        @NameInMap("TolerateProcessFailedCount")
        public Long tolerateProcessFailedCount;

        public static QueryTSTriggerInstancesResponseBodyListRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTriggerInstancesResponseBodyListRuntimeConfig self = new QueryTSTriggerInstancesResponseBodyListRuntimeConfig();
            return TeaModel.build(map, self);
        }

        public QueryTSTriggerInstancesResponseBodyListRuntimeConfig setMaxExecutingChunks(String maxExecutingChunks) {
            this.maxExecutingChunks = maxExecutingChunks;
            return this;
        }
        public String getMaxExecutingChunks() {
            return this.maxExecutingChunks;
        }

        public QueryTSTriggerInstancesResponseBodyListRuntimeConfig setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
            this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
            return this;
        }
        public Long getMaxExecutingChunksPerClient() {
            return this.maxExecutingChunksPerClient;
        }

        public QueryTSTriggerInstancesResponseBodyListRuntimeConfig setPermitsPerSecond(Long permitsPerSecond) {
            this.permitsPerSecond = permitsPerSecond;
            return this;
        }
        public Long getPermitsPerSecond() {
            return this.permitsPerSecond;
        }

        public QueryTSTriggerInstancesResponseBodyListRuntimeConfig setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
            this.tolerateProcessFailedCount = tolerateProcessFailedCount;
            return this;
        }
        public Long getTolerateProcessFailedCount() {
            return this.tolerateProcessFailedCount;
        }

    }

    public static class QueryTSTriggerInstancesResponseBodyList extends TeaModel {
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
        public QueryTSTriggerInstancesResponseBodyListRuntimeConfig runtimeConfig;

        public static QueryTSTriggerInstancesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTriggerInstancesResponseBodyList self = new QueryTSTriggerInstancesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSTriggerInstancesResponseBodyList setActivityInstanceId(String activityInstanceId) {
            this.activityInstanceId = activityInstanceId;
            return this;
        }
        public String getActivityInstanceId() {
            return this.activityInstanceId;
        }

        public QueryTSTriggerInstancesResponseBodyList setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSTriggerInstancesResponseBodyList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryTSTriggerInstancesResponseBodyList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSTriggerInstancesResponseBodyList setGmtExpectTrigger(String gmtExpectTrigger) {
            this.gmtExpectTrigger = gmtExpectTrigger;
            return this;
        }
        public String getGmtExpectTrigger() {
            return this.gmtExpectTrigger;
        }

        public QueryTSTriggerInstancesResponseBodyList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryTSTriggerInstancesResponseBodyList setGmtTrigger(String gmtTrigger) {
            this.gmtTrigger = gmtTrigger;
            return this;
        }
        public String getGmtTrigger() {
            return this.gmtTrigger;
        }

        public QueryTSTriggerInstancesResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTriggerInstancesResponseBodyList setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSTriggerInstancesResponseBodyList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryTSTriggerInstancesResponseBodyList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryTSTriggerInstancesResponseBodyList setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSTriggerInstancesResponseBodyList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSTriggerInstancesResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSTriggerInstancesResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSTriggerInstancesResponseBodyList setShardingCount(Long shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Long getShardingCount() {
            return this.shardingCount;
        }

        public QueryTSTriggerInstancesResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTriggerInstancesResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSTriggerInstancesResponseBodyList setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

        public QueryTSTriggerInstancesResponseBodyList setRuntimeConfig(QueryTSTriggerInstancesResponseBodyListRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }
        public QueryTSTriggerInstancesResponseBodyListRuntimeConfig getRuntimeConfig() {
            return this.runtimeConfig;
        }

    }

}
