// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllRootVariableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeAllRootVariableResponseBodyResultObject> resultObject;

    public static DescribeAllRootVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRootVariableResponseBody self = new DescribeAllRootVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllRootVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllRootVariableResponseBody setResultObject(java.util.List<DescribeAllRootVariableResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAllRootVariableResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAllRootVariableResponseBodyResultObjectOutputThreshold extends TeaModel {
        @NameInMap("maxValue")
        public Double maxValue;

        @NameInMap("minValue")
        public Double minValue;

        public static DescribeAllRootVariableResponseBodyResultObjectOutputThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllRootVariableResponseBodyResultObjectOutputThreshold self = new DescribeAllRootVariableResponseBodyResultObjectOutputThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeAllRootVariableResponseBodyResultObjectOutputThreshold setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public DescribeAllRootVariableResponseBodyResultObjectOutputThreshold setMinValue(Double minValue) {
            this.minValue = minValue;
            return this;
        }
        public Double getMinValue() {
            return this.minValue;
        }

    }

    public static class DescribeAllRootVariableResponseBodyResultObject extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("description")
        public String description;

        @NameInMap("displayType")
        public String displayType;

        @NameInMap("favoriteFlag")
        public Boolean favoriteFlag;

        @NameInMap("fieldRank")
        public Long fieldRank;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("id")
        public Long id;

        @NameInMap("inputFieldType")
        public String inputFieldType;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("name")
        public String name;

        @NameInMap("outputThreshold")
        public DescribeAllRootVariableResponseBodyResultObjectOutputThreshold outputThreshold;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        public static DescribeAllRootVariableResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllRootVariableResponseBodyResultObject self = new DescribeAllRootVariableResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAllRootVariableResponseBodyResultObject setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAllRootVariableResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAllRootVariableResponseBodyResultObject setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeAllRootVariableResponseBodyResultObject setFavoriteFlag(Boolean favoriteFlag) {
            this.favoriteFlag = favoriteFlag;
            return this;
        }
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        public DescribeAllRootVariableResponseBodyResultObject setFieldRank(Long fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Long getFieldRank() {
            return this.fieldRank;
        }

        public DescribeAllRootVariableResponseBodyResultObject setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeAllRootVariableResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAllRootVariableResponseBodyResultObject setInputFieldType(String inputFieldType) {
            this.inputFieldType = inputFieldType;
            return this;
        }
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        public DescribeAllRootVariableResponseBodyResultObject setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeAllRootVariableResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAllRootVariableResponseBodyResultObject setOutputThreshold(DescribeAllRootVariableResponseBodyResultObjectOutputThreshold outputThreshold) {
            this.outputThreshold = outputThreshold;
            return this;
        }
        public DescribeAllRootVariableResponseBodyResultObjectOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        public DescribeAllRootVariableResponseBodyResultObject setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeAllRootVariableResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeAllRootVariableResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
