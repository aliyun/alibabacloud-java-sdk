// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageRequest extends TeaModel {
    /**
     * <p>The message body from the user.</p>
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
     * <p>The list of digital employee names. A single string can be passed for backward compatibility with the legacy format.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>Specifies whether to enable direct chat mode. If set to true, the regular scenario routing is skipped and the direct chat scenario is entered.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("directChat")
    public Boolean directChat;

    /**
     * <p>The list of file references. Each item is an object in which fileId is required and is returned by uploadChatFile.</p>
     */
    @NameInMap("files")
    public java.util.List<SendAsyncChatMessageRequestFiles> files;

    /**
     * <p>The abstract model tier. Valid values: quick, standard, and flagship. If not specified, new sessions use standard, and existing sessions retain their current tier.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Specifies whether to reuse the most recent session of the digital employee when sessionId is not specified. This is designed for CLI scenarios. Default value: false, which creates a new session.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reuseLastSession")
    public Boolean reuseLastSession;

    /**
     * <p>The session ID. If not specified, a new session is created.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to use streaming generation. This operation always generates backend content in streaming mode and writes it to the message stream. The value does not change the response structure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The task execution metadata returned by executeScheduledTask. When provided, the request is processed through the task execution pipeline.</p>
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

    public static SendAsyncChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncChatMessageRequest self = new SendAsyncChatMessageRequest();
        return TeaModel.build(map, self);
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

    public SendAsyncChatMessageRequest setFiles(java.util.List<SendAsyncChatMessageRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<SendAsyncChatMessageRequestFiles> getFiles() {
        return this.files;
    }

    public SendAsyncChatMessageRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SendAsyncChatMessageRequest setReuseLastSession(Boolean reuseLastSession) {
        this.reuseLastSession = reuseLastSession;
        return this;
    }
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
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

    public static class SendAsyncChatMessageRequestFiles extends TeaModel {
        /**
         * <p>The file ID returned by uploadChatFile.</p>
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
         * <p>The tenant ID to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The user ID to which the task belongs.</p>
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
