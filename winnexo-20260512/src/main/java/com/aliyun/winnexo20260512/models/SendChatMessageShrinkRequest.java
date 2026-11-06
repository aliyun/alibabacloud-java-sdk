// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendChatMessageShrinkRequest extends TeaModel {
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
    public String digitalEmployeeNameShrink;

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
    public String filesShrink;

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
    public String taskExecutionShrink;

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

    public static SendChatMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageShrinkRequest self = new SendChatMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatMessageShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatMessageShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendChatMessageShrinkRequest setDigitalEmployeeNameShrink(String digitalEmployeeNameShrink) {
        this.digitalEmployeeNameShrink = digitalEmployeeNameShrink;
        return this;
    }
    public String getDigitalEmployeeNameShrink() {
        return this.digitalEmployeeNameShrink;
    }

    public SendChatMessageShrinkRequest setDirectChat(Boolean directChat) {
        this.directChat = directChat;
        return this;
    }
    public Boolean getDirectChat() {
        return this.directChat;
    }

    public SendChatMessageShrinkRequest setEnableWebSearch(Boolean enableWebSearch) {
        this.enableWebSearch = enableWebSearch;
        return this;
    }
    public Boolean getEnableWebSearch() {
        return this.enableWebSearch;
    }

    public SendChatMessageShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public SendChatMessageShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SendChatMessageShrinkRequest setReuseLastSession(Boolean reuseLastSession) {
        this.reuseLastSession = reuseLastSession;
        return this;
    }
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
    }

    public SendChatMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendChatMessageShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public SendChatMessageShrinkRequest setTaskExecutionShrink(String taskExecutionShrink) {
        this.taskExecutionShrink = taskExecutionShrink;
        return this;
    }
    public String getTaskExecutionShrink() {
        return this.taskExecutionShrink;
    }

    public SendChatMessageShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendChatMessageShrinkRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
