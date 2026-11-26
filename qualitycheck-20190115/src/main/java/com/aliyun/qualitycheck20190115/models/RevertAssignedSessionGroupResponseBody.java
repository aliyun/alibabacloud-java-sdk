// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionGroupResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success, whereas any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. If an error occurs, this field returns the error details. If the request is successful, this field returns &quot;successful&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public RevertAssignedSessionGroupResponseBodyMessages messages;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. You can use this field to determine whether the request is successful:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false/null</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RevertAssignedSessionGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionGroupResponseBody self = new RevertAssignedSessionGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevertAssignedSessionGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RevertAssignedSessionGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevertAssignedSessionGroupResponseBody setMessages(RevertAssignedSessionGroupResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public RevertAssignedSessionGroupResponseBodyMessages getMessages() {
        return this.messages;
    }

    public RevertAssignedSessionGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevertAssignedSessionGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RevertAssignedSessionGroupResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static RevertAssignedSessionGroupResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            RevertAssignedSessionGroupResponseBodyMessages self = new RevertAssignedSessionGroupResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public RevertAssignedSessionGroupResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
