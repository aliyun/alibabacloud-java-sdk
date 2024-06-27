// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeAllDataSourceResponseBodyResultObject> resultObject;

    public static DescribeAllDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourceResponseBody self = new DescribeAllDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllDataSourceResponseBody setResultObject(java.util.List<DescribeAllDataSourceResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAllDataSourceResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAllDataSourceResponseBodyResultObject extends TeaModel {
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("id")
        public Long id;

        public static DescribeAllDataSourceResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyResultObject self = new DescribeAllDataSourceResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeAllDataSourceResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAllDataSourceResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
