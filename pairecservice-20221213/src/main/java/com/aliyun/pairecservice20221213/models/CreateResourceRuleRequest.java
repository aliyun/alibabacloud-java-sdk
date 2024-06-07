// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateResourceRuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricOperationType")
    public String metricOperationType;

    @NameInMap("MetricPullInfo")
    public String metricPullInfo;

    @NameInMap("MetricPullPeriod")
    public String metricPullPeriod;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleComputingDefinition")
    public String ruleComputingDefinition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleItems")
    public java.util.List<CreateResourceRuleRequestRuleItems> ruleItems;

    public static CreateResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRuleRequest self = new CreateResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateResourceRuleRequest setMetricOperationType(String metricOperationType) {
        this.metricOperationType = metricOperationType;
        return this;
    }
    public String getMetricOperationType() {
        return this.metricOperationType;
    }

    public CreateResourceRuleRequest setMetricPullInfo(String metricPullInfo) {
        this.metricPullInfo = metricPullInfo;
        return this;
    }
    public String getMetricPullInfo() {
        return this.metricPullInfo;
    }

    public CreateResourceRuleRequest setMetricPullPeriod(String metricPullPeriod) {
        this.metricPullPeriod = metricPullPeriod;
        return this;
    }
    public String getMetricPullPeriod() {
        return this.metricPullPeriod;
    }

    public CreateResourceRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceRuleRequest setRuleComputingDefinition(String ruleComputingDefinition) {
        this.ruleComputingDefinition = ruleComputingDefinition;
        return this;
    }
    public String getRuleComputingDefinition() {
        return this.ruleComputingDefinition;
    }

    public CreateResourceRuleRequest setRuleItems(java.util.List<CreateResourceRuleRequestRuleItems> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<CreateResourceRuleRequestRuleItems> getRuleItems() {
        return this.ruleItems;
    }

    public static class CreateResourceRuleRequestRuleItems extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MaxValue")
        public Double maxValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MinValue")
        public Double minValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Value")
        public Double value;

        public static CreateResourceRuleRequestRuleItems build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRuleRequestRuleItems self = new CreateResourceRuleRequestRuleItems();
            return TeaModel.build(map, self);
        }

        public CreateResourceRuleRequestRuleItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateResourceRuleRequestRuleItems setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public CreateResourceRuleRequestRuleItems setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

        public CreateResourceRuleRequestRuleItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateResourceRuleRequestRuleItems setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
