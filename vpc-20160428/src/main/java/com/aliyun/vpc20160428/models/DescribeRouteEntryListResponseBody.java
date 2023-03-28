// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, it indicates that no next query is to be sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the routes.</p>
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
         * <p>The ID of the instance associated with the next hop.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance associated with the next hop. Valid values:</p>
         * <br>
         * <p>*   **VPC**: a virtual private cloud (VPC)</p>
         * <p>*   **VBR**: a VBR</p>
         * <p>*   **PCONN**: an Express Connect circuit</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region ID of the instance associated with the next hop.</p>
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
         * <br>
         * <p>*   **0**: unavailable</p>
         * <p>*   **1**: available</p>
         * <br>
         * <p>>  This parameter is returned if the next hop type is set to **RouterInterface**.</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The region ID of the next hop.</p>
         * <br>
         * <p>>  This parameter is returned if the next hop type is set to **RouterInterface**.</p>
         */
        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        /**
         * <p>The information about the next hop.</p>
         */
        @NameInMap("NextHopRelatedInfo")
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHopsNextHopNextHopRelatedInfo nextHopRelatedInfo;

        /**
         * <p>The type of the next hop. Valid values:</p>
         * <br>
         * <p>*   **Instance**: an ECS instance</p>
         * <p>*   **HaVip**: an HAVIP</p>
         * <p>*   **VpnGateway**: a VPN gateway</p>
         * <p>*   **NatGateway**: a NAT gateway</p>
         * <p>*   **NetworkInterface**: a secondary ENI</p>
         * <p>*   **RouterInterface**: a router interface</p>
         * <p>*   **IPv6Gateway**: an IPv6 gateway</p>
         * <p>*   **Attachment**: a transit router</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The weight of the route.</p>
         * <br>
         * <p>>  This parameter is returned if the next hop type is set to **RouterInterface**.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR blocks of the route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The time when the route was modified. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The information about the next hops.</p>
         */
        @NameInMap("NextHops")
        public DescribeRouteEntryListResponseBodyRouteEntrysRouteEntryNextHops nextHops;

        /**
         * <p>The ID of the route.</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The name of the route.</p>
         */
        @NameInMap("RouteEntryName")
        public String routeEntryName;

        /**
         * <p>The ID of the route table.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>Indicates whether the route is hosted. If the parameter is empty, the route is not hosted. </p>
         * <br>
         * <p>If the value is set to **TR**, the route is hosted by a transit router.</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the route. Valid values:</p>
         * <br>
         * <p>*   **Pending**: The route is being configured.</p>
         * <p>*   **Available**: The route is available.</p>
         * <p>*   **Modifying**: The route is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the route. Valid values:</p>
         * <br>
         * <p>*   **Custom**: a custom route</p>
         * <p>*   **System**: a system route</p>
         * <p>*   **BGP**: a BGP route</p>
         * <p>*   **CEN**: a CEN route</p>
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
