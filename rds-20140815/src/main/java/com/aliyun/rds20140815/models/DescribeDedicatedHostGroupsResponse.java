// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostGroups")
    @Validation(required = true)
    public DescribeDedicatedHostGroupsResponseDedicatedHostGroups dedicatedHostGroups;

    public static DescribeDedicatedHostGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostGroupsResponse self = new DescribeDedicatedHostGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostGroupsResponse setDedicatedHostGroups(DescribeDedicatedHostGroupsResponseDedicatedHostGroups dedicatedHostGroups) {
        this.dedicatedHostGroups = dedicatedHostGroups;
        return this;
    }
    public DescribeDedicatedHostGroupsResponseDedicatedHostGroups getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    public static class DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList extends TeaModel {
        // ZoneIDList
        @NameInMap("ZoneIDList")
        @Validation(required = true)
        public java.util.List<String> zoneIDList;

        public static DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList self = new DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList setZoneIDList(java.util.List<String> zoneIDList) {
            this.zoneIDList = zoneIDList;
            return this;
        }
        public java.util.List<String> getZoneIDList() {
            return this.zoneIDList;
        }

    }

    public static class DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups extends TeaModel {
        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        @NameInMap("DedicatedHostGroupDesc")
        @Validation(required = true)
        public String dedicatedHostGroupDesc;

        @NameInMap("CpuAllocationRatio")
        @Validation(required = true)
        public Integer cpuAllocationRatio;

        @NameInMap("MemAllocationRatio")
        @Validation(required = true)
        public Integer memAllocationRatio;

        @NameInMap("DiskAllocationRatio")
        @Validation(required = true)
        public Integer diskAllocationRatio;

        @NameInMap("AllocationPolicy")
        @Validation(required = true)
        public String allocationPolicy;

        @NameInMap("HostReplacePolicy")
        @Validation(required = true)
        public String hostReplacePolicy;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("VPCId")
        @Validation(required = true)
        public String VPCId;

        @NameInMap("HostNumber")
        @Validation(required = true)
        public Integer hostNumber;

        @NameInMap("InstanceNumber")
        @Validation(required = true)
        public Integer instanceNumber;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("DedicatedHostCountGroupByHostType")
        @Validation(required = true)
        public java.util.Map<String, ?> dedicatedHostCountGroupByHostType;

        @NameInMap("BastionInstanceId")
        @Validation(required = true)
        public String bastionInstanceId;

        @NameInMap("OpenPermission")
        @Validation(required = true)
        public String openPermission;

        @NameInMap("MemUtility")
        @Validation(required = true)
        public Float memUtility;

        @NameInMap("MemUsedAmount")
        @Validation(required = true)
        public Float memUsedAmount;

        @NameInMap("DiskUtility")
        @Validation(required = true)
        public Float diskUtility;

        @NameInMap("DiskUsedAmount")
        @Validation(required = true)
        public Float diskUsedAmount;

        @NameInMap("CpuAllocateRation")
        @Validation(required = true)
        public Float cpuAllocateRation;

        @NameInMap("CpuAllocatedAmount")
        @Validation(required = true)
        public Float cpuAllocatedAmount;

        @NameInMap("MemAllocateRation")
        @Validation(required = true)
        public Float memAllocateRation;

        @NameInMap("MemAllocatedAmount")
        @Validation(required = true)
        public Float memAllocatedAmount;

        @NameInMap("DiskAllocateRation")
        @Validation(required = true)
        public Float diskAllocateRation;

        @NameInMap("DiskAllocatedAmount")
        @Validation(required = true)
        public Float diskAllocatedAmount;

        @NameInMap("ZoneIDList")
        @Validation(required = true)
        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList;

        public static DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
            return this;
        }
        public String getDedicatedHostGroupDesc() {
            return this.dedicatedHostGroupDesc;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setCpuAllocationRatio(Integer cpuAllocationRatio) {
            this.cpuAllocationRatio = cpuAllocationRatio;
            return this;
        }
        public Integer getCpuAllocationRatio() {
            return this.cpuAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setMemAllocationRatio(Integer memAllocationRatio) {
            this.memAllocationRatio = memAllocationRatio;
            return this;
        }
        public Integer getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDiskAllocationRatio(Integer diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
            return this;
        }
        public Integer getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setAllocationPolicy(String allocationPolicy) {
            this.allocationPolicy = allocationPolicy;
            return this;
        }
        public String getAllocationPolicy() {
            return this.allocationPolicy;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setHostReplacePolicy(String hostReplacePolicy) {
            this.hostReplacePolicy = hostReplacePolicy;
            return this;
        }
        public String getHostReplacePolicy() {
            return this.hostReplacePolicy;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setHostNumber(Integer hostNumber) {
            this.hostNumber = hostNumber;
            return this;
        }
        public Integer getHostNumber() {
            return this.hostNumber;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setInstanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public Integer getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDedicatedHostCountGroupByHostType(java.util.Map<String, ?> dedicatedHostCountGroupByHostType) {
            this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
            return this;
        }
        public java.util.Map<String, ?> getDedicatedHostCountGroupByHostType() {
            return this.dedicatedHostCountGroupByHostType;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setBastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setOpenPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }
        public String getOpenPermission() {
            return this.openPermission;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setMemUtility(Float memUtility) {
            this.memUtility = memUtility;
            return this;
        }
        public Float getMemUtility() {
            return this.memUtility;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setMemUsedAmount(Float memUsedAmount) {
            this.memUsedAmount = memUsedAmount;
            return this;
        }
        public Float getMemUsedAmount() {
            return this.memUsedAmount;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDiskUtility(Float diskUtility) {
            this.diskUtility = diskUtility;
            return this;
        }
        public Float getDiskUtility() {
            return this.diskUtility;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDiskUsedAmount(Float diskUsedAmount) {
            this.diskUsedAmount = diskUsedAmount;
            return this;
        }
        public Float getDiskUsedAmount() {
            return this.diskUsedAmount;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setCpuAllocateRation(Float cpuAllocateRation) {
            this.cpuAllocateRation = cpuAllocateRation;
            return this;
        }
        public Float getCpuAllocateRation() {
            return this.cpuAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setCpuAllocatedAmount(Float cpuAllocatedAmount) {
            this.cpuAllocatedAmount = cpuAllocatedAmount;
            return this;
        }
        public Float getCpuAllocatedAmount() {
            return this.cpuAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setMemAllocateRation(Float memAllocateRation) {
            this.memAllocateRation = memAllocateRation;
            return this;
        }
        public Float getMemAllocateRation() {
            return this.memAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setMemAllocatedAmount(Float memAllocatedAmount) {
            this.memAllocatedAmount = memAllocatedAmount;
            return this;
        }
        public Float getMemAllocatedAmount() {
            return this.memAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDiskAllocateRation(Float diskAllocateRation) {
            this.diskAllocateRation = diskAllocateRation;
            return this;
        }
        public Float getDiskAllocateRation() {
            return this.diskAllocateRation;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setDiskAllocatedAmount(Float diskAllocatedAmount) {
            this.diskAllocatedAmount = diskAllocatedAmount;
            return this;
        }
        public Float getDiskAllocatedAmount() {
            return this.diskAllocatedAmount;
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups setZoneIDList(DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList) {
            this.zoneIDList = zoneIDList;
            return this;
        }
        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList getZoneIDList() {
            return this.zoneIDList;
        }

    }

    public static class DescribeDedicatedHostGroupsResponseDedicatedHostGroups extends TeaModel {
        @NameInMap("DedicatedHostGroups")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups;

        public static DescribeDedicatedHostGroupsResponseDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseDedicatedHostGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostGroupsResponseDedicatedHostGroups setDedicatedHostGroups(java.util.List<DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups) {
            this.dedicatedHostGroups = dedicatedHostGroups;
            return this;
        }
        public java.util.List<DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups> getDedicatedHostGroups() {
            return this.dedicatedHostGroups;
        }

    }

}
