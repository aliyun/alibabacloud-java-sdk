// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The agent silence configuration.</p>
     */
    @NameInMap("AgentSilenceConfig")
    public String agentSilenceConfigShrink;

    /**
     * <p>The agent ambient environment configuration. If this parameter is not specified, the ambient environment configuration is not used.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public String ambientSoundConfigShrink;

    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The speech-to-text settings.</p>
     */
    @NameInMap("AsrConfig")
    public String asrConfigShrink;

    /**
     * <p>The agent backchannel configuration.</p>
     */
    @NameInMap("BackChannelConfig")
    public String backChannelConfigShrink;

    /**
     * <p>The conversation mode. Valid values:</p>
     * <ul>
     * <li>1: Natural conversation mode (default).</li>
     * <li>2: Walkie-talkie mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatMode")
    public Integer chatMode;

    /**
     * <p>If enabled, the LLM must support multimodal data.</p>
     */
    @NameInMap("EnableVideoUnderstanding")
    public Boolean enableVideoUnderstanding;

    /**
     * <p>The greeting message. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Good morning, my friend</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231312312131231</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The agent interruption configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public String interruptConfigShrink;

    /**
     * <p>The interruption mode. Valid values:</p>
     * <ul>
     * <li>1: Interruption supported (default).</li>
     * <li>2: Interruption disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InterruptMode")
    public Integer interruptMode;

    /**
     * <p>The large language model settings.</p>
     */
    @NameInMap("LlmConfig")
    public String llmConfigShrink;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The preferred video stream for the agent to understand after visual understanding is enabled. The agent can understand only one video stream. When both the camera stream and the screen sharing stream are pushed:</p>
     * <p>1 - The agent prioritizes understanding the camera stream.</p>
     * <p>2 - The agent prioritizes understanding the screen sharing stream.</p>
     * <p>By default, the agent prioritizes understanding the camera stream.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PreferVideo")
    public Integer preferVideo;

    /**
     * <p>The text-to-speech settings.</p>
     */
    @NameInMap("TtsConfig")
    public String ttsConfigShrink;

    /**
     * <p>The agent type. Valid values:</p>
     * <ul>
     * <li>1: Voice call (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static ModifyAppAgentTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentTemplateShrinkRequest self = new ModifyAppAgentTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentTemplateShrinkRequest setAgentSilenceConfigShrink(String agentSilenceConfigShrink) {
        this.agentSilenceConfigShrink = agentSilenceConfigShrink;
        return this;
    }
    public String getAgentSilenceConfigShrink() {
        return this.agentSilenceConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setAmbientSoundConfigShrink(String ambientSoundConfigShrink) {
        this.ambientSoundConfigShrink = ambientSoundConfigShrink;
        return this;
    }
    public String getAmbientSoundConfigShrink() {
        return this.ambientSoundConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppAgentTemplateShrinkRequest setAsrConfigShrink(String asrConfigShrink) {
        this.asrConfigShrink = asrConfigShrink;
        return this;
    }
    public String getAsrConfigShrink() {
        return this.asrConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setBackChannelConfigShrink(String backChannelConfigShrink) {
        this.backChannelConfigShrink = backChannelConfigShrink;
        return this;
    }
    public String getBackChannelConfigShrink() {
        return this.backChannelConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
    }

    public ModifyAppAgentTemplateShrinkRequest setEnableVideoUnderstanding(Boolean enableVideoUnderstanding) {
        this.enableVideoUnderstanding = enableVideoUnderstanding;
        return this;
    }
    public Boolean getEnableVideoUnderstanding() {
        return this.enableVideoUnderstanding;
    }

    public ModifyAppAgentTemplateShrinkRequest setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
    }

    public ModifyAppAgentTemplateShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyAppAgentTemplateShrinkRequest setInterruptConfigShrink(String interruptConfigShrink) {
        this.interruptConfigShrink = interruptConfigShrink;
        return this;
    }
    public String getInterruptConfigShrink() {
        return this.interruptConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setInterruptMode(Integer interruptMode) {
        this.interruptMode = interruptMode;
        return this;
    }
    public Integer getInterruptMode() {
        return this.interruptMode;
    }

    public ModifyAppAgentTemplateShrinkRequest setLlmConfigShrink(String llmConfigShrink) {
        this.llmConfigShrink = llmConfigShrink;
        return this;
    }
    public String getLlmConfigShrink() {
        return this.llmConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAppAgentTemplateShrinkRequest setPreferVideo(Integer preferVideo) {
        this.preferVideo = preferVideo;
        return this;
    }
    public Integer getPreferVideo() {
        return this.preferVideo;
    }

    public ModifyAppAgentTemplateShrinkRequest setTtsConfigShrink(String ttsConfigShrink) {
        this.ttsConfigShrink = ttsConfigShrink;
        return this;
    }
    public String getTtsConfigShrink() {
        return this.ttsConfigShrink;
    }

    public ModifyAppAgentTemplateShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
