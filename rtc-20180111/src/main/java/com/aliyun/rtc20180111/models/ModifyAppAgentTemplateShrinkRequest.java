// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentTemplateShrinkRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatMode")
    public Integer chatMode;

    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231312312131231</p>
     */
    @NameInMap("Id")
    public String id;

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

    public static ModifyAppAgentTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentTemplateShrinkRequest self = new ModifyAppAgentTemplateShrinkRequest();
        return TeaModel.build(map, self);
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

    public ModifyAppAgentTemplateShrinkRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
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
