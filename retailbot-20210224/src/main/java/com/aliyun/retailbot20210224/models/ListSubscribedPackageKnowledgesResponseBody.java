// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscribedPackageKnowledgesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Knowledges")
    public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledges> knowledges;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSubscribedPackageKnowledgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribedPackageKnowledgesResponseBody self = new ListSubscribedPackageKnowledgesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscribedPackageKnowledgesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscribedPackageKnowledgesResponseBody setKnowledges(java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledges> knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledges> getKnowledges() {
        return this.knowledges;
    }

    public ListSubscribedPackageKnowledgesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscribedPackageKnowledgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscribedPackageKnowledgesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions extends TeaModel {
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

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions self = new ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionId(Long similarQuestionId) {
            this.similarQuestionId = similarQuestionId;
            return this;
        }
        public Long getSimilarQuestionId() {
            return this.similarQuestionId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionTitle(String similarQuestionTitle) {
            this.similarQuestionTitle = similarQuestionTitle;
            return this;
        }
        public String getSimilarQuestionTitle() {
            return this.similarQuestionTitle;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionType(String similarQuestionType) {
            this.similarQuestionType = similarQuestionType;
            return this;
        }
        public String getSimilarQuestionType() {
            return this.similarQuestionType;
        }

    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions extends TeaModel {
        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("ConditionValue")
        public String conditionValue;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionId")
        public Long solutionId;

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions self = new ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions();
            return TeaModel.build(map, self);
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions;

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

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions self = new ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions();
            return TeaModel.build(map, self);
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setConditions(java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> getConditions() {
            return this.conditions;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledges extends TeaModel {
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
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions;

        @NameInMap("Solutions")
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions> solutions;

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledges self = new ListSubscribedPackageKnowledgesResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeDescription(String knowledgeDescription) {
            this.knowledgeDescription = knowledgeDescription;
            return this;
        }
        public String getKnowledgeDescription() {
            return this.knowledgeDescription;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setSimilarQuestions(java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions) {
            this.similarQuestions = similarQuestions;
            return this;
        }
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> getSimilarQuestions() {
            return this.similarQuestions;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setSolutions(java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions> getSolutions() {
            return this.solutions;
        }

    }

}
