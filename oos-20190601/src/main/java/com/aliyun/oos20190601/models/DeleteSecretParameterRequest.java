// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteSecretParameterRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSecretParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretParameterRequest self = new DeleteSecretParameterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteSecretParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
