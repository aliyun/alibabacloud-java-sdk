// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasclaw20260626.models;

import com.aliyun.tea.*;

public class ChatUserSecAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sec-ops-agent</p>
     */
    @NameInMap("Agent")
    public String agent;

    /**
     * <p>附件暂存 ID</p>
     * 
     * <strong>example:</strong>
     * <p>stg-6f1d9c8b7a2e4530</p>
     */
    @NameInMap("AttachmentStagingId")
    public String attachmentStagingId;

    /**
     * <p>附件列表 JSON 字符串</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;oss/input.txt&quot;,&quot;oss/raw.txt&quot;]</p>
     */
    @NameInMap("Attachments")
    public String attachments;

    /**
     * <p>逻辑渠道名</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>执行模式: single/team/role</p>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>扩展参数 JSON 字符串，如 execution_mode、target 等</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;execution_mode&quot;:&quot;team&quot;,&quot;target&quot;:&quot;team:auto&quot;}</p>
     */
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Memory")
    public Boolean memory;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>用户提问；新会话时必填，恢复/交互时可空</p>
     * 
     * <strong>example:</strong>
     * <p>帮我梳理最近 24 小时的高危告警并给出处置建议</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ResponseLanguage")
    public String responseLanguage;

    /**
     * <strong>example:</strong>
     * <p>5f2c1b9a8d3e4c7f</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>alert-analysis</p>
     */
    @NameInMap("Skill")
    public String skill;

    @NameInMap("Stream")
    public Boolean stream;

    /**
     * <strong>example:</strong>
     * <p>9b1e7d2c4a6f8e30</p>
     */
    @NameInMap("TalkId")
    public String talkId;

    /**
     * <p>执行目标</p>
     * 
     * <strong>example:</strong>
     * <p>sec-ops-team-01</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>会话恢复/交互提交信息 JSON 字符串</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;session_example&quot;,&quot;talkId&quot;:&quot;talk_example&quot;,&quot;formId&quot;:&quot;interaction_example&quot;,&quot;formValues&quot;:{&quot;q1&quot;:{&quot;kind&quot;:&quot;selected&quot;,&quot;optionIds&quot;:[&quot;q1_o1&quot;]}},&quot;formAction&quot;:&quot;submit&quot;}</p>
     */
    @NameInMap("UserInputInfo")
    public String userInputInfo;

    public static ChatUserSecAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatUserSecAgentRequest self = new ChatUserSecAgentRequest();
        return TeaModel.build(map, self);
    }

    public ChatUserSecAgentRequest setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public ChatUserSecAgentRequest setAttachmentStagingId(String attachmentStagingId) {
        this.attachmentStagingId = attachmentStagingId;
        return this;
    }
    public String getAttachmentStagingId() {
        return this.attachmentStagingId;
    }

    public ChatUserSecAgentRequest setAttachments(String attachments) {
        this.attachments = attachments;
        return this;
    }
    public String getAttachments() {
        return this.attachments;
    }

    public ChatUserSecAgentRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ChatUserSecAgentRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public ChatUserSecAgentRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public ChatUserSecAgentRequest setMemory(Boolean memory) {
        this.memory = memory;
        return this;
    }
    public Boolean getMemory() {
        return this.memory;
    }

    public ChatUserSecAgentRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ChatUserSecAgentRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ChatUserSecAgentRequest setResponseLanguage(String responseLanguage) {
        this.responseLanguage = responseLanguage;
        return this;
    }
    public String getResponseLanguage() {
        return this.responseLanguage;
    }

    public ChatUserSecAgentRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatUserSecAgentRequest setSkill(String skill) {
        this.skill = skill;
        return this;
    }
    public String getSkill() {
        return this.skill;
    }

    public ChatUserSecAgentRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public ChatUserSecAgentRequest setTalkId(String talkId) {
        this.talkId = talkId;
        return this;
    }
    public String getTalkId() {
        return this.talkId;
    }

    public ChatUserSecAgentRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ChatUserSecAgentRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public ChatUserSecAgentRequest setUserInputInfo(String userInputInfo) {
        this.userInputInfo = userInputInfo;
        return this;
    }
    public String getUserInputInfo() {
        return this.userInputInfo;
    }

}
