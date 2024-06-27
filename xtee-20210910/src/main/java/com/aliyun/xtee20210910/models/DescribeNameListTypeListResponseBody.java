// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListTypeListResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeNameListTypeListResponseBodyResultObject> resultObject;

    public static DescribeNameListTypeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListTypeListResponseBody self = new DescribeNameListTypeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListTypeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListTypeListResponseBody setResultObject(java.util.List<DescribeNameListTypeListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeNameListTypeListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeNameListTypeListResponseBodyResultObject extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static DescribeNameListTypeListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListTypeListResponseBodyResultObject self = new DescribeNameListTypeListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListTypeListResponseBodyResultObject setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNameListTypeListResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
