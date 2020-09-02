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

    public DescribeVpnPbrRouteEntriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnPbrRouteEntriesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnPbrRouteEntriesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnPbrRouteEntriesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnPbrRouteEntriesResponse setVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries vpnPbrRouteEntries) {
        this.vpnPbrRouteEntries = vpnPbrRouteEntries;
        return this;
    }
    public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries getVpnPbrRouteEntries() {
        return this.vpnPbrRouteEntries;
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

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setVpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }
        public String getVpnInstanceId() {
            return this.vpnInstanceId;
        }

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setRouteSource(String routeSource) {
            this.routeSource = routeSource;
            return this;
        }
        public String getRouteSource() {
            return this.routeSource;
        }

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setRouteDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }
        public String getRouteDest() {
            return this.routeDest;
        }

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

        public DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntries setVpnPbrRouteEntry(java.util.List<DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry> vpnPbrRouteEntry) {
            this.vpnPbrRouteEntry = vpnPbrRouteEntry;
            return this;
        }
        public java.util.List<DescribeVpnPbrRouteEntriesResponseVpnPbrRouteEntriesVpnPbrRouteEntry> getVpnPbrRouteEntry() {
            return this.vpnPbrRouteEntry;
        }

    }

}
