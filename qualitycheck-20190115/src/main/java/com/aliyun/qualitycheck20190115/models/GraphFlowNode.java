// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GraphFlowNode extends TeaModel {
    @NameInMap("Conditions")
    public java.util.List<ConditionBasicInfo> conditions;

    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Index")
    public Integer index;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextNodes")
    public java.util.List<GraphFlowNodeNextNodes> nextNodes;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("Properties")
    public GraphFlowNodeProperties properties;

    @NameInMap("Rid")
    public Long rid;

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
        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Name")
        public String name;

        @NameInMap("NextNodeId")
        public Long nextNodeId;

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
        @NameInMap("AutoReview")
        public Integer autoReview;

        @NameInMap("BranchJudge")
        public Boolean branchJudge;

        @NameInMap("CheckMoreSize")
        public Integer checkMoreSize;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Role")
        public String role;

        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        @NameInMap("SayType")
        public String sayType;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        @NameInMap("ScoreType")
        public Integer scoreType;

        @NameInMap("Triggers")
        public java.util.List<String> triggers;

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
