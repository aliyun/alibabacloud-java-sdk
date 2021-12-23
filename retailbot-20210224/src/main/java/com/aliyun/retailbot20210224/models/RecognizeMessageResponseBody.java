// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 问答返回结果
    @NameInMap("Data")
    public RecognizeMessageResponseBodyData data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
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
        // 条件类型
        @NameInMap("ConditionType")
        public String conditionType;

        // 条件表达式
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
        // 变量名称
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
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
        // 答案限定条件
        @NameInMap("Conditions")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledgesSolutionsConditions> conditions;

        // 扩展答案信息
        @NameInMap("ExtraContent")
        public String extraContent;

        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 答案内容
        @NameInMap("SolutionContent")
        public String solutionContent;

        // 答案id
        @NameInMap("SolutionId")
        public Long solutionId;

        // 答案来源
        @NameInMap("SolutionSource")
        public String solutionSource;

        // 答案类型
        @NameInMap("SolutionType")
        public String solutionType;

        // 答案变量
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
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 知识标题
        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        // 场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 知识答案
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
        // 回复内容
        @NameInMap("OutputContent")
        public java.util.Map<String, ?> outputContent;

        // 回复类型
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
        // 场景key
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
        // 情绪识别
        @NameInMap("EmotionTag")
        public String emotionTag;

        // 定位场景使用的商品id
        @NameInMap("ItemId")
        public String itemId;

        // 定位场景使用的订单id
        @NameInMap("OrderId")
        public String orderId;

        // 场景识别
        @NameInMap("SceneDTOs")
        public java.util.List<RecognizeMessageResponseBodyDataSceneSceneDTOs> sceneDTOs;

        // 语义完整性识别
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
        // 单位唯一标识
        @NameInMap("UnitKey")
        public String unitKey;

        // 单位中文名
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
        // 数值部分
        @NameInMap("Num")
        public Double num;

        // 单位部分
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
        // 槽位结束下标
        @NameInMap("End")
        public Integer end;

        // 槽位值
        @NameInMap("NumericSlotValue")
        public RecognizeMessageResponseBodyDataUnitSlotsUnitSpansNumericSlotValue numericSlotValue;

        // 槽位分值
        @NameInMap("Score")
        public Double score;

        // 槽位key
        @NameInMap("SlotKey")
        public String slotKey;

        // 槽位值
        @NameInMap("SlotValue")
        public String slotValue;

        // 槽位来源
        @NameInMap("Source")
        public String source;

        // 槽位起始下标
        @NameInMap("Start")
        public Integer start;

        public static RecognizeMessageResponseBodyDataUnitSlotsUnitSpans build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageResponseBodyDataUnitSlotsUnitSpans self = new RecognizeMessageResponseBodyDataUnitSlotsUnitSpans();
            return TeaModel.build(map, self);
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
        // 定位到的知识
        @NameInMap("Knowledges")
        public java.util.List<RecognizeMessageResponseBodyDataKnowledges> knowledges;

        // 建议的回复内容
        @NameInMap("OutputMessages")
        public java.util.List<RecognizeMessageResponseBodyDataOutputMessages> outputMessages;

        // 定位到的场景
        @NameInMap("Scene")
        public RecognizeMessageResponseBodyDataScene scene;

        // 识别到的槽位信息
        @NameInMap("UnitSlots")
        public RecognizeMessageResponseBodyDataUnitSlots unitSlots;

        // 扩展的输出
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
