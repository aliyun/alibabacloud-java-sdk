// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentSkillsRequest extends TeaModel {
    /**
     * <p>Agent ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The skill allowlist. A value of null indicates that all skills are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;alibacloud-rds-copilot&quot;]</p>
     */
    @NameInMap("Skills")
    public java.util.List<String> skills;

    public static UpdatePolarClawAgentSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentSkillsRequest self = new UpdatePolarClawAgentSkillsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentSkillsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentSkillsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentSkillsRequest setSkills(java.util.List<String> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<String> getSkills() {
        return this.skills;
    }

}
