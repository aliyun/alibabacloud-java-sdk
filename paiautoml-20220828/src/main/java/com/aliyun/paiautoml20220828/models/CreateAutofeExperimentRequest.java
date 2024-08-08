// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateAutofeExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("AutofeExperimentConfiguration")
    public AutofeExperimentConfiguration autofeExperimentConfiguration;

    /**
     * <strong>example:</strong>
     * <p>This is an AutoFE experiment.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my experiment x</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>283301</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateAutofeExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutofeExperimentRequest self = new CreateAutofeExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutofeExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateAutofeExperimentRequest setAutofeExperimentConfiguration(AutofeExperimentConfiguration autofeExperimentConfiguration) {
        this.autofeExperimentConfiguration = autofeExperimentConfiguration;
        return this;
    }
    public AutofeExperimentConfiguration getAutofeExperimentConfiguration() {
        return this.autofeExperimentConfiguration;
    }

    public CreateAutofeExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAutofeExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAutofeExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
