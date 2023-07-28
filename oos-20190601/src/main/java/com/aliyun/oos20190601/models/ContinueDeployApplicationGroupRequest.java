// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ContinueDeployApplicationGroupRequest extends TeaModel {
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
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ContinueDeployApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployApplicationGroupRequest self = new ContinueDeployApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public ContinueDeployApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ContinueDeployApplicationGroupRequest setDeployParameters(String deployParameters) {
        this.deployParameters = deployParameters;
        return this;
    }
    public String getDeployParameters() {
        return this.deployParameters;
    }

    public ContinueDeployApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContinueDeployApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
