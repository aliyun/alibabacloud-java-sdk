// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVcoRouteEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VcoRouteEntries")
    public java.util.List<DescribeVcoRouteEntriesResponseBodyVcoRouteEntries> vcoRouteEntries;

    public static DescribeVcoRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVcoRouteEntriesResponseBody self = new DescribeVcoRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVcoRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVcoRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVcoRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVcoRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVcoRouteEntriesResponseBody setVcoRouteEntries(java.util.List<DescribeVcoRouteEntriesResponseBodyVcoRouteEntries> vcoRouteEntries) {
        this.vcoRouteEntries = vcoRouteEntries;
        return this;
    }
    public java.util.List<DescribeVcoRouteEntriesResponseBodyVcoRouteEntries> getVcoRouteEntries() {
        return this.vcoRouteEntries;
    }

    public static class DescribeVcoRouteEntriesResponseBodyVcoRouteEntries extends TeaModel {
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

        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeVcoRouteEntriesResponseBodyVcoRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeVcoRouteEntriesResponseBodyVcoRouteEntries self = new DescribeVcoRouteEntriesResponseBodyVcoRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setAsPath(String asPath) {
            this.asPath = asPath;
            return this;
        }
        public String getAsPath() {
            return this.asPath;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setCommunity(String community) {
            this.community = community;
            return this;
        }
        public String getCommunity() {
            return this.community;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setRouteDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }
        public String getRouteDest() {
            return this.routeDest;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setRouteEntryType(String routeEntryType) {
            this.routeEntryType = routeEntryType;
            return this;
        }
        public String getRouteEntryType() {
            return this.routeEntryType;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        public DescribeVcoRouteEntriesResponseBodyVcoRouteEntries setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
