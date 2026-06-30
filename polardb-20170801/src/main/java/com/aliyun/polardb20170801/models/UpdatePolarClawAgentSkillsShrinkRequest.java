// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentSkillsShrinkRequest extends TeaModel {
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
    public String skillsShrink;

    public static UpdatePolarClawAgentSkillsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentSkillsShrinkRequest self = new UpdatePolarClawAgentSkillsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentSkillsShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentSkillsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentSkillsShrinkRequest setSkillsShrink(String skillsShrink) {
        this.skillsShrink = skillsShrink;
        return this;
    }
    public String getSkillsShrink() {
        return this.skillsShrink;
    }

}
