// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeInitDigResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public DescribeInitDigResponseBodyResultObject resultObject;

    public static DescribeInitDigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitDigResponseBody self = new DescribeInitDigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInitDigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInitDigResponseBody setResultObject(DescribeInitDigResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeInitDigResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeInitDigResponseBodyResultObject extends TeaModel {
        /**
         * <p>Prompt information</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云内部测试</p>
         */
        @NameInMap("TipInfo")
        public String tipInfo;

        public static DescribeInitDigResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitDigResponseBodyResultObject self = new DescribeInitDigResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeInitDigResponseBodyResultObject setTipInfo(String tipInfo) {
            this.tipInfo = tipInfo;
            return this;
        }
        public String getTipInfo() {
            return this.tipInfo;
        }

    }

}
