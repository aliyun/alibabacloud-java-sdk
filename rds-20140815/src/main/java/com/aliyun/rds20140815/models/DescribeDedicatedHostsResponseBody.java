// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    /**
     * <p>The host group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-7a9xxxxxxxx</p>
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
     * 
     * <strong>example:</strong>
     * <p>C860658E-68A6-46C1-AF6E-3AE7C4D3CACF</p>
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
         * <p>The host account. You can call the <a href="https://help.aliyun.com/document_detail/196877.html">CreateDedicatedHostAccount</a> operation to create a host account.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Specifies whether instances can be deployed on the host. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Instances cannot be deployed on the host.</li>
         * <li><strong>1</strong>: Instances can be deployed on the host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <p>The bastion host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-m7xxxxxxxx</p>
         */
        @NameInMap("BastionInstanceId")
        public String bastionInstanceId;

        /**
         * <p>The core overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CPUAllocationRatio")
        public String CPUAllocationRatio;

        /**
         * <p>The number of used CPU cores on the host. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CpuUsed")
        public String cpuUsed;

        /**
         * <p>The time when the host was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25 17:29:06.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The dedicated cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9xxxxxxxx</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bpxxxxxxx</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The disk overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiskAllocationRatio")
        public String diskAllocationRatio;

        /**
         * <p>The time when the host expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The database engine of instances that are created on the host.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The total number of CPU cores that are configured for the host. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("HostCPU")
        public String hostCPU;

        /**
         * <p>The instance type of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.i2.16xlarge</p>
         */
        @NameInMap("HostClass")
        public String hostClass;

        /**
         * <p>The total memory space of the host. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>32238</p>
         */
        @NameInMap("HostMem")
        public String hostMem;

        /**
         * <p>The host name.</p>
         * 
         * <strong>example:</strong>
         * <p>testHost1</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The status of the host. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: creating</li>
         * <li><strong>1</strong>: running</li>
         * <li><strong>2</strong>: faulty</li>
         * <li><strong>3</strong>: being replaced</li>
         * <li><strong>4</strong>: deprecated</li>
         * <li><strong>5</strong>: deleting</li>
         * <li><strong>6</strong>: restarting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostStatus")
        public String hostStatus;

        /**
         * <p>The storage capacity of the host. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2097152</p>
         */
        @NameInMap("HostStorage")
        public String hostStorage;

        /**
         * <p>The storage type of the host. Valid values:</p>
         * <ul>
         * <li><strong>dhg_cloud_ssd</strong>: ESSD</li>
         * <li><strong>dhg_local_ssd</strong>: local SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dhg_cloud_ssd</p>
         */
        @NameInMap("HostType")
        public String hostType;

        /**
         * <p>The internal IP address of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>192.xx.xx.xx</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The host image. This parameter is returned only when the <strong>Engine</strong> parameter is set to <strong>mssql</strong>. Valid values:</p>
         * <ul>
         * <li><strong>WindowsWithMssqlStdLicense</strong>: a Windows image that contains the licenses of SQL Server Standard Edition</li>
         * <li><strong>WindowsWithMssqlEntLisence</strong>: a Windows image that contains the licenses of SQL Server Enterprise Edition</li>
         * <li><strong>WindowsWithMssqlWebLisence</strong>: a Windows image that contains the licenses of SQL Server Web Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WindowsWithMssqlStdLicense</p>
         */
        @NameInMap("ImageCategory")
        public String imageCategory;

        /**
         * <p>The total number of instances that are created on the host.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("InstanceNumber")
        public String instanceNumber;

        /**
         * <p>The maximum memory usage per host in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("MemAllocationRatio")
        public String memAllocationRatio;

        /**
         * <p>The size of the used memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("MemoryUsed")
        public String memoryUsed;

        /**
         * <p>Indicates whether the feature that allows you to have the OS permissions on the host is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> or <strong>null</strong>: The permissions cannot be granted.</li>
         * <li><strong>1</strong>: The permissions can be granted.</li>
         * <li><strong>3</strong>: The permissions have been granted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OpenPermission")
        public String openPermission;

        /**
         * <p>The amount of used storage space on the host.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StorageUsed")
        public String storageUsed;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bpxxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch associated with the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
