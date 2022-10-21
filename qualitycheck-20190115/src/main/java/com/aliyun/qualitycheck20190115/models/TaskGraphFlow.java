// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TaskGraphFlow extends TeaModel {
    @NameInMap("FlowRuleScoreType")
    public Integer flowRuleScoreType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Nodes")
    public java.util.List<GraphFlowNode> nodes;

    @NameInMap("Rid")
    public Long rid;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("ShowProperties")
    public String showProperties;

    @NameInMap("SkipWhenFirstSessionNodeMiss")
    public Boolean skipWhenFirstSessionNodeMiss;

    public static TaskGraphFlow build(java.util.Map<String, ?> map) throws Exception {
        TaskGraphFlow self = new TaskGraphFlow();
        return TeaModel.build(map, self);
    }

    public TaskGraphFlow setFlowRuleScoreType(Integer flowRuleScoreType) {
        this.flowRuleScoreType = flowRuleScoreType;
        return this;
    }
    public Integer getFlowRuleScoreType() {
        return this.flowRuleScoreType;
    }

    public TaskGraphFlow setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TaskGraphFlow setNodes(java.util.List<GraphFlowNode> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<GraphFlowNode> getNodes() {
        return this.nodes;
    }

    public TaskGraphFlow setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    public Long getRid() {
        return this.rid;
    }

    public TaskGraphFlow setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public TaskGraphFlow setShowProperties(String showProperties) {
        this.showProperties = showProperties;
        return this;
    }
    public String getShowProperties() {
        return this.showProperties;
    }

    public TaskGraphFlow setSkipWhenFirstSessionNodeMiss(Boolean skipWhenFirstSessionNodeMiss) {
        this.skipWhenFirstSessionNodeMiss = skipWhenFirstSessionNodeMiss;
        return this;
    }
    public Boolean getSkipWhenFirstSessionNodeMiss() {
        return this.skipWhenFirstSessionNodeMiss;
    }

}
