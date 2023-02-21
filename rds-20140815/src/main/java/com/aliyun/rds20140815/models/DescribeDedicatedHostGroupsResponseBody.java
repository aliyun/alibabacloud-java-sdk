// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of dedicated clusters returned.</p>
     */
    @NameInMap("DedicatedHostGroups")
    public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups dedicatedHostGroups;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostGroupsResponseBody self = new DescribeDedicatedHostGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostGroupsResponseBody setDedicatedHostGroups(DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups dedicatedHostGroups) {
        this.dedicatedHostGroups = dedicatedHostGroups;
        return this;
    }
    public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    public DescribeDedicatedHostGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList extends TeaModel {
        @NameInMap("ZoneIDList")
        public java.util.List<String> zoneIDList;

        public static DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList self = new DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList setZoneIDList(java.util.List<String> zoneIDList) {
            this.zoneIDList = zoneIDList;
            return this;
        }
        public java.util.List<String> getZoneIDList() {
            return this.zoneIDList;
        }

    }

    public static class DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups extends TeaModel {
        /**
         * <p>The policy based on which the system allocates resources in the dedicated cluster. Valid values:</p>
         * <br>
         * <p>*   **Evenly**: The system evenly allocates the resources to all the hosts in the dedicated cluster.</p>
         * <p>*   **Intensively**: The system preferentially allocates the resources to the heavily loaded hosts in the dedicated cluster.</p>
         */
        @NameInMap("AllocationPolicy")
        public String allocationPolicy;

        /**
         * <p>The ID of the bastion host.</p>
         */
        @NameInMap("BastionInstanceId")
        public String bastionInstanceId;

        /**
         * <p>The percentage of allocated cores in the dedicated cluster. Unit: %.</p>
         */
        @NameInMap("CpuAllocateRation")
        public Float cpuAllocateRation;

        /**
         * <p>The number of allocated cores in the dedicated cluster.</p>
         */
        @NameInMap("CpuAllocatedAmount")
        public Float cpuAllocatedAmount;

        /**
         * <p>The core overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).</p>
         */
        @NameInMap("CpuAllocationRatio")
        public Integer cpuAllocationRatio;

        /**
         * <p>The timestamp when the dedicated cluster was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of storage media that is used for the hosts in the dedicated cluster. Valid values:</p>
         * <br>
         * <p>*   **dhg_cloud_ssd**: standard or enhanced solid-state drive (SSD)</p>
         * <p>*   **dhg_local_ssd**: local SSD</p>
         */
        @NameInMap("DedicatedHostCountGroupByHostType")
        public java.util.Map<String, ?> dedicatedHostCountGroupByHostType;

        /**
         * <p>The name of the dedicated cluster.</p>
         */
        @NameInMap("DedicatedHostGroupDesc")
        public String dedicatedHostGroupDesc;

        /**
         * <p>The ID of the dedicated cluster.</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The percentage of allocated disk space in the dedicated cluster. Unit: %.</p>
         */
        @NameInMap("DiskAllocateRation")
        public Float diskAllocateRation;

        /**
         * <p>The amount of allocated disk space in the dedicated cluster. Unit: GB.</p>
         */
        @NameInMap("DiskAllocatedAmount")
        public Float diskAllocatedAmount;

        /**
         * <p>The disk overcommitment ratio of the dedicated cluster. Unit: %. For more information about the disk overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).</p>
         */
        @NameInMap("DiskAllocationRatio")
        public Integer diskAllocationRatio;

        /**
         * <p>The amount of used disk space in the dedicated cluster. Unit: GB.</p>
         */
        @NameInMap("DiskUsedAmount")
        public Float diskUsedAmount;

        /**
         * <p>The disk usage of the dedicated cluster. Unit: %.</p>
         */
        @NameInMap("DiskUtility")
        public Float diskUtility;

        /**
         * <p>The database engine that is run on the instances in the dedicated cluster.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The total number of hosts in the dedicated cluster.</p>
         */
        @NameInMap("HostNumber")
        public Integer hostNumber;

        /**
         * <p>The policy based on which the system handles host failures. Valid values:</p>
         * <br>
         * <p>*   **Auto**: The system automatically replaces faulty hosts.</p>
         * <p>*   **Manual**: You must manually replace faulty hosts.</p>
         */
        @NameInMap("HostReplacePolicy")
        public String hostReplacePolicy;

        /**
         * <p>The total number of instances in the dedicated cluster.</p>
         */
        @NameInMap("InstanceNumber")
        public Integer instanceNumber;

        /**
         * <p>The percentage of allocated memory space in the dedicated cluster. Unit: %.</p>
         */
        @NameInMap("MemAllocateRation")
        public Float memAllocateRation;

        /**
         * <p>The amount of allocated memory space in the dedicated cluster.</p>
         */
        @NameInMap("MemAllocatedAmount")
        public Float memAllocatedAmount;

        /**
         * <p>The memory overcommitment ratio of the dedicated cluster. Unit: %. For more information about the memory overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).</p>
         */
        @NameInMap("MemAllocationRatio")
        public Integer memAllocationRatio;

        /**
         * <p>The amount of used memory space in the dedicated cluster. Unit: MB.</p>
         */
        @NameInMap("MemUsedAmount")
        public Float memUsedAmount;

        /**
         * <p>The memory usage of the dedicated cluster. Unit: %.</p>
         */
        @NameInMap("MemUtility")
        public Float memUtility;

        /**
         * <p>Indicates whether the operating system permissions of the hosts in the dedicated cluster can be granted. Valid values:</p>
         * <br>
         * <p>*   **0** or **null**: The permissions cannot be granted.</p>
         * <p>*   **1**: The permissions can be granted.</p>
         * <p>*   **3**: The permissions have been granted.</p>
         */
        @NameInMap("OpenPermission")
        public String openPermission;

        /**
         * <p>The name and ID of the dedicated cluster. The value of this parameter consists of two parts: the value of the **DedicatedHostGroupDesc** parameter and the value of the **DedicatedHostGroupId** parameter. Format: DedicatedHostGroupDesc/DedicatedHostGroupId.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the dedicated cluster belongs.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>A list of zones to which the hosts of the dedicated cluster belong.</p>
         */
        @NameInMap("ZoneIDList")
        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList;

        public static DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setAllocationPolicy(String allocationPolicy) {
            this.allocationPolicy = allocationPolicy;
            return this;
        }
        public String getAllocationPolicy() {
            return this.allocationPolicy;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setBastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCpuAllocateRation(Float cpuAllocateRation) {
            this.cpuAllocateRation = cpuAllocateRation;
            return this;
        }
        public Float getCpuAllocateRation() {
            return this.cpuAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCpuAllocatedAmount(Float cpuAllocatedAmount) {
            this.cpuAllocatedAmount = cpuAllocatedAmount;
            return this;
        }
        public Float getCpuAllocatedAmount() {
            return this.cpuAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCpuAllocationRatio(Integer cpuAllocationRatio) {
            this.cpuAllocationRatio = cpuAllocationRatio;
            return this;
        }
        public Integer getCpuAllocationRatio() {
            return this.cpuAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDedicatedHostCountGroupByHostType(java.util.Map<String, ?> dedicatedHostCountGroupByHostType) {
            this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
            return this;
        }
        public java.util.Map<String, ?> getDedicatedHostCountGroupByHostType() {
            return this.dedicatedHostCountGroupByHostType;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
            return this;
        }
        public String getDedicatedHostGroupDesc() {
            return this.dedicatedHostGroupDesc;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskAllocateRation(Float diskAllocateRation) {
            this.diskAllocateRation = diskAllocateRation;
            return this;
        }
        public Float getDiskAllocateRation() {
            return this.diskAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskAllocatedAmount(Float diskAllocatedAmount) {
            this.diskAllocatedAmount = diskAllocatedAmount;
            return this;
        }
        public Float getDiskAllocatedAmount() {
            return this.diskAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskAllocationRatio(Integer diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }
        public Integer getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskUsedAmount(Float diskUsedAmount) {
            this.diskUsedAmount = diskUsedAmount;
            return this;
        }
        public Float getDiskUsedAmount() {
            return this.diskUsedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setDiskUtility(Float diskUtility) {
            this.diskUtility = diskUtility;
            return this;
        }
        public Float getDiskUtility() {
            return this.diskUtility;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setHostNumber(Integer hostNumber) {
            this.hostNumber = hostNumber;
            return this;
        }
        public Integer getHostNumber() {
            return this.hostNumber;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setHostReplacePolicy(String hostReplacePolicy) {
            this.hostReplacePolicy = hostReplacePolicy;
            return this;
        }
        public String getHostReplacePolicy() {
            return this.hostReplacePolicy;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setInstanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public Integer getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemAllocateRation(Float memAllocateRation) {
            this.memAllocateRation = memAllocateRation;
            return this;
        }
        public Float getMemAllocateRation() {
            return this.memAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemAllocatedAmount(Float memAllocatedAmount) {
            this.memAllocatedAmount = memAllocatedAmount;
            return this;
        }
        public Float getMemAllocatedAmount() {
            return this.memAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemAllocationRatio(Integer memAllocationRatio) {
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }
        public Integer getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemUsedAmount(Float memUsedAmount) {
            this.memUsedAmount = memUsedAmount;
            return this;
        }
        public Float getMemUsedAmount() {
            return this.memUsedAmount;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setMemUtility(Float memUtility) {
            this.memUtility = memUtility;
            return this;
        }
        public Float getMemUtility() {
            return this.memUtility;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setOpenPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }
        public String getOpenPermission() {
            return this.openPermission;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups setZoneIDList(DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList) {
            this.zoneIDList = zoneIDList;
            return this;
        }
        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroupsZoneIDList getZoneIDList() {
            return this.zoneIDList;
        }

    }

    public static class DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups extends TeaModel {
        @NameInMap("DedicatedHostGroups")
        public java.util.List<DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups;

        public static DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups setDedicatedHostGroups(java.util.List<DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups) {
            this.dedicatedHostGroups = dedicatedHostGroups;
            return this;
        }
        public java.util.List<DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroupsDedicatedHostGroups> getDedicatedHostGroups() {
            return this.dedicatedHostGroups;
        }

    }

}
