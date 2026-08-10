// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class SendNapalStreamMessageRequest extends TeaModel {
    /**
     * <p>The request configuration object.</p>
     */
    @NameInMap("Configuration")
    public SendNapalStreamMessageRequestConfiguration configuration;

    /**
     * <p>The message object that contains user input and session context information.</p>
     */
    @NameInMap("Message")
    public SendNapalStreamMessageRequestMessage message;

    /**
     * <p>The additional request information.</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, String> metadata;

    public static SendNapalStreamMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNapalStreamMessageRequest self = new SendNapalStreamMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendNapalStreamMessageRequest setConfiguration(SendNapalStreamMessageRequestConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public SendNapalStreamMessageRequestConfiguration getConfiguration() {
        return this.configuration;
    }

    public SendNapalStreamMessageRequest setMessage(SendNapalStreamMessageRequestMessage message) {
        this.message = message;
        return this;
    }
    public SendNapalStreamMessageRequestMessage getMessage() {
        return this.message;
    }

    public SendNapalStreamMessageRequest setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public static class SendNapalStreamMessageRequestConfiguration extends TeaModel {
        /**
         * <p>The accepted output modes. Default value: [&quot;text/event-stream&quot;], which indicates that SSE streaming responses are accepted.</p>
         */
        @NameInMap("AcceptedOutputModes")
        public java.util.List<String> acceptedOutputModes;

        /**
         * <p>The history message length. Controls the number of historical messages carried in multi-turn conversations. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HistoryLength")
        public Integer historyLength;

        /**
         * <p>Specifies whether to return immediately. Valid values:</p>
         * <ul>
         * <li>false (default): Returns responses in streaming mode.</li>
         * <li>true: Returns the task ID immediately and processes the request asynchronously.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReturnImmediately")
        public Boolean returnImmediately;

        public static SendNapalStreamMessageRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageRequestConfiguration self = new SendNapalStreamMessageRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageRequestConfiguration setAcceptedOutputModes(java.util.List<String> acceptedOutputModes) {
            this.acceptedOutputModes = acceptedOutputModes;
            return this;
        }
        public java.util.List<String> getAcceptedOutputModes() {
            return this.acceptedOutputModes;
        }

        public SendNapalStreamMessageRequestConfiguration setHistoryLength(Integer historyLength) {
            this.historyLength = historyLength;
            return this;
        }
        public Integer getHistoryLength() {
            return this.historyLength;
        }

        public SendNapalStreamMessageRequestConfiguration setReturnImmediately(Boolean returnImmediately) {
            this.returnImmediately = returnImmediately;
            return this;
        }
        public Boolean getReturnImmediately() {
            return this.returnImmediately;
        }

    }

    public static class SendNapalStreamMessageRequestMessageParts extends TeaModel {
        /**
         * <p>The structured data, used to pass JSON-formatted structured content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>report.txt</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>The media type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The raw content, used to pass non-text data.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The text content. The natural language instruction entered by the user, such as a diagnostic request or question consultation.</p>
         * 
         * <strong>example:</strong>
         * <p>Diagnose this instance ngw-xxx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The file URL, used to pass file-type content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/file.txt">https://example.com/file.txt</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageRequestMessageParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageRequestMessageParts self = new SendNapalStreamMessageRequestMessageParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageRequestMessageParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageRequestMessageParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageRequestMessageParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageRequestMessageParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageRequestMessageParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageRequestMessageParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageRequestMessage extends TeaModel {
        /**
         * <p>The session context ID. Do not specify this parameter for the first conversation. The server creates a new session. For multi-turn conversations, pass the contextId from the previous response to maintain context continuity.</p>
         * 
         * <strong>example:</strong>
         * <p>context-xxx</p>
         */
        @NameInMap("ContextId")
        public String contextId;

        /**
         * <p>The list of extension information.</p>
         */
        @NameInMap("Extensions")
        public java.util.List<String> extensions;

        /**
         * <p>The message ID. If not specified, the server automatically generates one.</p>
         * 
         * <strong>example:</strong>
         * <p>m_msijl2sv_pcfge8r7l</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The extended metadata, used to pass additional context information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The list of message content parts. Multiple parts are supported.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageRequestMessageParts> parts;

        /**
         * <p>The list of referenced historical task IDs, used for context association.</p>
         */
        @NameInMap("ReferenceTaskIds")
        public java.util.List<String> referenceTaskIds;

        /**
         * <p>The message role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The task ID. Pass the ID of the previous task in follow-up conversation scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SendNapalStreamMessageRequestMessage build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageRequestMessage self = new SendNapalStreamMessageRequestMessage();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageRequestMessage setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public SendNapalStreamMessageRequestMessage setExtensions(java.util.List<String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        public SendNapalStreamMessageRequestMessage setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendNapalStreamMessageRequestMessage setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageRequestMessage setParts(java.util.List<SendNapalStreamMessageRequestMessageParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageRequestMessageParts> getParts() {
            return this.parts;
        }

        public SendNapalStreamMessageRequestMessage setReferenceTaskIds(java.util.List<String> referenceTaskIds) {
            this.referenceTaskIds = referenceTaskIds;
            return this;
        }
        public java.util.List<String> getReferenceTaskIds() {
            return this.referenceTaskIds;
        }

        public SendNapalStreamMessageRequestMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SendNapalStreamMessageRequestMessage setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
