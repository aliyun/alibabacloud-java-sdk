// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSJobResponseBodyData data;

    public static QueryTSJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobResponseBody self = new QueryTSJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSJobResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSJobResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSJobResponseBody setData(QueryTSJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSJobResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSJobResponseBodyData extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("CountOfActiveZone")
        public String countOfActiveZone;

        @NameInMap("CountOfClient")
        public String countOfClient;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("CustomParams")
        public String customParams;

        @NameInMap("Des")
        public String des;

        @NameInMap("Exclusive")
        public Boolean exclusive;

        @NameInMap("FailHandleStrategy")
        public String failHandleStrategy;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvokeType")
        public String invokeType;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobItemId")
        public Long jobItemId;

        @NameInMap("JobZone")
        public String jobZone;

        @NameInMap("MaxExecutingChunks")
        public String maxExecutingChunks;

        @NameInMap("MaxExecutingChunksPerClient")
        public String maxExecutingChunksPerClient;

        @NameInMap("MisfireStrategy")
        public String misfireStrategy;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PermitsPerSecond")
        public String permitsPerSecond;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("RouteStrategy")
        public String routeStrategy;

        @NameInMap("ShardingCount")
        public String shardingCount;

        @NameInMap("SleepTime")
        public Long sleepTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("TimeoutStrategy")
        public String timeoutStrategy;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("TolerateProcessFailedCount")
        public String tolerateProcessFailedCount;

        @NameInMap("TotalZone")
        public String totalZone;

        @NameInMap("TriggerMode")
        public String triggerMode;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("Type")
        public String type;

        @NameInMap("Handlers")
        public java.util.List<String> handlers;

        public static QueryTSJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSJobResponseBodyData self = new QueryTSJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSJobResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSJobResponseBodyData setCountOfActiveZone(String countOfActiveZone) {
            this.countOfActiveZone = countOfActiveZone;
            return this;
        }
        public String getCountOfActiveZone() {
            return this.countOfActiveZone;
        }

        public QueryTSJobResponseBodyData setCountOfClient(String countOfClient) {
            this.countOfClient = countOfClient;
            return this;
        }
        public String getCountOfClient() {
            return this.countOfClient;
        }

        public QueryTSJobResponseBodyData setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryTSJobResponseBodyData setCustomParams(String customParams) {
            this.customParams = customParams;
            return this;
        }
        public String getCustomParams() {
            return this.customParams;
        }

        public QueryTSJobResponseBodyData setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public QueryTSJobResponseBodyData setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public QueryTSJobResponseBodyData setFailHandleStrategy(String failHandleStrategy) {
            this.failHandleStrategy = failHandleStrategy;
            return this;
        }
        public String getFailHandleStrategy() {
            return this.failHandleStrategy;
        }

        public QueryTSJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTSJobResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryTSJobResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryTSJobResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSJobResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSJobResponseBodyData setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public QueryTSJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryTSJobResponseBodyData setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSJobResponseBodyData setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSJobResponseBodyData setMaxExecutingChunks(String maxExecutingChunks) {
            this.maxExecutingChunks = maxExecutingChunks;
            return this;
        }
        public String getMaxExecutingChunks() {
            return this.maxExecutingChunks;
        }

        public QueryTSJobResponseBodyData setMaxExecutingChunksPerClient(String maxExecutingChunksPerClient) {
            this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
            return this;
        }
        public String getMaxExecutingChunksPerClient() {
            return this.maxExecutingChunksPerClient;
        }

        public QueryTSJobResponseBodyData setMisfireStrategy(String misfireStrategy) {
            this.misfireStrategy = misfireStrategy;
            return this;
        }
        public String getMisfireStrategy() {
            return this.misfireStrategy;
        }

        public QueryTSJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSJobResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSJobResponseBodyData setPermitsPerSecond(String permitsPerSecond) {
            this.permitsPerSecond = permitsPerSecond;
            return this;
        }
        public String getPermitsPerSecond() {
            return this.permitsPerSecond;
        }

        public QueryTSJobResponseBodyData setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryTSJobResponseBodyData setRouteStrategy(String routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public String getRouteStrategy() {
            return this.routeStrategy;
        }

        public QueryTSJobResponseBodyData setShardingCount(String shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public String getShardingCount() {
            return this.shardingCount;
        }

        public QueryTSJobResponseBodyData setSleepTime(Long sleepTime) {
            this.sleepTime = sleepTime;
            return this;
        }
        public Long getSleepTime() {
            return this.sleepTime;
        }

        public QueryTSJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSJobResponseBodyData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryTSJobResponseBodyData setTimeoutStrategy(String timeoutStrategy) {
            this.timeoutStrategy = timeoutStrategy;
            return this;
        }
        public String getTimeoutStrategy() {
            return this.timeoutStrategy;
        }

        public QueryTSJobResponseBodyData setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public QueryTSJobResponseBodyData setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryTSJobResponseBodyData setTolerateProcessFailedCount(String tolerateProcessFailedCount) {
            this.tolerateProcessFailedCount = tolerateProcessFailedCount;
            return this;
        }
        public String getTolerateProcessFailedCount() {
            return this.tolerateProcessFailedCount;
        }

        public QueryTSJobResponseBodyData setTotalZone(String totalZone) {
            this.totalZone = totalZone;
            return this;
        }
        public String getTotalZone() {
            return this.totalZone;
        }

        public QueryTSJobResponseBodyData setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public QueryTSJobResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryTSJobResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSJobResponseBodyData setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

    }

}
