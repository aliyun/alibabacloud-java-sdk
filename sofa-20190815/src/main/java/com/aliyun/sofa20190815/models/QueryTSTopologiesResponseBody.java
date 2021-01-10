// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologiesResponseBody extends TeaModel {
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
    public Long totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSTopologiesResponseBodyList> list;

    public static QueryTSTopologiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologiesResponseBody self = new QueryTSTopologiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTopologiesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTopologiesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTopologiesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSTopologiesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSTopologiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSTopologiesResponseBody setList(java.util.List<QueryTSTopologiesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSTopologiesResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSTopologiesResponseBodyList extends TeaModel {
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

        public static QueryTSTopologiesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologiesResponseBodyList self = new QueryTSTopologiesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologiesResponseBodyList setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSTopologiesResponseBodyList setCountOfActiveZone(String countOfActiveZone) {
            this.countOfActiveZone = countOfActiveZone;
            return this;
        }
        public String getCountOfActiveZone() {
            return this.countOfActiveZone;
        }

        public QueryTSTopologiesResponseBodyList setCountOfClient(String countOfClient) {
            this.countOfClient = countOfClient;
            return this;
        }
        public String getCountOfClient() {
            return this.countOfClient;
        }

        public QueryTSTopologiesResponseBodyList setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryTSTopologiesResponseBodyList setCustomParams(String customParams) {
            this.customParams = customParams;
            return this;
        }
        public String getCustomParams() {
            return this.customParams;
        }

        public QueryTSTopologiesResponseBodyList setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public QueryTSTopologiesResponseBodyList setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public QueryTSTopologiesResponseBodyList setFailHandleStrategy(String failHandleStrategy) {
            this.failHandleStrategy = failHandleStrategy;
            return this;
        }
        public String getFailHandleStrategy() {
            return this.failHandleStrategy;
        }

        public QueryTSTopologiesResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTSTopologiesResponseBodyList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryTSTopologiesResponseBodyList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryTSTopologiesResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologiesResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSTopologiesResponseBodyList setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public QueryTSTopologiesResponseBodyList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryTSTopologiesResponseBodyList setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSTopologiesResponseBodyList setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSTopologiesResponseBodyList setMaxExecutingChunks(String maxExecutingChunks) {
            this.maxExecutingChunks = maxExecutingChunks;
            return this;
        }
        public String getMaxExecutingChunks() {
            return this.maxExecutingChunks;
        }

        public QueryTSTopologiesResponseBodyList setMaxExecutingChunksPerClient(String maxExecutingChunksPerClient) {
            this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
            return this;
        }
        public String getMaxExecutingChunksPerClient() {
            return this.maxExecutingChunksPerClient;
        }

        public QueryTSTopologiesResponseBodyList setMisfireStrategy(String misfireStrategy) {
            this.misfireStrategy = misfireStrategy;
            return this;
        }
        public String getMisfireStrategy() {
            return this.misfireStrategy;
        }

        public QueryTSTopologiesResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSTopologiesResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSTopologiesResponseBodyList setPermitsPerSecond(String permitsPerSecond) {
            this.permitsPerSecond = permitsPerSecond;
            return this;
        }
        public String getPermitsPerSecond() {
            return this.permitsPerSecond;
        }

        public QueryTSTopologiesResponseBodyList setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryTSTopologiesResponseBodyList setRouteStrategy(String routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public String getRouteStrategy() {
            return this.routeStrategy;
        }

        public QueryTSTopologiesResponseBodyList setShardingCount(String shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public String getShardingCount() {
            return this.shardingCount;
        }

        public QueryTSTopologiesResponseBodyList setSleepTime(Long sleepTime) {
            this.sleepTime = sleepTime;
            return this;
        }
        public Long getSleepTime() {
            return this.sleepTime;
        }

        public QueryTSTopologiesResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTopologiesResponseBodyList setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryTSTopologiesResponseBodyList setTimeoutStrategy(String timeoutStrategy) {
            this.timeoutStrategy = timeoutStrategy;
            return this;
        }
        public String getTimeoutStrategy() {
            return this.timeoutStrategy;
        }

        public QueryTSTopologiesResponseBodyList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public QueryTSTopologiesResponseBodyList setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryTSTopologiesResponseBodyList setTolerateProcessFailedCount(String tolerateProcessFailedCount) {
            this.tolerateProcessFailedCount = tolerateProcessFailedCount;
            return this;
        }
        public String getTolerateProcessFailedCount() {
            return this.tolerateProcessFailedCount;
        }

        public QueryTSTopologiesResponseBodyList setTotalZone(String totalZone) {
            this.totalZone = totalZone;
            return this;
        }
        public String getTotalZone() {
            return this.totalZone;
        }

        public QueryTSTopologiesResponseBodyList setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public QueryTSTopologiesResponseBodyList setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryTSTopologiesResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSTopologiesResponseBodyList setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

    }

}
