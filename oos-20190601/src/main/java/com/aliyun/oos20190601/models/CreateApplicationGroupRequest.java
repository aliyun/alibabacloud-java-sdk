// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationGroupRequest extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CmsGroupId")
    public String cmsGroupId;

    @NameInMap("DeployRegionId")
    public String deployRegionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImportTagKey")
    public String importTagKey;

    @NameInMap("ImportTagValue")
    public String importTagValue;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationGroupRequest self = new CreateApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateApplicationGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationGroupRequest setCmsGroupId(String cmsGroupId) {
        this.cmsGroupId = cmsGroupId;
        return this;
    }
    public String getCmsGroupId() {
        return this.cmsGroupId;
    }

    public CreateApplicationGroupRequest setDeployRegionId(String deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

    public CreateApplicationGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationGroupRequest setImportTagKey(String importTagKey) {
        this.importTagKey = importTagKey;
        return this;
    }
    public String getImportTagKey() {
        return this.importTagKey;
    }

    public CreateApplicationGroupRequest setImportTagValue(String importTagValue) {
        this.importTagValue = importTagValue;
        return this;
    }
    public String getImportTagValue() {
        return this.importTagValue;
    }

    public CreateApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
