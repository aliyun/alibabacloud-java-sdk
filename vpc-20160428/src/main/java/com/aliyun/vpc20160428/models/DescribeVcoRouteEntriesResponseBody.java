// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVcoRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
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
     * <p>E18980E8-C8C2-31BD-8156-AE2BBDEC87E1</p>
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
     * <p>The list of routes.</p>
     */
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
        /**
         * <p>The list of autonomous system (AS) numbers that the BGP route goes through.</p>
         * 
         * <strong>example:</strong>
         * <p>[12000]</p>
         */
        @NameInMap("AsPath")
        public String asPath;

        /**
         * <p>The community value carried by the BGP route.</p>
         * 
         * <strong>example:</strong>
         * <p>65535:65510</p>
         */
        @NameInMap("Community")
        public String community;

        /**
         * <p>The timestamp when the route was created.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1658217008000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The next hop of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w2jpkhi2eeop6q6****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("RouteDest")
        public String routeDest;

        /**
         * <p>The route type. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: a destination-based route</li>
         * <li><strong>bgp</strong>: a BGP route</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("RouteEntryType")
        public String routeEntryType;

        /**
         * <p>The source of the BGP route. Valid values:</p>
         * <ul>
         * <li><strong>CLOUD</strong>: indicates that the current BGP route is learned by the IPsec-VPN connection from the transit router.</li>
         * <li><strong>VPN_BGP</strong>: indicates that the current BGP route is learned by the IPsec-VPN connection from the data center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the route.</p>
         * <ul>
         * <li><strong>published</strong>: indicates that the current route is advertised to the transit router.</li>
         * <li><strong>Active</strong>: indicates that the current BGP route is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w2jpkhi2eeop6q6****</p>
         */
        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        /**
         * <p>The weight of the destination-based route. Valid values:</p>
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
