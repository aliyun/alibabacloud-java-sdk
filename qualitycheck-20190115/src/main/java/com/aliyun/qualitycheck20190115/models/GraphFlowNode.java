// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GraphFlowNode extends TeaModel {
    /**
     * <p>The operator information.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<ConditionBasicInfo> conditions;

    /**
     * <p>The content for frontend display.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The index.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>Start node</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The child nodes.</p>
     */
    @NameInMap("NextNodes")
    public java.util.List<GraphFlowNodeNextNodes> nextNodes;

    /**
     * <p>The node type.</p>
     * 
     * <strong>example:</strong>
     * <p>startNode</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The node properties.</p>
     */
    @NameInMap("Properties")
    public GraphFlowNodeProperties properties;

    /**
     * <p>The rule ID. If the rule is not saved to the database, the value is empty. If the rule is saved, the value equals the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <p>Specifies whether to use operator matching or legacy matching.</p>
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
         * <p>The quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>The flow branch priority. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The Lambda expression for the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>The conditional branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subsequent node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31533</p>
         */
        @NameInMap("NextNodeId")
        public Long nextNodeId;

        /**
         * <p>The monitored operators.</p>
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
         * <p>The auto review setting. Valid values:</p>
         * <ul>
         * <li>1: Disables automatic review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoReview")
        public Integer autoReview;

        /**
         * <p>Specifies whether branch judgment is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BranchJudge")
        public Boolean branchJudge;

        /**
         * <p>The maximum number of sentences to check.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckMoreSize")
        public Integer checkMoreSize;

        /**
         * <p>The quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>The common operator logic.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Lambda")
        public String lambda;

        /**
         * <p>The role when the type is single.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Specifies whether scoring is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        /**
         * <p>Indicates whether expression is enabled when the type is single.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("SayType")
        public String sayType;

        /**
         * <p>The score value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <p>The score number type. Valid values:</p>
         * <ul>
         * <li>0: Adds or deducts points after the rule is triggered.</li>
         * <li>1: Assigns a one-time score after the rule is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>The score rule hit type. Valid values:</p>
         * <ul>
         * <li>0: Scores when the node is hit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        /**
         * <p>The score type. Valid values:</p>
         * <ul>
         * <li>1: Adds points.</li>
         * <li>3: Deducts points.
         * Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>The monitored operators.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<String> triggers;

        /**
         * <p>The property type.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
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
