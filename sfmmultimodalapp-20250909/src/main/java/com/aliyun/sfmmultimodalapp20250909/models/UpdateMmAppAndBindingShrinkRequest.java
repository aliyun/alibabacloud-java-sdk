// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppAndBindingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BindingConfig")
    public String bindingConfigShrink;

    @NameInMap("ConversationConfig")
    public String conversationConfigShrink;

    @NameInMap("MemoryConfig")
    public String memoryConfigShrink;

    @NameInMap("ModelConfig")
    public String modelConfigShrink;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppAndBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppAndBindingShrinkRequest self = new UpdateMmAppAndBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppAndBindingShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppAndBindingShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMmAppAndBindingShrinkRequest setBindingConfigShrink(String bindingConfigShrink) {
        this.bindingConfigShrink = bindingConfigShrink;
        return this;
    }
    public String getBindingConfigShrink() {
        return this.bindingConfigShrink;
    }

    public UpdateMmAppAndBindingShrinkRequest setConversationConfigShrink(String conversationConfigShrink) {
        this.conversationConfigShrink = conversationConfigShrink;
        return this;
    }
    public String getConversationConfigShrink() {
        return this.conversationConfigShrink;
    }

    public UpdateMmAppAndBindingShrinkRequest setMemoryConfigShrink(String memoryConfigShrink) {
        this.memoryConfigShrink = memoryConfigShrink;
        return this;
    }
    public String getMemoryConfigShrink() {
        return this.memoryConfigShrink;
    }

    public UpdateMmAppAndBindingShrinkRequest setModelConfigShrink(String modelConfigShrink) {
        this.modelConfigShrink = modelConfigShrink;
        return this;
    }
    public String getModelConfigShrink() {
        return this.modelConfigShrink;
    }

    public UpdateMmAppAndBindingShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateMmAppAndBindingShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
