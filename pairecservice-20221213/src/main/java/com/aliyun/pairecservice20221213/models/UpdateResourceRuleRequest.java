// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateResourceRuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetricOperationType")
    public String metricOperationType;

    @NameInMap("MetricPullInfo")
    public String metricPullInfo;

    @NameInMap("MetricPullPeriod")
    public String metricPullPeriod;

    @NameInMap("Name")
    public String name;

    @NameInMap("RuleComputingDefinition")
    public String ruleComputingDefinition;

    public static UpdateResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRuleRequest self = new UpdateResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateResourceRuleRequest setMetricOperationType(String metricOperationType) {
        this.metricOperationType = metricOperationType;
        return this;
    }
    public String getMetricOperationType() {
        return this.metricOperationType;
    }

    public UpdateResourceRuleRequest setMetricPullInfo(String metricPullInfo) {
        this.metricPullInfo = metricPullInfo;
        return this;
    }
    public String getMetricPullInfo() {
        return this.metricPullInfo;
    }

    public UpdateResourceRuleRequest setMetricPullPeriod(String metricPullPeriod) {
        this.metricPullPeriod = metricPullPeriod;
        return this;
    }
    public String getMetricPullPeriod() {
        return this.metricPullPeriod;
    }

    public UpdateResourceRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateResourceRuleRequest setRuleComputingDefinition(String ruleComputingDefinition) {
        this.ruleComputingDefinition = ruleComputingDefinition;
        return this;
    }
    public String getRuleComputingDefinition() {
        return this.ruleComputingDefinition;
    }

}
