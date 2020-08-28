// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHosts")
    @Validation(required = true)
    public DescribeDedicatedHostsResponseDedicatedHosts dedicatedHosts;

    public static DescribeDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponse self = new DescribeDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts extends TeaModel {
        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("HostStatus")
        @Validation(required = true)
        public String hostStatus;

        @NameInMap("InstanceNumber")
        @Validation(required = true)
        public String instanceNumber;

        @NameInMap("CPUAllocationRatio")
        @Validation(required = true)
        public String CPUAllocationRatio;

        @NameInMap("MemAllocationRatio")
        @Validation(required = true)
        public String memAllocationRatio;

        @NameInMap("DiskAllocationRatio")
        @Validation(required = true)
        public String diskAllocationRatio;

        @NameInMap("VPCId")
        @Validation(required = true)
        public String VPCId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String VSwitchId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("IPAddress")
        @Validation(required = true)
        public String IPAddress;

        @NameInMap("HostClass")
        @Validation(required = true)
        public String hostClass;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("AllocationStatus")
        @Validation(required = true)
        public String allocationStatus;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("HostType")
        @Validation(required = true)
        public String hostType;

        @NameInMap("BastionInstanceId")
        @Validation(required = true)
        public String bastionInstanceId;

        @NameInMap("OpenPermission")
        @Validation(required = true)
        public String openPermission;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("HostCPU")
        @Validation(required = true)
        public String hostCPU;

        @NameInMap("HostMem")
        @Validation(required = true)
        public String hostMem;

        @NameInMap("HostStorage")
        @Validation(required = true)
        public String hostStorage;

        @NameInMap("CpuUsed")
        @Validation(required = true)
        public String cpuUsed;

        @NameInMap("MemoryUsed")
        @Validation(required = true)
        public String memoryUsed;

        @NameInMap("StorageUsed")
        @Validation(required = true)
        public String storageUsed;

        @NameInMap("ImageCategory")
        @Validation(required = true)
        public String imageCategory;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHosts")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts> dedicatedHosts;

        public static DescribeDedicatedHostsResponseDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHosts self = new DescribeDedicatedHostsResponseDedicatedHosts();
            return TeaModel.build(map, self);
        }

    }

}
