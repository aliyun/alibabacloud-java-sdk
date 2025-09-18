// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>多模态应用xxxxx</p>
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
     * <p>提示词，不超过8000字符</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppShrinkRequest self = new UpdateMmAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMmAppShrinkRequest setBindingConfigShrink(String bindingConfigShrink) {
        this.bindingConfigShrink = bindingConfigShrink;
        return this;
    }
    public String getBindingConfigShrink() {
        return this.bindingConfigShrink;
    }

    public UpdateMmAppShrinkRequest setConversationConfigShrink(String conversationConfigShrink) {
        this.conversationConfigShrink = conversationConfigShrink;
        return this;
    }
    public String getConversationConfigShrink() {
        return this.conversationConfigShrink;
    }

    public UpdateMmAppShrinkRequest setModelConfigShrink(String modelConfigShrink) {
        this.modelConfigShrink = modelConfigShrink;
        return this;
    }
    public String getModelConfigShrink() {
        return this.modelConfigShrink;
    }

    public UpdateMmAppShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateMmAppShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
