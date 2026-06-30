// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RunCompletionMessageRequest extends TeaModel {
    /**
     * <p>A list of messages that form the conversation history and the current prompt.</p>
     */
    @NameInMap("Messages")
    public java.util.List<RunCompletionMessageRequestMessages> messages;

    /**
     * <p>The model specification to use. Valid values: <code>TYXM_PLUS</code> and <code>TYXM_TURBO</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TYXM_PLUS</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>Specifies whether to stream the response using Server-Sent Events (SSE). If <code>true</code>, the response is streamed. Defaults to <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    public static RunCompletionMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionMessageRequest self = new RunCompletionMessageRequest();
        return TeaModel.build(map, self);
    }

    public RunCompletionMessageRequest setMessages(java.util.List<RunCompletionMessageRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<RunCompletionMessageRequestMessages> getMessages() {
        return this.messages;
    }

    public RunCompletionMessageRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public RunCompletionMessageRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class RunCompletionMessageRequestMessages extends TeaModel {
        /**
         * <p>The content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>请用50字总结一下对话</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the message sender. Valid values: <code>user</code>, <code>agent</code>, <code>system</code>, and <code>function</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        public static RunCompletionMessageRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionMessageRequestMessages self = new RunCompletionMessageRequestMessages();
            return TeaModel.build(map, self);
        }

        public RunCompletionMessageRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunCompletionMessageRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
