// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostGroupAttributeRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHostGroupDesc")
    public String dedicatedHostGroupDesc;

    @NameInMap("CpuAllocationRatio")
    public Integer cpuAllocationRatio;

    @NameInMap("MemAllocationRatio")
    public Integer memAllocationRatio;

    @NameInMap("DiskAllocationRatio")
    public Integer diskAllocationRatio;

    @NameInMap("AllocationPolicy")
    public String allocationPolicy;

    @NameInMap("HostReplacePolicy")
    public String hostReplacePolicy;

    public static ModifyDedicatedHostGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostGroupAttributeRequest self = new ModifyDedicatedHostGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

}
