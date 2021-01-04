// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Names")
    public String names;

    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static GetSecretParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersRequest self = new GetSecretParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretParametersRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public GetSecretParametersRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
