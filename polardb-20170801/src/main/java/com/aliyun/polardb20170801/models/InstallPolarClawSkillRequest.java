// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class InstallPolarClawSkillRequest extends TeaModel {
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
     * <p>Specifies whether to force a reinstallation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.0</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <p>The Skill identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>alibacloud-rds-copilot</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The source.</p>
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
