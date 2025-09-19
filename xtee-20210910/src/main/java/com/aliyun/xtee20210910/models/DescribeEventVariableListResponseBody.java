// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object.</p>
     */
    @NameInMap("resultObject")
    public DescribeEventVariableListResponseBodyResultObject resultObject;

    public static DescribeEventVariableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableListResponseBody self = new DescribeEventVariableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventVariableListResponseBody setResultObject(DescribeEventVariableListResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeEventVariableListResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity extends TeaModel {
        /**
         * <p>iv value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectActions extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>deAddResult</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>决策结果</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTION</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Expression display. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Source of the field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3144</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Input type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input parameters. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>addDeResult</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Anomaly value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>决策结果</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTION</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectActions self = new DescribeEventVariableListResponseBodyResultObjectActions();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectActions setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold extends TeaModel {
        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity extends TeaModel {
        /**
         * <p>The IV value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectDeviceVariables extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>queryPhoneSimulatorInfo(deviceToken)?.deviceName</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>设备信息-设备名称</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display type and grouping label.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>The display value of the calculation expression. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>The favorite flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>The detailed information of the field in the field pool. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>The field rank.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>The source of the field. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>The required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input for the variable. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>device_name</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The outlier value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>The output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>设备信息-设备名称-deviceName</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity variableVelocity;

        /**
         * <p>The X label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>The Y label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectDeviceVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectDeviceVariables self = new DescribeEventVariableListResponseBodyResultObjectDeviceVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectDeviceVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold extends TeaModel {
        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity extends TeaModel {
        /**
         * <p>The IV value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectExpressionVariables extends TeaModel {
        /**
         * <p>The code of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>deInvokeSelfVariable(390397)</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>The definition ID of the variable. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>获取手机号前7位</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display type and grouping label.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>The display value of the calculation expression.</p>
         * 
         * <strong>example:</strong>
         * <p>@testaaa +1</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>The favorite flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>The detailed information of the field in the field pool. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>The field rank.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>The source of the field. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>The input type of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3148</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>The required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Multiple input parameters separated by commas. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_w2yIClHCc150</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The outlier value.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>The output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold outputThreshold;

        /**
         * <p>The parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>获取手机号前7位</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The type of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity variableVelocity;

        /**
         * <p>The X label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>The Y label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectExpressionVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectExpressionVariables self = new DescribeEventVariableListResponseBodyResultObjectExpressionVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectExpressionVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity extends TeaModel {
        /**
         * <p>iv value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectFavoriteVariables extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>deFunctionProcess(ip,\&quot;isIp\&quot;)</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>判断是否符合IPv4标准</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_BIND</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Expression display value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Source of the field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>BOOLEAN</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input parameters should be separated by commas. Some variables may not have this field.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>isIpAddressV4</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Anomaly value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>IP是否符合IPV4格式</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_BIND</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectFavoriteVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectFavoriteVariables self = new DescribeEventVariableListResponseBodyResultObjectFavoriteVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity extends TeaModel {
        /**
         * <p>id value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectMiddleVariables extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>mid</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Variable description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>MIDDLE</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Calculate the display value of the expression. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Variable source.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Input field type, indicating the type of input parameters, mainly used for function classification. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>mid</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Outlier value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>midVaribale</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>MIDDLE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This type of variable does not return this field.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectMiddleVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectMiddleVariables self = new DescribeEventVariableListResponseBodyResultObjectMiddleVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectMiddleVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold extends TeaModel {
        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity extends TeaModel {
        /**
         * <p>The IV value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectModelVariables extends TeaModel {
        /**
         * <p>The code of the model variable.</p>
         * 
         * <strong>example:</strong>
         * <p>getAIData(model)</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>The definition ID of the model variable. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>The description of the model variable.</p>
         * 
         * <strong>example:</strong>
         * <p>BL_t_show</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display type and grouping label.</p>
         * 
         * <strong>example:</strong>
         * <p>MODEL</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>The display value of the calculation expression. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>The favorite flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>The detailed information of the field in the field pool. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>The field rank.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>The source of the field. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>The type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>The primary key ID of the model variable.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>The required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Multiple input parameters separated by commas. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>The name of the model variable.</p>
         * 
         * <strong>example:</strong>
         * <p>mo_qbbyf33o66f2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The outlier value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>The output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold outputThreshold;

        /**
         * <p>The parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The title of the model variable.</p>
         * 
         * <strong>example:</strong>
         * <p>BL_t_show</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The type of the model variable.</p>
         * 
         * <strong>example:</strong>
         * <p>MODEL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity variableVelocity;

        /**
         * <p>The X label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>The Y label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectModelVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectModelVariables self = new DescribeEventVariableListResponseBodyResultObjectModelVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectModelVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity extends TeaModel {
        /**
         * <p>iv value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNameList extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>nl_UN8otElLb490</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display in JSON format. This field is not currently returned.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>NAME_LIST</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Calculate the expression display value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Source of the field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input parameters. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>nl_UN8otElLb490</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Outlier value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned currently.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>NAME_LIST</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNameList self = new DescribeEventVariableListResponseBodyResultObjectNameList();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectNameList setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity extends TeaModel {
        /**
         * <p>iv value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>getHourOfTimestamp({data})</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>时间戳，可以是秒或者毫秒</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>FUNC</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Calculate the expression display value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Source of the field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Variable return type.</p>
         * 
         * <strong>example:</strong>
         * <p>LONG</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DATE</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>getHourOfTimestamp</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Exception value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Variable title.</p>
         * 
         * <strong>example:</strong>
         * <p>根据时间戳获取小时</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>FUNC</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This type of variable does not return this field.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions self = new DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity extends TeaModel {
        /**
         * <p>iv value.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectNativeVariables extends TeaModel {
        /**
         * <p>variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Associated variable definition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Variable description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Calculate expression display value.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite Identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Field pool field details.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field Sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Variable source.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFINE</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>223</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Input field type, indicating the type of input parameters, mainly used for function categorization.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input of the variable. Event field is not present.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>outlier.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output score threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold outputThreshold;

        /**
         * <p>Parent name.</p>
         * 
         * <strong>example:</strong>
         * <p>parentName</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Variable source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable indicator information.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity variableVelocity;

        /**
         * <p>x label.</p>
         * 
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label.</p>
         * 
         * <strong>example:</strong>
         * <p>y</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectNativeVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectNativeVariables self = new DescribeEventVariableListResponseBodyResultObjectNativeVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectNativeVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold extends TeaModel {
        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity extends TeaModel {
        /**
         * <p>The IV value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectQueryVariables extends TeaModel {
        /**
         * <p>The code of the query variable.</p>
         * 
         * <strong>example:</strong>
         * <p>deInvokeQueryVariable(376773)</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>The definition ID of the query variable. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>The description of the query variable.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄计算</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display type and grouping label.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_EXPRESSION</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>The display value of the calculation expression. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT  AVG( $source )\nFROM testCase\nWHERE  $age &gt; 0</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>The favorite flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>The detailed information of the field in the field pool. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>The field rank.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>The source of the field. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>The type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>The primary key ID of the query variable.</p>
         * 
         * <strong>example:</strong>
         * <p>3148</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>The required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Multiple input parameters separated by commas. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>The name of the query variable.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_qWtKgCox350f</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The outlier value.</p>
         * 
         * <strong>example:</strong>
         * <p>SYS_ERROR</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>The output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold outputThreshold;

        /**
         * <p>The parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_SOURCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The title of the query variable. The title of the query variable.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄计算</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The type of the query variable.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_EXPRESSION</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity variableVelocity;

        /**
         * <p>The X label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>The Y label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectQueryVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectQueryVariables self = new DescribeEventVariableListResponseBodyResultObjectQueryVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectQueryVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity extends TeaModel {
        /**
         * <p>iv value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectSelfVariables extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>deReadVelocity(hitRules,\&quot;dUd5ioJ8014\&quot;,1,\&quot;MO\&quot;,0,true,\&quot;SUM\&quot;)</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>Variable definition ID. Only returned for custom system variables.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>变量的描述信息</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_BIND</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Expression name.</p>
         * 
         * <strong>example:</strong>
         * <p>@IP地址</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Source of the field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3174</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Input parameters. Only returned when custom system variables are defined.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_isvspbF2c7ac</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Anomaly value. Returned when the variable is a custom variable (type= EXPRESSION).</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold outputThreshold;

        /**
         * <p>Parent node. This field is not returned currently.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>获取手机号前七位</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectSelfVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectSelfVariables self = new DescribeEventVariableListResponseBodyResultObjectSelfVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectSelfVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold extends TeaModel {
        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity extends TeaModel {
        /**
         * <p>iv value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectSysVariables extends TeaModel {
        /**
         * <p>Variable code.</p>
         * 
         * <strong>example:</strong>
         * <p>parseIpV2(ip)?.cityId</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>ID of the bound variable definition.</p>
         * 
         * <strong>example:</strong>
         * <p>2488</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>通过IP地址库解析IP所在的城市Code，例如，输入“42.120.74.211”，经过该变量运算，输出“330100”。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_BIND</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>Calculate the expression display value. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Favorite identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>Details of the field pool. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>Field sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Source of the field. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3151</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>Required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Variable value input.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Variable name.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>ipLocationCityCode</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Outlier value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold outputThreshold;

        /**
         * <p>Parent name.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>IP所在地_城市Code</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_BIND</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity variableVelocity;

        /**
         * <p>x label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>y label. This type of variable does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectSysVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectSysVariables self = new DescribeEventVariableListResponseBodyResultObjectSysVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectSysVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold extends TeaModel {
        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxValue")
        public Double maxValue;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minValue")
        public Double minValue;

        public static DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold self = new DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity extends TeaModel {
        /**
         * <p>The IV value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("iv")
        public String iv;

        public static DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity self = new DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity setIv(String iv) {
            this.iv = iv;
            return this;
        }
        public String getIv() {
            return this.iv;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObjectVelocityVariables extends TeaModel {
        /**
         * <p>The code of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>deReadVelocity(userId,\&quot;hFsEFUEe88a\&quot;,1,\&quot;H\&quot;,0,true,\&quot;COUNT\&quot;)</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Data distribution display, in JSON format. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("dataDisplay")
        public String dataDisplay;

        /**
         * <p>The definition ID of the variable. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>累计用户省份次数。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display type and grouping label.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_VELOCITY</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>The display value of the calculation expression. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>The favorite flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        /**
         * <p>The detailed information of the field in the field pool. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldDetail")
        public String fieldDetail;

        /**
         * <p>The field rank.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>The source of the field. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>The type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3148</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The input type of the parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputFieldType")
        public String inputFieldType;

        /**
         * <p>The required parameter. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputRequired")
        public String inputRequired;

        /**
         * <p>Multiple input parameters separated by commas. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>hFsEFUEe88a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The outlier value. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>The output value threshold.</p>
         */
        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold outputThreshold;

        /**
         * <p>The parent node. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("parentName")
        public String parentName;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF_SELF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The title of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>累计用户省份次数</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The type of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_VELOCITY</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The variable metric information. This field is not returned for this type of variable.</p>
         */
        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity variableVelocity;

        /**
         * <p>The X label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("xLabel")
        public String xLabel;

        /**
         * <p>The Y label. This field is not returned for this type of variable.</p>
         * 
         * <strong>example:</strong>
         * <p>This type does not have this field</p>
         */
        @NameInMap("yLabel")
        public String yLabel;

        public static DescribeEventVariableListResponseBodyResultObjectVelocityVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObjectVelocityVariables self = new DescribeEventVariableListResponseBodyResultObjectVelocityVariables();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setDataDisplay(String dataDisplay) {
            this.dataDisplay = dataDisplay;
            return this;
        }
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setFieldDetail(String fieldDetail) {
            this.fieldDetail = fieldDetail;
            return this;
        }
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setInputRequired(String inputRequired) {
            this.inputRequired = inputRequired;
            return this;
        }
        public String getInputRequired() {
            return this.inputRequired;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setOutputThreshold(DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }
        public String getParentName() {
            return this.parentName;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setVariableVelocity(DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity variableVelocity) {
            this.variableVelocity = variableVelocity;
            return this;
        }
        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setXLabel(String xLabel) {
            this.xLabel = xLabel;
            return this;
        }
        public String getXLabel() {
            return this.xLabel;
        }

        public DescribeEventVariableListResponseBodyResultObjectVelocityVariables setYLabel(String yLabel) {
            this.yLabel = yLabel;
            return this;
        }
        public String getYLabel() {
            return this.yLabel;
        }

    }

    public static class DescribeEventVariableListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Action variable.</p>
         */
        @NameInMap("actions")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectActions> actions;

        /**
         * <p>Device variable.</p>
         */
        @NameInMap("deviceVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectDeviceVariables> deviceVariables;

        /**
         * <p>Custom variable.</p>
         */
        @NameInMap("expressionVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectExpressionVariables> expressionVariables;

        /**
         * <p>Favorite variables.</p>
         */
        @NameInMap("favoriteVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectFavoriteVariables> favoriteVariables;

        /**
         * <p>Intermediate variable return object.</p>
         */
        @NameInMap("middleVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectMiddleVariables> middleVariables;

        /**
         * <p>An array of model variables.</p>
         */
        @NameInMap("modelVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectModelVariables> modelVariables;

        /**
         * <p>List of name variables.</p>
         */
        @NameInMap("nameList")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNameList> nameList;

        /**
         * <p>List of available functions for the original variable.</p>
         */
        @NameInMap("nativeVariableFunctions")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions> nativeVariableFunctions;

        /**
         * <p>List of event fields.</p>
         */
        @NameInMap("nativeVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariables> nativeVariables;

        /**
         * <p>An array of custom query variables.</p>
         */
        @NameInMap("queryVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectQueryVariables> queryVariables;

        /**
         * <p>Custom variables (custom variables, cumulative variables, custom system variables).</p>
         */
        @NameInMap("selfVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectSelfVariables> selfVariables;

        /**
         * <p>System variables.</p>
         */
        @NameInMap("sysVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectSysVariables> sysVariables;

        /**
         * <p>Other related variables.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("thirdVariables")
        public java.util.Map<String, ?> thirdVariables;

        /**
         * <p>An array of accumulated variables.</p>
         */
        @NameInMap("velocityVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectVelocityVariables> velocityVariables;

        public static DescribeEventVariableListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventVariableListResponseBodyResultObject self = new DescribeEventVariableListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventVariableListResponseBodyResultObject setActions(java.util.List<DescribeEventVariableListResponseBodyResultObjectActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectActions> getActions() {
            return this.actions;
        }

        public DescribeEventVariableListResponseBodyResultObject setDeviceVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectDeviceVariables> deviceVariables) {
            this.deviceVariables = deviceVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectDeviceVariables> getDeviceVariables() {
            return this.deviceVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setExpressionVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectExpressionVariables> expressionVariables) {
            this.expressionVariables = expressionVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectExpressionVariables> getExpressionVariables() {
            return this.expressionVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setFavoriteVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectFavoriteVariables> favoriteVariables) {
            this.favoriteVariables = favoriteVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectFavoriteVariables> getFavoriteVariables() {
            return this.favoriteVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setMiddleVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectMiddleVariables> middleVariables) {
            this.middleVariables = middleVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectMiddleVariables> getMiddleVariables() {
            return this.middleVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setModelVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectModelVariables> modelVariables) {
            this.modelVariables = modelVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectModelVariables> getModelVariables() {
            return this.modelVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setNameList(java.util.List<DescribeEventVariableListResponseBodyResultObjectNameList> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNameList> getNameList() {
            return this.nameList;
        }

        public DescribeEventVariableListResponseBodyResultObject setNativeVariableFunctions(java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions> nativeVariableFunctions) {
            this.nativeVariableFunctions = nativeVariableFunctions;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions> getNativeVariableFunctions() {
            return this.nativeVariableFunctions;
        }

        public DescribeEventVariableListResponseBodyResultObject setNativeVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariables> nativeVariables) {
            this.nativeVariables = nativeVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariables> getNativeVariables() {
            return this.nativeVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setQueryVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectQueryVariables> queryVariables) {
            this.queryVariables = queryVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectQueryVariables> getQueryVariables() {
            return this.queryVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setSelfVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectSelfVariables> selfVariables) {
            this.selfVariables = selfVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectSelfVariables> getSelfVariables() {
            return this.selfVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setSysVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectSysVariables> sysVariables) {
            this.sysVariables = sysVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectSysVariables> getSysVariables() {
            return this.sysVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setThirdVariables(java.util.Map<String, ?> thirdVariables) {
            this.thirdVariables = thirdVariables;
            return this;
        }
        public java.util.Map<String, ?> getThirdVariables() {
            return this.thirdVariables;
        }

        public DescribeEventVariableListResponseBodyResultObject setVelocityVariables(java.util.List<DescribeEventVariableListResponseBodyResultObjectVelocityVariables> velocityVariables) {
            this.velocityVariables = velocityVariables;
            return this;
        }
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectVelocityVariables> getVelocityVariables() {
            return this.velocityVariables;
        }

    }

}
