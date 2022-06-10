// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteEntrys")
    public DescribeRouteEntryListResponseBodyRouteEntrys routeEntrys;

    public static DescribeRouteEntryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListResponseBody self = new DescribeRouteEntryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteEntryListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteEntryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteEntryListResponseBody setRouteEntrys(DescribeRouteEntryListResponseBodyRouteEntrys routeEntrys) {
        this.routeEntrys = routeEntrys;
        return this;
    }
    public DescribeRouteEntryListResponseBodyRouteEntrys getRouteEntrys() {
        return this.routeEntrys;
    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
        @NameInMap("Enabled")
        public Integer enabled;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        @NameInMap("NextHopRelatedInfo")
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopRelatedInfo(DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo) {
            this.nextHopRelatedInfo = nextHopRelatedInfo;
            return this;
        }
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo getNextHopRelatedInfo() {
            return this.nextHopRelatedInfo;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("NextHops")
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops nextHops;

        @NameInMap("RouteEntryId")
        public String routeEntryId;

        @NameInMap("RouteEntryName")
        public String routeEntryName;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setNextHops(DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteEntryListResponseBodyRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrys self = new DescribeRouteEntryListResponseBodyRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrys setRouteEntry(java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

}
