// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListResourceRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRules")
    public java.util.List<ListResourceRulesResponseBodyResourceRules> resourceRules;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListResourceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRulesResponseBody self = new ListResourceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceRulesResponseBody setResourceRules(java.util.List<ListResourceRulesResponseBodyResourceRules> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }
    public java.util.List<ListResourceRulesResponseBodyResourceRules> getResourceRules() {
        return this.resourceRules;
    }

    public ListResourceRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceRulesResponseBodyResourceRulesRuleItems extends TeaModel {
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

        public static ListResourceRulesResponseBodyResourceRulesRuleItems build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRulesResponseBodyResourceRulesRuleItems self = new ListResourceRulesResponseBodyResourceRulesRuleItems();
            return TeaModel.build(map, self);
        }

        public ListResourceRulesResponseBodyResourceRulesRuleItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceRulesResponseBodyResourceRulesRuleItems setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public ListResourceRulesResponseBodyResourceRulesRuleItems setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public ListResourceRulesResponseBodyResourceRulesRuleItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceRulesResponseBodyResourceRulesRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourceRulesResponseBodyResourceRules extends TeaModel {
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

        @NameInMap("ResourceRuleId")
        public String resourceRuleId;

        @NameInMap("RuleComputingDefinition")
        public String ruleComputingDefinition;

        @NameInMap("RuleItems")
        public java.util.List<ListResourceRulesResponseBodyResourceRulesRuleItems> ruleItems;

        public static ListResourceRulesResponseBodyResourceRules build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRulesResponseBodyResourceRules self = new ListResourceRulesResponseBodyResourceRules();
            return TeaModel.build(map, self);
        }

        public ListResourceRulesResponseBodyResourceRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceRulesResponseBodyResourceRules setMetricOperationType(String metricOperationType) {
            this.metricOperationType = metricOperationType;
            return this;
        }
        public String getMetricOperationType() {
            return this.metricOperationType;
        }

        public ListResourceRulesResponseBodyResourceRules setMetricPullInfo(String metricPullInfo) {
            this.metricPullInfo = metricPullInfo;
            return this;
        }
        public String getMetricPullInfo() {
            return this.metricPullInfo;
        }

        public ListResourceRulesResponseBodyResourceRules setMetricPullPeriod(String metricPullPeriod) {
            this.metricPullPeriod = metricPullPeriod;
            return this;
        }
        public String getMetricPullPeriod() {
            return this.metricPullPeriod;
        }

        public ListResourceRulesResponseBodyResourceRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceRulesResponseBodyResourceRules setResourceRuleId(String resourceRuleId) {
            this.resourceRuleId = resourceRuleId;
            return this;
        }
        public String getResourceRuleId() {
            return this.resourceRuleId;
        }

        public ListResourceRulesResponseBodyResourceRules setRuleComputingDefinition(String ruleComputingDefinition) {
            this.ruleComputingDefinition = ruleComputingDefinition;
            return this;
        }
        public String getRuleComputingDefinition() {
            return this.ruleComputingDefinition;
        }

        public ListResourceRulesResponseBodyResourceRules setRuleItems(java.util.List<ListResourceRulesResponseBodyResourceRulesRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<ListResourceRulesResponseBodyResourceRulesRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

}
