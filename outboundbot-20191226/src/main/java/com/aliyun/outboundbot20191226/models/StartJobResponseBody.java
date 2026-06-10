// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class StartJobResponseBody extends TeaModel {
    /**
     * <p>List of call IDs</p>
     */
    @NameInMap("CallIds")
    public java.util.List<StartJobResponseBodyCallIds> callIds;

    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8a621aa1-d2e7-43f3-b54d-8830af73c468</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded. true means success. false means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Mapping between third-party contact IDs and outbound call task IDs</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<StartJobResponseBodyTaskIds> taskIds;

    public static StartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartJobResponseBody self = new StartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartJobResponseBody setCallIds(java.util.List<StartJobResponseBodyCallIds> callIds) {
        this.callIds = callIds;
        return this;
    }
    public java.util.List<StartJobResponseBodyCallIds> getCallIds() {
        return this.callIds;
    }

    public StartJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartJobResponseBody setTaskIds(java.util.List<StartJobResponseBodyTaskIds> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<StartJobResponseBodyTaskIds> getTaskIds() {
        return this.taskIds;
    }

    public static class StartJobResponseBodyCallIds extends TeaModel {
        /**
         * <p>Third-party contact ID</p>
         * 
         * <strong>example:</strong>
         * <p>c93cdd1c-f9b5-4758-be43-7a237a7eaa1d</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Call ID for the task</p>
         * 
         * <strong>example:</strong>
         * <p>62229628-45d8-41bd-a80f-6e4c0a39f79b</p>
         */
        @NameInMap("Value")
        public String value;

        public static StartJobResponseBodyCallIds build(java.util.Map<String, ?> map) throws Exception {
            StartJobResponseBodyCallIds self = new StartJobResponseBodyCallIds();
            return TeaModel.build(map, self);
        }

        public StartJobResponseBodyCallIds setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartJobResponseBodyCallIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class StartJobResponseBodyTaskIds extends TeaModel {
        /**
         * <p>Third-party contact ID</p>
         * 
         * <strong>example:</strong>
         * <p>c93cdd1c-f9b5-4758-be43-7a237a7eaa1d</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Outbound call task ID</p>
         * 
         * <strong>example:</strong>
         * <p>62229628-45d8-41bd-a80f-6e4c0a39f79b</p>
         */
        @NameInMap("Value")
        public String value;

        public static StartJobResponseBodyTaskIds build(java.util.Map<String, ?> map) throws Exception {
            StartJobResponseBodyTaskIds self = new StartJobResponseBodyTaskIds();
            return TeaModel.build(map, self);
        }

        public StartJobResponseBodyTaskIds setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartJobResponseBodyTaskIds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
