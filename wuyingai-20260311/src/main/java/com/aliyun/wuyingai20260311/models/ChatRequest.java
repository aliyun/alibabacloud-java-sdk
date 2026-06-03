// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Bearer%20eyJhb****...****k</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    /**
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Role&quot;:&quot;user&quot;,&quot;Content&quot;:[{&quot;Type&quot;:&quot;text&quot;,&quot;Text&quot;:&quot;你好&quot;}]}]</p>
     */
    @NameInMap("Input")
    public java.util.List<ChatRequestInput> input;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("RoutingKey")
    public String routingKey;

    /**
     * <strong>example:</strong>
     * <p>test-session-001</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;OutputFileMode&quot;: &quot;url&quot;}</p>
     */
    @NameInMap("Settings")
    public ChatRequestSettings settings;

    /**
     * <strong>example:</strong>
     * <p>{&quot;IncludeReasoning&quot;: false, &quot;IncludeToolCalls&quot;: false}</p>
     */
    @NameInMap("StreamOptions")
    public ChatRequestStreamOptions streamOptions;

    /**
     * <strong>example:</strong>
     * <p>template-abc123</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static ChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatRequest self = new ChatRequest();
        return TeaModel.build(map, self);
    }

    public ChatRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public ChatRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ChatRequest setInput(java.util.List<ChatRequestInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<ChatRequestInput> getInput() {
        return this.input;
    }

    public ChatRequest setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }
    public String getRoutingKey() {
        return this.routingKey;
    }

    public ChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatRequest setSettings(ChatRequestSettings settings) {
        this.settings = settings;
        return this;
    }
    public ChatRequestSettings getSettings() {
        return this.settings;
    }

    public ChatRequest setStreamOptions(ChatRequestStreamOptions streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }
    public ChatRequestStreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    public ChatRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class ChatRequestInputContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>report.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>/workspace/report.pdf</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/img.jpg">https://example.com/img.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>帮我分析这张图片</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static ChatRequestInputContent build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestInputContent self = new ChatRequestInputContent();
            return TeaModel.build(map, self);
        }

        public ChatRequestInputContent setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ChatRequestInputContent setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ChatRequestInputContent setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ChatRequestInputContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ChatRequestInputContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatRequestInput extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ChatRequestInputContent> content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        public static ChatRequestInput build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestInput self = new ChatRequestInput();
            return TeaModel.build(map, self);
        }

        public ChatRequestInput setContent(java.util.List<ChatRequestInputContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ChatRequestInputContent> getContent() {
            return this.content;
        }

        public ChatRequestInput setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ChatRequestSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>base64</p>
         */
        @NameInMap("OutputFileMode")
        public String outputFileMode;

        public static ChatRequestSettings build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestSettings self = new ChatRequestSettings();
            return TeaModel.build(map, self);
        }

        public ChatRequestSettings setOutputFileMode(String outputFileMode) {
            this.outputFileMode = outputFileMode;
            return this;
        }
        public String getOutputFileMode() {
            return this.outputFileMode;
        }

    }

    public static class ChatRequestStreamOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncludeReasoning")
        public Boolean includeReasoning;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncludeToolCalls")
        public Boolean includeToolCalls;

        public static ChatRequestStreamOptions build(java.util.Map<String, ?> map) throws Exception {
            ChatRequestStreamOptions self = new ChatRequestStreamOptions();
            return TeaModel.build(map, self);
        }

        public ChatRequestStreamOptions setIncludeReasoning(Boolean includeReasoning) {
            this.includeReasoning = includeReasoning;
            return this;
        }
        public Boolean getIncludeReasoning() {
            return this.includeReasoning;
        }

        public ChatRequestStreamOptions setIncludeToolCalls(Boolean includeToolCalls) {
            this.includeToolCalls = includeToolCalls;
            return this;
        }
        public Boolean getIncludeToolCalls() {
            return this.includeToolCalls;
        }

    }

}
