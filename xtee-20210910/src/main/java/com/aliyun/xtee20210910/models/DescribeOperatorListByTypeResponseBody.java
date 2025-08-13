// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListByTypeResponseBody extends TeaModel {
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
    public java.util.List<DescribeOperatorListByTypeResponseBodyResultObject> resultObject;

    public static DescribeOperatorListByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListByTypeResponseBody self = new DescribeOperatorListByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperatorListByTypeResponseBody setResultObject(java.util.List<DescribeOperatorListByTypeResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeOperatorListByTypeResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeOperatorListByTypeResponseBodyResultObjectOperators extends TeaModel {
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
         * <p>Operator name</p>
         * 
         * <strong>example:</strong>
         * <p>等于</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeOperatorListByTypeResponseBodyResultObjectOperators build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListByTypeResponseBodyResultObjectOperators self = new DescribeOperatorListByTypeResponseBodyResultObjectOperators();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListByTypeResponseBodyResultObjectOperators setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOperatorListByTypeResponseBodyResultObjectOperators setHasRightVariable(Boolean hasRightVariable) {
            this.hasRightVariable = hasRightVariable;
            return this;
        }
        public Boolean getHasRightVariable() {
            return this.hasRightVariable;
        }

        public DescribeOperatorListByTypeResponseBodyResultObjectOperators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOperatorListByTypeResponseBodyResultObject extends TeaModel {
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
        public java.util.List<DescribeOperatorListByTypeResponseBodyResultObjectOperators> operators;

        public static DescribeOperatorListByTypeResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorListByTypeResponseBodyResultObject self = new DescribeOperatorListByTypeResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorListByTypeResponseBodyResultObject setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeOperatorListByTypeResponseBodyResultObject setOperators(java.util.List<DescribeOperatorListByTypeResponseBodyResultObjectOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<DescribeOperatorListByTypeResponseBodyResultObjectOperators> getOperators() {
            return this.operators;
        }

    }

}
