// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGatewayRoutesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneGatewayRoutesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>ac1a0b2215622246421415014e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListSwimmingLaneGatewayRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGatewayRoutesResponseBody self = new ListSwimmingLaneGatewayRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setData(java.util.List<ListSwimmingLaneGatewayRoutesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSwimmingLaneGatewayRoutesResponseBodyData> getData() {
        return this.data;
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSwimmingLaneGatewayRoutesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/Path</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate self = new ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate extends TeaModel {
        @NameInMap("PathPredicate")
        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate pathPredicate;

        public static ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate self = new ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate setPathPredicate(ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate pathPredicate) {
            this.pathPredicate = pathPredicate;
            return this;
        }
        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicatePathPredicate getPathPredicate() {
            return this.pathPredicate;
        }

    }

    public static class ListSwimmingLaneGatewayRoutesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16933</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <strong>example:</strong>
         * <p>test-route</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("RoutePredicate")
        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate routePredicate;

        public static ListSwimmingLaneGatewayRoutesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGatewayRoutesResponseBodyData self = new ListSwimmingLaneGatewayRoutesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGatewayRoutesResponseBodyData setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListSwimmingLaneGatewayRoutesResponseBodyData setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListSwimmingLaneGatewayRoutesResponseBodyData setRoutePredicate(ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate routePredicate) {
            this.routePredicate = routePredicate;
            return this;
        }
        public ListSwimmingLaneGatewayRoutesResponseBodyDataRoutePredicate getRoutePredicate() {
            return this.routePredicate;
        }

    }

}
