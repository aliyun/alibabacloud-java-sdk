// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressWithRCInstanceRequest extends TeaModel {
    /**
     * <p>The EIP ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-bp166out2x4bpcf******</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-i322y2t562oh7o******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UnassociateEipAddressWithRCInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressWithRCInstanceRequest self = new UnassociateEipAddressWithRCInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressWithRCInstanceRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public UnassociateEipAddressWithRCInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnassociateEipAddressWithRCInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
