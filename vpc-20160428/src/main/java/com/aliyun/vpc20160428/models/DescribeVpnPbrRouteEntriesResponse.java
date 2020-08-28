// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnPbrRouteEntriesResponse extends TeaModel {
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

    @NameInMap("VpnPbrRouteEntries")
    @Validation(required = true)
    public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries vpnPbrRouteEntries;

    public static DescribeVpnPbrRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnPbrRouteEntriesResponse self = new DescribeVpnPbrRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry extends TeaModel {
        @NameInMap("VpnInstanceId")
        @Validation(required = true)
        public String vpnInstanceId;

        @NameInMap("RouteSource")
        @Validation(required = true)
        public String routeSource;

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

        public static DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry self = new DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries extends TeaModel {
        @NameInMap("VpnPbrRouteEntry")
        @Validation(required = true)
        public java.util.List<DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry> vpnPbrRouteEntry;

        public static DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries self = new DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries();
            return TeaModel.build(map, self);
        }

    }

}
