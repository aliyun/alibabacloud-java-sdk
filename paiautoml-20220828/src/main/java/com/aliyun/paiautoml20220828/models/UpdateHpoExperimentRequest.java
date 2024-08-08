// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class UpdateHpoExperimentRequest extends TeaModel {
    /**
     * <p>Experiment accessibility, private or public.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Experiment description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an AutoML HPO experiment.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Experiment configuration.</p>
     */
    @NameInMap("HpoExperimentConfiguration")
    public HpoExperimentConfig hpoExperimentConfiguration;

    /**
     * <p>Experiment name.</p>
     * 
     * <strong>example:</strong>
     * <p>my experiment x</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Expeirment\&quot;s AI workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateHpoExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHpoExperimentRequest self = new UpdateHpoExperimentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHpoExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateHpoExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHpoExperimentRequest setHpoExperimentConfiguration(HpoExperimentConfig hpoExperimentConfiguration) {
        this.hpoExperimentConfiguration = hpoExperimentConfiguration;
        return this;
    }
    public HpoExperimentConfig getHpoExperimentConfiguration() {
        return this.hpoExperimentConfiguration;
    }

    public UpdateHpoExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateHpoExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
