// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentResponseBody extends TeaModel {
    /**
     * <p>Indicates whether tools are enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public String enableTools;

    /**
     * <p>The ID of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>82cf3d62-0add-47bd-869f-877131f7****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the agent.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Skills")
    public java.util.List<UpdateCustomAgentResponseBodySkills> skills;

    /**
     * <p>The system prompts.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The information about the tool.</p>
     */
    @NameInMap("Tools")
    public java.util.List<String> tools;

    public static UpdateCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentResponseBody self = new UpdateCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentResponseBody setEnableTools(String enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public String getEnableTools() {
        return this.enableTools;
    }

    public UpdateCustomAgentResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCustomAgentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCustomAgentResponseBody setSkills(java.util.List<UpdateCustomAgentResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<UpdateCustomAgentResponseBodySkills> getSkills() {
        return this.skills;
    }

    public UpdateCustomAgentResponseBody setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateCustomAgentResponseBody setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public static class UpdateCustomAgentResponseBodySkills extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillType")
        public String skillType;

        public static UpdateCustomAgentResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodySkills self = new UpdateCustomAgentResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodySkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCustomAgentResponseBodySkills setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCustomAgentResponseBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCustomAgentResponseBodySkills setSkillType(String skillType) {
            this.skillType = skillType;
            return this;
        }
        public String getSkillType() {
            return this.skillType;
        }

    }

}
