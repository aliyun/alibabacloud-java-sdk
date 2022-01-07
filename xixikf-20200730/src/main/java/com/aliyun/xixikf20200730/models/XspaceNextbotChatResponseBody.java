// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotChatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public XspaceNextbotChatResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static XspaceNextbotChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotChatResponseBody self = new XspaceNextbotChatResponseBody();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public XspaceNextbotChatResponseBody setData(XspaceNextbotChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public XspaceNextbotChatResponseBodyData getData() {
        return this.data;
    }

    public XspaceNextbotChatResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public XspaceNextbotChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public XspaceNextbotChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public XspaceNextbotChatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class XspaceNextbotChatResponseBodyData extends TeaModel {
        @NameInMap("message")
        public String message;

        @NameInMap("messageId")
        public String messageId;

        @NameInMap("requestId")
        public String requestId;

        @NameInMap("sessionId")
        public String sessionId;

        public static XspaceNextbotChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            XspaceNextbotChatResponseBodyData self = new XspaceNextbotChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public XspaceNextbotChatResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public XspaceNextbotChatResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public XspaceNextbotChatResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public XspaceNextbotChatResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
