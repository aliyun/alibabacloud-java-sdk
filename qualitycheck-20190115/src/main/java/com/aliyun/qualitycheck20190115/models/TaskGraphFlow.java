// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TaskGraphFlow extends TeaModel {
    /**
     * <p>Flow scoring logic settings</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowRuleScoreType")
    public Integer flowRuleScoreType;

    /**
     * <p>Canvas ID of the flow</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>All nodes in the flow</p>
     */
    @NameInMap("Nodes")
    public java.util.List<GraphFlowNode> nodes;

    /**
     * <p>Rule ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <p>Rule Name</p>
     * 
     * <strong>example:</strong>
     * <p>违规</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Used for frontend display</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ShowProperties")
    public String showProperties;

    /**
     * <p>Skip if the first session node is not hit</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
