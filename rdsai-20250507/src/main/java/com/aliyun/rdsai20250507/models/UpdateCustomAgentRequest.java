// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>UpdateCustomAgent</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ebe44453-3b41-4c74-94d1-01d088d7****</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <p>The system prompts.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public Boolean enableTools;

    /**
     * <p>The ID of the agent.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    /**
     * <p>The name of the agent.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>Specifies whether to enable tools.</p>
     */
    @NameInMap("Tools")
    public java.util.List<String> tools;

    public static UpdateCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentRequest self = new UpdateCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public UpdateCustomAgentRequest setEnableTools(Boolean enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    public UpdateCustomAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomAgentRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public UpdateCustomAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateCustomAgentRequest setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

}
