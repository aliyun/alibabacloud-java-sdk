// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppAgentTemplateShrinkRequest extends TeaModel {
    @NameInMap("AgentSilenceConfig")
    public String agentSilenceConfigShrink;

    @NameInMap("AmbientSoundConfig")
    public String ambientSoundConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AsrConfig")
    public String asrConfigShrink;

    @NameInMap("BackChannelConfig")
    public String backChannelConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatMode")
    public Integer chatMode;

    @NameInMap("Greeting")
    public String greeting;

    @NameInMap("InterruptConfig")
    public String interruptConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InterruptMode")
    public Integer interruptMode;

    @NameInMap("LlmConfig")
    public String llmConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>智能体模版</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TtsConfig")
    public String ttsConfigShrink;

    /**
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
