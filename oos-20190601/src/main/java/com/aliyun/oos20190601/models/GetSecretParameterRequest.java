// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParameterRequest extends TeaModel {
    /**
     * <p>The name of the parameter. The name must be 1 to 180 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySecretParameter</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version number of the common parameter. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParameterVersion")
    public Integer parameterVersion;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to decrypt the parameter value. The decrypted parameter value is returned only if this parameter is set to true. Otherwise, null is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static GetSecretParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParameterRequest self = new GetSecretParameterRequest();
        return TeaModel.build(map, self);
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

    public GetSecretParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretParameterRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
