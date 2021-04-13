// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageKnowledgesResponseBody extends TeaModel {
    // 知识集合
    @NameInMap("Knowledges")
    public java.util.List<ListPackageKnowledgesResponseBodyKnowledges> knowledges;

    @NameInMap("RequestId")
    public String requestId;

    // 是否成功标示
    @NameInMap("Success")
    public Boolean success;

    // 返回code
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Message")
    public String message;

    public static ListPackageKnowledgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageKnowledgesResponseBody self = new ListPackageKnowledgesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageKnowledgesResponseBody setKnowledges(java.util.List<ListPackageKnowledgesResponseBodyKnowledges> knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public java.util.List<ListPackageKnowledgesResponseBodyKnowledges> getKnowledges() {
        return this.knowledges;
    }

    public ListPackageKnowledgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPackageKnowledgesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPackageKnowledgesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPackageKnowledgesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions extends TeaModel {
        // 问法id
        @NameInMap("SimilarQuestionId")
        public Long similarQuestionId;

        // 示例问法标题
        @NameInMap("SimilarQuestionTitle")
        public String similarQuestionTitle;

        // "similar":相似问法，"sample":例句，"keyword":关键字
        @NameInMap("SimilarQuestionType")
        public String similarQuestionType;

        // "positive":正向，"negative":负向
        @NameInMap("SimilarQuestionEffectType")
        public String similarQuestionEffectType;

        // 创建时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 创建用户id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改用户id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        public static ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions self = new ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionId(Long similarQuestionId) {
            this.similarQuestionId = similarQuestionId;
            return this;
        }
        public Long getSimilarQuestionId() {
            return this.similarQuestionId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionTitle(String similarQuestionTitle) {
            this.similarQuestionTitle = similarQuestionTitle;
            return this;
        }
        public String getSimilarQuestionTitle() {
            return this.similarQuestionTitle;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionType(String similarQuestionType) {
            this.similarQuestionType = similarQuestionType;
            return this;
        }
        public String getSimilarQuestionType() {
            return this.similarQuestionType;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

    }

    public static class ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions extends TeaModel {
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 约束类型
        @NameInMap("ConditionType")
        public String conditionType;

        // 约束值
        @NameInMap("ConditionValue")
        public String conditionValue;

        public static ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions self = new ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

    }

    public static class ListPackageKnowledgesResponseBodyKnowledgesSolutions extends TeaModel {
        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案类型
        @NameInMap("SolutionType")
        public String solutionType;

        // 答案来源
        @NameInMap("SolutionSource")
        public String solutionSource;

        // 答案文本
        @NameInMap("SolutionContent")
        public String solutionContent;

        // 答案扩展文本
        @NameInMap("ExtraContent")
        public String extraContent;

        // 约束
        @NameInMap("Conditions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions;

        public static ListPackageKnowledgesResponseBodyKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSolutions self = new ListPackageKnowledgesResponseBodyKnowledgesSolutions();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setConditions(java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> getConditions() {
            return this.conditions;
        }

    }

    public static class ListPackageKnowledgesResponseBodyKnowledges extends TeaModel {
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 知识标题
        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        // "online":在用，"disabled":禁用
        @NameInMap("KnowledgeStatus")
        public String knowledgeStatus;

        // 场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 知识描述
        @NameInMap("KnowledgeDescription")
        public String knowledgeDescription;

        // 创建时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 创建用户id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改用户id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        // 示例问法、正负例句、正负关键字
        @NameInMap("SimilarQuestions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions;

        // 答案
        @NameInMap("Solutions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutions> solutions;

        public static ListPackageKnowledgesResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledges self = new ListPackageKnowledgesResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeDescription(String knowledgeDescription) {
            this.knowledgeDescription = knowledgeDescription;
            return this;
        }
        public String getKnowledgeDescription() {
            return this.knowledgeDescription;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setSimilarQuestions(java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions) {
            this.similarQuestions = similarQuestions;
            return this;
        }
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> getSimilarQuestions() {
            return this.similarQuestions;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setSolutions(java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutions> getSolutions() {
            return this.solutions;
        }

    }

}
