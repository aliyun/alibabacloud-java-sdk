// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the route.</p>
     */
    @NameInMap("RouteEntrys")
    public DescribeRouteEntryListResponseBodyRouteEntrys routeEntrys;

    public static DescribeRouteEntryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListResponseBody self = new DescribeRouteEntryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteEntryListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteEntryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteEntryListResponseBody setRouteEntrys(DescribeRouteEntryListResponseBodyRouteEntrys routeEntrys) {
        this.routeEntrys = routeEntrys;
        return this;
    }
    public DescribeRouteEntryListResponseBodyRouteEntrys getRouteEntrys() {
        return this.routeEntrys;
    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo extends TeaModel {
        /**
         * <p>The ID of the instance that is associated with the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1t36rn9l53iwbsf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance associated with the next hop. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: a VPC</li>
         * <li><strong>VBR</strong>: a VBR</li>
         * <li><strong>PCONN</strong>: an Express Connect circuit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region ID of the instance associated with the next hop. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ch-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
        /**
         * <p>Indicates whether the route is available. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unavailable</li>
         * <li><strong>1</strong>: available</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned when the next hop type is set to <strong>RouterInterface</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>The ID of the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp10zyaph5cc8b7c7****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The ID of the region where the next hop is deployed.</p>
         * <blockquote>
         * <p> This parameter is returned when the next hop type is set to <strong>RouterInterface</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        /**
         * <p>The information about the next hop.</p>
         */
        @NameInMap("NextHopRelatedInfo")
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo;

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong>: an ECS instance.</li>
         * <li><strong>HaVip</strong>: an HAVIP.</li>
         * <li><strong>VpnGateway</strong>: a VPN gateway.</li>
         * <li><strong>NatGateway</strong>: a NAT gateway.</li>
         * <li><strong>NetworkInterface</strong>: a secondary ENI.</li>
         * <li><strong>RouterInterface</strong>: a router interface.</li>
         * <li><strong>IPv6Gateway</strong>: an IPv6 gateway.</li>
         * <li><strong>Attachment</strong>: a transit router.</li>
         * <li><strong>Ipv4Gateway</strong>: an IPv4 gateway.</li>
         * <li><strong>GatewayEndpoint</strong>: a gateway endpoint.</li>
         * <li><strong>CenBasic</strong>: CEN does not support transit routers.</li>
         * <li><strong>Ecr</strong>: ECR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The weight of the route.</p>
         * <blockquote>
         * <p> This parameter is returned when the next hop type is set to <strong>RouterInterface</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopRelatedInfo(DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo) {
            this.nextHopRelatedInfo = nextHopRelatedInfo;
            return this;
        }
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo getNextHopRelatedInfo() {
            return this.nextHopRelatedInfo;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry extends TeaModel {
        /**
         * <p>The description of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>RouteEntryDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The time when the route was modified. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-09T03:00:07Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The IP version. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong></li>
         * <li><strong>ipv6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The information about the next hops.</p>
         */
        @NameInMap("NextHops")
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops nextHops;

        /**
         * <p>The route origin. Valid values:</p>
         * <ul>
         * <li><strong>RoutePropagation</strong>: The route is created by a dynamic propagation source.</li>
         * <li><strong>SystemCreate</strong>: The route is created by the system.</li>
         * <li><strong>CustomCreate</strong>: The route is created by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RoutePropagation</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnp****</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("RouteEntryName")
        public String routeEntryName;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp15w5q90d2rk3bww****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>Indicates whether the route is hosted. If the parameter is empty, the route is not hosted.</p>
         * <p>If <strong>TR</strong> is returned, the route is hosted by a transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>TR</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The route status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Modifying</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The route type. Valid values:</p>
         * <ul>
         * <li><strong>Custom</strong>: custom routes.</li>
         * <li><strong>System</strong>: system routes.</li>
         * <li><strong>BGP</strong>: BGP routes.</li>
         * <li><strong>CEN</strong>: CEN routes.</li>
         * <li><strong>ECR</strong>: ECR routes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry self = new DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setNextHops(DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteEntryListResponseBodyRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntrys self = new DescribeRouteEntryListResponseBodyRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntrys setRouteEntry(java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

}
