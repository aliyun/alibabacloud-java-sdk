// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeVariableDetailResponseBodyResultObject resultObject;

    public static DescribeVariableDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableDetailResponseBody self = new DescribeVariableDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVariableDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVariableDetailResponseBody setResultObject(DescribeVariableDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVariableDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVariableDetailResponseBodyResultObjectBaseInfo extends TeaModel {
        @NameInMap("allowBind")
        public String allowBind;

        @NameInMap("chargingMode")
        public String chargingMode;

        @NameInMap("chargingModeDesc")
        public String chargingModeDesc;

        @NameInMap("creator")
        public String creator;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("dataThreshold")
        public String dataThreshold;

        @NameInMap("deductionFactor")
        public Integer deductionFactor;

        @NameInMap("description")
        public String description;

        @NameInMap("frontAllowBind")
        public String frontAllowBind;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("inputsDesc")
        public String inputsDesc;

        @NameInMap("invokeKey")
        public String invokeKey;

        @NameInMap("invokeRt")
        public Integer invokeRt;

        @NameInMap("invokeSuccessRate")
        public String invokeSuccessRate;

        @NameInMap("invokeTimes")
        public Long invokeTimes;

        @NameInMap("lastModifiedOperator")
        public String lastModifiedOperator;

        @NameInMap("name")
        public String name;

        @NameInMap("outputs")
        public String outputs;

        @NameInMap("outputsDesc")
        public String outputsDesc;

        @NameInMap("scene")
        public java.util.List<String> scene;

        @NameInMap("sceneDesc")
        public java.util.List<String> sceneDesc;

        @NameInMap("showOrder")
        public String showOrder;

        @NameInMap("source")
        public String source;

        @NameInMap("sourceDesc")
        public String sourceDesc;

        @NameInMap("status")
        public String status;

        @NameInMap("supportRegions")
        public java.util.List<String> supportRegions;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("typeDesc")
        public String typeDesc;

        @NameInMap("xLabel")
        public String xLabel;

        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeVariableDetailResponseBodyResultObjectBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableDetailResponseBodyResultObjectBaseInfo self = new DescribeVariableDetailResponseBodyResultObjectBaseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setAllowBind(String allowBind) {
            this.allowBind = allowBind;
            return this;
        }
        public String getAllowBind() {
            return this.allowBind;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setChargingMode(String chargingMode) {
            this.chargingMode = chargingMode;
            return this;
        }
        public String getChargingMode() {
            return this.chargingMode;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setChargingModeDesc(String chargingModeDesc) {
            this.chargingModeDesc = chargingModeDesc;
            return this;
        }
        public String getChargingModeDesc() {
            return this.chargingModeDesc;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setDataThreshold(String dataThreshold) {
            this.dataThreshold = dataThreshold;
            return this;
        }
        public String getDataThreshold() {
            return this.dataThreshold;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setDeductionFactor(Integer deductionFactor) {
            this.deductionFactor = deductionFactor;
            return this;
        }
        public Integer getDeductionFactor() {
            return this.deductionFactor;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setFrontAllowBind(String frontAllowBind) {
            this.frontAllowBind = frontAllowBind;
            return this;
        }
        public String getFrontAllowBind() {
            return this.frontAllowBind;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInputsDesc(String inputsDesc) {
            this.inputsDesc = inputsDesc;
            return this;
        }
        public String getInputsDesc() {
            return this.inputsDesc;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInvokeKey(String invokeKey) {
            this.invokeKey = invokeKey;
            return this;
        }
        public String getInvokeKey() {
            return this.invokeKey;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInvokeRt(Integer invokeRt) {
            this.invokeRt = invokeRt;
            return this;
        }
        public Integer getInvokeRt() {
            return this.invokeRt;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInvokeSuccessRate(String invokeSuccessRate) {
            this.invokeSuccessRate = invokeSuccessRate;
            return this;
        }
        public String getInvokeSuccessRate() {
            return this.invokeSuccessRate;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setInvokeTimes(Long invokeTimes) {
            this.invokeTimes = invokeTimes;
            return this;
        }
        public Long getInvokeTimes() {
            return this.invokeTimes;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setLastModifiedOperator(String lastModifiedOperator) {
            this.lastModifiedOperator = lastModifiedOperator;
            return this;
        }
        public String getLastModifiedOperator() {
            return this.lastModifiedOperator;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setOutputsDesc(String outputsDesc) {
            this.outputsDesc = outputsDesc;
            return this;
        }
        public String getOutputsDesc() {
            return this.outputsDesc;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setScene(java.util.List<String> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<String> getScene() {
            return this.scene;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setSceneDesc(java.util.List<String> sceneDesc) {
            this.sceneDesc = sceneDesc;
            return this;
        }
        public java.util.List<String> getSceneDesc() {
            return this.sceneDesc;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setShowOrder(String showOrder) {
            this.showOrder = showOrder;
            return this;
        }
        public String getShowOrder() {
            return this.showOrder;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setSourceDesc(String sourceDesc) {
            this.sourceDesc = sourceDesc;
            return this;
        }
        public String getSourceDesc() {
            return this.sourceDesc;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setSupportRegions(java.util.List<String> supportRegions) {
            this.supportRegions = supportRegions;
            return this;
        }
        public java.util.List<String> getSupportRegions() {
            return this.supportRegions;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }
        public String getTypeDesc() {
            return this.typeDesc;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeVariableDetailResponseBodyResultObjectBaseInfo setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeVariableDetailResponseBodyResultObject extends TeaModel {
        @NameInMap("baseInfo")
        public DescribeVariableDetailResponseBodyResultObjectBaseInfo baseInfo;

        public static DescribeVariableDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableDetailResponseBodyResultObject self = new DescribeVariableDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVariableDetailResponseBodyResultObject setBaseInfo(DescribeVariableDetailResponseBodyResultObjectBaseInfo baseInfo) {
            this.baseInfo = baseInfo;
            return this;
        }
        public DescribeVariableDetailResponseBodyResultObjectBaseInfo getBaseInfo() {
            return this.baseInfo;
        }

    }

}
