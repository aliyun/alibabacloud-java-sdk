// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentToolsShrinkRequest extends TeaModel {
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
     * <p>The list of explicitly allowed tools.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;read&quot;,&quot;write&quot;,&quot;exec&quot;]</p>
     */
    @NameInMap("Allow")
    public String allowShrink;

    /**
     * <p>The list of additionally allowed tools.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;send_message&quot;]</p>
     */
    @NameInMap("AlsoAllow")
    public String alsoAllowShrink;

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
     * <p>The list of denied tools.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;exec&quot;]</p>
     */
    @NameInMap("Deny")
    public String denyShrink;

    /**
     * <p>The tool profile.</p>
     * 
     * <strong>example:</strong>
     * <p>coding</p>
     */
    @NameInMap("Profile")
    public String profile;

    public static UpdatePolarClawAgentToolsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentToolsShrinkRequest self = new UpdatePolarClawAgentToolsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentToolsShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentToolsShrinkRequest setAllowShrink(String allowShrink) {
        this.allowShrink = allowShrink;
        return this;
    }
    public String getAllowShrink() {
        return this.allowShrink;
    }

    public UpdatePolarClawAgentToolsShrinkRequest setAlsoAllowShrink(String alsoAllowShrink) {
        this.alsoAllowShrink = alsoAllowShrink;
        return this;
    }
    public String getAlsoAllowShrink() {
        return this.alsoAllowShrink;
    }

    public UpdatePolarClawAgentToolsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentToolsShrinkRequest setDenyShrink(String denyShrink) {
        this.denyShrink = denyShrink;
        return this;
    }
    public String getDenyShrink() {
        return this.denyShrink;
    }

    public UpdatePolarClawAgentToolsShrinkRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

}
