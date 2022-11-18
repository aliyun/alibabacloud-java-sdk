// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayRoutesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ConflictCidrs")
        public java.util.List<String> conflictCidrs;

        @NameInMap("Cost")
        public String cost;

        @NameInMap("Dst")
        public String dst;

        @NameInMap("Idx")
        public Integer idx;

        @NameInMap("Nexthop")
        public String nexthop;

        @NameInMap("Role")
        public String role;

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
