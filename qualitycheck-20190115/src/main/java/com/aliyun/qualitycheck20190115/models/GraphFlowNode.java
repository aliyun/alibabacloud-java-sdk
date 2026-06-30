// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GraphFlowNode extends TeaModel {
    /**
     * <p>Operator information.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<ConditionBasicInfo> conditions;

    /**
     * <p>Used for frontend display.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Index</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>Node name</p>
     * 
     * <strong>example:</strong>
     * <p>开始节点</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Child nodes</p>
     */
    @NameInMap("NextNodes")
    public java.util.List<GraphFlowNodeNextNodes> nextNodes;

    /**
     * <p>Node Type</p>
     * 
     * <strong>example:</strong>
     * <p>startNode</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>Node properties</p>
     */
    @NameInMap("Properties")
    public GraphFlowNodeProperties properties;

    /**
     * <p>Rule ID. \<code>rid\\</code> is empty if the rule is not persisted. If the rule is persisted, \<code>rid\\</code> equals \<code>ID\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <p>Whether to use operator matching or legacy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseConditions")
    public Boolean useConditions;

    public static GraphFlowNode build(java.util.Map<String, ?> map) throws Exception {
        GraphFlowNode self = new GraphFlowNode();
        return TeaModel.build(map, self);
    }

    public GraphFlowNode setConditions(java.util.List<ConditionBasicInfo> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<ConditionBasicInfo> getConditions() {
        return this.conditions;
    }

    public GraphFlowNode setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GraphFlowNode setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GraphFlowNode setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public GraphFlowNode setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GraphFlowNode setNextNodes(java.util.List<GraphFlowNodeNextNodes> nextNodes) {
        this.nextNodes = nextNodes;
        return this;
    }
    public java.util.List<GraphFlowNodeNextNodes> getNextNodes() {
        return this.nextNodes;
    }

    public GraphFlowNode setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GraphFlowNode setProperties(GraphFlowNodeProperties properties) {
        this.properties = properties;
        return this;
    }
    public GraphFlowNodeProperties getProperties() {
        return this.properties;
    }

    public GraphFlowNode setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    public Long getRid() {
        return this.rid;
    }

    public GraphFlowNode setUseConditions(Boolean useConditions) {
        this.useConditions = useConditions;
        return this;
    }
    public Boolean getUseConditions() {
        return this.useConditions;
    }

    public static class GraphFlowNodeNextNodes extends TeaModel {
        /**
         * <p>Quality check dimension</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>Flow branch priority. A smaller value indicates higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>Lambda expression for the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>Conditional branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Next node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31533</p>
         */
        @NameInMap("NextNodeId")
        public Long nextNodeId;

        /**
         * <p>Operators to follow.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<String> triggers;

        public static GraphFlowNodeNextNodes build(java.util.Map<String, ?> map) throws Exception {
            GraphFlowNodeNextNodes self = new GraphFlowNodeNextNodes();
            return TeaModel.build(map, self);
        }

        public GraphFlowNodeNextNodes setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GraphFlowNodeNextNodes setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GraphFlowNodeNextNodes setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public GraphFlowNodeNextNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GraphFlowNodeNextNodes setNextNodeId(Long nextNodeId) {
            this.nextNodeId = nextNodeId;
            return this;
        }
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        public GraphFlowNodeNextNodes setTriggers(java.util.List<String> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<String> getTriggers() {
            return this.triggers;
        }

    }

    public static class GraphFlowNodeProperties extends TeaModel {
        /**
         * <p>1: Do not auto-review.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoReview")
        public Integer autoReview;

        /**
         * <p>Enable branch judgment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BranchJudge")
        public Boolean branchJudge;

        /**
         * <p>Maximum N sentences to check.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckMoreSize")
        public Integer checkMoreSize;

        /**
         * <p>Quality check dimension</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>General operator logic.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>Role when the type is \<code>single\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>客户</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Is scored.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        /**
         * <p>Indicates expression when the type is \<code>single\\</code>.</p>
         */
        @NameInMap("SayType")
        public String sayType;

        /**
         * <p>Score value</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <p>0: Add or deduct points after the rule is triggered; 1: Score once after the rule is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>0: Score when the node is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        /**
         * <p>1: Add points; 3: Deduct points; default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>Operators to follow.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<String> triggers;

        /**
         * <p>Property type</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Type")
        public String type;

        public static GraphFlowNodeProperties build(java.util.Map<String, ?> map) throws Exception {
            GraphFlowNodeProperties self = new GraphFlowNodeProperties();
            return TeaModel.build(map, self);
        }

        public GraphFlowNodeProperties setAutoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }
        public Integer getAutoReview() {
            return this.autoReview;
        }

        public GraphFlowNodeProperties setBranchJudge(Boolean branchJudge) {
            this.branchJudge = branchJudge;
            return this;
        }
        public Boolean getBranchJudge() {
            return this.branchJudge;
        }

        public GraphFlowNodeProperties setCheckMoreSize(Integer checkMoreSize) {
            this.checkMoreSize = checkMoreSize;
            return this;
        }
        public Integer getCheckMoreSize() {
            return this.checkMoreSize;
        }

        public GraphFlowNodeProperties setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GraphFlowNodeProperties setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public GraphFlowNodeProperties setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GraphFlowNodeProperties setRuleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        public GraphFlowNodeProperties setSayType(String sayType) {
            this.sayType = sayType;
            return this;
        }
        public String getSayType() {
            return this.sayType;
        }

        public GraphFlowNodeProperties setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public GraphFlowNodeProperties setScoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        public GraphFlowNodeProperties setScoreRuleHitType(Integer scoreRuleHitType) {
            this.scoreRuleHitType = scoreRuleHitType;
            return this;
        }
        public Integer getScoreRuleHitType() {
            return this.scoreRuleHitType;
        }

        public GraphFlowNodeProperties setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public GraphFlowNodeProperties setTriggers(java.util.List<String> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<String> getTriggers() {
            return this.triggers;
        }

        public GraphFlowNodeProperties setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
