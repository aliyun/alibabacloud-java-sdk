// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("serviceCode")
        public String serviceCode;

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
