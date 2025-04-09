// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("AgentLlm")
    public Boolean agentLlm;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;appKey\&quot;:\&quot;kknxKIhTTUcpCzYX\&quot;,\&quot;maxEndSilence\&quot;:\&quot;400\&quot;,\&quot;silenceTimeout\&quot;:\&quot;5\&quot;}</p>
     */
    @NameInMap("AsrConfig")
    public String asrConfig;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-IfaUfqaUnb</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EmotionEnable")
    public Boolean emotionEnable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c46001bc-3ead-4bfd-9a69-4b5b66a4a3f4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LongWaitEnable")
    public Boolean longWaitEnable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MiniPlaybackEnable")
    public Boolean miniPlaybackEnable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewBargeInEnable")
    public Boolean newBargeInEnable;

    @NameInMap("NluAccessType")
    public String nluAccessType;

    @NameInMap("NluEngine")
    public String nluEngine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ScriptContent")
    public java.util.List<String> scriptContent;

    @NameInMap("ScriptDescription")
    public String scriptDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ScriptWaveform")
    public java.util.List<String> scriptWaveform;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;voice\&quot;:\&quot;aixia\&quot;,\&quot;volume\&quot;:\&quot;50\&quot;,\&quot;speechRate\&quot;:\&quot;-150\&quot;,\&quot;pitchRate\&quot;:\&quot;0\&quot;}</p>
     */
    @NameInMap("TtsConfig")
    public String ttsConfig;

    public static CreateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptRequest self = new CreateScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CreateScriptRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateScriptRequest setAgentLlm(Boolean agentLlm) {
        this.agentLlm = agentLlm;
        return this;
    }
    public Boolean getAgentLlm() {
        return this.agentLlm;
    }

    public CreateScriptRequest setAsrConfig(String asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public String getAsrConfig() {
        return this.asrConfig;
    }

    public CreateScriptRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public CreateScriptRequest setEmotionEnable(Boolean emotionEnable) {
        this.emotionEnable = emotionEnable;
        return this;
    }
    public Boolean getEmotionEnable() {
        return this.emotionEnable;
    }

    public CreateScriptRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScriptRequest setLongWaitEnable(Boolean longWaitEnable) {
        this.longWaitEnable = longWaitEnable;
        return this;
    }
    public Boolean getLongWaitEnable() {
        return this.longWaitEnable;
    }

    public CreateScriptRequest setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
        this.miniPlaybackEnable = miniPlaybackEnable;
        return this;
    }
    public Boolean getMiniPlaybackEnable() {
        return this.miniPlaybackEnable;
    }

    public CreateScriptRequest setNewBargeInEnable(Boolean newBargeInEnable) {
        this.newBargeInEnable = newBargeInEnable;
        return this;
    }
    public Boolean getNewBargeInEnable() {
        return this.newBargeInEnable;
    }

    public CreateScriptRequest setNluAccessType(String nluAccessType) {
        this.nluAccessType = nluAccessType;
        return this;
    }
    public String getNluAccessType() {
        return this.nluAccessType;
    }

    public CreateScriptRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

    public CreateScriptRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateScriptRequest setScriptContent(java.util.List<String> scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public java.util.List<String> getScriptContent() {
        return this.scriptContent;
    }

    public CreateScriptRequest setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }
    public String getScriptDescription() {
        return this.scriptDescription;
    }

    public CreateScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public CreateScriptRequest setScriptWaveform(java.util.List<String> scriptWaveform) {
        this.scriptWaveform = scriptWaveform;
        return this;
    }
    public java.util.List<String> getScriptWaveform() {
        return this.scriptWaveform;
    }

    public CreateScriptRequest setTtsConfig(String ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public String getTtsConfig() {
        return this.ttsConfig;
    }

}
