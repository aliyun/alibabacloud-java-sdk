// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationGroupRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the application group in CloudMonitor.</p>
     */
    @NameInMap("CmsGroupId")
    public String cmsGroupId;

    /**
     * <p>The ID of the region in which the related sources reside.</p>
     */
    @NameInMap("DeployRegionId")
    public String deployRegionId;

    /**
     * <p>The description of the application group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The key of the tag. You must set both the ImportTagKey and the ImportTagValue parameters, or leave both of them empty. If you do not set the ImportTagKey and ImportTagValue parameters, the application name is used for this parameter by default.</p>
     */
    @NameInMap("ImportTagKey")
    public String importTagKey;

    /**
     * <p>The value of the tag. You must set both the ImportTagKey and the ImportTagValue parameters, or leave both of them empty. If you do not set the ImportTagKey and ImportTagValue parameters, the application group name is used for this parameter by default.</p>
     */
    @NameInMap("ImportTagValue")
    public String importTagValue;

    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     */
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
