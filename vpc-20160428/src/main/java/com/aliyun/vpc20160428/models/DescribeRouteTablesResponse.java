// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RouteTables")
    @Validation(required = true)
    public DescribeRouteTablesResponseRouteTables routeTables;

    public static DescribeRouteTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesResponse self = new DescribeRouteTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTablesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteTablesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTablesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTablesResponse setRouteTables(DescribeRouteTablesResponseRouteTables routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public DescribeRouteTablesResponseRouteTables getRouteTables() {
        return this.routeTables;
    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
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

        @NameInMap("NextHopOppsiteType")
        @Validation(required = true)
        public String nextHopOppsiteType;

        @NameInMap("NextHopOppsiteInstanceId")
        @Validation(required = true)
        public String nextHopOppsiteInstanceId;

        @NameInMap("NextHopOppsiteRegionId")
        @Validation(required = true)
        public String nextHopOppsiteRegionId;

        public static DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopOppsiteType(String nextHopOppsiteType) {
            this.nextHopOppsiteType = nextHopOppsiteType;
            return this;
        }
        public String getNextHopOppsiteType() {
            return this.nextHopOppsiteType;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopOppsiteInstanceId(String nextHopOppsiteInstanceId) {
            this.nextHopOppsiteInstanceId = nextHopOppsiteInstanceId;
            return this;
        }
        public String getNextHopOppsiteInstanceId() {
            return this.nextHopOppsiteInstanceId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopOppsiteRegionId(String nextHopOppsiteRegionId) {
            this.nextHopOppsiteRegionId = nextHopOppsiteRegionId;
            return this;
        }
        public String getNextHopOppsiteRegionId() {
            return this.nextHopOppsiteRegionId;
        }

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        @Validation(required = true)
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops self = new DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry extends TeaModel {
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("DestinationCidrBlock")
        @Validation(required = true)
        public String destinationCidrBlock;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("NextHopType")
        @Validation(required = true)
        public String nextHopType;

        @NameInMap("RouteEntryName")
        @Validation(required = true)
        public String routeEntryName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("RouteEntryId")
        @Validation(required = true)
        public String routeEntryId;

        @NameInMap("NextHopRegionId")
        @Validation(required = true)
        public String nextHopRegionId;

        @NameInMap("NextHopOppsiteType")
        @Validation(required = true)
        public String nextHopOppsiteType;

        @NameInMap("NextHopOppsiteInstanceId")
        @Validation(required = true)
        public String nextHopOppsiteInstanceId;

        @NameInMap("NextHopOppsiteRegionId")
        @Validation(required = true)
        public String nextHopOppsiteRegionId;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("NextHops")
        @Validation(required = true)
        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops;

        public static DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry self = new DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setNextHopOppsiteType(String nextHopOppsiteType) {
            this.nextHopOppsiteType = nextHopOppsiteType;
            return this;
        }
        public String getNextHopOppsiteType() {
            return this.nextHopOppsiteType;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setNextHopOppsiteInstanceId(String nextHopOppsiteInstanceId) {
            this.nextHopOppsiteInstanceId = nextHopOppsiteInstanceId;
            return this;
        }
        public String getNextHopOppsiteInstanceId() {
            return this.nextHopOppsiteInstanceId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setNextHopOppsiteRegionId(String nextHopOppsiteRegionId) {
            this.nextHopOppsiteRegionId = nextHopOppsiteRegionId;
            return this;
        }
        public String getNextHopOppsiteRegionId() {
            return this.nextHopOppsiteRegionId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry setNextHops(DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        @Validation(required = true)
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys self = new DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys setRouteEntry(java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds self = new DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTable extends TeaModel {
        @NameInMap("VRouterId")
        @Validation(required = true)
        public String VRouterId;

        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RouteEntrys")
        @Validation(required = true)
        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys routeEntrys;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds vSwitchIds;

        public static DescribeRouteTablesResponseRouteTablesRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTable self = new DescribeRouteTablesResponseRouteTablesRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setRouteEntrys(DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }
        public DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys getRouteEntrys() {
            return this.routeEntrys;
        }

        public DescribeRouteTablesResponseRouteTablesRouteTable setVSwitchIds(DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeRouteTablesResponseRouteTablesRouteTableVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class DescribeRouteTablesResponseRouteTables extends TeaModel {
        @NameInMap("RouteTable")
        @Validation(required = true)
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTable> routeTable;

        public static DescribeRouteTablesResponseRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTables self = new DescribeRouteTablesResponseRouteTables();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseRouteTables setRouteTable(java.util.List<DescribeRouteTablesResponseRouteTablesRouteTable> routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTable> getRouteTable() {
            return this.routeTable;
        }

    }

}
