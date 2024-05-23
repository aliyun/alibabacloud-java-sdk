// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    /**
     * <p>The host group ID.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The host information.</p>
     */
    @NameInMap("DedicatedHosts")
    public DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponseBody self = new DescribeDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHosts(DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DescribeDedicatedHostsResponseBodyDedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public DescribeDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts extends TeaModel {
        /**
         * <p>The host account. You can call the [CreateDedicatedHostAccount](https://help.aliyun.com/document_detail/196877.html) operation to create a host account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Specifies whether instances can be deployed on the host. Valid values:</p>
         * <br>
         * <p>*   **0**: Instances cannot be deployed on the host.</p>
         * <p>*   **1**: Instances can be deployed on the host.</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <p>The bastion host ID.</p>
         */
        @NameInMap("BastionInstanceId")
        public String bastionInstanceId;

        /**
         * <p>The core overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see [Manage a dedicated cluster](https://help.aliyun.com/document_detail/182328.html).</p>
         */
        @NameInMap("CPUAllocationRatio")
        public String CPUAllocationRatio;

        /**
         * <p>The number of used CPU cores on the host. Unit: cores.</p>
         */
        @NameInMap("CpuUsed")
        public String cpuUsed;

        /**
         * <p>The time when the host was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The dedicated cluster ID.</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The host ID.</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The disk overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see [Manage a dedicated cluster](https://help.aliyun.com/document_detail/182328.html).</p>
         */
        @NameInMap("DiskAllocationRatio")
        public String diskAllocationRatio;

        /**
         * <p>The time when the host expires.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The database engine of instances that are created on the host.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The total number of CPU cores that are configured for the host. Unit: cores.</p>
         */
        @NameInMap("HostCPU")
        public String hostCPU;

        /**
         * <p>The instance type of the host.</p>
         */
        @NameInMap("HostClass")
        public String hostClass;

        /**
         * <p>The total memory space of the host. Unit: MB.</p>
         */
        @NameInMap("HostMem")
        public String hostMem;

        /**
         * <p>The host name.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The status of the host. Valid values:</p>
         * <br>
         * <p>*   **0**: creating</p>
         * <p>*   **1**: running</p>
         * <p>*   **2**: faulty</p>
         * <p>*   **3**: being replaced</p>
         * <p>*   **4**: deprecated</p>
         * <p>*   **5**: deleting</p>
         * <p>*   **6**: restarting</p>
         */
        @NameInMap("HostStatus")
        public String hostStatus;

        /**
         * <p>The storage capacity of the host. Unit: MB.</p>
         */
        @NameInMap("HostStorage")
        public String hostStorage;

        /**
         * <p>The storage type of the host. Valid values:</p>
         * <br>
         * <p>*   **dhg_cloud_ssd**: ESSD</p>
         * <p>*   **dhg_local_ssd**: local SSD</p>
         */
        @NameInMap("HostType")
        public String hostType;

        /**
         * <p>The internal IP address of the host.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The host image. This parameter is returned only when the **Engine** parameter is set to **mssql**. Valid values:</p>
         * <br>
         * <p>*   **WindowsWithMssqlStdLicense**: a Windows image that contains the licenses of SQL Server Standard Edition</p>
         * <p>*   **WindowsWithMssqlEntLisence**: a Windows image that contains the licenses of SQL Server Enterprise Edition</p>
         * <p>*   **WindowsWithMssqlWebLisence**: a Windows image that contains the licenses of SQL Server Web Edition</p>
         */
        @NameInMap("ImageCategory")
        public String imageCategory;

        /**
         * <p>The total number of instances that are created on the host.</p>
         */
        @NameInMap("InstanceNumber")
        public String instanceNumber;

        /**
         * <p>The maximum memory usage per host in the dedicated cluster.</p>
         */
        @NameInMap("MemAllocationRatio")
        public String memAllocationRatio;

        /**
         * <p>The size of the used memory. Unit: MB.</p>
         */
        @NameInMap("MemoryUsed")
        public String memoryUsed;

        /**
         * <p>Indicates whether the feature that allows you to have the OS permissions on the host is enabled. Valid values:</p>
         * <br>
         * <p>*   **0** or **null**: The permissions cannot be granted.</p>
         * <p>*   **1**: The permissions can be granted.</p>
         * <p>*   **3**: The permissions have been granted.</p>
         */
        @NameInMap("OpenPermission")
        public String openPermission;

        /**
         * <p>The amount of used storage space on the host.</p>
         */
        @NameInMap("StorageUsed")
        public String storageUsed;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the host belongs.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch associated with the specified VPC.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the host.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setBastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCPUAllocationRatio(String CPUAllocationRatio) {
            this.CPUAllocationRatio = CPUAllocationRatio;
            return this;
        }
        public String getCPUAllocationRatio() {
            return this.CPUAllocationRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCpuUsed(String cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public String getCpuUsed() {
            return this.cpuUsed;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setDiskAllocationRatio(String diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }
        public String getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostCPU(String hostCPU) {
            this.hostCPU = hostCPU;
            return this;
        }
        public String getHostCPU() {
            return this.hostCPU;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostClass(String hostClass) {
            this.hostClass = hostClass;
            return this;
        }
        public String getHostClass() {
            return this.hostClass;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostMem(String hostMem) {
            this.hostMem = hostMem;
            return this;
        }
        public String getHostMem() {
            return this.hostMem;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }
        public String getHostStatus() {
            return this.hostStatus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostStorage(String hostStorage) {
            this.hostStorage = hostStorage;
            return this;
        }
        public String getHostStorage() {
            return this.hostStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setHostType(String hostType) {
            this.hostType = hostType;
            return this;
        }
        public String getHostType() {
            return this.hostType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setImageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public String getImageCategory() {
            return this.imageCategory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public String getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setMemAllocationRatio(String memAllocationRatio) {
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }
        public String getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setMemoryUsed(String memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public String getMemoryUsed() {
            return this.memoryUsed;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setOpenPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }
        public String getOpenPermission() {
            return this.openPermission;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHosts")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts> dedicatedHosts;

        public static DescribeDedicatedHostsResponseBodyDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHosts self = new DescribeDedicatedHostsResponseBodyDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHosts setDedicatedHosts(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts> dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHosts> getDedicatedHosts() {
            return this.dedicatedHosts;
        }

    }

}
