// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeployApplicationGroupRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The deployment information about the application group.</p>
     */
    @NameInMap("DeployParameters")
    public String deployParameters;

    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region in which you want to deploy the application group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeployApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationGroupRequest self = new DeployApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DeployApplicationGroupRequest setDeployParameters(String deployParameters) {
        this.deployParameters = deployParameters;
        return this;
    }
    public String getDeployParameters() {
        return this.deployParameters;
    }

    public DeployApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
