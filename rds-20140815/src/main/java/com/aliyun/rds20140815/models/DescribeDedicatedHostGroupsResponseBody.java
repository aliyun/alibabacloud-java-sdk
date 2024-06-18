// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsResponseBody extends TeaModel {
    /**
     * <p>The information about dedicated clusters returned.</p>
     */
    @NameInMap("DedicatedHostGroups")
    public DescribeDedicatedHostGroupsResponseBodyDedicatedHostGroups dedicatedHostGroups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AB44DC0A-7E77-442A-97A9-C6418694CB22</p>
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
         * <ul>
         * <li><strong>Evenly</strong>: The system evenly allocates the resources to all the hosts in the dedicated cluster.</li>
         * <li><strong>Intensively</strong>: The system preferentially allocates the resources to the heavily loaded hosts in the dedicated cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Evenly</p>
         */
        @NameInMap("AllocationPolicy")
        public String allocationPolicy;

        /**
         * <p>The ID of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-m7xxxxxxxx</p>
         */
        @NameInMap("BastionInstanceId")
        public String bastionInstanceId;

        /**
         * <p>The percentage of allocated cores in the dedicated cluster. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("CpuAllocateRation")
        public Float cpuAllocateRation;

        /**
         * <p>The number of allocated cores in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CpuAllocatedAmount")
        public Float cpuAllocatedAmount;

        /**
         * <p>The core overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CpuAllocationRatio")
        public Integer cpuAllocationRatio;

        /**
         * <p>The timestamp when the dedicated cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1571125370000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of storage media that is used for the hosts in the dedicated cluster. Valid values:</p>
         * <ul>
         * <li><strong>dhg_cloud_ssd</strong>: cloud disks</li>
         * <li><strong>dhg_local_ssd</strong>: local disks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dhg_cloud_ssd</p>
         */
        @NameInMap("DedicatedHostCountGroupByHostType")
        public java.util.Map<String, ?> dedicatedHostCountGroupByHostType;

        /**
         * <p>The name of the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testHostGroup</p>
         */
        @NameInMap("DedicatedHostGroupDesc")
        public String dedicatedHostGroupDesc;

        /**
         * <p>The ID of the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9xxxxxxxx</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The percentage of allocated disk space in the dedicated cluster. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>0.49</p>
         */
        @NameInMap("DiskAllocateRation")
        public Float diskAllocateRation;

        /**
         * <p>The amount of allocated disk space in the dedicated cluster. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiskAllocatedAmount")
        public Float diskAllocatedAmount;

        /**
         * <p>The disk overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiskAllocationRatio")
        public Integer diskAllocationRatio;

        /**
         * <p>The amount of used disk space in the dedicated cluster. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DiskUsedAmount")
        public Float diskUsedAmount;

        /**
         * <p>The disk usage of the dedicated cluster. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiskUtility")
        public Float diskUtility;

        /**
         * <p>The database engine of the instances in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The total number of hosts in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HostNumber")
        public Integer hostNumber;

        /**
         * <p>The policy that is used to handle host failures. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: The system automatically replaces faulty hosts.</li>
         * <li><strong>Manual</strong>: You must manually replace faulty hosts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("HostReplacePolicy")
        public String hostReplacePolicy;

        /**
         * <p>The total number of instances in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("InstanceNumber")
        public Integer instanceNumber;

        /**
         * <p>The percentage of allocated memory space in the dedicated cluster. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>33.7</p>
         */
        @NameInMap("MemAllocateRation")
        public Float memAllocateRation;

        /**
         * <p>The amount of allocated memory space in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("MemAllocatedAmount")
        public Float memAllocatedAmount;

        /**
         * <p>The memory overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("MemAllocationRatio")
        public Integer memAllocationRatio;

        /**
         * <p>The amount of used memory space in the dedicated cluster. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MemUsedAmount")
        public Float memUsedAmount;

        /**
         * <p>The memory usage of the dedicated cluster. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MemUtility")
        public Float memUtility;

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
         * <p>The name and ID of the dedicated cluster. The value consists of <strong>DedicatedHostGroupDesc</strong> and <strong>DedicatedHostGroupId</strong>. Format: DedicatedHostGroupDesc/DedicatedHostGroupId.</p>
         * 
         * <strong>example:</strong>
         * <p>testHostGroup/dhg-7a9xxxxxxxx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the dedicated cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1oxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The zones to which the hosts of the dedicated cluster belong.</p>
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
