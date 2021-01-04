// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParameterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParameterVersion")
    public Integer parameterVersion;

    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static GetSecretParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParameterRequest self = new GetSecretParameterRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSecretParameterRequest setParameterVersion(Integer parameterVersion) {
        this.parameterVersion = parameterVersion;
        return this;
    }
    public Integer getParameterVersion() {
        return this.parameterVersion;
    }

    public GetSecretParameterRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
