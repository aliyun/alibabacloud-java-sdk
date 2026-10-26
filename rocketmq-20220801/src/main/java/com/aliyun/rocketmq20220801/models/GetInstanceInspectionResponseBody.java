// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public GetInstanceInspectionResponseBodyConfig config;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("configured")
    public Boolean configured;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("items")
    public java.util.List<GetInstanceInspectionResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("lastRun")
    public GetInstanceInspectionResponseBodyLastRun lastRun;

    /**
     * <strong>example:</strong>
     * <p>2026-09-09T03:00:00+08:00</p>
     */
    @NameInMap("nextRunAt")
    public String nextRunAt;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision")
    public Long revision;

    public static GetInstanceInspectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionResponseBody self = new GetInstanceInspectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionResponseBody setConfig(GetInstanceInspectionResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetInstanceInspectionResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetInstanceInspectionResponseBody setConfigured(Boolean configured) {
        this.configured = configured;
        return this;
    }
    public Boolean getConfigured() {
        return this.configured;
    }

    public GetInstanceInspectionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceInspectionResponseBody setItems(java.util.List<GetInstanceInspectionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetInstanceInspectionResponseBodyItems> getItems() {
        return this.items;
    }

    public GetInstanceInspectionResponseBody setLastRun(GetInstanceInspectionResponseBodyLastRun lastRun) {
        this.lastRun = lastRun;
        return this;
    }
    public GetInstanceInspectionResponseBodyLastRun getLastRun() {
        return this.lastRun;
    }

    public GetInstanceInspectionResponseBody setNextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }
    public String getNextRunAt() {
        return this.nextRunAt;
    }

    public GetInstanceInspectionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceInspectionResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public static class GetInstanceInspectionResponseBodyConfigItems extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyConfigItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyConfigItems self = new GetInstanceInspectionResponseBodyConfigItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyConfigItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public GetInstanceInspectionResponseBodyConfigItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetInstanceInspectionResponseBodyConfigResourceScope extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyConfigResourceScope build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyConfigResourceScope self = new GetInstanceInspectionResponseBodyConfigResourceScope();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyConfigResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public GetInstanceInspectionResponseBodyConfigResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetInstanceInspectionResponseBodyConfigResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class GetInstanceInspectionResponseBodyConfigSchedule extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyConfigSchedule build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyConfigSchedule self = new GetInstanceInspectionResponseBodyConfigSchedule();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyConfigSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetInstanceInspectionResponseBodyConfigSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetInstanceInspectionResponseBodyConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetInstanceInspectionResponseBodyConfigItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public GetInstanceInspectionResponseBodyConfigResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public GetInstanceInspectionResponseBodyConfigSchedule schedule;

        public static GetInstanceInspectionResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyConfig self = new GetInstanceInspectionResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyConfig setItems(java.util.List<GetInstanceInspectionResponseBodyConfigItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetInstanceInspectionResponseBodyConfigItems> getItems() {
            return this.items;
        }

        public GetInstanceInspectionResponseBodyConfig setResourceScope(GetInstanceInspectionResponseBodyConfigResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public GetInstanceInspectionResponseBodyConfigResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public GetInstanceInspectionResponseBodyConfig setSchedule(GetInstanceInspectionResponseBodyConfigSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public GetInstanceInspectionResponseBodyConfigSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class GetInstanceInspectionResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>检查消费延迟和消费健康度</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>消费健康巡检</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("resourceCount")
        public Long resourceCount;

        /**
         * <strong>example:</strong>
         * <p>[&quot;ConsumerGroup&quot;]</p>
         */
        @NameInMap("resourceTypes")
        public java.util.List<String> resourceTypes;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        public static GetInstanceInspectionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyItems self = new GetInstanceInspectionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceInspectionResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionResponseBodyItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetInstanceInspectionResponseBodyItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public GetInstanceInspectionResponseBodyItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunAiSummary extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunAiSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunAiSummary self = new GetInstanceInspectionResponseBodyLastRunAiSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunAiSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionResponseBodyLastRunAiSummary setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems self = new GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope self = new GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule self = new GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunConfigSnapshot extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule schedule;

        public static GetInstanceInspectionResponseBodyLastRunConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunConfigSnapshot self = new GetInstanceInspectionResponseBodyLastRunConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshot setItems(java.util.List<GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetInstanceInspectionResponseBodyLastRunConfigSnapshotItems> getItems() {
            return this.items;
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshot setResourceScope(GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public GetInstanceInspectionResponseBodyLastRunConfigSnapshot setSchedule(GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig self = new GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunItemsMetrics extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunItemsMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunItemsMetrics self = new GetInstanceInspectionResponseBodyLastRunItemsMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunItemsMetrics setBad(Boolean bad) {
            this.bad = bad;
            return this;
        }
        public Boolean getBad() {
            return this.bad;
        }

        public GetInstanceInspectionResponseBodyLastRunItemsMetrics setGood(Boolean good) {
            this.good = good;
            return this;
        }
        public Boolean getGood() {
            return this.good;
        }

        public GetInstanceInspectionResponseBodyLastRunItemsMetrics setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public GetInstanceInspectionResponseBodyLastRunItemsMetrics setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunItemsResourceSummary extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunItemsResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunItemsResourceSummary self = new GetInstanceInspectionResponseBodyLastRunItemsResourceSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunItemsResourceSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionResponseBodyLastRunItemsResourceSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunItemsTimeRange extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunItemsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunItemsTimeRange self = new GetInstanceInspectionResponseBodyLastRunItemsTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunItemsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionResponseBodyLastRunItemsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunItems extends TeaModel {
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
        public GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig effectiveConfig;

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
        public java.util.List<GetInstanceInspectionResponseBodyLastRunItemsMetrics> metrics;

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
        public GetInstanceInspectionResponseBodyLastRunItemsResourceSummary resourceSummary;

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
        public GetInstanceInspectionResponseBodyLastRunItemsTimeRange timeRange;

        public static GetInstanceInspectionResponseBodyLastRunItems build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunItems self = new GetInstanceInspectionResponseBodyLastRunItems();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setEffectiveConfig(GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig effectiveConfig) {
            this.effectiveConfig = effectiveConfig;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunItemsEffectiveConfig getEffectiveConfig() {
            return this.effectiveConfig;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setHeadline(String headline) {
            this.headline = headline;
            return this;
        }
        public String getHeadline() {
            return this.headline;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setMetrics(java.util.List<GetInstanceInspectionResponseBodyLastRunItemsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetInstanceInspectionResponseBodyLastRunItemsMetrics> getMetrics() {
            return this.metrics;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setResourceSummary(GetInstanceInspectionResponseBodyLastRunItemsResourceSummary resourceSummary) {
            this.resourceSummary = resourceSummary;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunItemsResourceSummary getResourceSummary() {
            return this.resourceSummary;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionResponseBodyLastRunItems setTimeRange(GetInstanceInspectionResponseBodyLastRunItemsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunItemsTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunNotification extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunNotification build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunNotification self = new GetInstanceInspectionResponseBodyLastRunNotification();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunNotification setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetInstanceInspectionResponseBodyLastRunNotification setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange self = new GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportCoverage extends TeaModel {
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
        public GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange timeRange;

        public static GetInstanceInspectionResponseBodyLastRunReportCoverage build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportCoverage self = new GetInstanceInspectionResponseBodyLastRunReportCoverage();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setDiagnosisStatus(String diagnosisStatus) {
            this.diagnosisStatus = diagnosisStatus;
            return this;
        }
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionResponseBodyLastRunReportCoverage setTimeRange(GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunReportCoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportFindingsResource extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunReportFindingsResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportFindingsResource self = new GetInstanceInspectionResponseBodyLastRunReportFindingsResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindingsResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindingsResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindingsResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange self = new GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportFindings extends TeaModel {
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
        public GetInstanceInspectionResponseBodyLastRunReportFindingsResource resource;

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
        public GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("verification")
        public java.util.List<String> verification;

        public static GetInstanceInspectionResponseBodyLastRunReportFindings build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportFindings self = new GetInstanceInspectionResponseBodyLastRunReportFindings();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setAlternatives(java.util.List<String> alternatives) {
            this.alternatives = alternatives;
            return this;
        }
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setEvidence(java.util.List<String> evidence) {
            this.evidence = evidence;
            return this;
        }
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setImpact(String impact) {
            this.impact = impact;
            return this;
        }
        public String getImpact() {
            return this.impact;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setMissingEvidence(java.util.List<String> missingEvidence) {
            this.missingEvidence = missingEvidence;
            return this;
        }
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setObservations(java.util.List<String> observations) {
            this.observations = observations;
            return this;
        }
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setRecommendations(java.util.List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setResource(GetInstanceInspectionResponseBodyLastRunReportFindingsResource resource) {
            this.resource = resource;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunReportFindingsResource getResource() {
            return this.resource;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setTimeRange(GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunReportFindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        public GetInstanceInspectionResponseBodyLastRunReportFindings setVerification(java.util.List<String> verification) {
            this.verification = verification;
            return this;
        }
        public java.util.List<String> getVerification() {
            return this.verification;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportReportSummary extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunReportReportSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportReportSummary self = new GetInstanceInspectionResponseBodyLastRunReportReportSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportReportSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionResponseBodyLastRunReportReportSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReportTimeRange extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunReportTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReportTimeRange self = new GetInstanceInspectionResponseBodyLastRunReportTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReportTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionResponseBodyLastRunReportTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunReport extends TeaModel {
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
        public java.util.List<GetInstanceInspectionResponseBodyLastRunReportCoverage> coverage;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("findings")
        public java.util.List<GetInstanceInspectionResponseBodyLastRunReportFindings> findings;

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
        public GetInstanceInspectionResponseBodyLastRunReportReportSummary reportSummary;

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
        public GetInstanceInspectionResponseBodyLastRunReportTimeRange timeRange;

        public static GetInstanceInspectionResponseBodyLastRunReport build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunReport self = new GetInstanceInspectionResponseBodyLastRunReport();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunReport setCompletion(String completion) {
            this.completion = completion;
            return this;
        }
        public String getCompletion() {
            return this.completion;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setCoverage(java.util.List<GetInstanceInspectionResponseBodyLastRunReportCoverage> coverage) {
            this.coverage = coverage;
            return this;
        }
        public java.util.List<GetInstanceInspectionResponseBodyLastRunReportCoverage> getCoverage() {
            return this.coverage;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setFindings(java.util.List<GetInstanceInspectionResponseBodyLastRunReportFindings> findings) {
            this.findings = findings;
            return this;
        }
        public java.util.List<GetInstanceInspectionResponseBodyLastRunReportFindings> getFindings() {
            return this.findings;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setHtml(String html) {
            this.html = html;
            return this;
        }
        public String getHtml() {
            return this.html;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setInspectionRunId(String inspectionRunId) {
            this.inspectionRunId = inspectionRunId;
            return this;
        }
        public String getInspectionRunId() {
            return this.inspectionRunId;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setMarkdown(String markdown) {
            this.markdown = markdown;
            return this;
        }
        public String getMarkdown() {
            return this.markdown;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setOverview(String overview) {
            this.overview = overview;
            return this;
        }
        public String getOverview() {
            return this.overview;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setReportSummary(GetInstanceInspectionResponseBodyLastRunReportReportSummary reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunReportReportSummary getReportSummary() {
            return this.reportSummary;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetInstanceInspectionResponseBodyLastRunReport setTimeRange(GetInstanceInspectionResponseBodyLastRunReportTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunReportTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunSummary extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunSummary self = new GetInstanceInspectionResponseBodyLastRunSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionResponseBodyLastRunSummary setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionResponseBodyLastRunSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRunTimeRange extends TeaModel {
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

        public static GetInstanceInspectionResponseBodyLastRunTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRunTimeRange self = new GetInstanceInspectionResponseBodyLastRunTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRunTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionResponseBodyLastRunTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionResponseBodyLastRun extends TeaModel {
        /**
         * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("aiSummary")
        public GetInstanceInspectionResponseBodyLastRunAiSummary aiSummary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("configSnapshot")
        public GetInstanceInspectionResponseBodyLastRunConfigSnapshot configSnapshot;

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
        public java.util.List<GetInstanceInspectionResponseBodyLastRunItems> items;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("notification")
        public GetInstanceInspectionResponseBodyLastRunNotification notification;

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
        public GetInstanceInspectionResponseBodyLastRunReport report;

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
        public GetInstanceInspectionResponseBodyLastRunSummary summary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionResponseBodyLastRunTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerSource")
        public String triggerSource;

        public static GetInstanceInspectionResponseBodyLastRun build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionResponseBodyLastRun self = new GetInstanceInspectionResponseBodyLastRun();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionResponseBodyLastRun setAiSummary(GetInstanceInspectionResponseBodyLastRunAiSummary aiSummary) {
            this.aiSummary = aiSummary;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunAiSummary getAiSummary() {
            return this.aiSummary;
        }

        public GetInstanceInspectionResponseBodyLastRun setConfigSnapshot(GetInstanceInspectionResponseBodyLastRunConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public GetInstanceInspectionResponseBodyLastRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetInstanceInspectionResponseBodyLastRun setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceInspectionResponseBodyLastRun setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceInspectionResponseBodyLastRun setItems(java.util.List<GetInstanceInspectionResponseBodyLastRunItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetInstanceInspectionResponseBodyLastRunItems> getItems() {
            return this.items;
        }

        public GetInstanceInspectionResponseBodyLastRun setNotification(GetInstanceInspectionResponseBodyLastRunNotification notification) {
            this.notification = notification;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunNotification getNotification() {
            return this.notification;
        }

        public GetInstanceInspectionResponseBodyLastRun setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceInspectionResponseBodyLastRun setReport(GetInstanceInspectionResponseBodyLastRunReport report) {
            this.report = report;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunReport getReport() {
            return this.report;
        }

        public GetInstanceInspectionResponseBodyLastRun setRequestedAt(String requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }
        public String getRequestedAt() {
            return this.requestedAt;
        }

        public GetInstanceInspectionResponseBodyLastRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetInstanceInspectionResponseBodyLastRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionResponseBodyLastRun setSummary(GetInstanceInspectionResponseBodyLastRunSummary summary) {
            this.summary = summary;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunSummary getSummary() {
            return this.summary;
        }

        public GetInstanceInspectionResponseBodyLastRun setTimeRange(GetInstanceInspectionResponseBodyLastRunTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionResponseBodyLastRunTimeRange getTimeRange() {
            return this.timeRange;
        }

        public GetInstanceInspectionResponseBodyLastRun setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

    }

}
