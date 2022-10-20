// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public RevertAssignedSessionResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

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
