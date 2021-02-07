// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class TerminateAppEnvRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static TerminateAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateAppEnvRequest self = new TerminateAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public TerminateAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public TerminateAppEnvRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public TerminateAppEnvRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
