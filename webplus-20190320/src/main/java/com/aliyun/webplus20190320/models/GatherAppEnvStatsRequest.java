// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class GatherAppEnvStatsRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("TargetInstances")
    public String targetInstances;

    @NameInMap("RegionId")
    public String regionId;

    public static GatherAppEnvStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GatherAppEnvStatsRequest self = new GatherAppEnvStatsRequest();
        return TeaModel.build(map, self);
    }

    public GatherAppEnvStatsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GatherAppEnvStatsRequest setTargetInstances(String targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }
    public String getTargetInstances() {
        return this.targetInstances;
    }

    public GatherAppEnvStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
