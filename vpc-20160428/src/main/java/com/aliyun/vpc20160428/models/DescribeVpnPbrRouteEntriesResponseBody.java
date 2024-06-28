// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnPbrRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The time when the policy-based route was created. Unit: millisecond.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The next hop of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp15oes1py4i66rmd****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the tunnel associated with the next hop of the policy-based route.</p>
         * <p>This parameter is returned only if the VPN gateway supports IPsec-VPN connections in dual-tunnel mode.</p>
         * 
         * <strong>example:</strong>
         * <p>tun-opsqc4d97wni2****</p>
         */
        @NameInMap("NextHopTunnelId")
        public String nextHopTunnelId;

        /**
         * <p>The priority of the policy-based route.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The destination CIDR block of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("RouteDest")
        public String routeDest;

        /**
         * <p>The source CIDR block of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("RouteSource")
        public String routeSource;

        /**
         * <p>The status of the policy-based route. Valid values:</p>
         * <ul>
         * <li><strong>published</strong>: advertised to the VPC route table.</li>
         * <li><strong>normal</strong>: not advertised to the VPC route table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1a3kqjiiq9legfx****</p>
         */
        @NameInMap("VpnInstanceId")
        public String vpnInstanceId;

        /**
         * <p>The weight of the policy-based route.</p>
         * <p>For a VPN gateway that supports IPsec-VPN connections in single-tunnel mode, the weight of a policy-based route indicates the priority of the route.</p>
         * <ul>
         * <li><strong>100</strong>: a high priority If multiple policy-based routes with the same source CIDR block and destination CIDR block exist, the IPsec-VPN connection associated with the policy-based route is the active connection.</li>
         * <li><strong>0</strong>: a low priority If multiple policy-based routes with the same source CIDR block and destination CIDR block exist, the IPsec-VPN connection associated with the policy-based route is the standby connection.</li>
         * </ul>
         * <blockquote>
         * <p> For a VPN gateway that does not support IPsec-VPN connections in single-tunnel mode, this parameter does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
