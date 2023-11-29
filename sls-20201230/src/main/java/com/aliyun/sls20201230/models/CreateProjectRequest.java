// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>Data redundancy type</p>
     */
    @NameInMap("dataRedundancyType")
    public String dataRedundancyType;

    /**
     * <p>The description of the project.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the project. The name must be unique in a region. You cannot change the name after you create the project. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be unique.</p>
     * <p>*   It can contain only lowercase letters, digits, and hyphens (-).</p>
     * <p>*   It must start and end with a lowercase letter or a digit.</p>
     * <p>*   It must be 3 to 63 characters in length.</p>
     */
    @NameInMap("projectName")
    public String projectName;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
