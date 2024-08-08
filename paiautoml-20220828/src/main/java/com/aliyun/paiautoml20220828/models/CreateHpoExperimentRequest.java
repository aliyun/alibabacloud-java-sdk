// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateHpoExperimentRequest extends TeaModel {
    /**
     * <p>Experiment accesibility, public or private.</p>
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
     * <p>The config object of the expriment.</p>
     */
    @NameInMap("HpoExperimentConfiguration")
    public HpoExperimentConfig hpoExperimentConfiguration;

    /**
     * <p>Experiment Name</p>
     * 
     * <strong>example:</strong>
     * <p>my experiment x</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>AI Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateHpoExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHpoExperimentRequest self = new CreateHpoExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateHpoExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateHpoExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHpoExperimentRequest setHpoExperimentConfiguration(HpoExperimentConfig hpoExperimentConfiguration) {
        this.hpoExperimentConfiguration = hpoExperimentConfiguration;
        return this;
    }
    public HpoExperimentConfig getHpoExperimentConfiguration() {
        return this.hpoExperimentConfiguration;
    }

    public CreateHpoExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHpoExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
