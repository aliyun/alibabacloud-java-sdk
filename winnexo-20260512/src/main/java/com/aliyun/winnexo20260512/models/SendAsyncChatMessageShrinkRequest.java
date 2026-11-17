// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageShrinkRequest extends TeaModel {
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
     * <p>The list of digital employee names. For backward compatibility, a single string can also be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pcitc-magent&quot;]</p>
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
     * <p>The number of recent complete direct Q&amp;A rounds carried in the current turn, excluding the current input. This parameter takes effect only when workMode is set to direct or directChat is set to true. Valid values are JSON integers from 0 to 100. If omitted, the backend processes it as 0, carrying no history but still saving the current round. Null, Boolean, string, decimal, and out-of-bounds values are processed through the original direct path, and the gateway retains the original values for backend determination. This field is ignored in work and ask modes. This parameter does not limit the history range when switching to the work mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("directMaxHistoryRounds")
    public Object directMaxHistoryRounds;

    /**
     * <p>Specifies whether to enable web search. Default value: false. In task execution scenarios where taskExecution is passed, the task configuration prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableWebSearch")
    public Boolean enableWebSearch;

    /**
     * <p>The list of file references. Each item is an object, and fileId is required, which is returned by uploadChatFile.</p>
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
     * <p>The abstract model tier. Valid values: quick, standard, and flagship. If not specified, standard is used for new sessions, and the current tier is retained for existing sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Specifies whether to reuse the most recent session under the digital employee when sessionId is not provided, which applies to CLI scenarios. Default value: false, which means a new session is created.</p>
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
     * <p>The session ID. If not specified, a new session is created.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to use streaming generation. This API always generates background content in streaming mode and writes it to the message stream. The value does not change the response structure.</p>
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
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The session work mode. Valid values:</p>
     * <ul>
     * <li>ask: Quick Q&amp;A mode. Trims tools, skills, and connectors for single-turn direct answers.</li>
     * <li>work: Deep work mode. This is the default value.</li>
     * <li>direct: Direct connection mode at the request level. Does not start a sandbox and prevents context pollution. Equivalent to setting directChat to true.
     * The ask and work modes are session-level. Once selected during session creation, the mode is fixed and inherited by default in subsequent chats. If the explicitly passed value conflicts with the session mode, a parameter error is returned. To switch modes, create a new session or fork the current one. In scenarios with multiple digital employees or task execution, passing ask takes effect as work. This parameter is ignored when directChat is set to true.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("workMode")
    public String workMode;

    public static SendAsyncChatMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncChatMessageShrinkRequest self = new SendAsyncChatMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendAsyncChatMessageShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendAsyncChatMessageShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendAsyncChatMessageShrinkRequest setContextItemsShrink(String contextItemsShrink) {
        this.contextItemsShrink = contextItemsShrink;
        return this;
    }
    public String getContextItemsShrink() {
        return this.contextItemsShrink;
    }

    public SendAsyncChatMessageShrinkRequest setDigitalEmployeeNameShrink(String digitalEmployeeNameShrink) {
        this.digitalEmployeeNameShrink = digitalEmployeeNameShrink;
        return this;
    }
    public String getDigitalEmployeeNameShrink() {
        return this.digitalEmployeeNameShrink;
    }

    public SendAsyncChatMessageShrinkRequest setDirectChat(Boolean directChat) {
        this.directChat = directChat;
        return this;
    }
    public Boolean getDirectChat() {
        return this.directChat;
    }

    public SendAsyncChatMessageShrinkRequest setDirectMaxHistoryRounds(Object directMaxHistoryRounds) {
        this.directMaxHistoryRounds = directMaxHistoryRounds;
        return this;
    }
    public Object getDirectMaxHistoryRounds() {
        return this.directMaxHistoryRounds;
    }

    public SendAsyncChatMessageShrinkRequest setEnableWebSearch(Boolean enableWebSearch) {
        this.enableWebSearch = enableWebSearch;
        return this;
    }
    public Boolean getEnableWebSearch() {
        return this.enableWebSearch;
    }

    public SendAsyncChatMessageShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public SendAsyncChatMessageShrinkRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public SendAsyncChatMessageShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SendAsyncChatMessageShrinkRequest setReuseLastSession(Boolean reuseLastSession) {
        this.reuseLastSession = reuseLastSession;
        return this;
    }
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
    }

    public SendAsyncChatMessageShrinkRequest setSegmentsShrink(String segmentsShrink) {
        this.segmentsShrink = segmentsShrink;
        return this;
    }
    public String getSegmentsShrink() {
        return this.segmentsShrink;
    }

    public SendAsyncChatMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendAsyncChatMessageShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public SendAsyncChatMessageShrinkRequest setTaskExecutionShrink(String taskExecutionShrink) {
        this.taskExecutionShrink = taskExecutionShrink;
        return this;
    }
    public String getTaskExecutionShrink() {
        return this.taskExecutionShrink;
    }

    public SendAsyncChatMessageShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendAsyncChatMessageShrinkRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
