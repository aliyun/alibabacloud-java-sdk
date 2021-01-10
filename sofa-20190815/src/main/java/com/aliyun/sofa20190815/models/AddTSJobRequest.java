// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSJobRequest extends TeaModel {
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
    public Boolean preAutoTrigger;

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

    @NameInMap("Zones")
    public String zones;

    @NameInMap("ZoneMode")
    public String zoneMode;

    public static AddTSJobRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTSJobRequest self = new AddTSJobRequest();
        return TeaModel.build(map, self);
    }

    public AddTSJobRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddTSJobRequest setCountOfActiveZone(Long countOfActiveZone) {
        this.countOfActiveZone = countOfActiveZone;
        return this;
    }
    public Long getCountOfActiveZone() {
        return this.countOfActiveZone;
    }

    public AddTSJobRequest setCountOfClient(Long countOfClient) {
        this.countOfClient = countOfClient;
        return this;
    }
    public Long getCountOfClient() {
        return this.countOfClient;
    }

    public AddTSJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public AddTSJobRequest setCustomParams(String customParams) {
        this.customParams = customParams;
        return this;
    }
    public String getCustomParams() {
        return this.customParams;
    }

    public AddTSJobRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public AddTSJobRequest setEnableForward(Boolean enableForward) {
        this.enableForward = enableForward;
        return this;
    }
    public Boolean getEnableForward() {
        return this.enableForward;
    }

    public AddTSJobRequest setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }
    public Boolean getExclusive() {
        return this.exclusive;
    }

    public AddTSJobRequest setFailHandleStrategy(String failHandleStrategy) {
        this.failHandleStrategy = failHandleStrategy;
        return this;
    }
    public String getFailHandleStrategy() {
        return this.failHandleStrategy;
    }

    public AddTSJobRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AddTSJobRequest setGrayRatio(Long grayRatio) {
        this.grayRatio = grayRatio;
        return this;
    }
    public Long getGrayRatio() {
        return this.grayRatio;
    }

    public AddTSJobRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public AddTSJobRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddTSJobRequest setHandlers(String handlers) {
        this.handlers = handlers;
        return this;
    }
    public String getHandlers() {
        return this.handlers;
    }

    public AddTSJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddTSJobRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public AddTSJobRequest setJobItemId(Long jobItemId) {
        this.jobItemId = jobItemId;
        return this;
    }
    public Long getJobItemId() {
        return this.jobItemId;
    }

    public AddTSJobRequest setJobZone(String jobZone) {
        this.jobZone = jobZone;
        return this;
    }
    public String getJobZone() {
        return this.jobZone;
    }

    public AddTSJobRequest setMaxExecutingChunks(Long maxExecutingChunks) {
        this.maxExecutingChunks = maxExecutingChunks;
        return this;
    }
    public Long getMaxExecutingChunks() {
        return this.maxExecutingChunks;
    }

    public AddTSJobRequest setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
        this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
        return this;
    }
    public Long getMaxExecutingChunksPerClient() {
        return this.maxExecutingChunksPerClient;
    }

    public AddTSJobRequest setMisfireStrategy(String misfireStrategy) {
        this.misfireStrategy = misfireStrategy;
        return this;
    }
    public String getMisfireStrategy() {
        return this.misfireStrategy;
    }

    public AddTSJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTSJobRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddTSJobRequest setPermitsPerSecond(Long permitsPerSecond) {
        this.permitsPerSecond = permitsPerSecond;
        return this;
    }
    public Long getPermitsPerSecond() {
        return this.permitsPerSecond;
    }

    public AddTSJobRequest setPreAutoTrigger(Boolean preAutoTrigger) {
        this.preAutoTrigger = preAutoTrigger;
        return this;
    }
    public Boolean getPreAutoTrigger() {
        return this.preAutoTrigger;
    }

    public AddTSJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AddTSJobRequest setRouteStrategy(String routeStrategy) {
        this.routeStrategy = routeStrategy;
        return this;
    }
    public String getRouteStrategy() {
        return this.routeStrategy;
    }

    public AddTSJobRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public AddTSJobRequest setShardingCount(Long shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Long getShardingCount() {
        return this.shardingCount;
    }

    public AddTSJobRequest setSleepTime(Long sleepTime) {
        this.sleepTime = sleepTime;
        return this;
    }
    public Long getSleepTime() {
        return this.sleepTime;
    }

    public AddTSJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddTSJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public AddTSJobRequest setTimeoutStrategy(String timeoutStrategy) {
        this.timeoutStrategy = timeoutStrategy;
        return this;
    }
    public String getTimeoutStrategy() {
        return this.timeoutStrategy;
    }

    public AddTSJobRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public AddTSJobRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public AddTSJobRequest setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
        this.tolerateProcessFailedCount = tolerateProcessFailedCount;
        return this;
    }
    public Long getTolerateProcessFailedCount() {
        return this.tolerateProcessFailedCount;
    }

    public AddTSJobRequest setTotalZone(Long totalZone) {
        this.totalZone = totalZone;
        return this;
    }
    public Long getTotalZone() {
        return this.totalZone;
    }

    public AddTSJobRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public AddTSJobRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public AddTSJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddTSJobRequest setZones(String zones) {
        this.zones = zones;
        return this;
    }
    public String getZones() {
        return this.zones;
    }

    public AddTSJobRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

}
