// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BF3995A6-FA4F-4C74-B90F-89ECF4BFF4D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of route entries.</p>
     */
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
        /**
         * <p>The AS path of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>65501,65001,60011</p>
         */
        @NameInMap("AsPath")
        public String asPath;

        /**
         * <p>The community attributes of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>65001:1000,65501:2000</p>
         */
        @NameInMap("Community")
        public String community;

        /**
         * <p>The timestamp when the route entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1563874074000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The next hop of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp1tui07ob10fmuro****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the tunnel associated with the next hop. </p>
         * <blockquote>
         * <p>This parameter is returned only if the VPN gateway supports the dual-tunnel mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tun-36cfgpwjn58axj****</p>
         */
        @NameInMap("NextHopTunnelId")
        public String nextHopTunnelId;

        /**
         * <p>The destination CIDR block of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("RouteDest")
        public String routeDest;

        /**
         * <p>The type of the route entry. Valid values:</p>
         * <ul>
         * <li><strong>Custom</strong>: custom</li>
         * <li><strong>System</strong>: system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("RouteEntryType")
        public String routeEntryType;

        /**
         * <p>The source CIDR block of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the route entry. Valid values:</p>
         * <ul>
         * <li><strong>published</strong>: advertised</li>
         * <li><strong>normal</strong>: not advertised</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1cmw7jh1nfe43m9****</p>
         */
        @NameInMap("VpnInstanceId")
        public String vpnInstanceId;

        /**
         * <p>The weight of the route entry. Valid values: <strong>0</strong> and <strong>100</strong>.</p>
         * <ul>
         * <li><strong>0</strong>: a low priority</li>
         * <li><strong>100</strong>: a high priority</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

        public DescribeVpnRouteEntriesResponseBodyVpnRouteEntriesVpnRouteEntry setNextHopTunnelId(String nextHopTunnelId) {
            this.nextHopTunnelId = nextHopTunnelId;
            return this;
        }
        public String getNextHopTunnelId() {
            return this.nextHopTunnelId;
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
