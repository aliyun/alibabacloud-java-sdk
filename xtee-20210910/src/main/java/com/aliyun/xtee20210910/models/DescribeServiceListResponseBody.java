// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceListResponseBody extends TeaModel {
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
    public java.util.List<DescribeServiceListResponseBodyResultObject> resultObject;

    public static DescribeServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceListResponseBody self = new DescribeServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceListResponseBody setResultObject(java.util.List<DescribeServiceListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeServiceListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeServiceListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Service code</p>
         * 
         * <strong>example:</strong>
         * <p>coupon_abuse_detection</p>
         */
        @NameInMap("serviceCode")
        public String serviceCode;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>coupon_abuse_detection</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        public static DescribeServiceListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceListResponseBodyResultObject self = new DescribeServiceListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeServiceListResponseBodyResultObject setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public DescribeServiceListResponseBodyResultObject setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
