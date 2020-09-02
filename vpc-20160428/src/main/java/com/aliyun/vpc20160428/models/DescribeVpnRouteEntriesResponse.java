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

    public DescribeVpnRouteEntriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnRouteEntriesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnRouteEntriesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnRouteEntriesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnRouteEntriesResponse setVpnRouteEntries(DescribeVpnRouteEntriesResponseVpnRouteEntries vpnRouteEntries) {
        this.vpnRouteEntries = vpnRouteEntries;
        return this;
    }
    public DescribeVpnRouteEntriesResponseVpnRouteEntries getVpnRouteEntries() {
        return this.vpnRouteEntries;
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

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setVpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }
        public String getVpnInstanceId() {
            return this.vpnInstanceId;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setRouteDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }
        public String getRouteDest() {
            return this.routeDest;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setAsPath(String asPath) {
            this.asPath = asPath;
            return this;
        }
        public String getAsPath() {
            return this.asPath;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setCommunity(String community) {
            this.community = community;
            return this;
        }
        public String getCommunity() {
            return this.community;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry setRouteEntryType(String routeEntryType) {
            this.routeEntryType = routeEntryType;
            return this;
        }
        public String getRouteEntryType() {
            return this.routeEntryType;
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

        public DescribeVpnRouteEntriesResponseVpnRouteEntries setVpnRouteEntry(java.util.List<DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry> vpnRouteEntry) {
            this.vpnRouteEntry = vpnRouteEntry;
            return this;
        }
        public java.util.List<DescribeVpnRouteEntriesResponseVpnRouteEntriesVpnRouteEntry> getVpnRouteEntry() {
            return this.vpnRouteEntry;
        }

    }

}
