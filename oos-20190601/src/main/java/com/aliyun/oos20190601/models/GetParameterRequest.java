// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParameterRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to GetParameter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The time when the common parameter was updated.</p>
     */
    @NameInMap("ParameterVersion")
    public Integer parameterVersion;

    /**
     * <p>The name of the common parameter.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user who created the common parameter.</p>
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
