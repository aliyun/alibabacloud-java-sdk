// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("CpuAllocationRatio")
    public Integer cpuAllocationRatio;

    @NameInMap("MemAllocationRatio")
    public Integer memAllocationRatio;

    @NameInMap("DiskAllocationRatio")
    public Integer diskAllocationRatio;

    @NameInMap("AllocationPolicy")
    public String allocationPolicy;

    @NameInMap("VPCId")
    @Validation(required = true)
    public String VPCId;

    @NameInMap("HostReplacePolicy")
    public String hostReplacePolicy;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    @NameInMap("OpenPermission")
    public Integer openPermission;

    public static CreateDedicatedHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostGroupRequest self = new CreateDedicatedHostGroupRequest();
        return TeaModel.build(map, self);
    }

}
