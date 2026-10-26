// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceInspectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public UpdateInstanceInspectionResponseBodyConfig config;

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
    public java.util.List<UpdateInstanceInspectionResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("lastRun")
    public UpdateInstanceInspectionResponseBodyLastRun lastRun;

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

    public static UpdateInstanceInspectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInspectionResponseBody self = new UpdateInstanceInspectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInspectionResponseBody setConfig(UpdateInstanceInspectionResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public UpdateInstanceInspectionResponseBodyConfig getConfig() {
        return this.config;
    }

    public UpdateInstanceInspectionResponseBody setConfigured(Boolean configured) {
        this.configured = configured;
        return this;
    }
    public Boolean getConfigured() {
        return this.configured;
    }

    public UpdateInstanceInspectionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceInspectionResponseBody setItems(java.util.List<UpdateInstanceInspectionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<UpdateInstanceInspectionResponseBodyItems> getItems() {
        return this.items;
    }

    public UpdateInstanceInspectionResponseBody setLastRun(UpdateInstanceInspectionResponseBodyLastRun lastRun) {
        this.lastRun = lastRun;
        return this;
    }
    public UpdateInstanceInspectionResponseBodyLastRun getLastRun() {
        return this.lastRun;
    }

    public UpdateInstanceInspectionResponseBody setNextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }
    public String getNextRunAt() {
        return this.nextRunAt;
    }

    public UpdateInstanceInspectionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceInspectionResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public static class UpdateInstanceInspectionResponseBodyConfigItems extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyConfigItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyConfigItems self = new UpdateInstanceInspectionResponseBodyConfigItems();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyConfigItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public UpdateInstanceInspectionResponseBodyConfigItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyConfigResourceScope extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyConfigResourceScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyConfigResourceScope self = new UpdateInstanceInspectionResponseBodyConfigResourceScope();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyConfigResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public UpdateInstanceInspectionResponseBodyConfigResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateInstanceInspectionResponseBodyConfigResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyConfigSchedule extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyConfigSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyConfigSchedule self = new UpdateInstanceInspectionResponseBodyConfigSchedule();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyConfigSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateInstanceInspectionResponseBodyConfigSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<UpdateInstanceInspectionResponseBodyConfigItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public UpdateInstanceInspectionResponseBodyConfigResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public UpdateInstanceInspectionResponseBodyConfigSchedule schedule;

        public static UpdateInstanceInspectionResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyConfig self = new UpdateInstanceInspectionResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyConfig setItems(java.util.List<UpdateInstanceInspectionResponseBodyConfigItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<UpdateInstanceInspectionResponseBodyConfigItems> getItems() {
            return this.items;
        }

        public UpdateInstanceInspectionResponseBodyConfig setResourceScope(UpdateInstanceInspectionResponseBodyConfigResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyConfigResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public UpdateInstanceInspectionResponseBodyConfig setSchedule(UpdateInstanceInspectionResponseBodyConfigSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyConfigSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyItems extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyItems self = new UpdateInstanceInspectionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateInstanceInspectionResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateInstanceInspectionResponseBodyItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public UpdateInstanceInspectionResponseBodyItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public UpdateInstanceInspectionResponseBodyItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunAiSummary extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunAiSummary build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunAiSummary self = new UpdateInstanceInspectionResponseBodyLastRunAiSummary();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunAiSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateInstanceInspectionResponseBodyLastRunAiSummary setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems self = new UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope self = new UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule self = new UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule schedule;

        public static UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot self = new UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot setItems(java.util.List<UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotItems> getItems() {
            return this.items;
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot setResourceScope(UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot setSchedule(UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshotSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig self = new UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunItemsMetrics extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunItemsMetrics build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunItemsMetrics self = new UpdateInstanceInspectionResponseBodyLastRunItemsMetrics();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsMetrics setBad(Boolean bad) {
            this.bad = bad;
            return this;
        }
        public Boolean getBad() {
            return this.bad;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsMetrics setGood(Boolean good) {
            this.good = good;
            return this;
        }
        public Boolean getGood() {
            return this.good;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsMetrics setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsMetrics setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary self = new UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange self = new UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunItems extends TeaModel {
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
        public UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig effectiveConfig;

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
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunItemsMetrics> metrics;

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
        public UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary resourceSummary;

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
        public UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange timeRange;

        public static UpdateInstanceInspectionResponseBodyLastRunItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunItems self = new UpdateInstanceInspectionResponseBodyLastRunItems();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setEffectiveConfig(UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig effectiveConfig) {
            this.effectiveConfig = effectiveConfig;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunItemsEffectiveConfig getEffectiveConfig() {
            return this.effectiveConfig;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setHeadline(String headline) {
            this.headline = headline;
            return this;
        }
        public String getHeadline() {
            return this.headline;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setMetrics(java.util.List<UpdateInstanceInspectionResponseBodyLastRunItemsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunItemsMetrics> getMetrics() {
            return this.metrics;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setResourceSummary(UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary resourceSummary) {
            this.resourceSummary = resourceSummary;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunItemsResourceSummary getResourceSummary() {
            return this.resourceSummary;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public UpdateInstanceInspectionResponseBodyLastRunItems setTimeRange(UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunItemsTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunNotification extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunNotification build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunNotification self = new UpdateInstanceInspectionResponseBodyLastRunNotification();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunNotification setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public UpdateInstanceInspectionResponseBodyLastRunNotification setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange self = new UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportCoverage extends TeaModel {
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
        public UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange timeRange;

        public static UpdateInstanceInspectionResponseBodyLastRunReportCoverage build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportCoverage self = new UpdateInstanceInspectionResponseBodyLastRunReportCoverage();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setDiagnosisStatus(String diagnosisStatus) {
            this.diagnosisStatus = diagnosisStatus;
            return this;
        }
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportCoverage setTimeRange(UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunReportCoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource self = new UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange self = new UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportFindings extends TeaModel {
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
        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource resource;

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
        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("verification")
        public java.util.List<String> verification;

        public static UpdateInstanceInspectionResponseBodyLastRunReportFindings build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportFindings self = new UpdateInstanceInspectionResponseBodyLastRunReportFindings();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setAlternatives(java.util.List<String> alternatives) {
            this.alternatives = alternatives;
            return this;
        }
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setEvidence(java.util.List<String> evidence) {
            this.evidence = evidence;
            return this;
        }
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setImpact(String impact) {
            this.impact = impact;
            return this;
        }
        public String getImpact() {
            return this.impact;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setMissingEvidence(java.util.List<String> missingEvidence) {
            this.missingEvidence = missingEvidence;
            return this;
        }
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setObservations(java.util.List<String> observations) {
            this.observations = observations;
            return this;
        }
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setRecommendations(java.util.List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setResource(UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource resource) {
            this.resource = resource;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsResource getResource() {
            return this.resource;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setTimeRange(UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunReportFindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportFindings setVerification(java.util.List<String> verification) {
            this.verification = verification;
            return this;
        }
        public java.util.List<String> getVerification() {
            return this.verification;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportReportSummary extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunReportReportSummary build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportReportSummary self = new UpdateInstanceInspectionResponseBodyLastRunReportReportSummary();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportReportSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportReportSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReportTimeRange extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunReportTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReportTimeRange self = new UpdateInstanceInspectionResponseBodyLastRunReportTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReportTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunReport extends TeaModel {
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
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunReportCoverage> coverage;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("findings")
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunReportFindings> findings;

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
        public UpdateInstanceInspectionResponseBodyLastRunReportReportSummary reportSummary;

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
        public UpdateInstanceInspectionResponseBodyLastRunReportTimeRange timeRange;

        public static UpdateInstanceInspectionResponseBodyLastRunReport build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunReport self = new UpdateInstanceInspectionResponseBodyLastRunReport();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setCompletion(String completion) {
            this.completion = completion;
            return this;
        }
        public String getCompletion() {
            return this.completion;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setCoverage(java.util.List<UpdateInstanceInspectionResponseBodyLastRunReportCoverage> coverage) {
            this.coverage = coverage;
            return this;
        }
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunReportCoverage> getCoverage() {
            return this.coverage;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setFindings(java.util.List<UpdateInstanceInspectionResponseBodyLastRunReportFindings> findings) {
            this.findings = findings;
            return this;
        }
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunReportFindings> getFindings() {
            return this.findings;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setHtml(String html) {
            this.html = html;
            return this;
        }
        public String getHtml() {
            return this.html;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setInspectionRunId(String inspectionRunId) {
            this.inspectionRunId = inspectionRunId;
            return this;
        }
        public String getInspectionRunId() {
            return this.inspectionRunId;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setMarkdown(String markdown) {
            this.markdown = markdown;
            return this;
        }
        public String getMarkdown() {
            return this.markdown;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setOverview(String overview) {
            this.overview = overview;
            return this;
        }
        public String getOverview() {
            return this.overview;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setReportSummary(UpdateInstanceInspectionResponseBodyLastRunReportReportSummary reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunReportReportSummary getReportSummary() {
            return this.reportSummary;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public UpdateInstanceInspectionResponseBodyLastRunReport setTimeRange(UpdateInstanceInspectionResponseBodyLastRunReportTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunReportTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunSummary extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunSummary build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunSummary self = new UpdateInstanceInspectionResponseBodyLastRunSummary();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public UpdateInstanceInspectionResponseBodyLastRunSummary setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public UpdateInstanceInspectionResponseBodyLastRunSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRunTimeRange extends TeaModel {
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

        public static UpdateInstanceInspectionResponseBodyLastRunTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRunTimeRange self = new UpdateInstanceInspectionResponseBodyLastRunTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRunTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateInstanceInspectionResponseBodyLastRunTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateInstanceInspectionResponseBodyLastRun extends TeaModel {
        /**
         * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("aiSummary")
        public UpdateInstanceInspectionResponseBodyLastRunAiSummary aiSummary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("configSnapshot")
        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot configSnapshot;

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
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunItems> items;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("notification")
        public UpdateInstanceInspectionResponseBodyLastRunNotification notification;

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
        public UpdateInstanceInspectionResponseBodyLastRunReport report;

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
        public UpdateInstanceInspectionResponseBodyLastRunSummary summary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public UpdateInstanceInspectionResponseBodyLastRunTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerSource")
        public String triggerSource;

        public static UpdateInstanceInspectionResponseBodyLastRun build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionResponseBodyLastRun self = new UpdateInstanceInspectionResponseBodyLastRun();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionResponseBodyLastRun setAiSummary(UpdateInstanceInspectionResponseBodyLastRunAiSummary aiSummary) {
            this.aiSummary = aiSummary;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunAiSummary getAiSummary() {
            return this.aiSummary;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setConfigSnapshot(UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setItems(java.util.List<UpdateInstanceInspectionResponseBodyLastRunItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<UpdateInstanceInspectionResponseBodyLastRunItems> getItems() {
            return this.items;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setNotification(UpdateInstanceInspectionResponseBodyLastRunNotification notification) {
            this.notification = notification;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunNotification getNotification() {
            return this.notification;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setReport(UpdateInstanceInspectionResponseBodyLastRunReport report) {
            this.report = report;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunReport getReport() {
            return this.report;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setRequestedAt(String requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }
        public String getRequestedAt() {
            return this.requestedAt;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setSummary(UpdateInstanceInspectionResponseBodyLastRunSummary summary) {
            this.summary = summary;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunSummary getSummary() {
            return this.summary;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setTimeRange(UpdateInstanceInspectionResponseBodyLastRunTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateInstanceInspectionResponseBodyLastRunTimeRange getTimeRange() {
            return this.timeRange;
        }

        public UpdateInstanceInspectionResponseBodyLastRun setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

    }

}
