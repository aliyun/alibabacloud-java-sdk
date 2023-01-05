// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptRequest extends TeaModel {
    @NameInMap("AsrConfig")
    public String asrConfig;

    @NameInMap("ChatbotId")
    public String chatbotId;

    @NameInMap("EmotionEnable")
    public Boolean emotionEnable;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LongWaitEnable")
    public Boolean longWaitEnable;

    @NameInMap("MiniPlaybackConfigListJsonString")
    public String miniPlaybackConfigListJsonString;

    @NameInMap("MiniPlaybackEnable")
    public Boolean miniPlaybackEnable;

    @NameInMap("NewBargeInEnable")
    public Boolean newBargeInEnable;

    @NameInMap("NlsConfig")
    public String nlsConfig;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("ScriptContent")
    public java.util.List<String> scriptContent;

    @NameInMap("ScriptDescription")
    public String scriptDescription;

    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("ScriptName")
    public String scriptName;

    @NameInMap("ScriptWaveform")
    public java.util.List<String> scriptWaveform;

    @NameInMap("TtsConfig")
    public String ttsConfig;

    public static ModifyScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptRequest self = new ModifyScriptRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScriptRequest setAsrConfig(String asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public String getAsrConfig() {
        return this.asrConfig;
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
