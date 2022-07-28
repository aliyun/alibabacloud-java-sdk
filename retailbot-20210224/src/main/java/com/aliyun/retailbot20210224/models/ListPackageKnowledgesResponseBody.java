// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageKnowledgesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Knowledges")
    public java.util.List<ListPackageKnowledgesResponseBodyKnowledges> knowledges;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPackageKnowledgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageKnowledgesResponseBody self = new ListPackageKnowledgesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageKnowledgesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPackageKnowledgesResponseBody setKnowledges(java.util.List<ListPackageKnowledgesResponseBodyKnowledges> knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public java.util.List<ListPackageKnowledgesResponseBodyKnowledges> getKnowledges() {
        return this.knowledges;
    }

    public ListPackageKnowledgesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("SimilarQuestionEffectType")
        public String similarQuestionEffectType;

        @NameInMap("SimilarQuestionId")
        public Long similarQuestionId;

        @NameInMap("SimilarQuestionTitle")
        public String similarQuestionTitle;

        @NameInMap("SimilarQuestionType")
        public String similarQuestionType;

        public static ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions self = new ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
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

    }

    public static class ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions extends TeaModel {
        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("ConditionValue")
        public String conditionValue;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionId")
        public Long solutionId;

        public static ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions self = new ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions();
            return TeaModel.build(map, self);
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

    }

    public static class ListPackageKnowledgesResponseBodyKnowledgesSolutions extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions;

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

        public static ListPackageKnowledgesResponseBodyKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSolutions self = new ListPackageKnowledgesResponseBodyKnowledgesSolutions();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setConditions(java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> getConditions() {
            return this.conditions;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

    }

    public static class ListPackageKnowledgesResponseBodyKnowledges extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("KnowledgeDescription")
        public String knowledgeDescription;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("KnowledgeStatus")
        public String knowledgeStatus;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("SimilarQuestions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions;

        @NameInMap("Solutions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSolutions> solutions;

        public static ListPackageKnowledgesResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledges self = new ListPackageKnowledgesResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledges setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeDescription(String knowledgeDescription) {
            this.knowledgeDescription = knowledgeDescription;
            return this;
        }
        public String getKnowledgeDescription() {
            return this.knowledgeDescription;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
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
