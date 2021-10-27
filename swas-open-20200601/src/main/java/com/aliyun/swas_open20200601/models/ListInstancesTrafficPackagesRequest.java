// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesTrafficPackagesRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static ListInstancesTrafficPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesTrafficPackagesRequest self = new ListInstancesTrafficPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesTrafficPackagesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesTrafficPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
