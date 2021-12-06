// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSolutionRequest extends TeaModel {
    // 知识id
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    // 操作人id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作人名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 答案
    @NameInMap("Solution")
    public AddSolutionRequestSolution solution;

    public static AddSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSolutionRequest self = new AddSolutionRequest();
        return TeaModel.build(map, self);
    }

    public AddSolutionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public AddSolutionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AddSolutionRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public AddSolutionRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddSolutionRequest setSolution(AddSolutionRequestSolution solution) {
        this.solution = solution;
        return this;
    }
    public AddSolutionRequestSolution getSolution() {
        return this.solution;
    }

    public static class AddSolutionRequestSolutionConditions extends TeaModel {
        // 生效模式：EffectiveMode  分支：BranchId
        @NameInMap("ConditionType")
        public String conditionType;

        // 生效模式："disable":全部不生效，"auto":全自动，"assistant":智能辅助，"enable":全部生效  分支：分支id
        @NameInMap("ConditionValue")
        public String conditionValue;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        public static AddSolutionRequestSolutionConditions build(java.util.Map<String, ?> map) throws Exception {
            AddSolutionRequestSolutionConditions self = new AddSolutionRequestSolutionConditions();
            return TeaModel.build(map, self);
        }

        public AddSolutionRequestSolutionConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public AddSolutionRequestSolutionConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public AddSolutionRequestSolutionConditions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

    }

    public static class AddSolutionRequestSolutionSolutionVariables extends TeaModel {
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 变量名称
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
        @NameInMap("VariableType")
        public String variableType;

        public static AddSolutionRequestSolutionSolutionVariables build(java.util.Map<String, ?> map) throws Exception {
            AddSolutionRequestSolutionSolutionVariables self = new AddSolutionRequestSolutionSolutionVariables();
            return TeaModel.build(map, self);
        }

        public AddSolutionRequestSolutionSolutionVariables setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public AddSolutionRequestSolutionSolutionVariables setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public AddSolutionRequestSolutionSolutionVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public AddSolutionRequestSolutionSolutionVariables setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

    public static class AddSolutionRequestSolution extends TeaModel {
        // 答案约束
        @NameInMap("Conditions")
        public java.util.List<AddSolutionRequestSolutionConditions> conditions;

        // 答案扩展信息
        @NameInMap("ExtraContent")
        public String extraContent;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案正文
        @NameInMap("SolutionContent")
        public String solutionContent;

        // 答案来源,乐言不需要填
        @NameInMap("SolutionSource")
        public String solutionSource;

        // 答案类型, "text":文本知识
        @NameInMap("SolutionType")
        public String solutionType;

        // 答案变量
        @NameInMap("SolutionVariables")
        public java.util.List<AddSolutionRequestSolutionSolutionVariables> solutionVariables;

        public static AddSolutionRequestSolution build(java.util.Map<String, ?> map) throws Exception {
            AddSolutionRequestSolution self = new AddSolutionRequestSolution();
            return TeaModel.build(map, self);
        }

        public AddSolutionRequestSolution setConditions(java.util.List<AddSolutionRequestSolutionConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<AddSolutionRequestSolutionConditions> getConditions() {
            return this.conditions;
        }

        public AddSolutionRequestSolution setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public AddSolutionRequestSolution setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public AddSolutionRequestSolution setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public AddSolutionRequestSolution setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public AddSolutionRequestSolution setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public AddSolutionRequestSolution setSolutionVariables(java.util.List<AddSolutionRequestSolutionSolutionVariables> solutionVariables) {
            this.solutionVariables = solutionVariables;
            return this;
        }
        public java.util.List<AddSolutionRequestSolutionSolutionVariables> getSolutionVariables() {
            return this.solutionVariables;
        }

    }

}
