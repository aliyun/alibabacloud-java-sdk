// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGatewayRouteTableEntriesResponseBody extends TeaModel {
    @NameInMap("GatewayRouteEntryModels")
    public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModels> gatewayRouteEntryModels;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("Name")
        public String name;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("NextHops")
        public java.util.List<ListGatewayRouteTableEntriesResponseBodyGatewayRouteEntryModelsNextHops> nextHops;

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
