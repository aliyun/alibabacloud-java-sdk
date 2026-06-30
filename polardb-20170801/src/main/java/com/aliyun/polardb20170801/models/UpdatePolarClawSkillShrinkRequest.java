// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawSkillShrinkRequest extends TeaModel {
    /**
     * <p>The Skill API key. An empty string indicates that the key is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>my-api</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

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
     * <p>Specifies whether to enable the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The environment variables as a key-value map. A null value indicates that the variable is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NETA_TOKEN&quot;:&quot;my-token&quot;}</p>
     */
    @NameInMap("Env")
    public String envShrink;

    /**
     * <p>The Skill identifier key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibacloud-rds-copilot</p>
     */
    @NameInMap("SkillKey")
    public String skillKey;

    public static UpdatePolarClawSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawSkillShrinkRequest self = new UpdatePolarClawSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawSkillShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public UpdatePolarClawSkillShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawSkillShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdatePolarClawSkillShrinkRequest setEnvShrink(String envShrink) {
        this.envShrink = envShrink;
        return this;
    }
    public String getEnvShrink() {
        return this.envShrink;
    }

    public UpdatePolarClawSkillShrinkRequest setSkillKey(String skillKey) {
        this.skillKey = skillKey;
        return this;
    }
    public String getSkillKey() {
        return this.skillKey;
    }

}
