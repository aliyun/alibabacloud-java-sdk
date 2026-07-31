// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    @NameInMap("messages")
    public java.util.List<ChatRequestMessages> messages;

    @NameInMap("sessionId")
    public String sessionId;

    public static ChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatRequest self = new ChatRequest();
        return TeaModel.build(map, self);
    }

    public ChatRequest setMessages(java.util.List<ChatRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ChatRequestMessages> getMessages() {
        return this.messages;
    }

    public ChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class ChatRequestMessages extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("role")
        public String role;

        public static ChatRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestMessages self = new ChatRequestMessages();
            return TeaModel.build(map, self);
        }

        public ChatRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
