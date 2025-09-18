// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMmAppShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>多模态xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BindingConfig")
    public String bindingConfigShrink;

    @NameInMap("ConversationConfig")
    public String conversationConfigShrink;

    @NameInMap("ModelConfig")
    public String modelConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMmAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMmAppShrinkRequest self = new CreateMmAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMmAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateMmAppShrinkRequest setBindingConfigShrink(String bindingConfigShrink) {
        this.bindingConfigShrink = bindingConfigShrink;
        return this;
    }
    public String getBindingConfigShrink() {
        return this.bindingConfigShrink;
    }

    public CreateMmAppShrinkRequest setConversationConfigShrink(String conversationConfigShrink) {
        this.conversationConfigShrink = conversationConfigShrink;
        return this;
    }
    public String getConversationConfigShrink() {
        return this.conversationConfigShrink;
    }

    public CreateMmAppShrinkRequest setModelConfigShrink(String modelConfigShrink) {
        this.modelConfigShrink = modelConfigShrink;
        return this;
    }
    public String getModelConfigShrink() {
        return this.modelConfigShrink;
    }

    public CreateMmAppShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateMmAppShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
