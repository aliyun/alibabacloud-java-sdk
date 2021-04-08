// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscribedPackageKnowledgesResponseBody extends TeaModel {
    // 知识集合
    @NameInMap("Knowledges")
    public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledges> knowledges;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSubscribedPackageKnowledgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribedPackageKnowledgesResponseBody self = new ListSubscribedPackageKnowledgesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscribedPackageKnowledgesResponseBody setKnowledges(java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledges> knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledges> getKnowledges() {
        return this.knowledges;
    }

    public ListSubscribedPackageKnowledgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions extends TeaModel {
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

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions self = new ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions();
            return TeaModel.build(map, self);
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

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions extends TeaModel {
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 生效模式：EffectiveMode
        @NameInMap("ConditionType")
        public String conditionType;

        // 生效模式："disable":全部不生效，"auto":全自动，"assistant":智能辅助，"enable":全部生效
        @NameInMap("ConditionValue")
        public String conditionValue;

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions self = new ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions();
            return TeaModel.build(map, self);
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

    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions extends TeaModel {
        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 场景id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案类型,"text":文本答案
        @NameInMap("SolutionType")
        public String solutionType;

        // 答案来源
        @NameInMap("SolutionSource")
        public String solutionSource;

        // 答案正文
        @NameInMap("SolutionContent")
        public String solutionContent;

        // 答案约束
        @NameInMap("Conditions")
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutionsConditions> conditions;

        // 答案扩展信息
        @NameInMap("ExtraContent")
        public String extraContent;

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions self = new ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions();
            return TeaModel.build(map, self);
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
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

    }

    public static class ListSubscribedPackageKnowledgesResponseBodyKnowledges extends TeaModel {
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 知识标题
        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        // "online":在用，"disabled":禁用
        @NameInMap("KnowledgeStatus")
        public String knowledgeStatus;

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

        @NameInMap("SceneKey")
        public String sceneKey;

        // 示例问法、正负例句、正负关键字
        @NameInMap("SimilarQuestions")
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions;

        // 答案
        @NameInMap("Solutions")
        public java.util.List<ListSubscribedPackageKnowledgesResponseBodyKnowledgesSolutions> solutions;

        public static ListSubscribedPackageKnowledgesResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribedPackageKnowledgesResponseBodyKnowledges self = new ListSubscribedPackageKnowledgesResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setKnowledgeDescription(String knowledgeDescription) {
            this.knowledgeDescription = knowledgeDescription;
            return this;
        }
        public String getKnowledgeDescription() {
            return this.knowledgeDescription;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSubscribedPackageKnowledgesResponseBodyKnowledges setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
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
