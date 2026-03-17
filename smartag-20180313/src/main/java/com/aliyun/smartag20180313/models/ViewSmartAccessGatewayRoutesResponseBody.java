// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayRoutesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3D21D0B-5258-5412-AD1C-3929D297286B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the queried routes.</p>
     */
    @NameInMap("Routes")
    public java.util.List<ViewSmartAccessGatewayRoutesResponseBodyRoutes> routes;

    public static ViewSmartAccessGatewayRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayRoutesResponseBody self = new ViewSmartAccessGatewayRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayRoutesResponseBody setRoutes(java.util.List<ViewSmartAccessGatewayRoutesResponseBodyRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayRoutesResponseBodyRoutes> getRoutes() {
        return this.routes;
    }

    public static class ViewSmartAccessGatewayRoutesResponseBodyRoutes extends TeaModel {
        /**
         * <p>The CIDR blocks that overlap with each other.</p>
         */
        @NameInMap("ConflictCidrs")
        public java.util.List<String> conflictCidrs;

        /**
         * <p>The route cost.</p>
         * <p>The first <strong>0</strong> represents the administrative distance (AD).</p>
         * <p>The second <strong>0</strong> represents the router metric.</p>
         * 
         * <strong>example:</strong>
         * <p>[0/0]</p>
         */
        @NameInMap("Cost")
        public String cost;

        /**
         * <p>The destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.1.1.0/24</p>
         */
        @NameInMap("Dst")
        public String dst;

        /**
         * <p>The port number. A value of -1 indicates that the next hop points to a VPN tunnel.</p>
         * <p>Valid values: <strong>-1</strong> to <strong>4294967295</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Idx")
        public Integer idx;

        /**
         * <p>The next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>1.XX.XX.1</p>
         */
        @NameInMap("Nexthop")
        public String nexthop;

        /**
         * <p>The port role.</p>
         * 
         * <strong>example:</strong>
         * <p>WAN</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The route type. Valid values:</p>
         * <ul>
         * <li><strong>static</strong></li>
         * <li><strong>bgp</strong></li>
         * <li><strong>ospf</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        public static ViewSmartAccessGatewayRoutesResponseBodyRoutes build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayRoutesResponseBodyRoutes self = new ViewSmartAccessGatewayRoutesResponseBodyRoutes();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setConflictCidrs(java.util.List<String> conflictCidrs) {
            this.conflictCidrs = conflictCidrs;
            return this;
        }
        public java.util.List<String> getConflictCidrs() {
            return this.conflictCidrs;
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setDst(String dst) {
            this.dst = dst;
            return this;
        }
        public String getDst() {
            return this.dst;
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setIdx(Integer idx) {
            this.idx = idx;
            return this;
        }
        public Integer getIdx() {
            return this.idx;
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setNexthop(String nexthop) {
            this.nexthop = nexthop;
            return this;
        }
        public String getNexthop() {
            return this.nexthop;
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ViewSmartAccessGatewayRoutesResponseBodyRoutes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
