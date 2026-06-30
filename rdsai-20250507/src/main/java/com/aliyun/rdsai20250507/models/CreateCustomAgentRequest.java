// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateCustomAgentRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable tools.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public Boolean enableTools;

    /**
     * <p>The name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>查询实例列表Agent</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    /**
     * <p>The system prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>我是您用来查询实例列表的专属Agent</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The tool information.</p>
     */
    @NameInMap("Tools")
    public java.util.List<String> tools;

    public static CreateCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentRequest self = new CreateCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentRequest setEnableTools(Boolean enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    public CreateCustomAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomAgentRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public CreateCustomAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateCustomAgentRequest setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

}
