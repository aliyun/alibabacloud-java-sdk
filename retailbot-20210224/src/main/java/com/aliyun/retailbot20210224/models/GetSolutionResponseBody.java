// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetSolutionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Solution")
    public GetSolutionResponseBodySolution solution;

    @NameInMap("Success")
    public Boolean success;

    public static GetSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSolutionResponseBody self = new GetSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSolutionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSolutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSolutionResponseBody setSolution(GetSolutionResponseBodySolution solution) {
        this.solution = solution;
        return this;
    }
    public GetSolutionResponseBodySolution getSolution() {
        return this.solution;
    }

    public GetSolutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSolutionResponseBodySolutionConditions extends TeaModel {
        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("ConditionValue")
        public String conditionValue;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionId")
        public Long solutionId;

        public static GetSolutionResponseBodySolutionConditions build(java.util.Map<String, ?> map) throws Exception {
            GetSolutionResponseBodySolutionConditions self = new GetSolutionResponseBodySolutionConditions();
            return TeaModel.build(map, self);
        }

        public GetSolutionResponseBodySolutionConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public GetSolutionResponseBodySolutionConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public GetSolutionResponseBodySolutionConditions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetSolutionResponseBodySolutionConditions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

    public static class GetSolutionResponseBodySolutionSolutionVariables extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionId")
        public Long solutionId;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        public static GetSolutionResponseBodySolutionSolutionVariables build(java.util.Map<String, ?> map) throws Exception {
            GetSolutionResponseBodySolutionSolutionVariables self = new GetSolutionResponseBodySolutionSolutionVariables();
            return TeaModel.build(map, self);
        }

        public GetSolutionResponseBodySolutionSolutionVariables setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetSolutionResponseBodySolutionSolutionVariables setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public GetSolutionResponseBodySolutionSolutionVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetSolutionResponseBodySolutionSolutionVariables setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

    public static class GetSolutionResponseBodySolution extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<GetSolutionResponseBodySolutionConditions> conditions;

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
        public java.util.List<GetSolutionResponseBodySolutionSolutionVariables> solutionVariables;

        public static GetSolutionResponseBodySolution build(java.util.Map<String, ?> map) throws Exception {
            GetSolutionResponseBodySolution self = new GetSolutionResponseBodySolution();
            return TeaModel.build(map, self);
        }

        public GetSolutionResponseBodySolution setConditions(java.util.List<GetSolutionResponseBodySolutionConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetSolutionResponseBodySolutionConditions> getConditions() {
            return this.conditions;
        }

        public GetSolutionResponseBodySolution setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public GetSolutionResponseBodySolution setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetSolutionResponseBodySolution setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public GetSolutionResponseBodySolution setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public GetSolutionResponseBodySolution setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public GetSolutionResponseBodySolution setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public GetSolutionResponseBodySolution setSolutionVariables(java.util.List<GetSolutionResponseBodySolutionSolutionVariables> solutionVariables) {
            this.solutionVariables = solutionVariables;
            return this;
        }
        public java.util.List<GetSolutionResponseBodySolutionSolutionVariables> getSolutionVariables() {
            return this.solutionVariables;
        }

    }

}
