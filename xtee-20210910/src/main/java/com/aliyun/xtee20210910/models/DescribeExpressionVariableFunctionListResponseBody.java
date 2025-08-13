// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableFunctionListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6E8817D5-5354-5953-84B1-D98379F036DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeExpressionVariableFunctionListResponseBodyResultObject> resultObject;

    public static DescribeExpressionVariableFunctionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableFunctionListResponseBody self = new DescribeExpressionVariableFunctionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableFunctionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressionVariableFunctionListResponseBody setResultObject(java.util.List<DescribeExpressionVariableFunctionListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeExpressionVariableFunctionListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeExpressionVariableFunctionListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Function name</p>
         * 
         * <strong>example:</strong>
         * <p>concat</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Maximum number of parameters</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("maxParamSize")
        public Long maxParamSize;

        /**
         * <p>Minimum number of parameters</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minParamSize")
        public Long minParamSize;

        /**
         * <p>Parameter types</p>
         * 
         * <strong>example:</strong>
         * <p>*STRING</p>
         */
        @NameInMap("paramTypes")
        public String paramTypes;

        /**
         * <p>Whether it is directly invoked</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("redirect")
        public Boolean redirect;

        /**
         * <p>Method return types</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("returnTypes")
        public String returnTypes;

        /**
         * <p>Function value</p>
         * 
         * <strong>example:</strong>
         * <p>concat</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeExpressionVariableFunctionListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressionVariableFunctionListResponseBodyResultObject self = new DescribeExpressionVariableFunctionListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setMaxParamSize(Long maxParamSize) {
            this.maxParamSize = maxParamSize;
            return this;
        }
        public Long getMaxParamSize() {
            return this.maxParamSize;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setMinParamSize(Long minParamSize) {
            this.minParamSize = minParamSize;
            return this;
        }
        public Long getMinParamSize() {
            return this.minParamSize;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setParamTypes(String paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public String getParamTypes() {
            return this.paramTypes;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setRedirect(Boolean redirect) {
            this.redirect = redirect;
            return this;
        }
        public Boolean getRedirect() {
            return this.redirect;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setReturnTypes(String returnTypes) {
            this.returnTypes = returnTypes;
            return this;
        }
        public String getReturnTypes() {
            return this.returnTypes;
        }

        public DescribeExpressionVariableFunctionListResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
