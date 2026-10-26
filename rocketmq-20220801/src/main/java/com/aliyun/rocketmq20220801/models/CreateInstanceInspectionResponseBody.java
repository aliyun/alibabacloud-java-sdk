// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceInspectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public CreateInstanceInspectionResponseBodyConfig config;

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
    public java.util.List<CreateInstanceInspectionResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("lastRun")
    public CreateInstanceInspectionResponseBodyLastRun lastRun;

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

    public static CreateInstanceInspectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInspectionResponseBody self = new CreateInstanceInspectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInspectionResponseBody setConfig(CreateInstanceInspectionResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public CreateInstanceInspectionResponseBodyConfig getConfig() {
        return this.config;
    }

    public CreateInstanceInspectionResponseBody setConfigured(Boolean configured) {
        this.configured = configured;
        return this;
    }
    public Boolean getConfigured() {
        return this.configured;
    }

    public CreateInstanceInspectionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceInspectionResponseBody setItems(java.util.List<CreateInstanceInspectionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CreateInstanceInspectionResponseBodyItems> getItems() {
        return this.items;
    }

    public CreateInstanceInspectionResponseBody setLastRun(CreateInstanceInspectionResponseBodyLastRun lastRun) {
        this.lastRun = lastRun;
        return this;
    }
    public CreateInstanceInspectionResponseBodyLastRun getLastRun() {
        return this.lastRun;
    }

    public CreateInstanceInspectionResponseBody setNextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }
    public String getNextRunAt() {
        return this.nextRunAt;
    }

    public CreateInstanceInspectionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceInspectionResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public static class CreateInstanceInspectionResponseBodyConfigItems extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyConfigItems build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyConfigItems self = new CreateInstanceInspectionResponseBodyConfigItems();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyConfigItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public CreateInstanceInspectionResponseBodyConfigItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateInstanceInspectionResponseBodyConfigResourceScope extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyConfigResourceScope build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyConfigResourceScope self = new CreateInstanceInspectionResponseBodyConfigResourceScope();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyConfigResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public CreateInstanceInspectionResponseBodyConfigResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateInstanceInspectionResponseBodyConfigResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class CreateInstanceInspectionResponseBodyConfigSchedule extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyConfigSchedule build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyConfigSchedule self = new CreateInstanceInspectionResponseBodyConfigSchedule();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyConfigSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateInstanceInspectionResponseBodyConfigSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateInstanceInspectionResponseBodyConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<CreateInstanceInspectionResponseBodyConfigItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public CreateInstanceInspectionResponseBodyConfigResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public CreateInstanceInspectionResponseBodyConfigSchedule schedule;

        public static CreateInstanceInspectionResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyConfig self = new CreateInstanceInspectionResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyConfig setItems(java.util.List<CreateInstanceInspectionResponseBodyConfigItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CreateInstanceInspectionResponseBodyConfigItems> getItems() {
            return this.items;
        }

        public CreateInstanceInspectionResponseBodyConfig setResourceScope(CreateInstanceInspectionResponseBodyConfigResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public CreateInstanceInspectionResponseBodyConfigResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public CreateInstanceInspectionResponseBodyConfig setSchedule(CreateInstanceInspectionResponseBodyConfigSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public CreateInstanceInspectionResponseBodyConfigSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class CreateInstanceInspectionResponseBodyItems extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyItems self = new CreateInstanceInspectionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceInspectionResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateInstanceInspectionResponseBodyItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public CreateInstanceInspectionResponseBodyItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public CreateInstanceInspectionResponseBodyItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunAiSummary extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunAiSummary build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunAiSummary self = new CreateInstanceInspectionResponseBodyLastRunAiSummary();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunAiSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateInstanceInspectionResponseBodyLastRunAiSummary setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems self = new CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope self = new CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule self = new CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunConfigSnapshot extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule schedule;

        public static CreateInstanceInspectionResponseBodyLastRunConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunConfigSnapshot self = new CreateInstanceInspectionResponseBodyLastRunConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshot setItems(java.util.List<CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunConfigSnapshotItems> getItems() {
            return this.items;
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshot setResourceScope(CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshot setSchedule(CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig self = new CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunItemsMetrics extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunItemsMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunItemsMetrics self = new CreateInstanceInspectionResponseBodyLastRunItemsMetrics();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsMetrics setBad(Boolean bad) {
            this.bad = bad;
            return this;
        }
        public Boolean getBad() {
            return this.bad;
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsMetrics setGood(Boolean good) {
            this.good = good;
            return this;
        }
        public Boolean getGood() {
            return this.good;
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsMetrics setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsMetrics setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary self = new CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunItemsTimeRange extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunItemsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunItemsTimeRange self = new CreateInstanceInspectionResponseBodyLastRunItemsTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateInstanceInspectionResponseBodyLastRunItemsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunItems extends TeaModel {
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
        public CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig effectiveConfig;

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
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunItemsMetrics> metrics;

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
        public CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary resourceSummary;

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
        public CreateInstanceInspectionResponseBodyLastRunItemsTimeRange timeRange;

        public static CreateInstanceInspectionResponseBodyLastRunItems build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunItems self = new CreateInstanceInspectionResponseBodyLastRunItems();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setEffectiveConfig(CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig effectiveConfig) {
            this.effectiveConfig = effectiveConfig;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig getEffectiveConfig() {
            return this.effectiveConfig;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setHeadline(String headline) {
            this.headline = headline;
            return this;
        }
        public String getHeadline() {
            return this.headline;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setMetrics(java.util.List<CreateInstanceInspectionResponseBodyLastRunItemsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunItemsMetrics> getMetrics() {
            return this.metrics;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setResourceSummary(CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary resourceSummary) {
            this.resourceSummary = resourceSummary;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunItemsResourceSummary getResourceSummary() {
            return this.resourceSummary;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateInstanceInspectionResponseBodyLastRunItems setTimeRange(CreateInstanceInspectionResponseBodyLastRunItemsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunItemsTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunNotification extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunNotification build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunNotification self = new CreateInstanceInspectionResponseBodyLastRunNotification();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunNotification setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public CreateInstanceInspectionResponseBodyLastRunNotification setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange self = new CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportCoverage extends TeaModel {
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
        public CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange timeRange;

        public static CreateInstanceInspectionResponseBodyLastRunReportCoverage build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportCoverage self = new CreateInstanceInspectionResponseBodyLastRunReportCoverage();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setDiagnosisStatus(String diagnosisStatus) {
            this.diagnosisStatus = diagnosisStatus;
            return this;
        }
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportCoverage setTimeRange(CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportFindingsResource extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunReportFindingsResource build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportFindingsResource self = new CreateInstanceInspectionResponseBodyLastRunReportFindingsResource();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindingsResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindingsResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindingsResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange self = new CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportFindings extends TeaModel {
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
        public CreateInstanceInspectionResponseBodyLastRunReportFindingsResource resource;

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
        public CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("verification")
        public java.util.List<String> verification;

        public static CreateInstanceInspectionResponseBodyLastRunReportFindings build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportFindings self = new CreateInstanceInspectionResponseBodyLastRunReportFindings();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setAlternatives(java.util.List<String> alternatives) {
            this.alternatives = alternatives;
            return this;
        }
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setEvidence(java.util.List<String> evidence) {
            this.evidence = evidence;
            return this;
        }
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setImpact(String impact) {
            this.impact = impact;
            return this;
        }
        public String getImpact() {
            return this.impact;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setMissingEvidence(java.util.List<String> missingEvidence) {
            this.missingEvidence = missingEvidence;
            return this;
        }
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setObservations(java.util.List<String> observations) {
            this.observations = observations;
            return this;
        }
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setRecommendations(java.util.List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setResource(CreateInstanceInspectionResponseBodyLastRunReportFindingsResource resource) {
            this.resource = resource;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunReportFindingsResource getResource() {
            return this.resource;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setTimeRange(CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportFindings setVerification(java.util.List<String> verification) {
            this.verification = verification;
            return this;
        }
        public java.util.List<String> getVerification() {
            return this.verification;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportReportSummary extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunReportReportSummary build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportReportSummary self = new CreateInstanceInspectionResponseBodyLastRunReportReportSummary();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportReportSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportReportSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReportTimeRange extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunReportTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReportTimeRange self = new CreateInstanceInspectionResponseBodyLastRunReportTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReportTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateInstanceInspectionResponseBodyLastRunReportTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunReport extends TeaModel {
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
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunReportCoverage> coverage;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("findings")
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunReportFindings> findings;

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
        public CreateInstanceInspectionResponseBodyLastRunReportReportSummary reportSummary;

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
        public CreateInstanceInspectionResponseBodyLastRunReportTimeRange timeRange;

        public static CreateInstanceInspectionResponseBodyLastRunReport build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunReport self = new CreateInstanceInspectionResponseBodyLastRunReport();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setCompletion(String completion) {
            this.completion = completion;
            return this;
        }
        public String getCompletion() {
            return this.completion;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setCoverage(java.util.List<CreateInstanceInspectionResponseBodyLastRunReportCoverage> coverage) {
            this.coverage = coverage;
            return this;
        }
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunReportCoverage> getCoverage() {
            return this.coverage;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setFindings(java.util.List<CreateInstanceInspectionResponseBodyLastRunReportFindings> findings) {
            this.findings = findings;
            return this;
        }
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunReportFindings> getFindings() {
            return this.findings;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setHtml(String html) {
            this.html = html;
            return this;
        }
        public String getHtml() {
            return this.html;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setInspectionRunId(String inspectionRunId) {
            this.inspectionRunId = inspectionRunId;
            return this;
        }
        public String getInspectionRunId() {
            return this.inspectionRunId;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setMarkdown(String markdown) {
            this.markdown = markdown;
            return this;
        }
        public String getMarkdown() {
            return this.markdown;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setOverview(String overview) {
            this.overview = overview;
            return this;
        }
        public String getOverview() {
            return this.overview;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setReportSummary(CreateInstanceInspectionResponseBodyLastRunReportReportSummary reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunReportReportSummary getReportSummary() {
            return this.reportSummary;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public CreateInstanceInspectionResponseBodyLastRunReport setTimeRange(CreateInstanceInspectionResponseBodyLastRunReportTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunReportTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunSummary extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunSummary build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunSummary self = new CreateInstanceInspectionResponseBodyLastRunSummary();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public CreateInstanceInspectionResponseBodyLastRunSummary setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateInstanceInspectionResponseBodyLastRunSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRunTimeRange extends TeaModel {
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

        public static CreateInstanceInspectionResponseBodyLastRunTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRunTimeRange self = new CreateInstanceInspectionResponseBodyLastRunTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRunTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateInstanceInspectionResponseBodyLastRunTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateInstanceInspectionResponseBodyLastRun extends TeaModel {
        /**
         * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("aiSummary")
        public CreateInstanceInspectionResponseBodyLastRunAiSummary aiSummary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("configSnapshot")
        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshot configSnapshot;

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
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunItems> items;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("notification")
        public CreateInstanceInspectionResponseBodyLastRunNotification notification;

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
        public CreateInstanceInspectionResponseBodyLastRunReport report;

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
        public CreateInstanceInspectionResponseBodyLastRunSummary summary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public CreateInstanceInspectionResponseBodyLastRunTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerSource")
        public String triggerSource;

        public static CreateInstanceInspectionResponseBodyLastRun build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionResponseBodyLastRun self = new CreateInstanceInspectionResponseBodyLastRun();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionResponseBodyLastRun setAiSummary(CreateInstanceInspectionResponseBodyLastRunAiSummary aiSummary) {
            this.aiSummary = aiSummary;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunAiSummary getAiSummary() {
            return this.aiSummary;
        }

        public CreateInstanceInspectionResponseBodyLastRun setConfigSnapshot(CreateInstanceInspectionResponseBodyLastRunConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public CreateInstanceInspectionResponseBodyLastRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public CreateInstanceInspectionResponseBodyLastRun setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceInspectionResponseBodyLastRun setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateInstanceInspectionResponseBodyLastRun setItems(java.util.List<CreateInstanceInspectionResponseBodyLastRunItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CreateInstanceInspectionResponseBodyLastRunItems> getItems() {
            return this.items;
        }

        public CreateInstanceInspectionResponseBodyLastRun setNotification(CreateInstanceInspectionResponseBodyLastRunNotification notification) {
            this.notification = notification;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunNotification getNotification() {
            return this.notification;
        }

        public CreateInstanceInspectionResponseBodyLastRun setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateInstanceInspectionResponseBodyLastRun setReport(CreateInstanceInspectionResponseBodyLastRunReport report) {
            this.report = report;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunReport getReport() {
            return this.report;
        }

        public CreateInstanceInspectionResponseBodyLastRun setRequestedAt(String requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }
        public String getRequestedAt() {
            return this.requestedAt;
        }

        public CreateInstanceInspectionResponseBodyLastRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public CreateInstanceInspectionResponseBodyLastRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateInstanceInspectionResponseBodyLastRun setSummary(CreateInstanceInspectionResponseBodyLastRunSummary summary) {
            this.summary = summary;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunSummary getSummary() {
            return this.summary;
        }

        public CreateInstanceInspectionResponseBodyLastRun setTimeRange(CreateInstanceInspectionResponseBodyLastRunTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateInstanceInspectionResponseBodyLastRunTimeRange getTimeRange() {
            return this.timeRange;
        }

        public CreateInstanceInspectionResponseBodyLastRun setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

    }

}
