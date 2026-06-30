// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentToolsRequest extends TeaModel {
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
    public java.util.List<String> allow;

    /**
     * <p>The list of additionally allowed tools.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;send_message&quot;]</p>
     */
    @NameInMap("AlsoAllow")
    public java.util.List<String> alsoAllow;

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
    public java.util.List<String> deny;

    /**
     * <p>The tool profile.</p>
     * 
     * <strong>example:</strong>
     * <p>coding</p>
     */
    @NameInMap("Profile")
    public String profile;

    public static UpdatePolarClawAgentToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentToolsRequest self = new UpdatePolarClawAgentToolsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentToolsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentToolsRequest setAllow(java.util.List<String> allow) {
        this.allow = allow;
        return this;
    }
    public java.util.List<String> getAllow() {
        return this.allow;
    }

    public UpdatePolarClawAgentToolsRequest setAlsoAllow(java.util.List<String> alsoAllow) {
        this.alsoAllow = alsoAllow;
        return this;
    }
    public java.util.List<String> getAlsoAllow() {
        return this.alsoAllow;
    }

    public UpdatePolarClawAgentToolsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentToolsRequest setDeny(java.util.List<String> deny) {
        this.deny = deny;
        return this;
    }
    public java.util.List<String> getDeny() {
        return this.deny;
    }

    public UpdatePolarClawAgentToolsRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

}
