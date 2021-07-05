// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAttributeResponseBody extends TeaModel {
    @NameInMap("CPUAllocationRatio")
    public String CPUAllocationRatio;

    @NameInMap("DiskAllocationRatio")
    public String diskAllocationRatio;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("InstanceNumber")
    public Integer instanceNumber;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("ImageCategory")
    public String imageCategory;

    @NameInMap("HostStorage")
    public Integer hostStorage;

    @NameInMap("InstanceNumberSlave")
    public Integer instanceNumberSlave;

    @NameInMap("OpenPermission")
    public String openPermission;

    @NameInMap("HostType")
    public String hostType;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("HostMem")
    public Integer hostMem;

    @NameInMap("MemoryUsed")
    public String memoryUsed;

    @NameInMap("HostStatus")
    public String hostStatus;

    @NameInMap("CpuUsed")
    public String cpuUsed;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceNumberROSlave")
    public Integer instanceNumberROSlave;

    @NameInMap("AllocationStatus")
    public String allocationStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MemAllocationRatio")
    public String memAllocationRatio;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceNumberROMaster")
    public Integer instanceNumberROMaster;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("InstanceNumberMaster")
    public Integer instanceNumberMaster;

    @NameInMap("StorageUsed")
    public String storageUsed;

    @NameInMap("HostClass")
    public String hostClass;

    @NameInMap("HostCPU")
    public Integer hostCPU;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IPAddress")
    public String IPAddress;

    @NameInMap("AccountName")
    public String accountName;

    public static DescribeDedicatedHostAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAttributeResponseBody self = new DescribeDedicatedHostAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAttributeResponseBody setCPUAllocationRatio(String CPUAllocationRatio) {
        this.CPUAllocationRatio = CPUAllocationRatio;
        return this;
    }
    public String getCPUAllocationRatio() {
        return this.CPUAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponseBody setDiskAllocationRatio(String diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public String getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    public DescribeDedicatedHostAttributeResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDedicatedHostAttributeResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostAttributeResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeDedicatedHostAttributeResponseBody setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostStorage(Integer hostStorage) {
        this.hostStorage = hostStorage;
        return this;
    }
    public Integer getHostStorage() {
        return this.hostStorage;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberSlave(Integer instanceNumberSlave) {
        this.instanceNumberSlave = instanceNumberSlave;
        return this;
    }
    public Integer getInstanceNumberSlave() {
        return this.instanceNumberSlave;
    }

    public DescribeDedicatedHostAttributeResponseBody setOpenPermission(String openPermission) {
        this.openPermission = openPermission;
        return this;
    }
    public String getOpenPermission() {
        return this.openPermission;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

    public DescribeDedicatedHostAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostMem(Integer hostMem) {
        this.hostMem = hostMem;
        return this;
    }
    public Integer getHostMem() {
        return this.hostMem;
    }

    public DescribeDedicatedHostAttributeResponseBody setMemoryUsed(String memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public String getMemoryUsed() {
        return this.memoryUsed;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }
    public String getHostStatus() {
        return this.hostStatus;
    }

    public DescribeDedicatedHostAttributeResponseBody setCpuUsed(String cpuUsed) {
        this.cpuUsed = cpuUsed;
        return this;
    }
    public String getCpuUsed() {
        return this.cpuUsed;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberROSlave(Integer instanceNumberROSlave) {
        this.instanceNumberROSlave = instanceNumberROSlave;
        return this;
    }
    public Integer getInstanceNumberROSlave() {
        return this.instanceNumberROSlave;
    }

    public DescribeDedicatedHostAttributeResponseBody setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
        return this;
    }
    public String getAllocationStatus() {
        return this.allocationStatus;
    }

    public DescribeDedicatedHostAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostAttributeResponseBody setMemAllocationRatio(String memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public String getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberROMaster(Integer instanceNumberROMaster) {
        this.instanceNumberROMaster = instanceNumberROMaster;
        return this;
    }
    public Integer getInstanceNumberROMaster() {
        return this.instanceNumberROMaster;
    }

    public DescribeDedicatedHostAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDedicatedHostAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDedicatedHostAttributeResponseBody setInstanceNumberMaster(Integer instanceNumberMaster) {
        this.instanceNumberMaster = instanceNumberMaster;
        return this;
    }
    public Integer getInstanceNumberMaster() {
        return this.instanceNumberMaster;
    }

    public DescribeDedicatedHostAttributeResponseBody setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostClass(String hostClass) {
        this.hostClass = hostClass;
        return this;
    }
    public String getHostClass() {
        return this.hostClass;
    }

    public DescribeDedicatedHostAttributeResponseBody setHostCPU(Integer hostCPU) {
        this.hostCPU = hostCPU;
        return this;
    }
    public Integer getHostCPU() {
        return this.hostCPU;
    }

    public DescribeDedicatedHostAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostAttributeResponseBody setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
        return this;
    }
    public String getIPAddress() {
        return this.IPAddress;
    }

    public DescribeDedicatedHostAttributeResponseBody setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
