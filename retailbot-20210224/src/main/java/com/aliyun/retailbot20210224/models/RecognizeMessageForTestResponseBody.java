// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageForTestResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 问答返回结果
    @NameInMap("Data")
    public RecognizeMessageForTestResponseBodyData data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
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
        // 条件类型
        @NameInMap("ConditionType")
        public String conditionType;

        // 条件表达式
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
        // 变量名称
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
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
        // 答案限定条件
        @NameInMap("Conditions")
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutionsConditions> conditions;

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
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledgesSolutions> solutions;

        // 行业包codes
        @NameInMap("packageCodes")
        public java.util.List<String> packageCodes;

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

        public RecognizeMessageForTestResponseBodyDataKnowledges setPackageCodes(java.util.List<String> packageCodes) {
            this.packageCodes = packageCodes;
            return this;
        }
        public java.util.List<String> getPackageCodes() {
            return this.packageCodes;
        }

    }

    public static class RecognizeMessageForTestResponseBodyDataOutputMessages extends TeaModel {
        // 回复内容
        @NameInMap("OutputContent")
        public java.util.Map<String, ?> outputContent;

        // 回复类型
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
        // 场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 场景来源
        @NameInMap("SceneSource")
        public String sceneSource;

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

    }

    public static class RecognizeMessageForTestResponseBodyDataScene extends TeaModel {
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
        public java.util.List<RecognizeMessageForTestResponseBodyDataSceneSceneDTOs> sceneDTOs;

        // 语义完整性识别
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
        // 单位唯一标识
        @NameInMap("UnitKey")
        public String unitKey;

        // 单位中文名
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
        // 数值部分
        @NameInMap("Num")
        public Double num;

        // 单位部分
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
        // 槽位名称
        @NameInMap("Alias")
        public String alias;

        // 槽位结束下标
        @NameInMap("End")
        public Integer end;

        // 槽位值
        @NameInMap("NumericSlotValue")
        public RecognizeMessageForTestResponseBodyDataUnitSlotsUnitSpansNumericSlotValue numericSlotValue;

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
        // 定位到的知识
        @NameInMap("Knowledges")
        public java.util.List<RecognizeMessageForTestResponseBodyDataKnowledges> knowledges;

        // 建议的回复内容
        @NameInMap("OutputMessages")
        public java.util.List<RecognizeMessageForTestResponseBodyDataOutputMessages> outputMessages;

        // 定位到的场景
        @NameInMap("Scene")
        public RecognizeMessageForTestResponseBodyDataScene scene;

        // 识别到的槽位信息
        @NameInMap("UnitSlots")
        public RecognizeMessageForTestResponseBodyDataUnitSlots unitSlots;

        // 扩展的输出
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
