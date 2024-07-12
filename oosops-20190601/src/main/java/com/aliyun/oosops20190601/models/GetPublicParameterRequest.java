// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetPublicParameterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ParameterVersion")
    public Integer parameterVersion;

    @NameInMap("RegionId")
    public String regionId;

    public static GetPublicParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicParameterRequest self = new GetPublicParameterRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPublicParameterRequest setParameterVersion(Integer parameterVersion) {
        this.parameterVersion = parameterVersion;
        return this;
    }
    public Integer getParameterVersion() {
        return this.parameterVersion;
    }

    public GetPublicParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
