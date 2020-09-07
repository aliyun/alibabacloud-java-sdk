// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostGroupAttributeRequest extends TeaModel {
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

    public ModifyDedicatedHostGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostGroupAttributeRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public ModifyDedicatedHostGroupAttributeRequest setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
        this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
        return this;
    }
    public String getDedicatedHostGroupDesc() {
        return this.dedicatedHostGroupDesc;
    }

    public ModifyDedicatedHostGroupAttributeRequest setCpuAllocationRatio(Integer cpuAllocationRatio) {
        this.cpuAllocationRatio = cpuAllocationRatio;
        return this;
    }
    public Integer getCpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }

    public ModifyDedicatedHostGroupAttributeRequest setMemAllocationRatio(Integer memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public Integer getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public ModifyDedicatedHostGroupAttributeRequest setDiskAllocationRatio(Integer diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public Integer getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public ModifyDedicatedHostGroupAttributeRequest setAllocationPolicy(String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
        return this;
    }
    public String getAllocationPolicy() {
        return this.allocationPolicy;
    }

    public ModifyDedicatedHostGroupAttributeRequest setHostReplacePolicy(String hostReplacePolicy) {
        this.hostReplacePolicy = hostReplacePolicy;
        return this;
    }
    public String getHostReplacePolicy() {
        return this.hostReplacePolicy;
    }

}
