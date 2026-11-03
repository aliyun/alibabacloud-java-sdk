// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class InstallPolarClawSkillRequest extends TeaModel {
    /**
     * <p>The target agent in the workspace. If not specified, the default agent is used.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
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
     * <p>Specifies whether to force reinstallation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The scope. Valid values: workspace (default) and global (shared directory). This parameter is mutually exclusive with AgentId.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.0</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <p>The skill identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>alibacloud-rds-copilot</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The source. Default value: polarhub.</p>
     * 
     * <strong>example:</strong>
     * <p>clawhub</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/skill.tar.gz">https://example.com/skill.tar.gz</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static InstallPolarClawSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallPolarClawSkillRequest self = new InstallPolarClawSkillRequest();
        return TeaModel.build(map, self);
    }

    public InstallPolarClawSkillRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public InstallPolarClawSkillRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public InstallPolarClawSkillRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public InstallPolarClawSkillRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public InstallPolarClawSkillRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

    public InstallPolarClawSkillRequest setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public InstallPolarClawSkillRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public InstallPolarClawSkillRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
