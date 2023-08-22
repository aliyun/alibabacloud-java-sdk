// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("dataRedundancyType")
    public String dataRedundancyType;

    @NameInMap("description")
    public String description;

    @NameInMap("projectName")
    public String projectName;

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
