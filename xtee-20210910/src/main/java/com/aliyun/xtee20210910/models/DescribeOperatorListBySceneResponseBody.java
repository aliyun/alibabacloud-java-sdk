// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListBySceneResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeOperatorListBySceneResponseBodyResultObject> resultObject;

    public static DescribeOperatorListBySceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListBySceneResponseBody self = new DescribeOperatorListBySceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListBySceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperatorListBySceneResponseBody setResultObject(java.util.List<DescribeOperatorListBySceneResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeOperatorListBySceneResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables extends TeaModel {
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("fieldValue")
        public String fieldValue;

        public static DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables self = new DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class DescribeOperatorListBySceneResponseBodyResultObjectOperators extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("hasRightVariable")
        public Boolean hasRightVariable;

        @NameInMap("memo")
        public String memo;

        @NameInMap("name")
        public String name;

        @NameInMap("rightVariables")
        public java.util.List<DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables> rightVariables;

        public static DescribeOperatorListBySceneResponseBodyResultObjectOperators build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListBySceneResponseBodyResultObjectOperators self = new DescribeOperatorListBySceneResponseBodyResultObjectOperators();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperators setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperators setHasRightVariable(Boolean hasRightVariable) {
            this.hasRightVariable = hasRightVariable;
            return this;
        }
        public Boolean getHasRightVariable() {
            return this.hasRightVariable;
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperators setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOperatorListBySceneResponseBodyResultObjectOperators setRightVariables(java.util.List<DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables> rightVariables) {
            this.rightVariables = rightVariables;
            return this;
        }
        public java.util.List<DescribeOperatorListBySceneResponseBodyResultObjectOperatorsRightVariables> getRightVariables() {
            return this.rightVariables;
        }

    }

    public static class DescribeOperatorListBySceneResponseBodyResultObject extends TeaModel {
        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("operators")
        public java.util.List<DescribeOperatorListBySceneResponseBodyResultObjectOperators> operators;

        public static DescribeOperatorListBySceneResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListBySceneResponseBodyResultObject self = new DescribeOperatorListBySceneResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListBySceneResponseBodyResultObject setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeOperatorListBySceneResponseBodyResultObject setOperators(java.util.List<DescribeOperatorListBySceneResponseBodyResultObjectOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<DescribeOperatorListBySceneResponseBodyResultObjectOperators> getOperators() {
            return this.operators;
        }

    }

}
