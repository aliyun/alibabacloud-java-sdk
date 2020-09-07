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
    public String vSwitchId;

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

    public DescribeDedicatedHostAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostAttributeResponse setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostAttributeResponse setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedHostAttributeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostAttributeResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeDedicatedHostAttributeResponse setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDedicatedHostAttributeResponse setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDedicatedHostAttributeResponse setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
        return this;
    }
    public String getIPAddress() {
        return this.IPAddress;
    }

    public DescribeDedicatedHostAttributeResponse setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeDedicatedHostAttributeResponse setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }
    public String getHostStatus() {
        return this.hostStatus;
    }

    public DescribeDedicatedHostAttributeResponse setHostClass(String hostClass) {
        this.hostClass = hostClass;
        return this;
    }
    public String getHostClass() {
        return this.hostClass;
    }

    public DescribeDedicatedHostAttributeResponse setHostCPU(Integer hostCPU) {
        this.hostCPU = hostCPU;
        return this;
    }
    public Integer getHostCPU() {
        return this.hostCPU;
    }

    public DescribeDedicatedHostAttributeResponse setHostMem(Integer hostMem) {
        this.hostMem = hostMem;
        return this;
    }
    public Integer getHostMem() {
        return this.hostMem;
    }

    public DescribeDedicatedHostAttributeResponse setHostStorage(Integer hostStorage) {
        this.hostStorage = hostStorage;
        return this;
    }
    public Integer getHostStorage() {
        return this.hostStorage;
    }

    public DescribeDedicatedHostAttributeResponse setCPUAllocationRatio(String CPUAllocationRatio) {
        this.CPUAllocationRatio = CPUAllocationRatio;
        return this;
    }
    public String getCPUAllocationRatio() {
        return this.CPUAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponse setMemAllocationRatio(String memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public String getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponse setDiskAllocationRatio(String diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public String getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public DescribeDedicatedHostAttributeResponse setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    public DescribeDedicatedHostAttributeResponse setInstanceNumberMaster(Integer instanceNumberMaster) {
        this.instanceNumberMaster = instanceNumberMaster;
        return this;
    }
    public Integer getInstanceNumberMaster() {
        return this.instanceNumberMaster;
    }

    public DescribeDedicatedHostAttributeResponse setInstanceNumberSlave(Integer instanceNumberSlave) {
        this.instanceNumberSlave = instanceNumberSlave;
        return this;
    }
    public Integer getInstanceNumberSlave() {
        return this.instanceNumberSlave;
    }

    public DescribeDedicatedHostAttributeResponse setInstanceNumberROMaster(Integer instanceNumberROMaster) {
        this.instanceNumberROMaster = instanceNumberROMaster;
        return this;
    }
    public Integer getInstanceNumberROMaster() {
        return this.instanceNumberROMaster;
    }

    public DescribeDedicatedHostAttributeResponse setInstanceNumberROSlave(Integer instanceNumberROSlave) {
        this.instanceNumberROSlave = instanceNumberROSlave;
        return this;
    }
    public Integer getInstanceNumberROSlave() {
        return this.instanceNumberROSlave;
    }

    public DescribeDedicatedHostAttributeResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDedicatedHostAttributeResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDedicatedHostAttributeResponse setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeDedicatedHostAttributeResponse setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
        return this;
    }
    public String getAllocationStatus() {
        return this.allocationStatus;
    }

    public DescribeDedicatedHostAttributeResponse setCpuUsed(String cpuUsed) {
        this.cpuUsed = cpuUsed;
        return this;
    }
    public String getCpuUsed() {
        return this.cpuUsed;
    }

    public DescribeDedicatedHostAttributeResponse setMemoryUsed(String memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public String getMemoryUsed() {
        return this.memoryUsed;
    }

    public DescribeDedicatedHostAttributeResponse setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDedicatedHostAttributeResponse setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

    public DescribeDedicatedHostAttributeResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeDedicatedHostAttributeResponse setOpenPermission(String openPermission) {
        this.openPermission = openPermission;
        return this;
    }
    public String getOpenPermission() {
        return this.openPermission;
    }

    public DescribeDedicatedHostAttributeResponse setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

}
