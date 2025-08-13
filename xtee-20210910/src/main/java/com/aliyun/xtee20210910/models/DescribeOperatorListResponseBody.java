// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
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
        /**
         * <p>Field name.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>INT</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Field value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
        /**
         * <p>Operator code</p>
         * 
         * <strong>example:</strong>
         * <p>equals</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Whether it contains a right variable</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasRightVariable")
        public Boolean hasRightVariable;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>等于</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Operator name</p>
         * 
         * <strong>example:</strong>
         * <p>等于</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Right variable object</p>
         */
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
        /**
         * <p>Return value type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Operator list</p>
         */
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
