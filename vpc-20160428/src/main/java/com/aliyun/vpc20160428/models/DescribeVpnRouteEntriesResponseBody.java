// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnRouteEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VpnRouteEntries")
    public DescribeVpnRouteEntriesResponseBodyVpnRouteEntries vpnRouteEntries;

    public static DescribeVpnRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnRouteEntriesResponseBody self = new DescribeVpnRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnRouteEntriesResponseBody setVpnRouteEntries(DescribeVpnRouteEntriesResponseBodyVpnRouteEntries vpnRouteEntries) {
        this.vpnRouteEntries = vpnRouteEntries;
        return this;
    }
    public DescribeVpnRouteEntriesResponseBodyVpnRouteEntries getVpnRouteEntries() {
        return this.vpnRouteEntries;
    }

    public static class DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry extends TeaModel {
        @NameInMap("AsPath")
        public String asPath;

        @NameInMap("Community")
        public String community;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("RouteDest")
        public String routeDest;

        @NameInMap("RouteEntryType")
        public String routeEntryType;

        @NameInMap("Source")
        public String source;

        @NameInMap("State")
        public String state;

        @NameInMap("VpnInstanceId")
        public String vpnInstanceId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry self = new DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setAsPath(String asPath) {
            this.asPath = asPath;
            return this;
        }
        public String getAsPath() {
            return this.asPath;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setCommunity(String community) {
            this.community = community;
            return this;
        }
        public String getCommunity() {
            return this.community;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setRouteDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }
        public String getRouteDest() {
            return this.routeDest;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setRouteEntryType(String routeEntryType) {
            this.routeEntryType = routeEntryType;
            return this;
        }
        public String getRouteEntryType() {
            return this.routeEntryType;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setVpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }
        public String getVpnInstanceId() {
            return this.vpnInstanceId;
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeVpnRouteEntriesResponseBodyVpnRouteEntries extends TeaModel {
        @NameInMap("VpnRouteEntry")
        public java.util.List<DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry> vpnRouteEntry;

        public static DescribeVpnRouteEntriesResponseBodyVpnRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnRouteEntriesResponseBodyVpnRouteEntries self = new DescribeVpnRouteEntriesResponseBodyVpnRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntries setVpnRouteEntry(java.util.List<DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry> vpnRouteEntry) {
            this.vpnRouteEntry = vpnRouteEntry;
            return this;
        }
        public java.util.List<DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry> getVpnRouteEntry() {
            return this.vpnRouteEntry;
        }

    }

}
