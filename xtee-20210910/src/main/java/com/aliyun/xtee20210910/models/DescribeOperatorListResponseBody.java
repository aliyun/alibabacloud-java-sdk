// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeOperatorListResponseBodyResultObject> resultObject;

    public static DescribeOperatorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListResponseBody self = new DescribeOperatorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperatorListResponseBody setResultObject(java.util.List<DescribeOperatorListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeOperatorListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables extends TeaModel {
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("fieldValue")
        public String fieldValue;

        public static DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables self = new DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class DescribeOperatorListResponseBodyResultObjectOperators extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("hasRightVariable")
        public Boolean hasRightVariable;

        @NameInMap("memo")
        public String memo;

        @NameInMap("name")
        public String name;

        @NameInMap("rightVariables")
        public java.util.List<DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables> rightVariables;

        public static DescribeOperatorListResponseBodyResultObjectOperators build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListResponseBodyResultObjectOperators self = new DescribeOperatorListResponseBodyResultObjectOperators();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListResponseBodyResultObjectOperators setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOperatorListResponseBodyResultObjectOperators setHasRightVariable(Boolean hasRightVariable) {
            this.hasRightVariable = hasRightVariable;
            return this;
        }
        public Boolean getHasRightVariable() {
            return this.hasRightVariable;
        }

        public DescribeOperatorListResponseBodyResultObjectOperators setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeOperatorListResponseBodyResultObjectOperators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOperatorListResponseBodyResultObjectOperators setRightVariables(java.util.List<DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables> rightVariables) {
            this.rightVariables = rightVariables;
            return this;
        }
        public java.util.List<DescribeOperatorListResponseBodyResultObjectOperatorsRightVariables> getRightVariables() {
            return this.rightVariables;
        }

    }

    public static class DescribeOperatorListResponseBodyResultObject extends TeaModel {
        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("operators")
        public java.util.List<DescribeOperatorListResponseBodyResultObjectOperators> operators;

        public static DescribeOperatorListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListResponseBodyResultObject self = new DescribeOperatorListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListResponseBodyResultObject setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeOperatorListResponseBodyResultObject setOperators(java.util.List<DescribeOperatorListResponseBodyResultObjectOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<DescribeOperatorListResponseBodyResultObjectOperators> getOperators() {
            return this.operators;
        }

    }

}
