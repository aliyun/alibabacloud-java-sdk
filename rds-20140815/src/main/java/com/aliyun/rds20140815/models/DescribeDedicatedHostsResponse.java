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

    public DescribeDedicatedHostsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostsResponse setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostsResponse setDedicatedHosts(DescribeDedicatedHostsResponseDedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DescribeDedicatedHostsResponseDedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
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
        public String vSwitchId;

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

        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }
        public String getHostStatus() {
            return this.hostStatus;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public String getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setCPUAllocationRatio(String CPUAllocationRatio) {
            this.CPUAllocationRatio = CPUAllocationRatio;
            return this;
        }
        public String getCPUAllocationRatio() {
            return this.CPUAllocationRatio;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setMemAllocationRatio(String memAllocationRatio) {
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }
        public String getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setDiskAllocationRatio(String diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }
        public String getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostClass(String hostClass) {
            this.hostClass = hostClass;
            return this;
        }
        public String getHostClass() {
            return this.hostClass;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostType(String hostType) {
            this.hostType = hostType;
            return this;
        }
        public String getHostType() {
            return this.hostType;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setBastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setOpenPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }
        public String getOpenPermission() {
            return this.openPermission;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostCPU(String hostCPU) {
            this.hostCPU = hostCPU;
            return this;
        }
        public String getHostCPU() {
            return this.hostCPU;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostMem(String hostMem) {
            this.hostMem = hostMem;
            return this;
        }
        public String getHostMem() {
            return this.hostMem;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setHostStorage(String hostStorage) {
            this.hostStorage = hostStorage;
            return this;
        }
        public String getHostStorage() {
            return this.hostStorage;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setCpuUsed(String cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public String getCpuUsed() {
            return this.cpuUsed;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setMemoryUsed(String memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public String getMemoryUsed() {
            return this.memoryUsed;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setImageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public String getImageCategory() {
            return this.imageCategory;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
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

        public DescribeDedicatedHostsResponseDedicatedHosts setDedicatedHosts(java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts> dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHosts> getDedicatedHosts() {
            return this.dedicatedHosts;
        }

    }

}
