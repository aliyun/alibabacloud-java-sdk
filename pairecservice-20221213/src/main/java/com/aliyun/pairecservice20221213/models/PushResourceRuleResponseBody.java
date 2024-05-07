// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushResourceRuleResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("MetricOperationType")
    public String metricOperationType;

    @NameInMap("MetricPullInfo")
    public String metricPullInfo;

    @NameInMap("MetricPullPeriod")
    public String metricPullPeriod;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRuleId")
    public String resourceRuleId;

    @NameInMap("RuleComputingDefinition")
    public String ruleComputingDefinition;

    @NameInMap("RuleItems")
    public java.util.List<PushResourceRuleResponseBodyRuleItems> ruleItems;

    public static PushResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushResourceRuleResponseBody self = new PushResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PushResourceRuleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PushResourceRuleResponseBody setMetricOperationType(String metricOperationType) {
        this.metricOperationType = metricOperationType;
        return this;
    }
    public String getMetricOperationType() {
        return this.metricOperationType;
    }

    public PushResourceRuleResponseBody setMetricPullInfo(String metricPullInfo) {
        this.metricPullInfo = metricPullInfo;
        return this;
    }
    public String getMetricPullInfo() {
        return this.metricPullInfo;
    }

    public PushResourceRuleResponseBody setMetricPullPeriod(String metricPullPeriod) {
        this.metricPullPeriod = metricPullPeriod;
        return this;
    }
    public String getMetricPullPeriod() {
        return this.metricPullPeriod;
    }

    public PushResourceRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushResourceRuleResponseBody setResourceRuleId(String resourceRuleId) {
        this.resourceRuleId = resourceRuleId;
        return this;
    }
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    public PushResourceRuleResponseBody setRuleComputingDefinition(String ruleComputingDefinition) {
        this.ruleComputingDefinition = ruleComputingDefinition;
        return this;
    }
    public String getRuleComputingDefinition() {
        return this.ruleComputingDefinition;
    }

    public PushResourceRuleResponseBody setRuleItems(java.util.List<PushResourceRuleResponseBodyRuleItems> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<PushResourceRuleResponseBodyRuleItems> getRuleItems() {
        return this.ruleItems;
    }

    public static class PushResourceRuleResponseBodyRuleItems extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("MaxValue")
        public String maxValue;

        @NameInMap("MinValue")
        public String minValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static PushResourceRuleResponseBodyRuleItems build(java.util.Map<String, ?> map) throws Exception {
            PushResourceRuleResponseBodyRuleItems self = new PushResourceRuleResponseBodyRuleItems();
            return TeaModel.build(map, self);
        }

        public PushResourceRuleResponseBodyRuleItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PushResourceRuleResponseBodyRuleItems setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public PushResourceRuleResponseBodyRuleItems setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public PushResourceRuleResponseBodyRuleItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PushResourceRuleResponseBodyRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
