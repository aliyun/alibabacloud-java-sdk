// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetSolutionResponseBody extends TeaModel {
    // 返回code
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 答案
    @NameInMap("Solution")
    public GetSolutionResponseBodySolution solution;

    // 是否成功标示
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
        // 生效模式：EffectiveMode
        @NameInMap("ConditionType")
        public String conditionType;

        // 生效模式："disable":全部不生效，"auto":全自动，"assistant":智能辅助，"enable":全部生效
        @NameInMap("ConditionValue")
        public String conditionValue;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案id
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
        // 答案约束
        @NameInMap("Conditions")
        public java.util.List<GetSolutionResponseBodySolutionConditions> conditions;

        // 答案扩展信息
        @NameInMap("ExtraContent")
        public String extraContent;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案正文
        @NameInMap("SolutionContent")
        public String solutionContent;

        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 答案来源
        @NameInMap("SolutionSource")
        public String solutionSource;

        // 答案类型,"text":文本答案
        @NameInMap("SolutionType")
        public String solutionType;

        // 答案变量
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
