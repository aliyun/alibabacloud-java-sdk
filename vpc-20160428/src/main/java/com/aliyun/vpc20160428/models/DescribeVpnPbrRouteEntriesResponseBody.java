// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnPbrRouteEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VpnPbrRouteEntries")
    public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries vpnPbrRouteEntries;

    public static DescribeVpnPbrRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnPbrRouteEntriesResponseBody self = new DescribeVpnPbrRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnPbrRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnPbrRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnPbrRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnPbrRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnPbrRouteEntriesResponseBody setVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries vpnPbrRouteEntries) {
        this.vpnPbrRouteEntries = vpnPbrRouteEntries;
        return this;
    }
    public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries getVpnPbrRouteEntries() {
        return this.vpnPbrRouteEntries;
    }

    public static class DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("RouteDest")
        public String routeDest;

        @NameInMap("RouteSource")
        public String routeSource;

        @NameInMap("State")
        public String state;

        @NameInMap("VpnInstanceId")
        public String vpnInstanceId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry self = new DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setRouteDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }
        public String getRouteDest() {
            return this.routeDest;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setRouteSource(String routeSource) {
            this.routeSource = routeSource;
            return this;
        }
        public String getRouteSource() {
            return this.routeSource;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setVpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }
        public String getVpnInstanceId() {
            return this.vpnInstanceId;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries extends TeaModel {
        @NameInMap("VpnPbrRouteEntry")
        public java.util.List<DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry> vpnPbrRouteEntry;

        public static DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries self = new DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntries setVpnPbrRouteEntry(java.util.List<DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry> vpnPbrRouteEntry) {
            this.vpnPbrRouteEntry = vpnPbrRouteEntry;
            return this;
        }
        public java.util.List<DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry> getVpnPbrRouteEntry() {
            return this.vpnPbrRouteEntry;
        }

    }

}
