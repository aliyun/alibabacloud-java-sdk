// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>AUTO 偏好：none=默认、performance=效果优先、credit=成本优先；缺省或 null 继承会话，空白重置为 none</p>
     * 
     * <strong>example:</strong>
     * <p>credit</p>
     */
    @NameInMap("autoPreference")
    public String autoPreference;

    /**
     * <p>The body of the user message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample content</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The message type. Valid values: Text and Markdown.</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The references and annotations for the current turn.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("contextItems")
    public java.util.List<SendAsyncChatMessageRequestContextItems> contextItems;

    /**
     * <p>The list of digital employee names. For compatibility with the old format, a single string can also be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pcitc-magent&quot;]</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p><strong>[Deprecated]</strong> Use workMode=direct instead. If set to true, winnexo_chat is retained and processed in request-level direct mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("directChat")
    public Boolean directChat;

    /**
     * <p>The maximum number of history rounds referenced in the current turn for the direct mode. Valid values: integers from 0 to 100. Default value: 0. Invalid values fall back to the original single-turn path. This parameter is ignored in non-direct modes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("directMaxHistoryRounds")
    public Object directMaxHistoryRounds;

    /**
     * <p>Specifies whether to enable web search. Default value: false. In the task execution scenario (when taskExecution is passed), the task configuration prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableWebSearch")
    public Boolean enableWebSearch;

    /**
     * <p>The list of file references. Each item is an object, and fileId is required (returned by uploadChatFile).</p>
     */
    @NameInMap("files")
    public java.util.List<SendAsyncChatMessageRequestFiles> files;

    /**
     * <p>The language for the current turn. Valid values: zh-CN and en-US. This parameter is used for API error messages and passed through to CodeAgent. If omitted, the current language behavior is retained and user settings are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <p>The model tier. Valid values: quick, standard, flagship, auto, or other currently available model names (case-insensitive). If not specified, the model tier of the session is inherited. For a new session, the default value is standard.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>Specifies whether to reuse the most recent session under the digital employee when sessionId is not provided (CLI scenario). Default value: false, which means a new session is created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reuseLastSession")
    public Boolean reuseLastSession;

    /**
     * <p>The structured segments in the message, such as session or object mentions.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("segments")
    public java.util.List<SendAsyncChatMessageRequestSegments> segments;

    /**
     * <p>The session ID. If not specified, a new session is created.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to use streaming generation. This API always generates background content in streaming mode and writes it to the message stream. The value of this parameter does not change the response structure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The task execution metadata returned by executeScheduledTask. If passed, the request is processed through the task execution pipeline.</p>
     */
    @NameInMap("taskExecution")
    public SendAsyncChatMessageRequestTaskExecution taskExecution;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>本轮显式覆盖是否思考；AUTO 未传时由决策模型判断，固定档未传时沿用个人设置，最终遵守模型能力与租户开关</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("thinkingEnabled")
    public Boolean thinkingEnabled;

    /**
     * <p>本轮显式覆盖思考强度；AUTO 未传时由决策模型判断，固定档未传时沿用个人设置，最终遵守模型能力与租户开关</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("thinkingLevel")
    public String thinkingLevel;

    /**
     * <p>The session work mode. Valid values: ask (quick Q&amp;A), work (deep work, default), and direct (direct connection mode, which does not start the sandbox, uses independent direct history controlled by directMaxHistoryRounds, and is equivalent to directChat=true). The ask and work modes are session-level. For continued chats, the session mode is inherited by default. To switch modes, create a new session or fork. In multi-digital employee or task execution scenarios, if ask is passed, it takes effect as work. If directChat is set to true, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("workMode")
    public String workMode;

    public static SendAsyncChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncChatMessageRequest self = new SendAsyncChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendAsyncChatMessageRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SendAsyncChatMessageRequest setAutoPreference(String autoPreference) {
        this.autoPreference = autoPreference;
        return this;
    }
    public String getAutoPreference() {
        return this.autoPreference;
    }

    public SendAsyncChatMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendAsyncChatMessageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendAsyncChatMessageRequest setContextItems(java.util.List<SendAsyncChatMessageRequestContextItems> contextItems) {
        this.contextItems = contextItems;
        return this;
    }
    public java.util.List<SendAsyncChatMessageRequestContextItems> getContextItems() {
        return this.contextItems;
    }

    public SendAsyncChatMessageRequest setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public SendAsyncChatMessageRequest setDirectChat(Boolean directChat) {
        this.directChat = directChat;
        return this;
    }
    public Boolean getDirectChat() {
        return this.directChat;
    }

    public SendAsyncChatMessageRequest setDirectMaxHistoryRounds(Object directMaxHistoryRounds) {
        this.directMaxHistoryRounds = directMaxHistoryRounds;
        return this;
    }
    public Object getDirectMaxHistoryRounds() {
        return this.directMaxHistoryRounds;
    }

    public SendAsyncChatMessageRequest setEnableWebSearch(Boolean enableWebSearch) {
        this.enableWebSearch = enableWebSearch;
        return this;
    }
    public Boolean getEnableWebSearch() {
        return this.enableWebSearch;
    }

    public SendAsyncChatMessageRequest setFiles(java.util.List<SendAsyncChatMessageRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<SendAsyncChatMessageRequestFiles> getFiles() {
        return this.files;
    }

    public SendAsyncChatMessageRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public SendAsyncChatMessageRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SendAsyncChatMessageRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SendAsyncChatMessageRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SendAsyncChatMessageRequest setReuseLastSession(Boolean reuseLastSession) {
        this.reuseLastSession = reuseLastSession;
        return this;
    }
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
    }

    public SendAsyncChatMessageRequest setSegments(java.util.List<SendAsyncChatMessageRequestSegments> segments) {
        this.segments = segments;
        return this;
    }
    public java.util.List<SendAsyncChatMessageRequestSegments> getSegments() {
        return this.segments;
    }

    public SendAsyncChatMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendAsyncChatMessageRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public SendAsyncChatMessageRequest setTaskExecution(SendAsyncChatMessageRequestTaskExecution taskExecution) {
        this.taskExecution = taskExecution;
        return this;
    }
    public SendAsyncChatMessageRequestTaskExecution getTaskExecution() {
        return this.taskExecution;
    }

    public SendAsyncChatMessageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendAsyncChatMessageRequest setThinkingEnabled(Boolean thinkingEnabled) {
        this.thinkingEnabled = thinkingEnabled;
        return this;
    }
    public Boolean getThinkingEnabled() {
        return this.thinkingEnabled;
    }

    public SendAsyncChatMessageRequest setThinkingLevel(String thinkingLevel) {
        this.thinkingLevel = thinkingLevel;
        return this;
    }
    public String getThinkingLevel() {
        return this.thinkingLevel;
    }

    public SendAsyncChatMessageRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

    public static class SendAsyncChatMessageRequestContextItemsAnnotationFiles extends TeaModel {
        /**
         * <p>The file name of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplementary notes.pdf</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The public access URL of the attachment. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/public/file">https://example.com/public/file</a></p>
         */
        @NameInMap("filePublicUrl")
        public String filePublicUrl;

        /**
         * <p>The file record ID of the attachment. This parameter is required. It is used to verify the ownership of the attachment and provide it for session processing.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        @NameInMap("fileRecordId")
        public String fileRecordId;

        /**
         * <p>The internal access URL of the attachment. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/file">https://example.com/file</a></p>
         */
        @NameInMap("fileUrl")
        public String fileUrl;

        public static SendAsyncChatMessageRequestContextItemsAnnotationFiles build(java.util.Map<String, ?> map) throws Exception {
            SendAsyncChatMessageRequestContextItemsAnnotationFiles self = new SendAsyncChatMessageRequestContextItemsAnnotationFiles();
            return TeaModel.build(map, self);
        }

        public SendAsyncChatMessageRequestContextItemsAnnotationFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SendAsyncChatMessageRequestContextItemsAnnotationFiles setFilePublicUrl(String filePublicUrl) {
            this.filePublicUrl = filePublicUrl;
            return this;
        }
        public String getFilePublicUrl() {
            return this.filePublicUrl;
        }

        public SendAsyncChatMessageRequestContextItemsAnnotationFiles setFileRecordId(String fileRecordId) {
            this.fileRecordId = fileRecordId;
            return this;
        }
        public String getFileRecordId() {
            return this.fileRecordId;
        }

        public SendAsyncChatMessageRequestContextItemsAnnotationFiles setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class SendAsyncChatMessageRequestContextItems extends TeaModel {
        /**
         * <p>The annotation content entered by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Please verify the data for the East China region</p>
         */
        @NameInMap("annotation")
        public String annotation;

        /**
         * <p>The list of attachments associated with the output annotation. This parameter is only applicable when type is set to output_annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("annotationFiles")
        public java.util.List<SendAsyncChatMessageRequestContextItemsAnnotationFiles> annotationFiles;

        /**
         * <p>The content corresponding to the reference or annotation. For output_annotation, this parameter is optional, but annotationFiles must be provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue for this month</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The ID of the referenced or annotated output file.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileId</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <p>The name of the referenced or annotated output file.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales data.xlsx</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The type of the referenced or annotated output file.</p>
         * 
         * <strong>example:</strong>
         * <p>xlsx</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <p>The ID of the referenced or annotated message.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The name of the sender of the referenced or annotated message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales Assistant</p>
         */
        @NameInMap("senderName")
        public String senderName;

        /**
         * <p>The context type. Valid values: message_reference, message_selection, message_annotation, output_selection, and output_annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>message_annotation</p>
         */
        @NameInMap("type")
        public String type;

        public static SendAsyncChatMessageRequestContextItems build(java.util.Map<String, ?> map) throws Exception {
            SendAsyncChatMessageRequestContextItems self = new SendAsyncChatMessageRequestContextItems();
            return TeaModel.build(map, self);
        }

        public SendAsyncChatMessageRequestContextItems setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public SendAsyncChatMessageRequestContextItems setAnnotationFiles(java.util.List<SendAsyncChatMessageRequestContextItemsAnnotationFiles> annotationFiles) {
            this.annotationFiles = annotationFiles;
            return this;
        }
        public java.util.List<SendAsyncChatMessageRequestContextItemsAnnotationFiles> getAnnotationFiles() {
            return this.annotationFiles;
        }

        public SendAsyncChatMessageRequestContextItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SendAsyncChatMessageRequestContextItems setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendAsyncChatMessageRequestContextItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SendAsyncChatMessageRequestContextItems setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SendAsyncChatMessageRequestContextItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendAsyncChatMessageRequestContextItems setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public SendAsyncChatMessageRequestContextItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendAsyncChatMessageRequestFiles extends TeaModel {
        /**
         * <p>The file ID, returned by uploadChatFile.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileId</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static SendAsyncChatMessageRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            SendAsyncChatMessageRequestFiles self = new SendAsyncChatMessageRequestFiles();
            return TeaModel.build(map, self);
        }

        public SendAsyncChatMessageRequestFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendAsyncChatMessageRequestFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendAsyncChatMessageRequestSegments extends TeaModel {
        /**
         * <p>The display content of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>Previous session</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The category of the mentioned object.</p>
         * 
         * <strong>example:</strong>
         * <p>conversations</p>
         */
        @NameInMap("mentionType")
        public String mentionType;

        /**
         * <p>The name of the referenced object.</p>
         * 
         * <strong>example:</strong>
         * <p>Previous session</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the referenced object.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type of the referenced object.</p>
         * 
         * <strong>example:</strong>
         * <p>conversation</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>The session type.</p>
         * 
         * <strong>example:</strong>
         * <p>personal</p>
         */
        @NameInMap("sessionType")
        public String sessionType;

        /**
         * <p>The segment type.</p>
         * 
         * <strong>example:</strong>
         * <p>mention</p>
         */
        @NameInMap("type")
        public String type;

        public static SendAsyncChatMessageRequestSegments build(java.util.Map<String, ?> map) throws Exception {
            SendAsyncChatMessageRequestSegments self = new SendAsyncChatMessageRequestSegments();
            return TeaModel.build(map, self);
        }

        public SendAsyncChatMessageRequestSegments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SendAsyncChatMessageRequestSegments setMentionType(String mentionType) {
            this.mentionType = mentionType;
            return this;
        }
        public String getMentionType() {
            return this.mentionType;
        }

        public SendAsyncChatMessageRequestSegments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SendAsyncChatMessageRequestSegments setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public SendAsyncChatMessageRequestSegments setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public SendAsyncChatMessageRequestSegments setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public SendAsyncChatMessageRequestSegments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendAsyncChatMessageRequestTaskExecution extends TeaModel {
        /**
         * <p>The billing ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBillingId</p>
         */
        @NameInMap("billingId")
        public String billingId;

        /**
         * <p>Specifies whether to enable web search.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableWebSearch")
        public Boolean enableWebSearch;

        /**
         * <p>The execution record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        @NameInMap("executionId")
        public String executionId;

        /**
         * <p>The name of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        /**
         * <p>The list of associated skill codes.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;code&quot;]</p>
         */
        @NameInMap("skillCodes")
        public java.util.List<String> skillCodes;

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>The task understanding content.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("taskUnderstand")
        public String taskUnderstand;

        /**
         * <p>The ID of the tenant to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The ID of the user to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleUserId</p>
         */
        @NameInMap("userId")
        public String userId;

        public static SendAsyncChatMessageRequestTaskExecution build(java.util.Map<String, ?> map) throws Exception {
            SendAsyncChatMessageRequestTaskExecution self = new SendAsyncChatMessageRequestTaskExecution();
            return TeaModel.build(map, self);
        }

        public SendAsyncChatMessageRequestTaskExecution setBillingId(String billingId) {
            this.billingId = billingId;
            return this;
        }
        public String getBillingId() {
            return this.billingId;
        }

        public SendAsyncChatMessageRequestTaskExecution setEnableWebSearch(Boolean enableWebSearch) {
            this.enableWebSearch = enableWebSearch;
            return this;
        }
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        public SendAsyncChatMessageRequestTaskExecution setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public SendAsyncChatMessageRequestTaskExecution setOperatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public SendAsyncChatMessageRequestTaskExecution setSkillCodes(java.util.List<String> skillCodes) {
            this.skillCodes = skillCodes;
            return this;
        }
        public java.util.List<String> getSkillCodes() {
            return this.skillCodes;
        }

        public SendAsyncChatMessageRequestTaskExecution setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SendAsyncChatMessageRequestTaskExecution setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public SendAsyncChatMessageRequestTaskExecution setTaskUnderstand(String taskUnderstand) {
            this.taskUnderstand = taskUnderstand;
            return this;
        }
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        public SendAsyncChatMessageRequestTaskExecution setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public SendAsyncChatMessageRequestTaskExecution setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
