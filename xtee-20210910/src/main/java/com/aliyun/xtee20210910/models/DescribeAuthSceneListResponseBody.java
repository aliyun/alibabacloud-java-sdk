// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthSceneListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAuthSceneListResponseBodyResultObject> resultObject;

    public static DescribeAuthSceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthSceneListResponseBody self = new DescribeAuthSceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthSceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthSceneListResponseBody setResultObject(java.util.List<DescribeAuthSceneListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAuthSceneListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAuthSceneListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Service code</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse</p>
         */
        @NameInMap("serviceCode")
        public String serviceCode;

        public static DescribeAuthSceneListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthSceneListResponseBodyResultObject self = new DescribeAuthSceneListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAuthSceneListResponseBodyResultObject setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

    }

}
