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
     * <p>The list of digital employee names. For compatibility with the legacy format, a single string can be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>Specifies whether to enable the direct connection mode. If this parameter is set to true, the regular scenario routing is skipped and the direct connection conversation scenario is directly entered.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("directChat")
    public Boolean directChat;

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
     * <p>The abstract model tier. Valid values: quick, standard, and flagship. If this parameter is not specified, standard is used for new sessions, and the current tier is used for existing sessions.</p>
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
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to enable streaming output.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The task execution metadata returned by executeScheduledTask. If this parameter is passed, the request is processed according to the task execution link.</p>
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
     * <p>The session work mode. Valid values: ask (quick Q&amp;A, which trims tools, skills, and connectors for single-turn direct answers), work (deep work, which is the default value), and direct (direct connection mode at the request level, which does not start the sandbox and prevents context pollution, equivalent to directChat=true). The ask and work modes are at the session level. The mode is fixed when a new session is created. Subsequent chats inherit the session mode by default. If the explicitly passed value is inconsistent with the session mode, a parameter error is returned. To switch the mode, create a new session or fork the session. If ask is passed in the multi-digital employee or task execution scenario, it takes effect as work. If directChat is set to true, this parameter is ignored.</p>
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
