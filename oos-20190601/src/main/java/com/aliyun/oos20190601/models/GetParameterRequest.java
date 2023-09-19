// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParameterRequest extends TeaModel {
    /**
     * <p>The name of the common parameter. The name can be up to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version number of the common parameter. Valid values: 1 to 100.</p>
     */
    @NameInMap("ParameterVersion")
    public Integer parameterVersion;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParameterRequest self = new GetParameterRequest();
        return TeaModel.build(map, self);
    }

    public GetParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetParameterRequest setParameterVersion(Integer parameterVersion) {
        this.parameterVersion = parameterVersion;
        return this;
    }
    public Integer getParameterVersion() {
        return this.parameterVersion;
    }

    public GetParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetParameterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
