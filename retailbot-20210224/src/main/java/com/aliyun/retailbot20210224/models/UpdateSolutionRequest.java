// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateSolutionRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Solution")
    public UpdateSolutionRequestSolution solution;

    public static UpdateSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionRequest self = new UpdateSolutionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateSolutionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateSolutionRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public UpdateSolutionRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateSolutionRequest setSolution(UpdateSolutionRequestSolution solution) {
        this.solution = solution;
        return this;
    }
    public UpdateSolutionRequestSolution getSolution() {
        return this.solution;
    }

    public static class UpdateSolutionRequestSolutionConditions extends TeaModel {
        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("ConditionValue")
        public String conditionValue;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionId")
        public Long solutionId;

        public static UpdateSolutionRequestSolutionConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateSolutionRequestSolutionConditions self = new UpdateSolutionRequestSolutionConditions();
            return TeaModel.build(map, self);
        }

        public UpdateSolutionRequestSolutionConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public UpdateSolutionRequestSolutionConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public UpdateSolutionRequestSolutionConditions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public UpdateSolutionRequestSolutionConditions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

    public static class UpdateSolutionRequestSolutionSolutionVariables extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionId")
        public Long solutionId;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        public static UpdateSolutionRequestSolutionSolutionVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateSolutionRequestSolutionSolutionVariables self = new UpdateSolutionRequestSolutionSolutionVariables();
            return TeaModel.build(map, self);
        }

        public UpdateSolutionRequestSolutionSolutionVariables setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public UpdateSolutionRequestSolutionSolutionVariables setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public UpdateSolutionRequestSolutionSolutionVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public UpdateSolutionRequestSolutionSolutionVariables setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

    public static class UpdateSolutionRequestSolution extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<UpdateSolutionRequestSolutionConditions> conditions;

        @NameInMap("ExtraContent")
        public String extraContent;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionContent")
        public String solutionContent;

        @NameInMap("SolutionId")
        public Long solutionId;

        @NameInMap("SolutionSource")
        public String solutionSource;

        @NameInMap("SolutionType")
        public String solutionType;

        @NameInMap("SolutionVariables")
        public java.util.List<UpdateSolutionRequestSolutionSolutionVariables> solutionVariables;

        public static UpdateSolutionRequestSolution build(java.util.Map<String, ?> map) throws Exception {
            UpdateSolutionRequestSolution self = new UpdateSolutionRequestSolution();
            return TeaModel.build(map, self);
        }

        public UpdateSolutionRequestSolution setConditions(java.util.List<UpdateSolutionRequestSolutionConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<UpdateSolutionRequestSolutionConditions> getConditions() {
            return this.conditions;
        }

        public UpdateSolutionRequestSolution setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public UpdateSolutionRequestSolution setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public UpdateSolutionRequestSolution setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public UpdateSolutionRequestSolution setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public UpdateSolutionRequestSolution setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public UpdateSolutionRequestSolution setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public UpdateSolutionRequestSolution setSolutionVariables(java.util.List<UpdateSolutionRequestSolutionSolutionVariables> solutionVariables) {
            this.solutionVariables = solutionVariables;
            return this;
        }
        public java.util.List<UpdateSolutionRequestSolutionSolutionVariables> getSolutionVariables() {
            return this.solutionVariables;
        }

    }

}
