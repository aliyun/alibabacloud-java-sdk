// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The route list.</p>
     */
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
        /**
         * <p>The list of conflicting CIDR blocks.</p>
         */
        @NameInMap("ConflictCidrs")
        public java.util.List<String> conflictCidrs;

        /**
         * <p>The routing cost value. The number to the left of the forward slash (/) represents the administrative distance (AD) of the routable protocol. The number to the right of the forward slash (/) represents the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>[110/11]</p>
         */
        @NameInMap("Cost")
        public String cost;

        /**
         * <p>The destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>6.XX.XX.6/32</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The port name. A port name of -1 indicates that data traffic enters Alibaba Cloud through a VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The routable protocol type. Valid values:</p>
         * <ul>
         * <li><strong>STATIC</strong>: Static routable protocol.</li>
         * <li><strong>OSPF</strong>: OSPF dynamic routable protocol.</li>
         * <li><strong>BGP</strong>: BGP dynamic routable protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        @NameInMap("RouteProtocol")
        public String routeProtocol;

        public static DescribeSagRouteListResponseBodyRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRouteListResponseBodyRoutes self = new DescribeSagRouteListResponseBodyRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeSagRouteListResponseBodyRoutes setConflictCidrs(java.util.List<String> conflictCidrs) {
            this.conflictCidrs = conflictCidrs;
            return this;
        }
        public java.util.List<String> getConflictCidrs() {
            return this.conflictCidrs;
        }

        public DescribeSagRouteListResponseBodyRoutes setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public DescribeSagRouteListResponseBodyRoutes setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeSagRouteListResponseBodyRoutes setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeSagRouteListResponseBodyRoutes setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
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
