// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The creation time of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-27 16:01:28</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>Indicates whether tools are enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public Boolean enableTools;

    /**
     * <p>AgentId</p>
     * 
     * <strong>example:</strong>
     * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
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
    public java.util.List<CreateCustomAgentResponseBodySkills> skills;

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

    public static CreateCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentResponseBody self = new CreateCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateCustomAgentResponseBody setEnableTools(Boolean enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    public CreateCustomAgentResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCustomAgentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomAgentResponseBody setSkills(java.util.List<CreateCustomAgentResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<CreateCustomAgentResponseBodySkills> getSkills() {
        return this.skills;
    }

    public CreateCustomAgentResponseBody setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateCustomAgentResponseBody setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public static class CreateCustomAgentResponseBodySkills extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillType")
        public String skillType;

        public static CreateCustomAgentResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodySkills self = new CreateCustomAgentResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodySkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCustomAgentResponseBodySkills setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateCustomAgentResponseBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCustomAgentResponseBodySkills setSkillType(String skillType) {
            this.skillType = skillType;
            return this;
        }
        public String getSkillType() {
            return this.skillType;
        }

    }

}
