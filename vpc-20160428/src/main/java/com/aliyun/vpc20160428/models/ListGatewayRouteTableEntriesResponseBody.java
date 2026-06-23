// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGatewayRouteTableEntriesResponseBody extends TeaModel {
    /**
     * <p>The details of route entries in the gateway route table.</p>
     */
    @NameInMap("GatewayRouteEntryModels")
    public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels> gatewayRouteEntryModels;

    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
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
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
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
    public String totalCount;

    public static ListGatewayRouteTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteTableEntriesResponseBody self = new ListGatewayRouteTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteTableEntriesResponseBody setGatewayRouteEntryModels(java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels> gatewayRouteEntryModels) {
        this.gatewayRouteEntryModels = gatewayRouteEntryModels;
        return this;
    }
    public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels> getGatewayRouteEntryModels() {
        return this.gatewayRouteEntryModels;
    }

    public ListGatewayRouteTableEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGatewayRouteTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayRouteTableEntriesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops extends TeaModel {
        /**
         * <p>Indicates whether the route is available. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unavailable.</li>
         * <li><strong>1</strong>: available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The instance ID of the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp10zyaph5cc8b7c7****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong> (default): ECS instance.</li>
         * <li><strong>HaVip</strong>: high-availability virtual IP address (HaVip).</li>
         * <li><strong>VpnGateway</strong>: VPN gateway.</li>
         * <li><strong>NatGateway</strong>: NAT gateway.</li>
         * <li><strong>NetworkInterface</strong>: secondary elastic network interfaces (ENIs).</li>
         * <li><strong>RouterInterface</strong>: vRouter interface.</li>
         * <li><strong>IPv6Gateway</strong>: IPv6 gateway.</li>
         * <li><strong>Attachment</strong>: transit router.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The weight of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops self = new ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels extends TeaModel {
        /**
         * <p>The description of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.5</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The name of the route entry.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The instance ID of the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp11gcl0sm85t9bi****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><strong>EcsInstance</strong>: ECS instance.</li>
         * <li><strong>NetworkInterface</strong>: elastic network interfaces (ENIs).</li>
         * <li><strong>Local</strong>: local.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsInstance</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The next hop information.</p>
         */
        @NameInMap("NextHops")
        public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops> nextHops;

        /**
         * <p>The status of the route entry.</p>
         * <ul>
         * <li><strong>Pending</strong>: being configured.</li>
         * <li><strong>Available</strong>: available.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels self = new ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setNextHops(java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops> nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops> getNextHops() {
            return this.nextHops;
        }

        public ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
