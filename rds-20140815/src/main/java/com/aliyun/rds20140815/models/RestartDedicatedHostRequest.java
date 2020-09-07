// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestartDedicatedHostRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("FailoverMode")
    @Validation(required = true)
    public String failoverMode;

    public static RestartDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDedicatedHostRequest self = new RestartDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

    public RestartDedicatedHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartDedicatedHostRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RestartDedicatedHostRequest setFailoverMode(String failoverMode) {
        this.failoverMode = failoverMode;
        return this;
    }
    public String getFailoverMode() {
        return this.failoverMode;
    }

}
