// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceDedicatedHostRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("FailoverMode")
    @Validation(required = true)
    public String failoverMode;

    public static ReplaceDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDedicatedHostRequest self = new ReplaceDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceDedicatedHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceDedicatedHostRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ReplaceDedicatedHostRequest setFailoverMode(String failoverMode) {
        this.failoverMode = failoverMode;
        return this;
    }
    public String getFailoverMode() {
        return this.failoverMode;
    }

}
