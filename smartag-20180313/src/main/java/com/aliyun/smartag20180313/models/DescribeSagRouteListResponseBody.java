// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Routes")
    public java.util.List<DescribeSagRouteListResponseBodyRoutes> routes;

    public static DescribeSagRouteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteListResponseBody self = new DescribeSagRouteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagRouteListResponseBody setRoutes(java.util.List<DescribeSagRouteListResponseBodyRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<DescribeSagRouteListResponseBodyRoutes> getRoutes() {
        return this.routes;
    }

    public static class DescribeSagRouteListResponseBodyRoutes extends TeaModel {
        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("DestinationCidr")
        public String destinationCidr;

        @NameInMap("Cost")
        public String cost;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("ConflictCidrs")
        public java.util.List<String> conflictCidrs;

        @NameInMap("RouteProtocol")
        public String routeProtocol;

        public static DescribeSagRouteListResponseBodyRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRouteListResponseBodyRoutes self = new DescribeSagRouteListResponseBodyRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeSagRouteListResponseBodyRoutes setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeSagRouteListResponseBodyRoutes setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeSagRouteListResponseBodyRoutes setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public DescribeSagRouteListResponseBodyRoutes setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagRouteListResponseBodyRoutes setConflictCidrs(java.util.List<String> conflictCidrs) {
            this.conflictCidrs = conflictCidrs;
            return this;
        }
        public java.util.List<String> getConflictCidrs() {
            return this.conflictCidrs;
        }

        public DescribeSagRouteListResponseBodyRoutes setRouteProtocol(String routeProtocol) {
            this.routeProtocol = routeProtocol;
            return this;
        }
        public String getRouteProtocol() {
            return this.routeProtocol;
        }

    }

}
