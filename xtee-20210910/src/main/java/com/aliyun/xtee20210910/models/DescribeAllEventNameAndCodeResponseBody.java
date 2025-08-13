// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllEventNameAndCodeResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObject> resultObject;

    /**
     * <p>Whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aamexg3015</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险旁路</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Event type</p>
         * 
         * <strong>example:</strong>
         * <p>BYPASS</p>
         */
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
        /**
         * <p>List of child fields.</p>
         */
        @NameInMap("children")
        public java.util.List<DescribeAllEventNameAndCodeResponseBodyResultObjectChildren> children;

        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>MORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Event type</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
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
