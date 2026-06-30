// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionResponseBody extends TeaModel {
    /**
     * <p>Result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. Use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>Error details if the request failed. Returns <strong>successful</strong> if the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public RevertAssignedSessionResponseBodyMessages messages;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>82C91484-B2D5-4D2A-A21F-A6D73F4D55C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Set to true for success. Set to false or null for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RevertAssignedSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionResponseBody self = new RevertAssignedSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevertAssignedSessionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RevertAssignedSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevertAssignedSessionResponseBody setMessages(RevertAssignedSessionResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public RevertAssignedSessionResponseBodyMessages getMessages() {
        return this.messages;
    }

    public RevertAssignedSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevertAssignedSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RevertAssignedSessionResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static RevertAssignedSessionResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            RevertAssignedSessionResponseBodyMessages self = new RevertAssignedSessionResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public RevertAssignedSessionResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
