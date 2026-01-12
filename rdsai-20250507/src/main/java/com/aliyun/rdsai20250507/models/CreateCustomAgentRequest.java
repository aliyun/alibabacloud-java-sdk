// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateCustomAgentRequest extends TeaModel {
    /**
     * <p>The system prompts.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public Boolean enableTools;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>CreateCustomAgent</strong>.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the dedicated agent.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>Specifies whether to enable tools.</p>
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
