// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobsResponseBody extends TeaModel {
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
    public java.util.List<QueryTSJobsResponseBodyList> list;

    public static QueryTSJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobsResponseBody self = new QueryTSJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSJobsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSJobsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSJobsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSJobsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSJobsResponseBody setList(java.util.List<QueryTSJobsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSJobsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSJobsResponseBodyListCustomParams extends TeaModel {
        @NameInMap("ParamKey")
        public String paramKey;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("ParamValue")
        public String paramValue;

        public static QueryTSJobsResponseBodyListCustomParams build(java.util.Map<String, ?> map) throws Exception {
            QueryTSJobsResponseBodyListCustomParams self = new QueryTSJobsResponseBodyListCustomParams();
            return TeaModel.build(map, self);
        }

        public QueryTSJobsResponseBodyListCustomParams setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public QueryTSJobsResponseBodyListCustomParams setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public QueryTSJobsResponseBodyListCustomParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class QueryTSJobsResponseBodyList extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("CountOfActiveZone")
        public String countOfActiveZone;

        @NameInMap("CountOfClient")
        public String countOfClient;

        @NameInMap("Cron")
        public String cron;

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

        @NameInMap("CustomParams")
        public QueryTSJobsResponseBodyListCustomParams customParams;

        public static QueryTSJobsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSJobsResponseBodyList self = new QueryTSJobsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSJobsResponseBodyList setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSJobsResponseBodyList setCountOfActiveZone(String countOfActiveZone) {
            this.countOfActiveZone = countOfActiveZone;
            return this;
        }
        public String getCountOfActiveZone() {
            return this.countOfActiveZone;
        }

        public QueryTSJobsResponseBodyList setCountOfClient(String countOfClient) {
            this.countOfClient = countOfClient;
            return this;
        }
        public String getCountOfClient() {
            return this.countOfClient;
        }

        public QueryTSJobsResponseBodyList setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryTSJobsResponseBodyList setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public QueryTSJobsResponseBodyList setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public QueryTSJobsResponseBodyList setFailHandleStrategy(String failHandleStrategy) {
            this.failHandleStrategy = failHandleStrategy;
            return this;
        }
        public String getFailHandleStrategy() {
            return this.failHandleStrategy;
        }

        public QueryTSJobsResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTSJobsResponseBodyList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryTSJobsResponseBodyList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryTSJobsResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSJobsResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSJobsResponseBodyList setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public QueryTSJobsResponseBodyList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryTSJobsResponseBodyList setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSJobsResponseBodyList setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSJobsResponseBodyList setMaxExecutingChunks(String maxExecutingChunks) {
            this.maxExecutingChunks = maxExecutingChunks;
            return this;
        }
        public String getMaxExecutingChunks() {
            return this.maxExecutingChunks;
        }

        public QueryTSJobsResponseBodyList setMaxExecutingChunksPerClient(String maxExecutingChunksPerClient) {
            this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
            return this;
        }
        public String getMaxExecutingChunksPerClient() {
            return this.maxExecutingChunksPerClient;
        }

        public QueryTSJobsResponseBodyList setMisfireStrategy(String misfireStrategy) {
            this.misfireStrategy = misfireStrategy;
            return this;
        }
        public String getMisfireStrategy() {
            return this.misfireStrategy;
        }

        public QueryTSJobsResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSJobsResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSJobsResponseBodyList setPermitsPerSecond(String permitsPerSecond) {
            this.permitsPerSecond = permitsPerSecond;
            return this;
        }
        public String getPermitsPerSecond() {
            return this.permitsPerSecond;
        }

        public QueryTSJobsResponseBodyList setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryTSJobsResponseBodyList setRouteStrategy(String routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public String getRouteStrategy() {
            return this.routeStrategy;
        }

        public QueryTSJobsResponseBodyList setShardingCount(String shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public String getShardingCount() {
            return this.shardingCount;
        }

        public QueryTSJobsResponseBodyList setSleepTime(Long sleepTime) {
            this.sleepTime = sleepTime;
            return this;
        }
        public Long getSleepTime() {
            return this.sleepTime;
        }

        public QueryTSJobsResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSJobsResponseBodyList setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryTSJobsResponseBodyList setTimeoutStrategy(String timeoutStrategy) {
            this.timeoutStrategy = timeoutStrategy;
            return this;
        }
        public String getTimeoutStrategy() {
            return this.timeoutStrategy;
        }

        public QueryTSJobsResponseBodyList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public QueryTSJobsResponseBodyList setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryTSJobsResponseBodyList setTolerateProcessFailedCount(String tolerateProcessFailedCount) {
            this.tolerateProcessFailedCount = tolerateProcessFailedCount;
            return this;
        }
        public String getTolerateProcessFailedCount() {
            return this.tolerateProcessFailedCount;
        }

        public QueryTSJobsResponseBodyList setTotalZone(String totalZone) {
            this.totalZone = totalZone;
            return this;
        }
        public String getTotalZone() {
            return this.totalZone;
        }

        public QueryTSJobsResponseBodyList setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public QueryTSJobsResponseBodyList setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryTSJobsResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSJobsResponseBodyList setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

        public QueryTSJobsResponseBodyList setCustomParams(QueryTSJobsResponseBodyListCustomParams customParams) {
            this.customParams = customParams;
            return this;
        }
        public QueryTSJobsResponseBodyListCustomParams getCustomParams() {
            return this.customParams;
        }

    }

}
