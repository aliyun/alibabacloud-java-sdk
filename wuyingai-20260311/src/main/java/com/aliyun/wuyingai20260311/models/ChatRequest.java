// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    /**
     * <p>Bearer + JWT returned by GetAccessToken. URL-encode the entire string and pass it as a query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer%20eyJhb****...****k</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    /**
     * <p>The user ID from the external system.</p>
     * 
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The message list (JSON string), sorted in chronological order.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Role&quot;:&quot;user&quot;,&quot;Content&quot;:[{&quot;Type&quot;:&quot;text&quot;,&quot;Text&quot;:&quot;你好&quot;}]}]</p>
     */
    @NameInMap("Input")
    public java.util.List<ChatRequestInput> input;

    @NameInMap("Model")
    public String model;

    @NameInMap("Resume")
    public Boolean resume;

    /**
     * <p>The routing key that specifies the backend instance to process the request.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("RoutingKey")
    public String routingKey;

    /**
     * <p>The session ID for multi-turn conversation context persistence.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session-001</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The additional settings. Contains the output file mode control parameter OutputFileMode (string, valid values: url or base64. Defaults to base64 for legacy compatibility. We recommend url).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OutputFileMode&quot;: &quot;url&quot;}</p>
     */
    @NameInMap("Settings")
    public ChatRequestSettings settings;

    /**
     * <p>The streaming output control options. Contains IncludeReasoning (boolean, default true, specifies whether to include the model thinking process) and IncludeToolCalls (boolean, default true, specifies whether to include tool invocation details). If not specified or set to a null object, the behavior is consistent with the legacy version.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IncludeReasoning&quot;: false, &quot;IncludeToolCalls&quot;: false}</p>
     */
    @NameInMap("StreamOptions")
    public ChatRequestStreamOptions streamOptions;

    /**
     * <p>The agent template ID.</p>
     * 
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

    public ChatRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ChatRequest setResume(Boolean resume) {
        this.resume = resume;
        return this;
    }
    public Boolean getResume() {
        return this.resume;
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
         * <p>The file path or URL (Type=file).</p>
         * 
         * <strong>example:</strong>
         * <p>/workspace/report.pdf</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The image URL or Base64-encoded string (Type=image).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/img.jpg">https://example.com/img.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The text content (Type=text).</p>
         * 
         * <strong>example:</strong>
         * <p>帮我分析这张图片</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The content type.</p>
         * 
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
        /**
         * <p>The content block list.</p>
         */
        @NameInMap("Content")
        public java.util.List<ChatRequestInputContent> content;

        /**
         * <p>The message role.</p>
         * 
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
         * <p>Controls the file output mode. Valid values: url or base64. If this parameter is not specified, base64 is used by default for legacy compatibility.</p>
         * 
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
         * <p>Specifies whether to include the model thinking process. When set to false, the SSE stream does not include messages with Type=&quot;reasoning&quot; or their content events.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncludeReasoning")
        public Boolean includeReasoning;

        /**
         * <p>Specifies whether to include tool invocation details. When set to false, the SSE stream does not include messages of type plugin_call, plugin_call_output, mcp_call, or mcp_call_output, or their content events.</p>
         * 
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
