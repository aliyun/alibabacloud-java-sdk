// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableFunctionListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("description")
        public String description;

        @NameInMap("key")
        public String key;

        @NameInMap("maxParamSize")
        public Long maxParamSize;

        @NameInMap("minParamSize")
        public Long minParamSize;

        @NameInMap("paramTypes")
        public String paramTypes;

        @NameInMap("redirect")
        public Boolean redirect;

        @NameInMap("returnTypes")
        public String returnTypes;

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
