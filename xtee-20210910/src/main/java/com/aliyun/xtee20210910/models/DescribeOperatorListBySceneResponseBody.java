// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListBySceneResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
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
