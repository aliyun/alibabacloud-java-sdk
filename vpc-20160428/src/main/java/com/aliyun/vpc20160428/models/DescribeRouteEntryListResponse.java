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

    }

    public static class DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        @Validation(required = true)
        public java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops self = new DescribeRouteEntryListResponseRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeRouteEntryListResponseRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        @Validation(required = true)
        public java.util.List<DescribeRouteEntryListResponseRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteEntryListResponseRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseRouteEntrys self = new DescribeRouteEntryListResponseRouteEntrys();
            return TeaModel.build(map, self);
        }

    }

}
