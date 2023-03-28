// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the route table.</p>
     */
    @NameInMap("RouteTables")
    public DescribeRouteTablesResponseBodyRouteTables routeTables;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesResponseBody self = new DescribeRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTablesResponseBody setRouteTables(DescribeRouteTablesResponseBodyRouteTables routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public DescribeRouteTablesResponseBodyRouteTables getRouteTables() {
        return this.routeTables;
    }

    public DescribeRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
        /**
         * <p>Indicates whether the next hop feature is enabled.</p>
         * <br>
         * <p>*   **0**: The next hop feature is disabled.</p>
         * <p>*   **1**: The next hop feature is enabled.</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the next hop.</p>
         * <br>
         * <p>*   **Instance**: The next hop is an Elastic Compute Service (ECS) instance.</p>
         * <p>*   **HaVip**: The next hop is a high-availability virtual IP address (HAVIP).</p>
         * <p>*   **VpnGateway**: The next hop is a VPN gateway.</p>
         * <p>*   **NatGateway**: The next hop is a NAT gateway.</p>
         * <p>*   **NetworkInterface**: The next hop is a secondary elastic network interface (ENI).</p>
         * <p>*   **RouterInterface**: The next hop is a router interface.</p>
         * <p>*   **IPv6Gateway**: The next hop is an IPv6 gateway.</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The route weight of the next hop.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry extends TeaModel {
        /**
         * <p>The description of the router entry.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the route entry.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the route.</p>
         * <br>
         * <p>*   **local**: a vSwitch route</p>
         * <p>*   **service**: a cloud service route</p>
         * <p>*   **classicLink**: a route added by the system after ClassicLink is enabled</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The list of next hops of equal-cost multi-path routing (ECMP) routes.</p>
         */
        @NameInMap("NextHops")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops;

        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The name of the route entry.</p>
         */
        @NameInMap("RouteEntryName")
        public String routeEntryName;

        /**
         * <p>The ID of the route table to which the route entry belongs.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The state of the route entry.</p>
         * <br>
         * <p>*   **Pending**: The route entry is being configured.</p>
         * <p>*   **Available**: The route entry is available.</p>
         * <p>*   **Modifying**: The route entry is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the route entry.</p>
         * <br>
         * <p>*   **System** : a system route entry</p>
         * <p>*   **Custom**: a custom route entry</p>
         * <p>*   **BGP**: a BGP route entry</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setNextHops(DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys setRouteEntry(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTable extends TeaModel {
        /**
         * <p>The time when the route table was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the resource group to which the elastic IP address (EIP) belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Detailed information about the route entry.</p>
         */
        @NameInMap("RouteEntrys")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys routeEntrys;

        /**
         * <p>The ID of the route table to which the route entry belongs.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        /**
         * <p>The state of the route table.</p>
         * <br>
         * <p>*   **Pending**: The route table is being configured.</p>
         * <p>*   **Available**: The route table is available.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vRouter.</p>
         */
        @NameInMap("VRouterId")
        public String VRouterId;

        /**
         * <p>The list of vSwitches that belong to the VPC.</p>
         */
        @NameInMap("VSwitchIds")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds vSwitchIds;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTable self = new DescribeRouteTablesResponseBodyRouteTablesRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteEntrys(DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys getRouteEntrys() {
            return this.routeEntrys;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setVSwitchIds(DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTables extends TeaModel {
        @NameInMap("RouteTable")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> routeTable;

        public static DescribeRouteTablesResponseBodyRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTables self = new DescribeRouteTablesResponseBodyRouteTables();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTables setRouteTable(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> getRouteTable() {
            return this.routeTable;
        }

    }

}
