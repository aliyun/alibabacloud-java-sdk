// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionRunResponseBody extends TeaModel {
    /**
     * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("aiSummary")
    public GetInstanceInspectionRunResponseBodyAiSummary aiSummary;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("configSnapshot")
    public GetInstanceInspectionRunResponseBodyConfigSnapshot configSnapshot;

    /**
     * <strong>example:</strong>
     * <p>2026-09-08T00:01:00Z</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>订单实例</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("items")
    public java.util.List<GetInstanceInspectionRunResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("notification")
    public GetInstanceInspectionRunResponseBodyNotification notification;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("report")
    public GetInstanceInspectionRunResponseBodyReport report;

    /**
     * <strong>example:</strong>
     * <p>2026-09-08T00:00:00Z</p>
     */
    @NameInMap("requestedAt")
    public String requestedAt;

    /**
     * <strong>example:</strong>
     * <p>inspection-run-001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("summary")
    public GetInstanceInspectionRunResponseBodySummary summary;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("timeRange")
    public GetInstanceInspectionRunResponseBodyTimeRange timeRange;

    /**
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("triggerSource")
    public String triggerSource;

    public static GetInstanceInspectionRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionRunResponseBody self = new GetInstanceInspectionRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionRunResponseBody setAiSummary(GetInstanceInspectionRunResponseBodyAiSummary aiSummary) {
        this.aiSummary = aiSummary;
        return this;
    }
    public GetInstanceInspectionRunResponseBodyAiSummary getAiSummary() {
        return this.aiSummary;
    }

    public GetInstanceInspectionRunResponseBody setConfigSnapshot(GetInstanceInspectionRunResponseBodyConfigSnapshot configSnapshot) {
        this.configSnapshot = configSnapshot;
        return this;
    }
    public GetInstanceInspectionRunResponseBodyConfigSnapshot getConfigSnapshot() {
        return this.configSnapshot;
    }

    public GetInstanceInspectionRunResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetInstanceInspectionRunResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceInspectionRunResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceInspectionRunResponseBody setItems(java.util.List<GetInstanceInspectionRunResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetInstanceInspectionRunResponseBodyItems> getItems() {
        return this.items;
    }

    public GetInstanceInspectionRunResponseBody setNotification(GetInstanceInspectionRunResponseBodyNotification notification) {
        this.notification = notification;
        return this;
    }
    public GetInstanceInspectionRunResponseBodyNotification getNotification() {
        return this.notification;
    }

    public GetInstanceInspectionRunResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceInspectionRunResponseBody setReport(GetInstanceInspectionRunResponseBodyReport report) {
        this.report = report;
        return this;
    }
    public GetInstanceInspectionRunResponseBodyReport getReport() {
        return this.report;
    }

    public GetInstanceInspectionRunResponseBody setRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }
    public String getRequestedAt() {
        return this.requestedAt;
    }

    public GetInstanceInspectionRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetInstanceInspectionRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceInspectionRunResponseBody setSummary(GetInstanceInspectionRunResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public GetInstanceInspectionRunResponseBodySummary getSummary() {
        return this.summary;
    }

    public GetInstanceInspectionRunResponseBody setTimeRange(GetInstanceInspectionRunResponseBodyTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetInstanceInspectionRunResponseBodyTimeRange getTimeRange() {
        return this.timeRange;
    }

    public GetInstanceInspectionRunResponseBody setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
        return this;
    }
    public String getTriggerSource() {
        return this.triggerSource;
    }

    public static class GetInstanceInspectionRunResponseBodyAiSummary extends TeaModel {
        /**
         * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>仅生成成功时返回，最多 200 字，不由前端拼接或截取。</p>
         * 
         * <strong>example:</strong>
         * <p>本次巡检未发现风险，实例运行正常。</p>
         */
        @NameInMap("text")
        public String text;

        public static GetInstanceInspectionRunResponseBodyAiSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyAiSummary self = new GetInstanceInspectionRunResponseBodyAiSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyAiSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionRunResponseBodyAiSummary setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyConfigSnapshotItems extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;lookback&quot;:&quot;1h&quot;,&quot;consumerDelayThresholdSeconds&quot;:600}</p>
         */
        @NameInMap("parameters")
        public Object parameters;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        public static GetInstanceInspectionRunResponseBodyConfigSnapshotItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyConfigSnapshotItems self = new GetInstanceInspectionRunResponseBodyConfigSnapshotItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;orders-g1&quot;]</p>
         */
        @NameInMap("consumerGroups")
        public java.util.List<String> consumerGroups;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>[&quot;orders&quot;]</p>
         */
        @NameInMap("topics")
        public java.util.List<String> topics;

        public static GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope self = new GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0 3 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule self = new GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyConfigSnapshot extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetInstanceInspectionRunResponseBodyConfigSnapshotItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule schedule;

        public static GetInstanceInspectionRunResponseBodyConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyConfigSnapshot self = new GetInstanceInspectionRunResponseBodyConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshot setItems(java.util.List<GetInstanceInspectionRunResponseBodyConfigSnapshotItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetInstanceInspectionRunResponseBodyConfigSnapshotItems> getItems() {
            return this.items;
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshot setResourceScope(GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyConfigSnapshotResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public GetInstanceInspectionRunResponseBodyConfigSnapshot setSchedule(GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyConfigSnapshotSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyItemsEffectiveConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;lookback&quot;:&quot;1h&quot;,&quot;consumerDelayThresholdSeconds&quot;:600}</p>
         */
        @NameInMap("parameters")
        public Object parameters;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        public static GetInstanceInspectionRunResponseBodyItemsEffectiveConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyItemsEffectiveConfig self = new GetInstanceInspectionRunResponseBodyItemsEffectiveConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyItemsEffectiveConfig setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public GetInstanceInspectionRunResponseBodyItemsEffectiveConfig setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyItemsMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("bad")
        public Boolean bad;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("good")
        public Boolean good;

        /**
         * <strong>example:</strong>
         * <p>消费延迟</p>
         */
        @NameInMap("k")
        public String k;

        /**
         * <strong>example:</strong>
         * <p>320 秒</p>
         */
        @NameInMap("v")
        public String v;

        public static GetInstanceInspectionRunResponseBodyItemsMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyItemsMetrics self = new GetInstanceInspectionRunResponseBodyItemsMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyItemsMetrics setBad(Boolean bad) {
            this.bad = bad;
            return this;
        }
        public Boolean getBad() {
            return this.bad;
        }

        public GetInstanceInspectionRunResponseBodyItemsMetrics setGood(Boolean good) {
            this.good = good;
            return this;
        }
        public Boolean getGood() {
            return this.good;
        }

        public GetInstanceInspectionRunResponseBodyItemsMetrics setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public GetInstanceInspectionRunResponseBodyItemsMetrics setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyItemsResourceSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("infoCount")
        public Integer infoCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskCount")
        public Integer riskCount;

        public static GetInstanceInspectionRunResponseBodyItemsResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyItemsResourceSummary self = new GetInstanceInspectionRunResponseBodyItemsResourceSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyItemsResourceSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionRunResponseBodyItemsResourceSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyItemsTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionRunResponseBodyItemsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyItemsTimeRange self = new GetInstanceInspectionRunResponseBodyItemsTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyItemsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionRunResponseBodyItemsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>检查消费延迟和消费健康度</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}}</p>
         */
        @NameInMap("effectiveConfig")
        public GetInstanceInspectionRunResponseBodyItemsEffectiveConfig effectiveConfig;

        /**
         * <strong>example:</strong>
         * <p>INSPECTION_EXECUTION_INTERRUPTED</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>消费延迟超过阈值</p>
         */
        @NameInMap("headline")
        public String headline;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("metrics")
        public java.util.List<GetInstanceInspectionRunResponseBodyItemsMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>消费健康巡检</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T01:00:00Z</p>
         */
        @NameInMap("observedAt")
        public String observedAt;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("resourceCount")
        public Long resourceCount;

        /**
         * <strong>example:</strong>
         * <p>{&quot;infoCount&quot;:2,&quot;riskCount&quot;:1}</p>
         */
        @NameInMap("resourceSummary")
        public GetInstanceInspectionRunResponseBodyItemsResourceSummary resourceSummary;

        /**
         * <strong>example:</strong>
         * <p>[&quot;ConsumerGroup&quot;]</p>
         */
        @NameInMap("resourceTypes")
        public java.util.List<String> resourceTypes;

        /**
         * <strong>example:</strong>
         * <p>Risk</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>{&quot;startTime&quot;:&quot;2026-09-01T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-09-01T01:00:00Z&quot;}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionRunResponseBodyItemsTimeRange timeRange;

        public static GetInstanceInspectionRunResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyItems self = new GetInstanceInspectionRunResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceInspectionRunResponseBodyItems setEffectiveConfig(GetInstanceInspectionRunResponseBodyItemsEffectiveConfig effectiveConfig) {
            this.effectiveConfig = effectiveConfig;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyItemsEffectiveConfig getEffectiveConfig() {
            return this.effectiveConfig;
        }

        public GetInstanceInspectionRunResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetInstanceInspectionRunResponseBodyItems setHeadline(String headline) {
            this.headline = headline;
            return this;
        }
        public String getHeadline() {
            return this.headline;
        }

        public GetInstanceInspectionRunResponseBodyItems setMetrics(java.util.List<GetInstanceInspectionRunResponseBodyItemsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetInstanceInspectionRunResponseBodyItemsMetrics> getMetrics() {
            return this.metrics;
        }

        public GetInstanceInspectionRunResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionRunResponseBodyItems setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionRunResponseBodyItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetInstanceInspectionRunResponseBodyItems setResourceSummary(GetInstanceInspectionRunResponseBodyItemsResourceSummary resourceSummary) {
            this.resourceSummary = resourceSummary;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyItemsResourceSummary getResourceSummary() {
            return this.resourceSummary;
        }

        public GetInstanceInspectionRunResponseBodyItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public GetInstanceInspectionRunResponseBodyItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionRunResponseBodyItems setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetInstanceInspectionRunResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionRunResponseBodyItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionRunResponseBodyItems setTimeRange(GetInstanceInspectionRunResponseBodyItemsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyItemsTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyNotification extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>inspection-event-001</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>Sent</p>
         */
        @NameInMap("status")
        public String status;

        public static GetInstanceInspectionRunResponseBodyNotification build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyNotification self = new GetInstanceInspectionRunResponseBodyNotification();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyNotification setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetInstanceInspectionRunResponseBodyNotification setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportCoverageTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionRunResponseBodyReportCoverageTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportCoverageTimeRange self = new GetInstanceInspectionRunResponseBodyReportCoverageTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportCoverageTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverageTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportCoverage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("diagnosisStatus")
        public String diagnosisStatus;

        /**
         * <strong>example:</strong>
         * <p>消费健康</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T01:00:00Z</p>
         */
        @NameInMap("observedAt")
        public String observedAt;

        /**
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>{&quot;startTime&quot;:&quot;2026-09-01T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-09-01T01:00:00Z&quot;}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionRunResponseBodyReportCoverageTimeRange timeRange;

        public static GetInstanceInspectionRunResponseBodyReportCoverage build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportCoverage self = new GetInstanceInspectionRunResponseBodyReportCoverage();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setDiagnosisStatus(String diagnosisStatus) {
            this.diagnosisStatus = diagnosisStatus;
            return this;
        }
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionRunResponseBodyReportCoverage setTimeRange(GetInstanceInspectionRunResponseBodyReportCoverageTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyReportCoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportFindingsResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GID-orders</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>订单消费组</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("type")
        public String type;

        public static GetInstanceInspectionRunResponseBodyReportFindingsResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportFindingsResource self = new GetInstanceInspectionRunResponseBodyReportFindingsResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportFindingsResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceInspectionRunResponseBodyReportFindingsResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionRunResponseBodyReportFindingsResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportFindingsTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionRunResponseBodyReportFindingsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportFindingsTimeRange self = new GetInstanceInspectionRunResponseBodyReportFindingsTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportFindingsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionRunResponseBodyReportFindingsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportFindings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("alternatives")
        public java.util.List<String> alternatives;

        /**
         * <strong>example:</strong>
         * <p>消费环节</p>
         */
        @NameInMap("boundary")
        public String boundary;

        /**
         * <strong>example:</strong>
         * <p>消费者处理速度可能不足</p>
         */
        @NameInMap("cause")
        public String cause;

        /**
         * <strong>example:</strong>
         * <p>likely</p>
         */
        @NameInMap("confidence")
        public String confidence;

        /**
         * <strong>example:</strong>
         * <p>[&quot;消费延迟 60 秒&quot;]</p>
         */
        @NameInMap("evidence")
        public java.util.List<String> evidence;

        /**
         * <strong>example:</strong>
         * <p>消息处理延迟升高</p>
         */
        @NameInMap("impact")
        public String impact;

        /**
         * <strong>example:</strong>
         * <p>消费组监控</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("missingEvidence")
        public java.util.List<String> missingEvidence;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("observations")
        public java.util.List<String> observations;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T01:00:00Z</p>
         */
        @NameInMap("observedAt")
        public String observedAt;

        /**
         * <strong>example:</strong>
         * <p>[&quot;检查消费者处理耗时&quot;]</p>
         */
        @NameInMap("recommendations")
        public java.util.List<String> recommendations;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("resource")
        public GetInstanceInspectionRunResponseBodyReportFindingsResource resource;

        /**
         * <strong>example:</strong>
         * <p>消费延迟</p>
         */
        @NameInMap("riskType")
        public String riskType;

        /**
         * <strong>example:</strong>
         * <p>script</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionRunResponseBodyReportFindingsTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("verification")
        public java.util.List<String> verification;

        public static GetInstanceInspectionRunResponseBodyReportFindings build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportFindings self = new GetInstanceInspectionRunResponseBodyReportFindings();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setAlternatives(java.util.List<String> alternatives) {
            this.alternatives = alternatives;
            return this;
        }
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setEvidence(java.util.List<String> evidence) {
            this.evidence = evidence;
            return this;
        }
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setImpact(String impact) {
            this.impact = impact;
            return this;
        }
        public String getImpact() {
            return this.impact;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setMissingEvidence(java.util.List<String> missingEvidence) {
            this.missingEvidence = missingEvidence;
            return this;
        }
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setObservations(java.util.List<String> observations) {
            this.observations = observations;
            return this;
        }
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setRecommendations(java.util.List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setResource(GetInstanceInspectionRunResponseBodyReportFindingsResource resource) {
            this.resource = resource;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyReportFindingsResource getResource() {
            return this.resource;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setTimeRange(GetInstanceInspectionRunResponseBodyReportFindingsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyReportFindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        public GetInstanceInspectionRunResponseBodyReportFindings setVerification(java.util.List<String> verification) {
            this.verification = verification;
            return this;
        }
        public java.util.List<String> getVerification() {
            return this.verification;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportReportSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("infoCount")
        public Integer infoCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskCount")
        public Integer riskCount;

        public static GetInstanceInspectionRunResponseBodyReportReportSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportReportSummary self = new GetInstanceInspectionRunResponseBodyReportReportSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportReportSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionRunResponseBodyReportReportSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReportTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionRunResponseBodyReportTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReportTimeRange self = new GetInstanceInspectionRunResponseBodyReportTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReportTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionRunResponseBodyReportTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyReport extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("completion")
        public String completion;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("coverage")
        public java.util.List<GetInstanceInspectionRunResponseBodyReportCoverage> coverage;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("findings")
        public java.util.List<GetInstanceInspectionRunResponseBodyReportFindings> findings;

        /**
         * <strong>example:</strong>
         * <p>2026-09-18T08:02:00Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <strong>example:</strong>
         * <h1>实例巡检诊断报告</h1>
         */
        @NameInMap("html")
        public String html;

        /**
         * <strong>example:</strong>
         * <p>irun-example</p>
         */
        @NameInMap("inspectionRunId")
        public String inspectionRunId;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-example</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>订单实例</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <h1>实例巡检诊断报告</h1>
         */
        @NameInMap("markdown")
        public String markdown;

        /**
         * <strong>example:</strong>
         * <p>消费延迟与容量限制可能相关</p>
         */
        @NameInMap("overview")
        public String overview;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>irpt-example</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("reportSummary")
        public GetInstanceInspectionRunResponseBodyReportReportSummary reportSummary;

        /**
         * <strong>example:</strong>
         * <p>inspection-v2.1</p>
         */
        @NameInMap("templateVersion")
        public String templateVersion;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionRunResponseBodyReportTimeRange timeRange;

        public static GetInstanceInspectionRunResponseBodyReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyReport self = new GetInstanceInspectionRunResponseBodyReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyReport setCompletion(String completion) {
            this.completion = completion;
            return this;
        }
        public String getCompletion() {
            return this.completion;
        }

        public GetInstanceInspectionRunResponseBodyReport setCoverage(java.util.List<GetInstanceInspectionRunResponseBodyReportCoverage> coverage) {
            this.coverage = coverage;
            return this;
        }
        public java.util.List<GetInstanceInspectionRunResponseBodyReportCoverage> getCoverage() {
            return this.coverage;
        }

        public GetInstanceInspectionRunResponseBodyReport setFindings(java.util.List<GetInstanceInspectionRunResponseBodyReportFindings> findings) {
            this.findings = findings;
            return this;
        }
        public java.util.List<GetInstanceInspectionRunResponseBodyReportFindings> getFindings() {
            return this.findings;
        }

        public GetInstanceInspectionRunResponseBodyReport setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetInstanceInspectionRunResponseBodyReport setHtml(String html) {
            this.html = html;
            return this;
        }
        public String getHtml() {
            return this.html;
        }

        public GetInstanceInspectionRunResponseBodyReport setInspectionRunId(String inspectionRunId) {
            this.inspectionRunId = inspectionRunId;
            return this;
        }
        public String getInspectionRunId() {
            return this.inspectionRunId;
        }

        public GetInstanceInspectionRunResponseBodyReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceInspectionRunResponseBodyReport setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceInspectionRunResponseBodyReport setMarkdown(String markdown) {
            this.markdown = markdown;
            return this;
        }
        public String getMarkdown() {
            return this.markdown;
        }

        public GetInstanceInspectionRunResponseBodyReport setOverview(String overview) {
            this.overview = overview;
            return this;
        }
        public String getOverview() {
            return this.overview;
        }

        public GetInstanceInspectionRunResponseBodyReport setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceInspectionRunResponseBodyReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetInstanceInspectionRunResponseBodyReport setReportSummary(GetInstanceInspectionRunResponseBodyReportReportSummary reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyReportReportSummary getReportSummary() {
            return this.reportSummary;
        }

        public GetInstanceInspectionRunResponseBodyReport setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetInstanceInspectionRunResponseBodyReport setTimeRange(GetInstanceInspectionRunResponseBodyReportTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionRunResponseBodyReportTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionRunResponseBodySummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("infoCount")
        public Integer infoCount;

        /**
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskCount")
        public Integer riskCount;

        public static GetInstanceInspectionRunResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodySummary self = new GetInstanceInspectionRunResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodySummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionRunResponseBodySummary setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionRunResponseBodySummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionRunResponseBodyTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionRunResponseBodyTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionRunResponseBodyTimeRange self = new GetInstanceInspectionRunResponseBodyTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionRunResponseBodyTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionRunResponseBodyTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
