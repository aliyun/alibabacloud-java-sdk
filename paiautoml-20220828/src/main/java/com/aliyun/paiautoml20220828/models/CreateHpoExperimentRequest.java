// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateHpoExperimentRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Description")
    public String description;

    @NameInMap("HpoExperimentConfiguration")
    public HpoExperimentConfig hpoExperimentConfiguration;

    @NameInMap("Name")
    public String name;

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
