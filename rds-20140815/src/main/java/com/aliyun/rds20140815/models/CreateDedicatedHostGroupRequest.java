// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostGroupRequest extends TeaModel {
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

    public CreateDedicatedHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedHostGroupRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDedicatedHostGroupRequest setCpuAllocationRatio(Integer cpuAllocationRatio) {
        this.cpuAllocationRatio = cpuAllocationRatio;
        return this;
    }
    public Integer getCpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }

    public CreateDedicatedHostGroupRequest setMemAllocationRatio(Integer memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public Integer getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public CreateDedicatedHostGroupRequest setDiskAllocationRatio(Integer diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public Integer getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public CreateDedicatedHostGroupRequest setAllocationPolicy(String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
        return this;
    }
    public String getAllocationPolicy() {
        return this.allocationPolicy;
    }

    public CreateDedicatedHostGroupRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDedicatedHostGroupRequest setHostReplacePolicy(String hostReplacePolicy) {
        this.hostReplacePolicy = hostReplacePolicy;
        return this;
    }
    public String getHostReplacePolicy() {
        return this.hostReplacePolicy;
    }

    public CreateDedicatedHostGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDedicatedHostGroupRequest setOpenPermission(Integer openPermission) {
        this.openPermission = openPermission;
        return this;
    }
    public Integer getOpenPermission() {
        return this.openPermission;
    }

}
