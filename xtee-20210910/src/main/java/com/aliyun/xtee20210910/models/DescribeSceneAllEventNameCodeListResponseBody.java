// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneAllEventNameCodeListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeSceneAllEventNameCodeListResponseBodyResultObject> resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DescribeSceneAllEventNameCodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneAllEventNameCodeListResponseBody self = new DescribeSceneAllEventNameCodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneAllEventNameCodeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSceneAllEventNameCodeListResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSceneAllEventNameCodeListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSceneAllEventNameCodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneAllEventNameCodeListResponseBody setResultObject(java.util.List<DescribeSceneAllEventNameCodeListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSceneAllEventNameCodeListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSceneAllEventNameCodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <strong>example:</strong>
         * <p>de_aamexg3015</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>BYPASS</p>
         */
        @NameInMap("eventType")
        public String eventType;

        public static DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren self = new DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren();
            return TeaModel.build(map, self);
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class DescribeSceneAllEventNameCodeListResponseBodyResultObject extends TeaModel {
        @NameInMap("children")
        public java.util.List<DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren> children;

        /**
         * <strong>example:</strong>
         * <p>MORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("eventType")
        public String eventType;

        public static DescribeSceneAllEventNameCodeListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneAllEventNameCodeListResponseBodyResultObject self = new DescribeSceneAllEventNameCodeListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObject setChildren(java.util.List<DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<DescribeSceneAllEventNameCodeListResponseBodyResultObjectChildren> getChildren() {
            return this.children;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObject setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSceneAllEventNameCodeListResponseBodyResultObject setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

}
