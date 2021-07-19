// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeployRegionId")
    public String deployRegionId;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("CreateType")
    public String createType;

    @NameInMap("ImportClusterId")
    public String importClusterId;

    @NameInMap("Name")
    public String name;

    public static CreateApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationGroupRequest self = new CreateApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateApplicationGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationGroupRequest setDeployRegionId(String deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

    public CreateApplicationGroupRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateApplicationGroupRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateApplicationGroupRequest setImportClusterId(String importClusterId) {
        this.importClusterId = importClusterId;
        return this;
    }
    public String getImportClusterId() {
        return this.importClusterId;
    }

    public CreateApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
