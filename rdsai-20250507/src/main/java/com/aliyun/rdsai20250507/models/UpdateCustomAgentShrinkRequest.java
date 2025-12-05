// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentShrinkRequest extends TeaModel {
    /**
     * <p>AgentId。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ebe44453-3b41-4c74-94d1-01d088d7****</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public Boolean enableTools;

    @NameInMap("Name")
    public String name;

    @NameInMap("SystemPrompt")
    public String systemPrompt;

    @NameInMap("Tools")
    public String toolsShrink;

    public static UpdateCustomAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentShrinkRequest self = new UpdateCustomAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentShrinkRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public UpdateCustomAgentShrinkRequest setEnableTools(Boolean enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    public UpdateCustomAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomAgentShrinkRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateCustomAgentShrinkRequest setToolsShrink(String toolsShrink) {
        this.toolsShrink = toolsShrink;
        return this;
    }
    public String getToolsShrink() {
        return this.toolsShrink;
    }

}
