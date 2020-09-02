// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RouteEntrys")
    @Validation(required = true)
    public DescribeRouteEntryListResponseRouteEntrys routeEntrys;

    public static DescribeRouteEntryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListResponse self = new DescribeRouteEntryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteEntryListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteEntryListResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteEntryListResponse setRouteEntrys(DescribeRouteEntryListResponseRouteEntrys routeEntrys) {
        this.routeEntrys = routeEntrys;
        return this;
    }
    public DescribeRouteEntryListResponseRouteEntrys getRouteEntrys() {
        return this.routeEntrys;
    }

    public static class DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo self = new DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
        @NameInMap("NextHopType")
        @Validation(required = true)
        public String nextHopType;

        @NameInMap("NextHopId")
        @Validation(required = true)
        public String nextHopId;

        @NameInMap("Enabled")
        @Validation(required = true)
        public Integer enabled;

        @NameInMap("Weight")
        @Validation(required = true)
        public Integer weight;

        @NameInMap("NextHopRegionId")
        @Validation(required = true)
        public String nextHopRegionId;

        @NameInMap("NextHopRelatedInfo")
        @Validation(required = true)
        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo;

        public static DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop setNextHopRelatedInfo(DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo) {
            this.nextHopRelatedInfo = nextHopRelatedInfo;
            return this;
        }
        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo getNextHopRelatedInfo() {
            return this.nextHopRelatedInfo;
        }

    }

    public static class DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        @Validation(required = true)
        public java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops self = new DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteEntryListResponseRouteEntrysRouteEntry extends TeaModel {
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("DestinationCidrBlock")
        @Validation(required = true)
        public String destinationCidrBlock;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("RouteEntryId")
        @Validation(required = true)
        public String routeEntryId;

        @NameInMap("RouteEntryName")
        @Validation(required = true)
        public String routeEntryName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("IpVersion")
        @Validation(required = true)
        public String ipVersion;

        @NameInMap("NextHops")
        @Validation(required = true)
        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops nextHops;

        public static DescribeRouteEntryListResponseRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrysRouteEntry self = new DescribeRouteEntryListResponseRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeRouteEntryListResponseRouteEntrysRouteEntry setNextHops(DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

    }

    public static class DescribeRouteEntryListResponseRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        @Validation(required = true)
        public java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteEntryListResponseRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrys self = new DescribeRouteEntryListResponseRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseRouteEntrys setRouteEntry(java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

}
