// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageShrinkRequest extends TeaModel {
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
    public String contextItemsShrink;

    /**
     * <p>The list of digital employee names. For compatibility with the old format, a single string can also be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pcitc-magent&quot;]</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

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

    public static SendAsyncChatMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncChatMessageShrinkRequest self = new SendAsyncChatMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendAsyncChatMessageShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SendAsyncChatMessageShrinkRequest setAutoPreference(String autoPreference) {
        this.autoPreference = autoPreference;
        return this;
    }
    public String getAutoPreference() {
        return this.autoPreference;
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

    public SendAsyncChatMessageShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SendAsyncChatMessageShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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

    public SendAsyncChatMessageShrinkRequest setThinkingEnabled(Boolean thinkingEnabled) {
        this.thinkingEnabled = thinkingEnabled;
        return this;
    }
    public Boolean getThinkingEnabled() {
        return this.thinkingEnabled;
    }

    public SendAsyncChatMessageShrinkRequest setThinkingLevel(String thinkingLevel) {
        this.thinkingLevel = thinkingLevel;
        return this;
    }
    public String getThinkingLevel() {
        return this.thinkingLevel;
    }

    public SendAsyncChatMessageShrinkRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
