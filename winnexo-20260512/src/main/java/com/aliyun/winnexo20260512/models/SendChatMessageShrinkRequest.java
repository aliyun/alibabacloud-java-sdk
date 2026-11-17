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
     * <p>The message or file entries referenced as context for the current turn.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("contextItems")
    public String contextItemsShrink;

    /**
     * <p>The list of digital employee names. For compatibility with the legacy format, a single string can be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

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
    public String filesShrink;

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
    public String segmentsShrink;

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
     * <p>The session work mode. Valid values: ask (quick Q&amp;A, which trims tools, skills, and connectors for single-turn direct answers), work (deep work, which is the default), and direct (direct connection mode at the request level, which does not start a sandbox and prevents context pollution, equivalent to directChat=true). The ask and work modes are session-level. The mode is fixed when a new session is created. Subsequent chats inherit the session mode by default. If the explicitly passed value is inconsistent with the session mode, a parameter error is returned. To switch modes, create a new session or fork the session. If ask is passed in multi-digital employee or task execution scenarios, it takes effect as work. This parameter is ignored when directChat is set to true.</p>
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

    public SendChatMessageShrinkRequest setContextItemsShrink(String contextItemsShrink) {
        this.contextItemsShrink = contextItemsShrink;
        return this;
    }
    public String getContextItemsShrink() {
        return this.contextItemsShrink;
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

    public SendChatMessageShrinkRequest setDirectMaxHistoryRounds(Object directMaxHistoryRounds) {
        this.directMaxHistoryRounds = directMaxHistoryRounds;
        return this;
    }
    public Object getDirectMaxHistoryRounds() {
        return this.directMaxHistoryRounds;
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

    public SendChatMessageShrinkRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
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

    public SendChatMessageShrinkRequest setSegmentsShrink(String segmentsShrink) {
        this.segmentsShrink = segmentsShrink;
        return this;
    }
    public String getSegmentsShrink() {
        return this.segmentsShrink;
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
