// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeParamByEventCodesResponseBody extends TeaModel {
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
    public java.util.List<DescribeParamByEventCodesResponseBodyResultObject> resultObject;

    public static DescribeParamByEventCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParamByEventCodesResponseBody self = new DescribeParamByEventCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParamByEventCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParamByEventCodesResponseBody setResultObject(java.util.List<DescribeParamByEventCodesResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeParamByEventCodesResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeParamByEventCodesResponseBodyResultObject extends TeaModel {
        /**
         * <p>Return code.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Name</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeParamByEventCodesResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeParamByEventCodesResponseBodyResultObject self = new DescribeParamByEventCodesResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeParamByEventCodesResponseBodyResultObject setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeParamByEventCodesResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
