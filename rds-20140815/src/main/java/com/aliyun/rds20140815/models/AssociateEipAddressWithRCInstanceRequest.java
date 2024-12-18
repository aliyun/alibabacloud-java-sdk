// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AssociateEipAddressWithRCInstanceRequest extends TeaModel {
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static AssociateEipAddressWithRCInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressWithRCInstanceRequest self = new AssociateEipAddressWithRCInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressWithRCInstanceRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public AssociateEipAddressWithRCInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateEipAddressWithRCInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
