// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeMessageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RecognizeMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageResponseBody self = new RecognizeMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeMessageResponseBody setData(RecognizeMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeMessageResponseBodyData getData() {
        return this.data;
    }

    public RecognizeMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

        @NameInMap("VariableType")
        public String variableType;

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

        public RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

    }

    public static class RecognizeMessageResponseBodyDataKnowledgesSolutions extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions> conditions;

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
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsSolutionVariables> solutionVariables;

        public static RecognizeMessageResponseBodyDataKnowledgesSolutions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataKnowledgesSolutions self = new RecognizeMessageResponseBodyDataKnowledgesSolutions();
            return TeaModel.build(map, self);
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

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionContent(String solutionContent) {
            this.solutionContent = solutionContent;
            return this;
        }
        public String getSolutionContent() {
            return this.solutionContent;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionSource(String solutionSource) {
            this.solutionSource = solutionSource;
            return this;
        }
        public String getSolutionSource() {
            return this.solutionSource;
        }

        public RecognizeMessageResponseBodyDataKnowledgesSolutions setSolutionType(String solutionType) {
            this.solutionType = solutionType;
            return this;
        }
        public String getSolutionType() {
            return this.solutionType;
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

        @NameInMap("SceneKey")
        public String sceneKey;

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

        public RecognizeMessageResponseBodyDataKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
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
        @NameInMap("OutputContent")
        public java.util.Map<String, ?> outputContent;

        @NameInMap("OutputContentType")
        public String outputContentType;

        public static RecognizeMessageResponseBodyDataOutputMessages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataOutputMessages self = new RecognizeMessageResponseBodyDataOutputMessages();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataOutputMessages setOutputContent(java.util.Map<String, ?> outputContent) {
            this.outputContent = outputContent;
            return this;
        }
        public java.util.Map<String, ?> getOutputContent() {
            return this.outputContent;
        }

        public RecognizeMessageResponseBodyDataOutputMessages setOutputContentType(String outputContentType) {
            this.outputContentType = outputContentType;
            return this;
        }
        public String getOutputContentType() {
            return this.outputContentType;
        }

    }

    public static class RecognizeMessageResponseBodyDataSceneSceneDTOs extends TeaModel {
        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("SceneSource")
        public String sceneSource;

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

        public RecognizeMessageResponseBodyDataSceneSceneDTOs setSceneSource(String sceneSource) {
            this.sceneSource = sceneSource;
            return this;
        }
        public String getSceneSource() {
            return this.sceneSource;
        }

    }

    public static class RecognizeMessageResponseBodyDataScene extends TeaModel {
        @NameInMap("EmotionTag")
        public String emotionTag;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("SceneDTOs")
        public java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> sceneDTOs;

        @NameInMap("SemanticComplete")
        public String semanticComplete;

        public static RecognizeMessageResponseBodyDataScene build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataScene self = new RecognizeMessageResponseBodyDataScene();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataScene setEmotionTag(String emotionTag) {
            this.emotionTag = emotionTag;
            return this;
        }
        public String getEmotionTag() {
            return this.emotionTag;
        }

        public RecognizeMessageResponseBodyDataScene setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageResponseBodyDataScene setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public RecognizeMessageResponseBodyDataScene setSceneDTOs(java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> sceneDTOs) {
            this.sceneDTOs = sceneDTOs;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> getSceneDTOs() {
            return this.sceneDTOs;
        }

        public RecognizeMessageResponseBodyDataScene setSemanticComplete(String semanticComplete) {
            this.semanticComplete = semanticComplete;
            return this;
        }
        public String getSemanticComplete() {
            return this.semanticComplete;
        }

    }

    public static class RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit extends TeaModel {
        @NameInMap("UnitKey")
        public String unitKey;

        @NameInMap("UnitName")
        public String unitName;

        public static RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit self = new RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit setUnitKey(String unitKey) {
            this.unitKey = unitKey;
            return this;
        }
        public String getUnitKey() {
            return this.unitKey;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue extends TeaModel {
        @NameInMap("Num")
        public Double num;

        @NameInMap("Unit")
        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit unit;

        public static RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue self = new RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue setNum(Double num) {
            this.num = num;
            return this;
        }
        public Double getNum() {
            return this.num;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue setUnit(RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit unit) {
            this.unit = unit;
            return this;
        }
        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValueUnit getUnit() {
            return this.unit;
        }

    }

    public static class RecognizeMessageResponseBodyDataUnitSlotsUnitSpans extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("End")
        public Integer end;

        @NameInMap("NumericSlotValue")
        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue numericSlotValue;

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

        public static RecognizeMessageResponseBodyDataUnitSlotsUnitSpans build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataUnitSlotsUnitSpans self = new RecognizeMessageResponseBodyDataUnitSlotsUnitSpans();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setNumericSlotValue(RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue numericSlotValue) {
            this.numericSlotValue = numericSlotValue;
            return this;
        }
        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue getNumericSlotValue() {
            return this.numericSlotValue;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setSlotKey(String slotKey) {
            this.slotKey = slotKey;
            return this;
        }
        public String getSlotKey() {
            return this.slotKey;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setSlotValue(String slotValue) {
            this.slotValue = slotValue;
            return this;
        }
        public String getSlotValue() {
            return this.slotValue;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpans setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class RecognizeMessageResponseBodyDataUnitSlots extends TeaModel {
        @NameInMap("UnitSpans")
        public java.util.List<RecognizeMessageResponseBodyDataUnitSlotsUnitSpans> unitSpans;

        public static RecognizeMessageResponseBodyDataUnitSlots build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataUnitSlots self = new RecognizeMessageResponseBodyDataUnitSlots();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageResponseBodyDataUnitSlots setUnitSpans(java.util.List<RecognizeMessageResponseBodyDataUnitSlotsUnitSpans> unitSpans) {
            this.unitSpans = unitSpans;
            return this;
        }
        public java.util.List<RecognizeMessageResponseBodyDataUnitSlotsUnitSpans> getUnitSpans() {
            return this.unitSpans;
        }

    }

    public static class RecognizeMessageResponseBodyData extends TeaModel {
        @NameInMap("Knowledges")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledges> knowledges;

        @NameInMap("OutputMessages")
        public java.util.List<RecognizeMessageResponseBodyDataOutputMessages> outputMessages;

        @NameInMap("Scene")
        public RecognizeMessageResponseBodyDataScene scene;

        @NameInMap("UnitSlots")
        public RecognizeMessageResponseBodyDataUnitSlots unitSlots;

        @NameInMap("extOutput")
        public java.util.Map<String, ?> extOutput;

        public static RecognizeMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyData self = new RecognizeMessageResponseBodyData();
            return TeaModel.build(map, self);
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

        public RecognizeMessageResponseBodyData setScene(RecognizeMessageResponseBodyDataScene scene) {
            this.scene = scene;
            return this;
        }
        public RecognizeMessageResponseBodyDataScene getScene() {
            return this.scene;
        }

        public RecognizeMessageResponseBodyData setUnitSlots(RecognizeMessageResponseBodyDataUnitSlots unitSlots) {
            this.unitSlots = unitSlots;
            return this;
        }
        public RecognizeMessageResponseBodyDataUnitSlots getUnitSlots() {
            return this.unitSlots;
        }

        public RecognizeMessageResponseBodyData setExtOutput(java.util.Map<String, ?> extOutput) {
            this.extOutput = extOutput;
            return this;
        }
        public java.util.Map<String, ?> getExtOutput() {
            return this.extOutput;
        }

    }

}
