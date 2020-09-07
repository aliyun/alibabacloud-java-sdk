// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ClearDedicatedHostRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("FailoverMode")
    @Validation(required = true)
    public String failoverMode;

    public static ClearDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearDedicatedHostRequest self = new ClearDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

    public ClearDedicatedHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ClearDedicatedHostRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ClearDedicatedHostRequest setFailoverMode(String failoverMode) {
        this.failoverMode = failoverMode;
        return this;
    }
    public String getFailoverMode() {
        return this.failoverMode;
    }

}
