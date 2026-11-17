// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendChatMessageRequest extends TeaModel {
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
     * <p>The message or file entries referenced as context for the current turn.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("contextItems")
    public java.util.List<SendChatMessageRequestContextItems> contextItems;

    /**
     * <p>The list of digital employee names. For compatibility with the legacy format, a single string can be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>Specifies whether to enable direct connection mode. If set to true, regular scenario routing is skipped and the direct conversation scenario is entered directly.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("directChat")
    public Boolean directChat;

    /**
     * <p>The number of recent complete direct Q&amp;A rounds carried in the current turn, excluding the input of the current turn. This parameter takes effect only when workMode is set to direct or directChat is set to true. Valid values: JSON integers from 0 to 100. If omitted, the backend processes it as 0, carrying no history but still saving the current turn. Null, Boolean, string, decimal, and out-of-bounds values are processed through the original direct path, and the gateway retains the original values for backend determination. This field is ignored in work and ask modes. This parameter does not limit the history range when converted to the work mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("directMaxHistoryRounds")
    public Object directMaxHistoryRounds;

    /**
     * <p>Specifies whether to enable web search. Default value: false. In the task execution scenario where taskExecution is passed, the task configuration prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableWebSearch")
    public Boolean enableWebSearch;

    /**
     * <p>The list of file references. Each item is an object, and the fileId parameter is required, which is returned by uploadChatFile.</p>
     */
    @NameInMap("files")
    public java.util.List<SendChatMessageRequestFiles> files;

    /**
     * <p>The language for the current turn. Valid values: zh-CN and en-US. This parameter is used for API error messages and passed through to CodeAgent. If omitted, the current language behavior is retained and user settings are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <p>The abstract model tier. Valid values: quick, standard, and flagship. If omitted, standard is used for new sessions, and the current tier is retained for existing sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Specifies whether to reuse the most recent session under the digital employee when sessionId is not passed, which applies to CLI scenarios. Default value: false, which indicates that a new session is created.</p>
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
    public java.util.List<SendChatMessageRequestSegments> segments;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether streaming output is enabled.</p>
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
    public SendChatMessageRequestTaskExecution taskExecution;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The session work mode. Valid values: ask (quick Q&amp;A, which trims tools, skills, and connectors for single-turn direct answers), work (deep work, which is the default), and direct (direct connection mode at the request level, which does not start a sandbox and prevents context pollution, equivalent to directChat=true). The ask and work modes are session-level. The mode is fixed when a new session is created. Subsequent chats inherit the session mode by default. If the explicitly passed value is inconsistent with the session mode, a parameter error is returned. To switch modes, create a new session or fork the session. If ask is passed in multi-digital employee or task execution scenarios, it takes effect as work. This parameter is ignored when directChat is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("workMode")
    public String workMode;

    public static SendChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageRequest self = new SendChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatMessageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendChatMessageRequest setContextItems(java.util.List<SendChatMessageRequestContextItems> contextItems) {
        this.contextItems = contextItems;
        return this;
    }
    public java.util.List<SendChatMessageRequestContextItems> getContextItems() {
        return this.contextItems;
    }

    public SendChatMessageRequest setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public SendChatMessageRequest setDirectChat(Boolean directChat) {
        this.directChat = directChat;
        return this;
    }
    public Boolean getDirectChat() {
        return this.directChat;
    }

    public SendChatMessageRequest setDirectMaxHistoryRounds(Object directMaxHistoryRounds) {
        this.directMaxHistoryRounds = directMaxHistoryRounds;
        return this;
    }
    public Object getDirectMaxHistoryRounds() {
        return this.directMaxHistoryRounds;
    }

    public SendChatMessageRequest setEnableWebSearch(Boolean enableWebSearch) {
        this.enableWebSearch = enableWebSearch;
        return this;
    }
    public Boolean getEnableWebSearch() {
        return this.enableWebSearch;
    }

    public SendChatMessageRequest setFiles(java.util.List<SendChatMessageRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<SendChatMessageRequestFiles> getFiles() {
        return this.files;
    }

    public SendChatMessageRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public SendChatMessageRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SendChatMessageRequest setReuseLastSession(Boolean reuseLastSession) {
        this.reuseLastSession = reuseLastSession;
        return this;
    }
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
    }

    public SendChatMessageRequest setSegments(java.util.List<SendChatMessageRequestSegments> segments) {
        this.segments = segments;
        return this;
    }
    public java.util.List<SendChatMessageRequestSegments> getSegments() {
        return this.segments;
    }

    public SendChatMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendChatMessageRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public SendChatMessageRequest setTaskExecution(SendChatMessageRequestTaskExecution taskExecution) {
        this.taskExecution = taskExecution;
        return this;
    }
    public SendChatMessageRequestTaskExecution getTaskExecution() {
        return this.taskExecution;
    }

    public SendChatMessageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendChatMessageRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

    public static class SendChatMessageRequestContextItemsAnnotationFiles extends TeaModel {
        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplementary notes.pdf</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The public access URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/public/file">https://example.com/public/file</a></p>
         */
        @NameInMap("filePublicUrl")
        public String filePublicUrl;

        /**
         * <p>The file record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        @NameInMap("fileRecordId")
        public String fileRecordId;

        /**
         * <p>The internal access URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/file">https://example.com/file</a></p>
         */
        @NameInMap("fileUrl")
        public String fileUrl;

        public static SendChatMessageRequestContextItemsAnnotationFiles build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestContextItemsAnnotationFiles self = new SendChatMessageRequestContextItemsAnnotationFiles();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestContextItemsAnnotationFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SendChatMessageRequestContextItemsAnnotationFiles setFilePublicUrl(String filePublicUrl) {
            this.filePublicUrl = filePublicUrl;
            return this;
        }
        public String getFilePublicUrl() {
            return this.filePublicUrl;
        }

        public SendChatMessageRequestContextItemsAnnotationFiles setFileRecordId(String fileRecordId) {
            this.fileRecordId = fileRecordId;
            return this;
        }
        public String getFileRecordId() {
            return this.fileRecordId;
        }

        public SendChatMessageRequestContextItemsAnnotationFiles setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class SendChatMessageRequestContextItems extends TeaModel {
        /**
         * <p>The user annotation for the referenced content.</p>
         * 
         * <strong>example:</strong>
         * <p>Please verify the data for the East China region</p>
         */
        @NameInMap("annotation")
        public String annotation;

        /**
         * <p>The list of files associated with the annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("annotationFiles")
        public java.util.List<SendChatMessageRequestContextItemsAnnotationFiles> annotationFiles;

        /**
         * <p>The body of the referenced content.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue for this month</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The ID of the referenced file.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileId</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <p>The name of the referenced file.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales data.xlsx</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The type of the referenced file.</p>
         * 
         * <strong>example:</strong>
         * <p>xlsx</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <p>The ID of the referenced message.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The name of the message sender.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales Assistant</p>
         */
        @NameInMap("senderName")
        public String senderName;

        /**
         * <p>The context entry type.</p>
         * 
         * <strong>example:</strong>
         * <p>message_annotation</p>
         */
        @NameInMap("type")
        public String type;

        public static SendChatMessageRequestContextItems build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestContextItems self = new SendChatMessageRequestContextItems();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestContextItems setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public SendChatMessageRequestContextItems setAnnotationFiles(java.util.List<SendChatMessageRequestContextItemsAnnotationFiles> annotationFiles) {
            this.annotationFiles = annotationFiles;
            return this;
        }
        public java.util.List<SendChatMessageRequestContextItemsAnnotationFiles> getAnnotationFiles() {
            return this.annotationFiles;
        }

        public SendChatMessageRequestContextItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SendChatMessageRequestContextItems setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendChatMessageRequestContextItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SendChatMessageRequestContextItems setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SendChatMessageRequestContextItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendChatMessageRequestContextItems setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public SendChatMessageRequestContextItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendChatMessageRequestFiles extends TeaModel {
        /**
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileId</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <p>The element type. Valid values: text, web_search, mention, and skill.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static SendChatMessageRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestFiles self = new SendChatMessageRequestFiles();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendChatMessageRequestFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendChatMessageRequestSegments extends TeaModel {
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

        public static SendChatMessageRequestSegments build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestSegments self = new SendChatMessageRequestSegments();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestSegments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SendChatMessageRequestSegments setMentionType(String mentionType) {
            this.mentionType = mentionType;
            return this;
        }
        public String getMentionType() {
            return this.mentionType;
        }

        public SendChatMessageRequestSegments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SendChatMessageRequestSegments setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public SendChatMessageRequestSegments setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public SendChatMessageRequestSegments setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public SendChatMessageRequestSegments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendChatMessageRequestTaskExecution extends TeaModel {
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
         * <p>The digital employee name.</p>
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
         * <p>string_value</p>
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

        public static SendChatMessageRequestTaskExecution build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageRequestTaskExecution self = new SendChatMessageRequestTaskExecution();
            return TeaModel.build(map, self);
        }

        public SendChatMessageRequestTaskExecution setBillingId(String billingId) {
            this.billingId = billingId;
            return this;
        }
        public String getBillingId() {
            return this.billingId;
        }

        public SendChatMessageRequestTaskExecution setEnableWebSearch(Boolean enableWebSearch) {
            this.enableWebSearch = enableWebSearch;
            return this;
        }
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        public SendChatMessageRequestTaskExecution setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public SendChatMessageRequestTaskExecution setOperatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public SendChatMessageRequestTaskExecution setSkillCodes(java.util.List<String> skillCodes) {
            this.skillCodes = skillCodes;
            return this;
        }
        public java.util.List<String> getSkillCodes() {
            return this.skillCodes;
        }

        public SendChatMessageRequestTaskExecution setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SendChatMessageRequestTaskExecution setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public SendChatMessageRequestTaskExecution setTaskUnderstand(String taskUnderstand) {
            this.taskUnderstand = taskUnderstand;
            return this;
        }
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        public SendChatMessageRequestTaskExecution setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public SendChatMessageRequestTaskExecution setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
