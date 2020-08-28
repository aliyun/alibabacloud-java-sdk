// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("VPCId")
    @Validation(required = true)
    public String VPCId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String VSwitchId;

    @NameInMap("IPAddress")
    @Validation(required = true)
    public String IPAddress;

    @NameInMap("HostName")
    @Validation(required = true)
    public String hostName;

    @NameInMap("HostStatus")
    @Validation(required = true)
    public String hostStatus;

    @NameInMap("HostClass")
    @Validation(required = true)
    public String hostClass;

    @NameInMap("HostCPU")
    @Validation(required = true)
    public Integer hostCPU;

    @NameInMap("HostMem")
    @Validation(required = true)
    public Integer hostMem;

    @NameInMap("HostStorage")
    @Validation(required = true)
    public Integer hostStorage;

    @NameInMap("CPUAllocationRatio")
    @Validation(required = true)
    public String CPUAllocationRatio;

    @NameInMap("MemAllocationRatio")
    @Validation(required = true)
    public String memAllocationRatio;

    @NameInMap("DiskAllocationRatio")
    @Validation(required = true)
    public String diskAllocationRatio;

    @NameInMap("InstanceNumber")
    @Validation(required = true)
    public Integer instanceNumber;

    @NameInMap("InstanceNumberMaster")
    @Validation(required = true)
    public Integer instanceNumberMaster;

    @NameInMap("InstanceNumberSlave")
    @Validation(required = true)
    public Integer instanceNumberSlave;

    @NameInMap("InstanceNumberROMaster")
    @Validation(required = true)
    public Integer instanceNumberROMaster;

    @NameInMap("InstanceNumberROSlave")
    @Validation(required = true)
    public Integer instanceNumberROSlave;

    @NameInMap("CreatedTime")
    @Validation(required = true)
    public String createdTime;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("AutoRenew")
    @Validation(required = true)
    public String autoRenew;

    @NameInMap("AllocationStatus")
    @Validation(required = true)
    public String allocationStatus;

    @NameInMap("CpuUsed")
    @Validation(required = true)
    public String cpuUsed;

    @NameInMap("MemoryUsed")
    @Validation(required = true)
    public String memoryUsed;

    @NameInMap("StorageUsed")
    @Validation(required = true)
    public String storageUsed;

    @NameInMap("HostType")
    @Validation(required = true)
    public String hostType;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("OpenPermission")
    @Validation(required = true)
    public String openPermission;

    @NameInMap("ImageCategory")
    @Validation(required = true)
    public String imageCategory;

    public static DescribeDedicatedHostAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAttributeResponse self = new DescribeDedicatedHostAttributeResponse();
        return TeaModel.build(map, self);
    }

}
