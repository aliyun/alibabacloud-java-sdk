// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGatewayRouteTableEntriesResponseBody extends TeaModel {
    /**
     * <p>The details of the routes in the gateway route table.</p>
     */
    @NameInMap("GatewayRouteEntryModels")
    public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels> gatewayRouteEntryModels;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <br>
         * <p>*   **0**: unavailable</p>
         * <p>*   **1**: available</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the next hop. Valid values:</p>
         * <br>
         * <p>*   **Instance** (default): an ECS instance</p>
         * <p>*   **HaVip**: a high-availability virtual IP address (HAVIP)</p>
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
         * <p>The name of the route.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The name of the route.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the next hop. Valid values:</p>
         * <br>
         * <p>*   **EcsInstance**: an Elastic Compute Service (ECS) instance</p>
         * <p>*   **NetworkInterface**: an elastic network interface (ENI)</p>
         * <p>*   **Local**: a local next hop</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The information about the next hop.</p>
         */
        @NameInMap("NextHops")
        public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops> nextHops;

        /**
         * <p>The status of the route. Valid values:</p>
         * <br>
         * <p>*   **Pending**</p>
         * <p>*   **Available**</p>
         * <p>*   **Modifying**</p>
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
