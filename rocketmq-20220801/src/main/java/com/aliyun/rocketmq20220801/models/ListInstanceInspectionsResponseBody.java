// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ListInstanceInspectionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListInstanceInspectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionsResponseBody self = new ListInstanceInspectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionsResponseBody setData(java.util.List<ListInstanceInspectionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceInspectionsResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceInspectionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceInspectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListInstanceInspectionsResponseBodyDataConfigItems extends TeaModel {
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

        public static ListInstanceInspectionsResponseBodyDataConfigItems build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionsResponseBodyDataConfigItems self = new ListInstanceInspectionsResponseBodyDataConfigItems();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionsResponseBodyDataConfigItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public ListInstanceInspectionsResponseBodyDataConfigItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class ListInstanceInspectionsResponseBodyDataConfigResourceScope extends TeaModel {
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

        public static ListInstanceInspectionsResponseBodyDataConfigResourceScope build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionsResponseBodyDataConfigResourceScope self = new ListInstanceInspectionsResponseBodyDataConfigResourceScope();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionsResponseBodyDataConfigResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public ListInstanceInspectionsResponseBodyDataConfigResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListInstanceInspectionsResponseBodyDataConfigResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class ListInstanceInspectionsResponseBodyDataConfigSchedule extends TeaModel {
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

        public static ListInstanceInspectionsResponseBodyDataConfigSchedule build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionsResponseBodyDataConfigSchedule self = new ListInstanceInspectionsResponseBodyDataConfigSchedule();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionsResponseBodyDataConfigSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListInstanceInspectionsResponseBodyDataConfigSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ListInstanceInspectionsResponseBodyDataConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
         */
        @NameInMap("items")
        public java.util.List<ListInstanceInspectionsResponseBodyDataConfigItems> items;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
         */
        @NameInMap("resourceScope")
        public ListInstanceInspectionsResponseBodyDataConfigResourceScope resourceScope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
         */
        @NameInMap("schedule")
        public ListInstanceInspectionsResponseBodyDataConfigSchedule schedule;

        public static ListInstanceInspectionsResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionsResponseBodyDataConfig self = new ListInstanceInspectionsResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionsResponseBodyDataConfig setItems(java.util.List<ListInstanceInspectionsResponseBodyDataConfigItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListInstanceInspectionsResponseBodyDataConfigItems> getItems() {
            return this.items;
        }

        public ListInstanceInspectionsResponseBodyDataConfig setResourceScope(ListInstanceInspectionsResponseBodyDataConfigResourceScope resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public ListInstanceInspectionsResponseBodyDataConfigResourceScope getResourceScope() {
            return this.resourceScope;
        }

        public ListInstanceInspectionsResponseBodyDataConfig setSchedule(ListInstanceInspectionsResponseBodyDataConfigSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public ListInstanceInspectionsResponseBodyDataConfigSchedule getSchedule() {
            return this.schedule;
        }

    }

    public static class ListInstanceInspectionsResponseBodyDataItems extends TeaModel {
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

        public static ListInstanceInspectionsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionsResponseBodyDataItems self = new ListInstanceInspectionsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstanceInspectionsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceInspectionsResponseBodyDataItems setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public ListInstanceInspectionsResponseBodyDataItems setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public ListInstanceInspectionsResponseBodyDataItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class ListInstanceInspectionsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("config")
        public ListInstanceInspectionsResponseBodyDataConfig config;

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
        public java.util.List<ListInstanceInspectionsResponseBodyDataItems> items;

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

        public static ListInstanceInspectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionsResponseBodyData self = new ListInstanceInspectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionsResponseBodyData setConfig(ListInstanceInspectionsResponseBodyDataConfig config) {
            this.config = config;
            return this;
        }
        public ListInstanceInspectionsResponseBodyDataConfig getConfig() {
            return this.config;
        }

        public ListInstanceInspectionsResponseBodyData setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

        public ListInstanceInspectionsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceInspectionsResponseBodyData setItems(java.util.List<ListInstanceInspectionsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListInstanceInspectionsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListInstanceInspectionsResponseBodyData setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public ListInstanceInspectionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceInspectionsResponseBodyData setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

    }

}
