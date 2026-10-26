// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceInspectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inspection-request-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
     */
    @NameInMap("items")
    public java.util.List<CreateInstanceInspectionRequestItems> items;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
     */
    @NameInMap("resourceScope")
    public CreateInstanceInspectionRequestResourceScope resourceScope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
     */
    @NameInMap("schedule")
    public CreateInstanceInspectionRequestSchedule schedule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateInstanceInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInspectionRequest self = new CreateInstanceInspectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInspectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceInspectionRequest setItems(java.util.List<CreateInstanceInspectionRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CreateInstanceInspectionRequestItems> getItems() {
        return this.items;
    }

    public CreateInstanceInspectionRequest setResourceScope(CreateInstanceInspectionRequestResourceScope resourceScope) {
        this.resourceScope = resourceScope;
        return this;
    }
    public CreateInstanceInspectionRequestResourceScope getResourceScope() {
        return this.resourceScope;
    }

    public CreateInstanceInspectionRequest setSchedule(CreateInstanceInspectionRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public CreateInstanceInspectionRequestSchedule getSchedule() {
        return this.schedule;
    }

    public CreateInstanceInspectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateInstanceInspectionRequestItems extends TeaModel {
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

        public static CreateInstanceInspectionRequestItems build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionRequestItems self = new CreateInstanceInspectionRequestItems();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionRequestItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public CreateInstanceInspectionRequestItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateInstanceInspectionRequestResourceScope extends TeaModel {
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

        public static CreateInstanceInspectionRequestResourceScope build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionRequestResourceScope self = new CreateInstanceInspectionRequestResourceScope();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionRequestResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public CreateInstanceInspectionRequestResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateInstanceInspectionRequestResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class CreateInstanceInspectionRequestSchedule extends TeaModel {
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

        public static CreateInstanceInspectionRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceInspectionRequestSchedule self = new CreateInstanceInspectionRequestSchedule();
            return TeaModel.build(map, self);
        }

        public CreateInstanceInspectionRequestSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateInstanceInspectionRequestSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
