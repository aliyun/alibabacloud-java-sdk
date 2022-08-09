// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageForTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeMessageForTestResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RecognizeMessageForTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageForTestResponseBody self = new RecognizeMessageForTestResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageForTestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeMessageForTestResponseBody setData(RecognizeMessageForTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeMessageForTestResponseBodyData getData() {
        return this.data;
    }

    public RecognizeMessageForTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeMessageForTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeMessageForTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions extends TeaModel {
        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("ConditionValue")
        public String conditionValue;

        public static RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions self = new RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions setConditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public String getConditionValue() {
            return this.conditionValue;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables extends TeaModel {
        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        public static RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables self = new RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataKnowledgesSolutions extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions> conditions;

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
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables> solutionVariables;

        public static RecognizeMessageForTestResponseBodyDataKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataKnowledgesSolutions self = new RecognizeMessageForTestResponseBodyDataKnowledgesSolutions();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setConditions(java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions> getConditions() {
            return this.conditions;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setExtraContent(String extraContent) {
            this.extraContent = extraContent;
            return this;
        }
        public String getExtraContent() {
            return this.extraContent;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledgesSolutions setSolutionVariables(java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables> solutionVariables) {
            this.solutionVariables = solutionVariables;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsSolutionVariables> getSolutionVariables() {
            return this.solutionVariables;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataKnowledges extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("Solutions")
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutions> solutions;

        public static RecognizeMessageForTestResponseBodyDataKnowledges build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataKnowledges self = new RecognizeMessageForTestResponseBodyDataKnowledges();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public RecognizeMessageForTestResponseBodyDataKnowledges setSolutions(java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutions> getSolutions() {
            return this.solutions;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataOutputMessages extends TeaModel {
        @NameInMap("OutputContent")
        public java.util.Map<String, ?> outputContent;

        @NameInMap("OutputContentType")
        public String outputContentType;

        public static RecognizeMessageForTestResponseBodyDataOutputMessages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataOutputMessages self = new RecognizeMessageForTestResponseBodyDataOutputMessages();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataOutputMessages setOutputContent(java.util.Map<String, ?> outputContent) {
            this.outputContent = outputContent;
            return this;
        }
        public java.util.Map<String, ?> getOutputContent() {
            return this.outputContent;
        }

        public RecognizeMessageForTestResponseBodyDataOutputMessages setOutputContentType(String outputContentType) {
            this.outputContentType = outputContentType;
            return this;
        }
        public String getOutputContentType() {
            return this.outputContentType;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataSceneSceneDTOs extends TeaModel {
        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("SceneSource")
        public String sceneSource;

        @NameInMap("contextModule")
        public String contextModule;

        public static RecognizeMessageForTestResponseBodyDataSceneSceneDTOs build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataSceneSceneDTOs self = new RecognizeMessageForTestResponseBodyDataSceneSceneDTOs();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataSceneSceneDTOs setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public RecognizeMessageForTestResponseBodyDataSceneSceneDTOs setSceneSource(String sceneSource) {
            this.sceneSource = sceneSource;
            return this;
        }
        public String getSceneSource() {
            return this.sceneSource;
        }

        public RecognizeMessageForTestResponseBodyDataSceneSceneDTOs setContextModule(String contextModule) {
            this.contextModule = contextModule;
            return this;
        }
        public String getContextModule() {
            return this.contextModule;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataScene extends TeaModel {
        @NameInMap("EmotionTag")
        public String emotionTag;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("SceneDTOs")
        public java.util.List<RecognizeMessageForTestResponseBodyDataSceneSceneDTOs> sceneDTOs;

        @NameInMap("SemanticComplete")
        public String semanticComplete;

        public static RecognizeMessageForTestResponseBodyDataScene build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataScene self = new RecognizeMessageForTestResponseBodyDataScene();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataScene setEmotionTag(String emotionTag) {
            this.emotionTag = emotionTag;
            return this;
        }
        public String getEmotionTag() {
            return this.emotionTag;
        }

        public RecognizeMessageForTestResponseBodyDataScene setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageForTestResponseBodyDataScene setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public RecognizeMessageForTestResponseBodyDataScene setSceneDTOs(java.util.List<RecognizeMessageForTestResponseBodyDataSceneSceneDTOs> sceneDTOs) {
            this.sceneDTOs = sceneDTOs;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataSceneSceneDTOs> getSceneDTOs() {
            return this.sceneDTOs;
        }

        public RecognizeMessageForTestResponseBodyDataScene setSemanticComplete(String semanticComplete) {
            this.semanticComplete = semanticComplete;
            return this;
        }
        public String getSemanticComplete() {
            return this.semanticComplete;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit extends TeaModel {
        @NameInMap("UnitKey")
        public String unitKey;

        @NameInMap("UnitName")
        public String unitName;

        public static RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit self = new RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit setUnitKey(String unitKey) {
            this.unitKey = unitKey;
            return this;
        }
        public String getUnitKey() {
            return this.unitKey;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue extends TeaModel {
        @NameInMap("Num")
        public Double num;

        @NameInMap("Unit")
        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit unit;

        public static RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue self = new RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue setNum(Double num) {
            this.num = num;
            return this;
        }
        public Double getNum() {
            return this.num;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue setUnit(RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit unit) {
            this.unit = unit;
            return this;
        }
        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit getUnit() {
            return this.unit;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("End")
        public Integer end;

        @NameInMap("NumericSlotValue")
        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue numericSlotValue;

        @NameInMap("Score")
        public Double score;

        @NameInMap("SlotKey")
        public String slotKey;

        @NameInMap("SlotValue")
        public String slotValue;

        @NameInMap("Source")
        public String source;

        @NameInMap("Start")
        public Integer start;

        public static RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans self = new RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setNumericSlotValue(RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue numericSlotValue) {
            this.numericSlotValue = numericSlotValue;
            return this;
        }
        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue getNumericSlotValue() {
            return this.numericSlotValue;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setSlotKey(String slotKey) {
            this.slotKey = slotKey;
            return this;
        }
        public String getSlotKey() {
            return this.slotKey;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setSlotValue(String slotValue) {
            this.slotValue = slotValue;
            return this;
        }
        public String getSlotValue() {
            return this.slotValue;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataUnitSlots extends TeaModel {
        @NameInMap("UnitSpans")
        public java.util.List<RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans> unitSpans;

        public static RecognizeMessageForTestResponseBodyDataUnitSlots build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyDataUnitSlots self = new RecognizeMessageForTestResponseBodyDataUnitSlots();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyDataUnitSlots setUnitSpans(java.util.List<RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans> unitSpans) {
            this.unitSpans = unitSpans;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpans> getUnitSpans() {
            return this.unitSpans;
        }

    }

    public static class RecognizeMessageForTestResponseBodyData extends TeaModel {
        @NameInMap("Knowledges")
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledges> knowledges;

        @NameInMap("OutputMessages")
        public java.util.List<RecognizeMessageForTestResponseBodyDataOutputMessages> outputMessages;

        @NameInMap("Scene")
        public RecognizeMessageForTestResponseBodyDataScene scene;

        @NameInMap("UnitSlots")
        public RecognizeMessageForTestResponseBodyDataUnitSlots unitSlots;

        @NameInMap("extOutput")
        public java.util.Map<String, ?> extOutput;

        public static RecognizeMessageForTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestResponseBodyData self = new RecognizeMessageForTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestResponseBodyData setKnowledges(java.util.List<RecognizeMessageForTestResponseBodyDataKnowledges> knowledges) {
            this.knowledges = knowledges;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledges> getKnowledges() {
            return this.knowledges;
        }

        public RecognizeMessageForTestResponseBodyData setOutputMessages(java.util.List<RecognizeMessageForTestResponseBodyDataOutputMessages> outputMessages) {
            this.outputMessages = outputMessages;
            return this;
        }
        public java.util.List<RecognizeMessageForTestResponseBodyDataOutputMessages> getOutputMessages() {
            return this.outputMessages;
        }

        public RecognizeMessageForTestResponseBodyData setScene(RecognizeMessageForTestResponseBodyDataScene scene) {
            this.scene = scene;
            return this;
        }
        public RecognizeMessageForTestResponseBodyDataScene getScene() {
            return this.scene;
        }

        public RecognizeMessageForTestResponseBodyData setUnitSlots(RecognizeMessageForTestResponseBodyDataUnitSlots unitSlots) {
            this.unitSlots = unitSlots;
            return this;
        }
        public RecognizeMessageForTestResponseBodyDataUnitSlots getUnitSlots() {
            return this.unitSlots;
        }

        public RecognizeMessageForTestResponseBodyData setExtOutput(java.util.Map<String, ?> extOutput) {
            this.extOutput = extOutput;
            return this;
        }
        public java.util.Map<String, ?> getExtOutput() {
            return this.extOutput;
        }

    }

}
