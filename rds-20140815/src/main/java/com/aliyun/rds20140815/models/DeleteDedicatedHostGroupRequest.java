// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostGroupRequest extends TeaModel {
    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDedicatedHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostGroupRequest self = new DeleteDedicatedHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostGroupRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DeleteDedicatedHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
