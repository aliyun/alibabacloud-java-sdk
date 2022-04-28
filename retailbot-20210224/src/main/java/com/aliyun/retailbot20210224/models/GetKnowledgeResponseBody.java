// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetKnowledgeResponseBody extends TeaModel {
    // 返回code
    @NameInMap("Code")
    public String code;

    // 知识
    @NameInMap("Knowledge")
    public GetKnowledgeResponseBodyKnowledge knowledge;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功标示
    @NameInMap("Success")
    public Boolean success;

    public static GetKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeResponseBody self = new GetKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeResponseBody setKnowledge(GetKnowledgeResponseBodyKnowledge knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public GetKnowledgeResponseBodyKnowledge getKnowledge() {
        return this.knowledge;
    }

    public GetKnowledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeResponseBodyKnowledgeCategory extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        public static GetKnowledgeResponseBodyKnowledgeCategory build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledgeCategory self = new GetKnowledgeResponseBodyKnowledgeCategory();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledgeCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetKnowledgeResponseBodyKnowledgeCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetKnowledgeResponseBodyKnowledgeCategory setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class GetKnowledgeResponseBodyKnowledgePackages extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageName")
        public String packageName;

        public static GetKnowledgeResponseBodyKnowledgePackages build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledgePackages self = new GetKnowledgeResponseBodyKnowledgePackages();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledgePackages setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public GetKnowledgeResponseBodyKnowledgePackages setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

    public static class GetKnowledgeResponseBodyKnowledgeSimilarQuestions extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 创建用户id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 修改用户id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        // 问法影响类型
        @NameInMap("SimilarQuestionEffectType")
        public String similarQuestionEffectType;

        // 问法id
        @NameInMap("SimilarQuestionId")
        public Long similarQuestionId;

        // 示例问法标题
        @NameInMap("SimilarQuestionTitle")
        public String similarQuestionTitle;

        // 问法类型
        @NameInMap("SimilarQuestionType")
        public String similarQuestionType;

        public static GetKnowledgeResponseBodyKnowledgeSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledgeSimilarQuestions self = new GetKnowledgeResponseBodyKnowledgeSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setSimilarQuestionId(Long similarQuestionId) {
            this.similarQuestionId = similarQuestionId;
            return this;
        }
        public Long getSimilarQuestionId() {
            return this.similarQuestionId;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setSimilarQuestionTitle(String similarQuestionTitle) {
            this.similarQuestionTitle = similarQuestionTitle;
            return this;
        }
        public String getSimilarQuestionTitle() {
            return this.similarQuestionTitle;
        }

        public GetKnowledgeResponseBodyKnowledgeSimilarQuestions setSimilarQuestionType(String similarQuestionType) {
            this.similarQuestionType = similarQuestionType;
            return this;
        }
        public String getSimilarQuestionType() {
            return this.similarQuestionType;
        }

    }

    public static class GetKnowledgeResponseBodyKnowledgeSolutionsConditions extends TeaModel {
        // 生效模式
        @NameInMap("ConditionType")
        public String conditionType;

        // 生效模式值
        @NameInMap("ConditionValue")
        public String conditionValue;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        public static GetKnowledgeResponseBodyKnowledgeSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledgeSolutionsConditions self = new GetKnowledgeResponseBodyKnowledgeSolutionsConditions();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsConditions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsConditions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

    public static class GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables extends TeaModel {
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

        public static GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables self = new GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

    public static class GetKnowledgeResponseBodyKnowledgeSolutions extends TeaModel {
        // 答案约束集合
        @NameInMap("Conditions")
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSolutionsConditions> conditions;

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

        // 答案类型,
        @NameInMap("SolutionType")
        public String solutionType;

        // 变量集合
        @NameInMap("SolutionVariables")
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables> solutionVariables;

        public static GetKnowledgeResponseBodyKnowledgeSolutions build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledgeSolutions self = new GetKnowledgeResponseBodyKnowledgeSolutions();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setConditions(java.util.List<GetKnowledgeResponseBodyKnowledgeSolutionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSolutionsConditions> getConditions() {
            return this.conditions;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public GetKnowledgeResponseBodyKnowledgeSolutions setSolutionVariables(java.util.List<GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables> solutionVariables) {
            this.solutionVariables = solutionVariables;
            return this;
        }
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSolutionsSolutionVariables> getSolutionVariables() {
            return this.solutionVariables;
        }

    }

    public static class GetKnowledgeResponseBodyKnowledge extends TeaModel {
        @NameInMap("Category")
        public GetKnowledgeResponseBodyKnowledgeCategory category;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 创建用户id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 场景描述
        @NameInMap("KnowledgeDescription")
        public String knowledgeDescription;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 知识状态
        @NameInMap("KnowledgeStatus")
        public String knowledgeStatus;

        // 知识标题
        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 修改用户id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("Packages")
        public java.util.List<GetKnowledgeResponseBodyKnowledgePackages> packages;

        // 场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 示例问法集合
        @NameInMap("SimilarQuestions")
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSimilarQuestions> similarQuestions;

        // 答案集合
        @NameInMap("Solutions")
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSolutions> solutions;

        public static GetKnowledgeResponseBodyKnowledge build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeResponseBodyKnowledge self = new GetKnowledgeResponseBodyKnowledge();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeResponseBodyKnowledge setCategory(GetKnowledgeResponseBodyKnowledgeCategory category) {
            this.category = category;
            return this;
        }
        public GetKnowledgeResponseBodyKnowledgeCategory getCategory() {
            return this.category;
        }

        public GetKnowledgeResponseBodyKnowledge setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetKnowledgeResponseBodyKnowledge setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public GetKnowledgeResponseBodyKnowledge setKnowledgeDescription(String knowledgeDescription) {
            this.knowledgeDescription = knowledgeDescription;
            return this;
        }
        public String getKnowledgeDescription() {
            return this.knowledgeDescription;
        }

        public GetKnowledgeResponseBodyKnowledge setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetKnowledgeResponseBodyKnowledge setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public GetKnowledgeResponseBodyKnowledge setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public GetKnowledgeResponseBodyKnowledge setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetKnowledgeResponseBodyKnowledge setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public GetKnowledgeResponseBodyKnowledge setPackages(java.util.List<GetKnowledgeResponseBodyKnowledgePackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<GetKnowledgeResponseBodyKnowledgePackages> getPackages() {
            return this.packages;
        }

        public GetKnowledgeResponseBodyKnowledge setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public GetKnowledgeResponseBodyKnowledge setSimilarQuestions(java.util.List<GetKnowledgeResponseBodyKnowledgeSimilarQuestions> similarQuestions) {
            this.similarQuestions = similarQuestions;
            return this;
        }
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSimilarQuestions> getSimilarQuestions() {
            return this.similarQuestions;
        }

        public GetKnowledgeResponseBodyKnowledge setSolutions(java.util.List<GetKnowledgeResponseBodyKnowledgeSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<GetKnowledgeResponseBodyKnowledgeSolutions> getSolutions() {
            return this.solutions;
        }

    }

}
