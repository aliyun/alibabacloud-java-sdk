// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiNameListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeApiNameListResponseBodyResultObject> resultObject;

    public static DescribeApiNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiNameListResponseBody self = new DescribeApiNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiNameListResponseBody setResultObject(java.util.List<DescribeApiNameListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeApiNameListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeApiNameListResponseBodyResultObject extends TeaModel {
        @NameInMap("apiId")
        public String apiId;

        @NameInMap("apiName")
        public String apiName;

        public static DescribeApiNameListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiNameListResponseBodyResultObject self = new DescribeApiNameListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeApiNameListResponseBodyResultObject setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApiNameListResponseBodyResultObject setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

    }

}
