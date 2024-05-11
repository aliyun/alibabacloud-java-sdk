// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateLayerRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerRequest self = new CreateLayerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLayerRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateLayerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLayerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateLayerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
