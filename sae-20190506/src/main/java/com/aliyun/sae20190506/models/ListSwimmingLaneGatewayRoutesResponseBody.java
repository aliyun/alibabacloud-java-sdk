// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGatewayRoutesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Indicates a client error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Indicates a server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of gateway routes.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneGatewayRoutesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is returned only if the request fails.</p>
     * </li>
     * <li><p>For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned for the request.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error message is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID of the request.</p>
     * 
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
         * <p>The route path.</p>
         * 
         * <strong>example:</strong>
         * <p>/Path</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The type of the rule.</p>
         * 
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
        /**
         * <p>The path matching rule.</p>
         */
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
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16933</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-route</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The routing rule.</p>
         */
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
