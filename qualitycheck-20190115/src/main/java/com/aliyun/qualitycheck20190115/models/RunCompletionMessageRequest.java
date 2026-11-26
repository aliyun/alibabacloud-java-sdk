// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RunCompletionMessageRequest extends TeaModel {
    /**
     * <p>The list of messages in the model request.</p>
     */
    @NameInMap("Messages")
    public java.util.List<RunCompletionMessageRequestMessages> messages;

    /**
     * <p>The model specification. Valid values: TYXM_PLUS and TYXM_TURBO.</p>
     * 
     * <strong>example:</strong>
     * <p>TYXM_PLUS</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>Specifies whether to enable Server-Sent Events (SSE) responses. Default value: false.</p>
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
         * <p>The prompt content.</p>
         * 
         * <strong>example:</strong>
         * <p>Summarize the conversation in 50 words</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The conversation role. Valid values: user (customer), assistant (customer service representative), system (system message), and function (function).</p>
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
