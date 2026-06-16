// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned object.</p>
     */
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
        /**
         * <p>Specifies whether variable binding is allowed. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: unavailable</li>
         * <li><strong>ALL</strong>: all</li>
         * <li><strong>ENABLE</strong>: available</li>
         * <li><strong>PART_ENABLE</strong>: partially available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("allowBind")
        public String allowBind;

        /**
         * <p>The billing mode. Valid values:</p>
         * <ul>
         * <li><strong>PAY_PER_VIEW</strong>: paid</li>
         * <li><strong>FREE</strong>: free.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("chargingMode")
        public String chargingMode;

        /**
         * <p>The billing mode description.</p>
         * 
         * <strong>example:</strong>
         * <p>免费</p>
         */
        @NameInMap("chargingModeDesc")
        public String chargingModeDesc;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>176020</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The data distribution display in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>The valid data range, inclusive on both ends.</p>
         * 
         * <strong>example:</strong>
         * <p>(0,10)</p>
         */
        @NameInMap("dataThreshold")
        public String dataThreshold;

        /**
         * <p>The deduction coefficient.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("deductionFactor")
        public Integer deductionFactor;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether front-end binding is allowed. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: not allowed</li>
         * <li><strong>ENABLE</strong>: allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("frontAllowBind")
        public String frontAllowBind;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1698143758000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1698143758000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3144</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The required parameters.</p>
         * <p>When inputRequired is set to <strong>all</strong>, all parameters are required.
         * When inputRequired is set to <strong>one</strong>, only one input parameter is required.
         * Required fields are separated by commas, such as mobile,ip,email.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>one</strong></p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>The input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>ip,age,mobile</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>The input parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>ip,年龄,手机号</p>
         */
        @NameInMap("inputsDesc")
        public String inputsDesc;

        /**
         * <p>The invocation key.</p>
         * 
         * <strong>example:</strong>
         * <p>onlineScamDetectionTags_v</p>
         */
        @NameInMap("invokeKey")
        public String invokeKey;

        /**
         * <p>The invocation response time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("invokeRt")
        public Integer invokeRt;

        /**
         * <p>The invocation success rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("invokeSuccessRate")
        public String invokeSuccessRate;

        /**
         * <p>The number of invocations.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("invokeTimes")
        public Long invokeTimes;

        /**
         * <p>The last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("lastModifiedOperator")
        public String lastModifiedOperator;

        /**
         * <p>The variable name.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>onlineScamDetectionTags</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The outputs.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("outputs")
        public String outputs;

        /**
         * <p>The output description.</p>
         * 
         * <strong>example:</strong>
         * <p>字符串</p>
         */
        @NameInMap("outputsDesc")
        public String outputsDesc;

        /**
         * <p>The applicable scenario code.</p>
         */
        @NameInMap("scene")
        public java.util.List<String> scene;

        /**
         * <p>The applicable scenario description.</p>
         */
        @NameInMap("sceneDesc")
        public java.util.List<String> sceneDesc;

        /**
         * <p>The display order.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("showOrder")
        public String showOrder;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The source description.</p>
         * 
         * <strong>example:</strong>
         * <p>风险识别</p>
         */
        @NameInMap("sourceDesc")
        public String sourceDesc;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of supported regions.</p>
         */
        @NameInMap("supportRegions")
        public java.util.List<String> supportRegions;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>诈骗引流识别_标签</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The category description.</p>
         * 
         * <strong>example:</strong>
         * <p>事件字段</p>
         */
        @NameInMap("typeDesc")
        public String typeDesc;

        /**
         * <p>The X-axis label for the data distribution chart.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>The Y-axis label for the data distribution chart.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The basic properties.</p>
         */
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
