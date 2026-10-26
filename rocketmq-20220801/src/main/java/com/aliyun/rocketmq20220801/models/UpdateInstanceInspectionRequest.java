// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceInspectionRequest extends TeaModel {
    /**
     * <p>同一实例配置生命周期内有效 24 小时；同 token 同请求返回首次成功结果，不同请求返回冲突。新请求仍须携带当前 revision。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>update-inspection-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
     */
    @NameInMap("items")
    public java.util.List<UpdateInstanceInspectionRequestItems> items;

    /**
     * <strong>example:</strong>
     * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
     */
    @NameInMap("resourceScope")
    public UpdateInstanceInspectionRequestResourceScope resourceScope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
     */
    @NameInMap("schedule")
    public UpdateInstanceInspectionRequestSchedule schedule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static UpdateInstanceInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInspectionRequest self = new UpdateInstanceInspectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInspectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceInspectionRequest setItems(java.util.List<UpdateInstanceInspectionRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<UpdateInstanceInspectionRequestItems> getItems() {
        return this.items;
    }

    public UpdateInstanceInspectionRequest setResourceScope(UpdateInstanceInspectionRequestResourceScope resourceScope) {
        this.resourceScope = resourceScope;
        return this;
    }
    public UpdateInstanceInspectionRequestResourceScope getResourceScope() {
        return this.resourceScope;
    }

    public UpdateInstanceInspectionRequest setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public UpdateInstanceInspectionRequest setSchedule(UpdateInstanceInspectionRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public UpdateInstanceInspectionRequestSchedule getSchedule() {
        return this.schedule;
    }

    public UpdateInstanceInspectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateInstanceInspectionRequestItems extends TeaModel {
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

        public static UpdateInstanceInspectionRequestItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionRequestItems self = new UpdateInstanceInspectionRequestItems();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionRequestItems setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public UpdateInstanceInspectionRequestItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateInstanceInspectionRequestResourceScope extends TeaModel {
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

        public static UpdateInstanceInspectionRequestResourceScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionRequestResourceScope self = new UpdateInstanceInspectionRequestResourceScope();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionRequestResourceScope setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public UpdateInstanceInspectionRequestResourceScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateInstanceInspectionRequestResourceScope setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

    public static class UpdateInstanceInspectionRequestSchedule extends TeaModel {
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

        public static UpdateInstanceInspectionRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceInspectionRequestSchedule self = new UpdateInstanceInspectionRequestSchedule();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceInspectionRequestSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateInstanceInspectionRequestSchedule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
