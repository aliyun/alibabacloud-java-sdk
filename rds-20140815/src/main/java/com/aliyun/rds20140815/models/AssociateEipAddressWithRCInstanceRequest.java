// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AssociateEipAddressWithRCInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eip-bp166out2x4bpcf******</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <strong>example:</strong>
     * <p>rc-i322y2t562oh7o******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
