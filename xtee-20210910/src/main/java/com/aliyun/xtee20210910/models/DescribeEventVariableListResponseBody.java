// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectActionsOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectActionsVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectDeviceVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectExpressionVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectFavoriteVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectMiddleVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectModelVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectModelVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectNameListOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectNameListVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctionsVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectNativeVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectQueryVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectSelfVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectSysVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectSysVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("maxValue")
        public Double maxValue;

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
        @NameInMap("code")
        public String code;

        @NameInMap("dataDisplay")
        public String dataDisplay;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldDetail")
        public String fieldDetail;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputRequired")
        public String inputRequired;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputThreshold")
        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesOutputThreshold outputThreshold;

        @NameInMap("parentName")
        public String parentName;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("variableVelocity")
        public DescribeEventVariableListResponseBodyResultObjectVelocityVariablesVariableVelocity variableVelocity;

        @NameInMap("xLabel")
        public String xLabel;

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
        @NameInMap("actions")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectActions> actions;

        @NameInMap("deviceVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectDeviceVariables> deviceVariables;

        @NameInMap("expressionVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectExpressionVariables> expressionVariables;

        @NameInMap("favoriteVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectFavoriteVariables> favoriteVariables;

        @NameInMap("middleVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectMiddleVariables> middleVariables;

        @NameInMap("modelVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectModelVariables> modelVariables;

        @NameInMap("nameList")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNameList> nameList;

        @NameInMap("nativeVariableFunctions")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariableFunctions> nativeVariableFunctions;

        @NameInMap("nativeVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectNativeVariables> nativeVariables;

        @NameInMap("queryVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectQueryVariables> queryVariables;

        @NameInMap("selfVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectSelfVariables> selfVariables;

        @NameInMap("sysVariables")
        public java.util.List<DescribeEventVariableListResponseBodyResultObjectSysVariables> sysVariables;

        @NameInMap("thirdVariables")
        public java.util.Map<String, ?> thirdVariables;

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
