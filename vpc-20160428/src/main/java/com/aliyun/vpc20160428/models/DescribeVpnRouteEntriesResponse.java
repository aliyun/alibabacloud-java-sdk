// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnRouteEntriesResponse extends TeaModel {
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

    @NameInMap("VpnRouteEntries")
    @Validation(required = true)
    public DescribeVpnRouteEntriesResponseVpnRouteEntries vpnRouteEntries;

    public static DescribeVpnRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnRouteEntriesResponse self = new DescribeVpnRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry extends TeaModel {
        @NameInMap("VpnInstanceId")
        @Validation(required = true)
        public String vpnInstanceId;

        @NameInMap("RouteDest")
        @Validation(required = true)
        public String routeDest;

        @NameInMap("NextHop")
        @Validation(required = true)
        public String nextHop;

        @NameInMap("Weight")
        @Validation(required = true)
        public Integer weight;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("AsPath")
        @Validation(required = true)
        public String asPath;

        @NameInMap("Community")
        @Validation(required = true)
        public String community;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("RouteEntryType")
        @Validation(required = true)
        public String routeEntryType;

        public static DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry self = new DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnRouteEntriesResponseVpnRouteEntries extends TeaModel {
        @NameInMap("VpnRouteEntry")
        @Validation(required = true)
        public java.util.List<DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry> vpnRouteEntry;

        public static DescribeVpnRouteEntriesResponseVpnRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnRouteEntriesResponseVpnRouteEntries self = new DescribeVpnRouteEntriesResponseVpnRouteEntries();
            return TeaModel.build(map, self);
        }

    }

}
