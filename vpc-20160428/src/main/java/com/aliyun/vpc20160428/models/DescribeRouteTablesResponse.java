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

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        @Validation(required = true)
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops self = new DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        @Validation(required = true)
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys self = new DescribeRouteTablesResponseRouteTablesRouteTableRouteEntrys();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeRouteTablesResponseRouteTables extends TeaModel {
        @NameInMap("RouteTable")
        @Validation(required = true)
        public java.util.List<DescribeRouteTablesResponseRouteTablesRouteTable> routeTable;

        public static DescribeRouteTablesResponseRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseRouteTables self = new DescribeRouteTablesResponseRouteTables();
            return TeaModel.build(map, self);
        }

    }

}
