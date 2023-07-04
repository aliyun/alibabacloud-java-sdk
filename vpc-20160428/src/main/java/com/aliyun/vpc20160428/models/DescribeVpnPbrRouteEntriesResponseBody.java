// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnPbrRouteEntriesResponseBody extends TeaModel {
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
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of policy-based routes.</p>
     */
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
        /**
         * <p>The timestamp generated when the policy-based route was created. Unit: milliseconds.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The next hop of the policy-based route.</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("NextHopTunnelId")
        public String nextHopTunnelId;

        /**
         * <p>The priority of the policy-based route.</p>
         * <br>
         * <p>A smaller value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The destination CIDR block of the policy-based route.</p>
         */
        @NameInMap("RouteDest")
        public String routeDest;

        /**
         * <p>The source CIDR block of the policy-based route.</p>
         */
        @NameInMap("RouteSource")
        public String routeSource;

        /**
         * <p>The status of the policy-based route. Valid values:</p>
         * <br>
         * <p>*   **published**: advertised to the VPC route table.</p>
         * <p>*   **normal**: not advertised to the VPC route table.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the VPN gateway.</p>
         */
        @NameInMap("VpnInstanceId")
        public String vpnInstanceId;

        /**
         * <p>The weight of the policy-based route. Valid values:</p>
         * <br>
         * <p>*   **100**: The IPsec-VPN connection associated with the policy-based route serves as an active connection.</p>
         * <p>*   **0**: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.</p>
         */
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

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setNextHopTunnelId(String nextHopTunnelId) {
            this.nextHopTunnelId = nextHopTunnelId;
            return this;
        }
        public String getNextHopTunnelId() {
            return this.nextHopTunnelId;
        }

        public DescribeVpnPbrRouteEntriesResponseBodyVpnPbrRouteEntriesVpnPbrRouteEntry setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
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
