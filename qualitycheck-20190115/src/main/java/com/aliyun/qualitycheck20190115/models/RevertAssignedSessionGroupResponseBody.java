// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public RevertAssignedSessionGroupResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

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
