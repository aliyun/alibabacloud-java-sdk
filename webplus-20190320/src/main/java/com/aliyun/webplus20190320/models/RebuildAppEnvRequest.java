// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class RebuildAppEnvRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static RebuildAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildAppEnvRequest self = new RebuildAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public RebuildAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public RebuildAppEnvRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RebuildAppEnvRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
