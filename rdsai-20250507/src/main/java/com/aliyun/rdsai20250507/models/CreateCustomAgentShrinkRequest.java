// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateCustomAgentShrinkRequest extends TeaModel {
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
    public String skillIdsShrink;

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
    public String toolsShrink;

    public static CreateCustomAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentShrinkRequest self = new CreateCustomAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentShrinkRequest setEnableTools(Boolean enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    public CreateCustomAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomAgentShrinkRequest setSkillIdsShrink(String skillIdsShrink) {
        this.skillIdsShrink = skillIdsShrink;
        return this;
    }
    public String getSkillIdsShrink() {
        return this.skillIdsShrink;
    }

    public CreateCustomAgentShrinkRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateCustomAgentShrinkRequest setToolsShrink(String toolsShrink) {
        this.toolsShrink = toolsShrink;
        return this;
    }
    public String getToolsShrink() {
        return this.toolsShrink;
    }

}
