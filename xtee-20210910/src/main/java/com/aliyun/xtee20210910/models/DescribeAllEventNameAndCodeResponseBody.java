// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllEventNameAndCodeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeAllEventNameAndCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEventNameAndCodeResponseBody self = new DescribeAllEventNameAndCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllEventNameAndCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAllEventNameAndCodeResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAllEventNameAndCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAllEventNameAndCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllEventNameAndCodeResponseBody setResultObject(java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeAllEventNameAndCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAllEventNameAndCodeResponseBodyResultObjectChildren extends TeaModel {
        @NameInMap("createType")
        public String createType;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("eventType")
        public String eventType;

        public static DescribeAllEventNameAndCodeResponseBodyResultObjectChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllEventNameAndCodeResponseBodyResultObjectChildren self = new DescribeAllEventNameAndCodeResponseBodyResultObjectChildren();
            return TeaModel.build(map, self);
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObjectChildren setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObjectChildren setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObjectChildren setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObjectChildren setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class DescribeAllEventNameAndCodeResponseBodyResultObject extends TeaModel {
        @NameInMap("children")
        public java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObjectChildren> children;

        @NameInMap("createType")
        public String createType;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("eventType")
        public String eventType;

        public static DescribeAllEventNameAndCodeResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllEventNameAndCodeResponseBodyResultObject self = new DescribeAllEventNameAndCodeResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObject setChildren(java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObjectChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObjectChildren> getChildren() {
            return this.children;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObject setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAllEventNameAndCodeResponseBodyResultObject setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

}
