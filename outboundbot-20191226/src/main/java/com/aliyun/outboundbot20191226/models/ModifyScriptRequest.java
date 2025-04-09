// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("AgentLlm")
    public Boolean agentLlm;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;AppKey\&quot;:\&quot;kknxKIhTTUcpCzYX\&quot;}</p>
     */
    @NameInMap("AsrConfig")
    public String asrConfig;

    @NameInMap("ChatConfig")
    public String chatConfig;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-iFZfi7eq6e</p>
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
     * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LongWaitEnable")
    public Boolean longWaitEnable;

    @NameInMap("MiniPlaybackConfigListJsonString")
    public String miniPlaybackConfigListJsonString;

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

    @NameInMap("NlsConfig")
    public String nlsConfig;

    @NameInMap("NluAccessType")
    public String nluAccessType;

    @NameInMap("NluEngine")
    public String nluEngine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scene")
    public String scene;

    @NameInMap("ScriptContent")
    public java.util.List<String> scriptContent;

    @NameInMap("ScriptDescription")
    public String scriptDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c153d0d8-ba04-41c0-8632-453944c9dd0b</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    @NameInMap("ScriptWaveform")
    public java.util.List<String> scriptWaveform;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;voice\&quot;:\&quot;siyue\&quot;,\&quot;volume\&quot;:\&quot;50\&quot;,\&quot;speechRate\&quot;:\&quot;-150\&quot;,\&quot;pitchRate\&quot;:\&quot;0\&quot;}</p>
     */
    @NameInMap("TtsConfig")
    public String ttsConfig;

    public static ModifyScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptRequest self = new ModifyScriptRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScriptRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public ModifyScriptRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ModifyScriptRequest setAgentLlm(Boolean agentLlm) {
        this.agentLlm = agentLlm;
        return this;
    }
    public Boolean getAgentLlm() {
        return this.agentLlm;
    }

    public ModifyScriptRequest setAsrConfig(String asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public String getAsrConfig() {
        return this.asrConfig;
    }

    public ModifyScriptRequest setChatConfig(String chatConfig) {
        this.chatConfig = chatConfig;
        return this;
    }
    public String getChatConfig() {
        return this.chatConfig;
    }

    public ModifyScriptRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public ModifyScriptRequest setEmotionEnable(Boolean emotionEnable) {
        this.emotionEnable = emotionEnable;
        return this;
    }
    public Boolean getEmotionEnable() {
        return this.emotionEnable;
    }

    public ModifyScriptRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ModifyScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyScriptRequest setLongWaitEnable(Boolean longWaitEnable) {
        this.longWaitEnable = longWaitEnable;
        return this;
    }
    public Boolean getLongWaitEnable() {
        return this.longWaitEnable;
    }

    public ModifyScriptRequest setMiniPlaybackConfigListJsonString(String miniPlaybackConfigListJsonString) {
        this.miniPlaybackConfigListJsonString = miniPlaybackConfigListJsonString;
        return this;
    }
    public String getMiniPlaybackConfigListJsonString() {
        return this.miniPlaybackConfigListJsonString;
    }

    public ModifyScriptRequest setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
        this.miniPlaybackEnable = miniPlaybackEnable;
        return this;
    }
    public Boolean getMiniPlaybackEnable() {
        return this.miniPlaybackEnable;
    }

    public ModifyScriptRequest setNewBargeInEnable(Boolean newBargeInEnable) {
        this.newBargeInEnable = newBargeInEnable;
        return this;
    }
    public Boolean getNewBargeInEnable() {
        return this.newBargeInEnable;
    }

    public ModifyScriptRequest setNlsConfig(String nlsConfig) {
        this.nlsConfig = nlsConfig;
        return this;
    }
    public String getNlsConfig() {
        return this.nlsConfig;
    }

    public ModifyScriptRequest setNluAccessType(String nluAccessType) {
        this.nluAccessType = nluAccessType;
        return this;
    }
    public String getNluAccessType() {
        return this.nluAccessType;
    }

    public ModifyScriptRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

    public ModifyScriptRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ModifyScriptRequest setScriptContent(java.util.List<String> scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public java.util.List<String> getScriptContent() {
        return this.scriptContent;
    }

    public ModifyScriptRequest setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }
    public String getScriptDescription() {
        return this.scriptDescription;
    }

    public ModifyScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public ModifyScriptRequest setScriptWaveform(java.util.List<String> scriptWaveform) {
        this.scriptWaveform = scriptWaveform;
        return this;
    }
    public java.util.List<String> getScriptWaveform() {
        return this.scriptWaveform;
    }

    public ModifyScriptRequest setTtsConfig(String ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public String getTtsConfig() {
        return this.ttsConfig;
    }

}
