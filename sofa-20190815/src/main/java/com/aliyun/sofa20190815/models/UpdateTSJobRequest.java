// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSJobRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("CountOfActiveZone")
    public Long countOfActiveZone;

    @NameInMap("CountOfClient")
    public Long countOfClient;

    @NameInMap("Cron")
    public String cron;

    @NameInMap("CustomParams")
    public String customParams;

    @NameInMap("Des")
    public String des;

    @NameInMap("EnableForward")
    public Boolean enableForward;

    @NameInMap("Exclusive")
    public Boolean exclusive;

    @NameInMap("FailHandleStrategy")
    public String failHandleStrategy;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GrayRatio")
    public Long grayRatio;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Handlers")
    public String handlers;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("JobItemId")
    public Long jobItemId;

    @NameInMap("JobZone")
    public String jobZone;

    @NameInMap("MaxExecutingChunks")
    public Long maxExecutingChunks;

    @NameInMap("MaxExecutingChunksPerClient")
    public Long maxExecutingChunksPerClient;

    @NameInMap("MisfireStrategy")
    public String misfireStrategy;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PermitsPerSecond")
    public Long permitsPerSecond;

    @NameInMap("PreAutoTrigger")
    public Long preAutoTrigger;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("RouteStrategy")
    public String routeStrategy;

    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("ShardingCount")
    public Long shardingCount;

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
    public Long tolerateProcessFailedCount;

    @NameInMap("TotalZone")
    public Long totalZone;

    @NameInMap("TriggerMode")
    public String triggerMode;

    @NameInMap("TriggerType")
    public String triggerType;

    @NameInMap("Type")
    public String type;

    public static UpdateTSJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSJobRequest self = new UpdateTSJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTSJobRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateTSJobRequest setCountOfActiveZone(Long countOfActiveZone) {
        this.countOfActiveZone = countOfActiveZone;
        return this;
    }
    public Long getCountOfActiveZone() {
        return this.countOfActiveZone;
    }

    public UpdateTSJobRequest setCountOfClient(Long countOfClient) {
        this.countOfClient = countOfClient;
        return this;
    }
    public Long getCountOfClient() {
        return this.countOfClient;
    }

    public UpdateTSJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdateTSJobRequest setCustomParams(String customParams) {
        this.customParams = customParams;
        return this;
    }
    public String getCustomParams() {
        return this.customParams;
    }

    public UpdateTSJobRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public UpdateTSJobRequest setEnableForward(Boolean enableForward) {
        this.enableForward = enableForward;
        return this;
    }
    public Boolean getEnableForward() {
        return this.enableForward;
    }

    public UpdateTSJobRequest setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }
    public Boolean getExclusive() {
        return this.exclusive;
    }

    public UpdateTSJobRequest setFailHandleStrategy(String failHandleStrategy) {
        this.failHandleStrategy = failHandleStrategy;
        return this;
    }
    public String getFailHandleStrategy() {
        return this.failHandleStrategy;
    }

    public UpdateTSJobRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdateTSJobRequest setGrayRatio(Long grayRatio) {
        this.grayRatio = grayRatio;
        return this;
    }
    public Long getGrayRatio() {
        return this.grayRatio;
    }

    public UpdateTSJobRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateTSJobRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateTSJobRequest setHandlers(String handlers) {
        this.handlers = handlers;
        return this;
    }
    public String getHandlers() {
        return this.handlers;
    }

    public UpdateTSJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTSJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTSJobRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public UpdateTSJobRequest setJobItemId(Long jobItemId) {
        this.jobItemId = jobItemId;
        return this;
    }
    public Long getJobItemId() {
        return this.jobItemId;
    }

    public UpdateTSJobRequest setJobZone(String jobZone) {
        this.jobZone = jobZone;
        return this;
    }
    public String getJobZone() {
        return this.jobZone;
    }

    public UpdateTSJobRequest setMaxExecutingChunks(Long maxExecutingChunks) {
        this.maxExecutingChunks = maxExecutingChunks;
        return this;
    }
    public Long getMaxExecutingChunks() {
        return this.maxExecutingChunks;
    }

    public UpdateTSJobRequest setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
        this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
        return this;
    }
    public Long getMaxExecutingChunksPerClient() {
        return this.maxExecutingChunksPerClient;
    }

    public UpdateTSJobRequest setMisfireStrategy(String misfireStrategy) {
        this.misfireStrategy = misfireStrategy;
        return this;
    }
    public String getMisfireStrategy() {
        return this.misfireStrategy;
    }

    public UpdateTSJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTSJobRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateTSJobRequest setPermitsPerSecond(Long permitsPerSecond) {
        this.permitsPerSecond = permitsPerSecond;
        return this;
    }
    public Long getPermitsPerSecond() {
        return this.permitsPerSecond;
    }

    public UpdateTSJobRequest setPreAutoTrigger(Long preAutoTrigger) {
        this.preAutoTrigger = preAutoTrigger;
        return this;
    }
    public Long getPreAutoTrigger() {
        return this.preAutoTrigger;
    }

    public UpdateTSJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateTSJobRequest setRouteStrategy(String routeStrategy) {
        this.routeStrategy = routeStrategy;
        return this;
    }
    public String getRouteStrategy() {
        return this.routeStrategy;
    }

    public UpdateTSJobRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public UpdateTSJobRequest setShardingCount(Long shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Long getShardingCount() {
        return this.shardingCount;
    }

    public UpdateTSJobRequest setSleepTime(Long sleepTime) {
        this.sleepTime = sleepTime;
        return this;
    }
    public Long getSleepTime() {
        return this.sleepTime;
    }

    public UpdateTSJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateTSJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public UpdateTSJobRequest setTimeoutStrategy(String timeoutStrategy) {
        this.timeoutStrategy = timeoutStrategy;
        return this;
    }
    public String getTimeoutStrategy() {
        return this.timeoutStrategy;
    }

    public UpdateTSJobRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public UpdateTSJobRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public UpdateTSJobRequest setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
        this.tolerateProcessFailedCount = tolerateProcessFailedCount;
        return this;
    }
    public Long getTolerateProcessFailedCount() {
        return this.tolerateProcessFailedCount;
    }

    public UpdateTSJobRequest setTotalZone(Long totalZone) {
        this.totalZone = totalZone;
        return this;
    }
    public Long getTotalZone() {
        return this.totalZone;
    }

    public UpdateTSJobRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public UpdateTSJobRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public UpdateTSJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
