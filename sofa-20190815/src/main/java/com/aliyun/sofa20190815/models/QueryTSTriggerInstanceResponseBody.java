// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTriggerInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSTriggerInstanceResponseBodyData data;

    public static QueryTSTriggerInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTriggerInstanceResponseBody self = new QueryTSTriggerInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTriggerInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTriggerInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTriggerInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTriggerInstanceResponseBody setData(QueryTSTriggerInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSTriggerInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSTriggerInstanceResponseBodyDataRuntimeConfig extends TeaModel {
        @NameInMap("MaxExecutingChunks")
        public String maxExecutingChunks;

        @NameInMap("MaxExecutingChunksPerClient")
        public Long maxExecutingChunksPerClient;

        @NameInMap("PermitsPerSecond")
        public Long permitsPerSecond;

        @NameInMap("TolerateProcessFailedCount")
        public Long tolerateProcessFailedCount;

        public static QueryTSTriggerInstanceResponseBodyDataRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTriggerInstanceResponseBodyDataRuntimeConfig self = new QueryTSTriggerInstanceResponseBodyDataRuntimeConfig();
            return TeaModel.build(map, self);
        }

        public QueryTSTriggerInstanceResponseBodyDataRuntimeConfig setMaxExecutingChunks(String maxExecutingChunks) {
            this.maxExecutingChunks = maxExecutingChunks;
            return this;
        }
        public String getMaxExecutingChunks() {
            return this.maxExecutingChunks;
        }

        public QueryTSTriggerInstanceResponseBodyDataRuntimeConfig setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
            this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
            return this;
        }
        public Long getMaxExecutingChunksPerClient() {
            return this.maxExecutingChunksPerClient;
        }

        public QueryTSTriggerInstanceResponseBodyDataRuntimeConfig setPermitsPerSecond(Long permitsPerSecond) {
            this.permitsPerSecond = permitsPerSecond;
            return this;
        }
        public Long getPermitsPerSecond() {
            return this.permitsPerSecond;
        }

        public QueryTSTriggerInstanceResponseBodyDataRuntimeConfig setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
            this.tolerateProcessFailedCount = tolerateProcessFailedCount;
            return this;
        }
        public Long getTolerateProcessFailedCount() {
            return this.tolerateProcessFailedCount;
        }

    }

    public static class QueryTSTriggerInstanceResponseBodyData extends TeaModel {
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
        public QueryTSTriggerInstanceResponseBodyDataRuntimeConfig runtimeConfig;

        public static QueryTSTriggerInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTriggerInstanceResponseBodyData self = new QueryTSTriggerInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSTriggerInstanceResponseBodyData setActivityInstanceId(String activityInstanceId) {
            this.activityInstanceId = activityInstanceId;
            return this;
        }
        public String getActivityInstanceId() {
            return this.activityInstanceId;
        }

        public QueryTSTriggerInstanceResponseBodyData setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSTriggerInstanceResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryTSTriggerInstanceResponseBodyData setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSTriggerInstanceResponseBodyData setGmtExpectTrigger(String gmtExpectTrigger) {
            this.gmtExpectTrigger = gmtExpectTrigger;
            return this;
        }
        public String getGmtExpectTrigger() {
            return this.gmtExpectTrigger;
        }

        public QueryTSTriggerInstanceResponseBodyData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryTSTriggerInstanceResponseBodyData setGmtTrigger(String gmtTrigger) {
            this.gmtTrigger = gmtTrigger;
            return this;
        }
        public String getGmtTrigger() {
            return this.gmtTrigger;
        }

        public QueryTSTriggerInstanceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTriggerInstanceResponseBodyData setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSTriggerInstanceResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryTSTriggerInstanceResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryTSTriggerInstanceResponseBodyData setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSTriggerInstanceResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSTriggerInstanceResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSTriggerInstanceResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSTriggerInstanceResponseBodyData setShardingCount(Long shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Long getShardingCount() {
            return this.shardingCount;
        }

        public QueryTSTriggerInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTriggerInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSTriggerInstanceResponseBodyData setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

        public QueryTSTriggerInstanceResponseBodyData setRuntimeConfig(QueryTSTriggerInstanceResponseBodyDataRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }
        public QueryTSTriggerInstanceResponseBodyDataRuntimeConfig getRuntimeConfig() {
            return this.runtimeConfig;
        }

    }

}
