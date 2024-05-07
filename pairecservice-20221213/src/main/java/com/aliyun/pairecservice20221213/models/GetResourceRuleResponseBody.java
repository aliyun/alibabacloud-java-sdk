// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetResourceRuleResponseBody extends TeaModel {
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
    public java.util.List<GetResourceRuleResponseBodyRuleItems> ruleItems;

    public static GetResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRuleResponseBody self = new GetResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceRuleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetResourceRuleResponseBody setMetricOperationType(String metricOperationType) {
        this.metricOperationType = metricOperationType;
        return this;
    }
    public String getMetricOperationType() {
        return this.metricOperationType;
    }

    public GetResourceRuleResponseBody setMetricPullInfo(String metricPullInfo) {
        this.metricPullInfo = metricPullInfo;
        return this;
    }
    public String getMetricPullInfo() {
        return this.metricPullInfo;
    }

    public GetResourceRuleResponseBody setMetricPullPeriod(String metricPullPeriod) {
        this.metricPullPeriod = metricPullPeriod;
        return this;
    }
    public String getMetricPullPeriod() {
        return this.metricPullPeriod;
    }

    public GetResourceRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceRuleResponseBody setResourceRuleId(String resourceRuleId) {
        this.resourceRuleId = resourceRuleId;
        return this;
    }
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    public GetResourceRuleResponseBody setRuleComputingDefinition(String ruleComputingDefinition) {
        this.ruleComputingDefinition = ruleComputingDefinition;
        return this;
    }
    public String getRuleComputingDefinition() {
        return this.ruleComputingDefinition;
    }

    public GetResourceRuleResponseBody setRuleItems(java.util.List<GetResourceRuleResponseBodyRuleItems> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<GetResourceRuleResponseBodyRuleItems> getRuleItems() {
        return this.ruleItems;
    }

    public static class GetResourceRuleResponseBodyRuleItems extends TeaModel {
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

        public static GetResourceRuleResponseBodyRuleItems build(java.util.Map<String, ?> map) throws Exception {
            GetResourceRuleResponseBodyRuleItems self = new GetResourceRuleResponseBodyRuleItems();
            return TeaModel.build(map, self);
        }

        public GetResourceRuleResponseBodyRuleItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceRuleResponseBodyRuleItems setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public GetResourceRuleResponseBodyRuleItems setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public GetResourceRuleResponseBodyRuleItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceRuleResponseBodyRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
