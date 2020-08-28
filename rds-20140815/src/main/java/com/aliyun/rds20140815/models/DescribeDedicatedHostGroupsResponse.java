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

    public static class DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList extends TeaModel {
        @NameInMap("ZoneIDList")
        @Validation(required = true)
        public java.util.List<String> zoneIDList;

        public static DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList self = new DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList();
            return TeaModel.build(map, self);
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

        @NameInMap("ZoneIDList")
        @Validation(required = true)
        public DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroupsZoneIDList zoneIDList;

        public static DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups self = new DescribeDedicatedHostGroupsResponseDedicatedHostGroupsDedicatedHostGroups();
            return TeaModel.build(map, self);
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

    }

}
