// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteAppEnvRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppEnvRequest self = new DeleteAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DeleteAppEnvRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
