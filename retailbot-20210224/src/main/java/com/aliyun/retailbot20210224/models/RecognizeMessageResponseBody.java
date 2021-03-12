// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeMessageResponseBodyData data;

    public static RecognizeMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageResponseBody self = new RecognizeMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeMessageResponseBody setData(RecognizeMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeMessageResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeMessageResponseBodyDataSceneSceneDTOs extends TeaModel {
        @NameInMap("SceneKey")
        public String sceneKey;

        public static RecognizeMessageResponseBodyDataSceneSceneDTOs build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataSceneSceneDTOs self = new RecognizeMessageResponseBodyDataSceneSceneDTOs();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataSceneSceneDTOs setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

    }

    public static class RecognizeMessageResponseBodyDataScene extends TeaModel {
        @NameInMap("SceneDTOs")
        public java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> sceneDTOs;

        @NameInMap("EmotionTag")
        public String emotionTag;

        @NameInMap("SemanticComplete")
        public String semanticComplete;

        public static RecognizeMessageResponseBodyDataScene build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataScene self = new RecognizeMessageResponseBodyDataScene();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataScene setSceneDTOs(java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> sceneDTOs) {
            this.sceneDTOs = sceneDTOs;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> getSceneDTOs() {
            return this.sceneDTOs;
        }

        public RecognizeMessageResponseBodyDataScene setEmotionTag(String emotionTag) {
            this.emotionTag = emotionTag;
            return this;
        }
        public String getEmotionTag() {
            return this.emotionTag;
        }

        public RecognizeMessageResponseBodyDataScene setSemanticComplete(String semanticComplete) {
            this.semanticComplete = semanticComplete;
            return this;
        }
        public String getSemanticComplete() {
            return this.semanticComplete;
        }

    }

    public static class RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions extends TeaModel {
        @NameInMap("SimilarQuestionId")
        public Long similarQuestionId;

        @NameInMap("SimilarQuestionTitle")
        public String similarQuestionTitle;

        @NameInMap("SimilarQuestionType")
        public String similarQuestionType;

        @NameInMap("SimilarQuestionEffectType")
        public Integer similarQuestionEffectType;

        public static RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions self = new RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions setSimilarQuestionId(Long similarQuestionId) {
            this.similarQuestionId = similarQuestionId;
            return this;
        }
        public Long getSimilarQuestionId() {
            return this.similarQuestionId;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions setSimilarQuestionTitle(String similarQuestionTitle) {
            this.similarQuestionTitle = similarQuestionTitle;
            return this;
        }
        public String getSimilarQuestionTitle() {
            return this.similarQuestionTitle;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions setSimilarQuestionType(String similarQuestionType) {
            this.similarQuestionType = similarQuestionType;
            return this;
        }
        public String getSimilarQuestionType() {
            return this.similarQuestionType;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions setSimilarQuestionEffectType(Integer similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public Integer getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

    }

    public static class RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions extends TeaModel {
        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("ConditionValue")
        public String conditionValue;

        public static RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions self = new RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

    }

    public static class RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables extends TeaModel {
        @NameInMap("VariableName")
        public String variableName;

        public static RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables self = new RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

    }

    public static class RecognizeMessageResponseBodyDataKnowledgesSolutions extends TeaModel {
        @NameInMap("SolutionId")
        public Long solutionId;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SolutionType")
        public String solutionType;

        @NameInMap("SolutionSource")
        public String solutionSource;

        @NameInMap("SolutionContent")
        public String solutionContent;

        @NameInMap("Conditions")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions> conditions;

        @NameInMap("ExtraContent")
        public String extraContent;

        @NameInMap("SolutionVariables")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables> solutionVariables;

        public static RecognizeMessageResponseBodyDataKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataKnowledgesSolutions self = new RecognizeMessageResponseBodyDataKnowledgesSolutions();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setConditions(java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions> getConditions() {
            return this.conditions;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionVariables(java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables> solutionVariables) {
            this.solutionVariables = solutionVariables;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables> getSolutionVariables() {
            return this.solutionVariables;
        }

    }

    public static class RecognizeMessageResponseBodyDataKnowledges extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        @NameInMap("KnowledgeStatus")
        public String knowledgeStatus;

        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("KnowledgeDesc")
        public String knowledgeDesc;

        @NameInMap("SimilarQuestions")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions> similarQuestions;

        @NameInMap("Solutions")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutions> solutions;

        public static RecognizeMessageResponseBodyDataKnowledges build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataKnowledges self = new RecognizeMessageResponseBodyDataKnowledges();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public RecognizeMessageResponseBodyDataKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public RecognizeMessageResponseBodyDataKnowledges setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public RecognizeMessageResponseBodyDataKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public RecognizeMessageResponseBodyDataKnowledges setKnowledgeDesc(String knowledgeDesc) {
            this.knowledgeDesc = knowledgeDesc;
            return this;
        }
        public String getKnowledgeDesc() {
            return this.knowledgeDesc;
        }

        public RecognizeMessageResponseBodyDataKnowledges setSimilarQuestions(java.util.List<RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions> similarQuestions) {
            this.similarQuestions = similarQuestions;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSimilarQuestions> getSimilarQuestions() {
            return this.similarQuestions;
        }

        public RecognizeMessageResponseBodyDataKnowledges setSolutions(java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutions> getSolutions() {
            return this.solutions;
        }

    }

    public static class RecognizeMessageResponseBodyDataOutputMessages extends TeaModel {
        @NameInMap("OutputContentType")
        public String outputContentType;

        @NameInMap("OutputContent")
        public java.util.Map<String, ?> outputContent;

        public static RecognizeMessageResponseBodyDataOutputMessages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataOutputMessages self = new RecognizeMessageResponseBodyDataOutputMessages();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataOutputMessages setOutputContentType(String outputContentType) {
            this.outputContentType = outputContentType;
            return this;
        }
        public String getOutputContentType() {
            return this.outputContentType;
        }

        public RecognizeMessageResponseBodyDataOutputMessages setOutputContent(java.util.Map<String, ?> outputContent) {
            this.outputContent = outputContent;
            return this;
        }
        public java.util.Map<String, ?> getOutputContent() {
            return this.outputContent;
        }

    }

    public static class RecognizeMessageResponseBodyData extends TeaModel {
        @NameInMap("Scene")
        public RecognizeMessageResponseBodyDataScene scene;

        @NameInMap("Knowledges")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledges> knowledges;

        @NameInMap("OutputMessages")
        public java.util.List<RecognizeMessageResponseBodyDataOutputMessages> outputMessages;

        public static RecognizeMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyData self = new RecognizeMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyData setScene(RecognizeMessageResponseBodyDataScene scene) {
            this.scene = scene;
            return this;
        }
        public RecognizeMessageResponseBodyDataScene getScene() {
            return this.scene;
        }

        public RecognizeMessageResponseBodyData setKnowledges(java.util.List<RecognizeMessageResponseBodyDataKnowledges> knowledges) {
            this.knowledges = knowledges;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataKnowledges> getKnowledges() {
            return this.knowledges;
        }

        public RecognizeMessageResponseBodyData setOutputMessages(java.util.List<RecognizeMessageResponseBodyDataOutputMessages> outputMessages) {
            this.outputMessages = outputMessages;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataOutputMessages> getOutputMessages() {
            return this.outputMessages;
        }

    }

}
