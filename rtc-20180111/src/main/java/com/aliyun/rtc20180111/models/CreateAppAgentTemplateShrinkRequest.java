// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppAgentTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The agent silence configuration.</p>
     */
    @NameInMap("AgentSilenceConfig")
    public String agentSilenceConfigShrink;

    /**
     * <p>The ambient environment configuration for the agent. If this parameter is not specified, the ambient environment configuration is not used.</p>
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
     * <p>Specifies whether to enable video understanding. If enabled, the LLM must support multimodal data.</p>
     */
    @NameInMap("EnableVideoUnderstanding")
    public Boolean enableVideoUnderstanding;

    /**
     * <p>The greeting message. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Good morning, my friend!</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The agent interruption configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public String interruptConfigShrink;

    /**
     * <p>The interruption mode. Valid values:</p>
     * <ul>
     * <li>1: Interruption allowed (default).</li>
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
     * <p>The preferred video stream for the agent to process when visual understanding is enabled. The agent can process only one video stream at a time. When both the camera stream and the screen sharing stream are pushed simultaneously, this parameter specifies the preferred stream. Valid values:</p>
     * <ul>
     * <li>1: The agent preferentially processes the camera stream.</li>
     * <li>2: The agent preferentially processes the screen sharing stream.
     * Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public static CreateAppAgentTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAgentTemplateShrinkRequest self = new CreateAppAgentTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAgentTemplateShrinkRequest setAgentSilenceConfigShrink(String agentSilenceConfigShrink) {
        this.agentSilenceConfigShrink = agentSilenceConfigShrink;
        return this;
    }
    public String getAgentSilenceConfigShrink() {
        return this.agentSilenceConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setAmbientSoundConfigShrink(String ambientSoundConfigShrink) {
        this.ambientSoundConfigShrink = ambientSoundConfigShrink;
        return this;
    }
    public String getAmbientSoundConfigShrink() {
        return this.ambientSoundConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppAgentTemplateShrinkRequest setAsrConfigShrink(String asrConfigShrink) {
        this.asrConfigShrink = asrConfigShrink;
        return this;
    }
    public String getAsrConfigShrink() {
        return this.asrConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setBackChannelConfigShrink(String backChannelConfigShrink) {
        this.backChannelConfigShrink = backChannelConfigShrink;
        return this;
    }
    public String getBackChannelConfigShrink() {
        return this.backChannelConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
    }

    public CreateAppAgentTemplateShrinkRequest setEnableVideoUnderstanding(Boolean enableVideoUnderstanding) {
        this.enableVideoUnderstanding = enableVideoUnderstanding;
        return this;
    }
    public Boolean getEnableVideoUnderstanding() {
        return this.enableVideoUnderstanding;
    }

    public CreateAppAgentTemplateShrinkRequest setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
    }

    public CreateAppAgentTemplateShrinkRequest setInterruptConfigShrink(String interruptConfigShrink) {
        this.interruptConfigShrink = interruptConfigShrink;
        return this;
    }
    public String getInterruptConfigShrink() {
        return this.interruptConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setInterruptMode(Integer interruptMode) {
        this.interruptMode = interruptMode;
        return this;
    }
    public Integer getInterruptMode() {
        return this.interruptMode;
    }

    public CreateAppAgentTemplateShrinkRequest setLlmConfigShrink(String llmConfigShrink) {
        this.llmConfigShrink = llmConfigShrink;
        return this;
    }
    public String getLlmConfigShrink() {
        return this.llmConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppAgentTemplateShrinkRequest setPreferVideo(Integer preferVideo) {
        this.preferVideo = preferVideo;
        return this;
    }
    public Integer getPreferVideo() {
        return this.preferVideo;
    }

    public CreateAppAgentTemplateShrinkRequest setTtsConfigShrink(String ttsConfigShrink) {
        this.ttsConfigShrink = ttsConfigShrink;
        return this;
    }
    public String getTtsConfigShrink() {
        return this.ttsConfigShrink;
    }

    public CreateAppAgentTemplateShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
