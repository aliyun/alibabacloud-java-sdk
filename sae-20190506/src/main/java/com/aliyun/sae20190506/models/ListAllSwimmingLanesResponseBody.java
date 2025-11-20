// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAllSwimmingLanesResponseBody extends TeaModel {
    /**
     * <p>The interface status or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The output parameters of the node.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAllSwimmingLanesResponseBodyData> data;

    /**
     * <p>Error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, no <strong>ErrorCode</strong> fields are returned.</li>
     * <li>Request failed: <strong>ErrorCode</strong> fields are returned. For more information, see <strong>Error codes</strong>.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information. Valid values:</p>
     * <ul>
     * <li>The error message returned because the request is normal and <strong>success</strong> is returned.</li>
     * <li>If the request is abnormal, the specific exception error code is returned.</li>
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
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the data is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The application instances were restarted.</li>
     * <li><strong>false</strong>: Restart failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. This parameter is used to query the exact call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListAllSwimmingLanesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllSwimmingLanesResponseBody self = new ListAllSwimmingLanesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllSwimmingLanesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllSwimmingLanesResponseBody setData(java.util.List<ListAllSwimmingLanesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllSwimmingLanesResponseBodyData> getData() {
        return this.data;
    }

    public ListAllSwimmingLanesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAllSwimmingLanesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllSwimmingLanesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllSwimmingLanesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAllSwimmingLanesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions extends TeaModel {
        /**
         * <p>The matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The match value.</p>
         * 
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The match value of the condition.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions self = new ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataAppEntryRule extends TeaModel {
        /**
         * <p>Logical connectors between conditions:</p>
         * <ul>
         * <li>AND: All conditions are met at the same time.</li>
         * <li>OR: Any condition is met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        /**
         * <p>The matching condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions> conditions;

        /**
         * <p>Whether to enable proportional grayscale.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The request path.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The traffic ratio. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>Traffic matching.</p>
         */
        @NameInMap("PercentageByPath")
        public java.util.Map<String, Integer> percentageByPath;

        public static ListAllSwimmingLanesResponseBodyDataAppEntryRule build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataAppEntryRule self = new ListAllSwimmingLanesResponseBodyDataAppEntryRule();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRule setConditionJoiner(String conditionJoiner) {
            this.conditionJoiner = conditionJoiner;
            return this;
        }
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRule setConditions(java.util.List<ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListAllSwimmingLanesResponseBodyDataAppEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRule setIndependentPercentageEnable(Boolean independentPercentageEnable) {
            this.independentPercentageEnable = independentPercentageEnable;
            return this;
        }
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRule setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListAllSwimmingLanesResponseBodyDataAppEntryRule setPercentageByPath(java.util.Map<String, Integer> percentageByPath) {
            this.percentageByPath = percentageByPath;
            return this;
        }
        public java.util.Map<String, Integer> getPercentageByPath() {
            return this.percentageByPath;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataApps extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>8ea0c468-8165-416d-beae-531abb******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the MSE instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-53y49******</p>
         */
        @NameInMap("MseAppId")
        public String mseAppId;

        /**
         * <p>The name of the MSE instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("MseAppName")
        public String mseAppName;

        /**
         * <p>The ID of the namespace to which the MSE instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>space</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        public static ListAllSwimmingLanesResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataApps self = new ListAllSwimmingLanesResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAllSwimmingLanesResponseBodyDataApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAllSwimmingLanesResponseBodyDataApps setMseAppId(String mseAppId) {
            this.mseAppId = mseAppId;
            return this;
        }
        public String getMseAppId() {
            return this.mseAppId;
        }

        public ListAllSwimmingLanesResponseBodyDataApps setMseAppName(String mseAppName) {
            this.mseAppName = mseAppName;
            return this;
        }
        public String getMseAppName() {
            return this.mseAppName;
        }

        public ListAllSwimmingLanesResponseBodyDataApps setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions extends TeaModel {
        /**
         * <p>The matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The match value of the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions self = new ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate extends TeaModel {
        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/Path</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate self = new ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate extends TeaModel {
        /**
         * <p>The path matching rule.</p>
         */
        @NameInMap("PathPredicate")
        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate pathPredicate;

        public static ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate self = new ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate setPathPredicate(ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate pathPredicate) {
            this.pathPredicate = pathPredicate;
            return this;
        }
        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate getPathPredicate() {
            return this.pathPredicate;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes extends TeaModel {
        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9504</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The routing rule.</p>
         */
        @NameInMap("RoutePredicate")
        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate routePredicate;

        public static ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes self = new ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes setRoutePredicate(ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate routePredicate) {
            this.routePredicate = routePredicate;
            return this;
        }
        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate getRoutePredicate() {
            return this.routePredicate;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule extends TeaModel {
        /**
         * <p>The logical connector between conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        /**
         * <p>The matching condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions> conditions;

        /**
         * <p>Whether to enable proportional grayscale.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The proportion of path traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The traffic configuration.</p>
         */
        @NameInMap("PercentageByRoute")
        public java.util.Map<String, Integer> percentageByRoute;

        /**
         * <p>The IDs of the route tables.</p>
         */
        @NameInMap("RouteIds")
        public java.util.List<Long> routeIds;

        /**
         * <p>The detailed configuration of the routing rule.</p>
         */
        @NameInMap("Routes")
        public java.util.List<ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes> routes;

        public static ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule self = new ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setConditionJoiner(String conditionJoiner) {
            this.conditionJoiner = conditionJoiner;
            return this;
        }
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setConditions(java.util.List<ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setIndependentPercentageEnable(Boolean independentPercentageEnable) {
            this.independentPercentageEnable = independentPercentageEnable;
            return this;
        }
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setPercentageByRoute(java.util.Map<String, Integer> percentageByRoute) {
            this.percentageByRoute = percentageByRoute;
            return this;
        }
        public java.util.Map<String, Integer> getPercentageByRoute() {
            return this.percentageByRoute;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setRouteIds(java.util.List<Long> routeIds) {
            this.routeIds = routeIds;
            return this;
        }
        public java.util.List<Long> getRouteIds() {
            return this.routeIds;
        }

        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule setRoutes(java.util.List<ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRuleRoutes> getRoutes() {
            return this.routes;
        }

    }

    public static class ListAllSwimmingLanesResponseBodyData extends TeaModel {
        /**
         * <p>Apply ingress rules.</p>
         */
        @NameInMap("AppEntryRule")
        public ListAllSwimmingLanesResponseBodyDataAppEntryRule appEntryRule;

        /**
         * <p>The associated application.</p>
         */
        @NameInMap("Apps")
        public java.util.List<ListAllSwimmingLanesResponseBodyDataApps> apps;

        /**
         * <p>Full-link Grayscale Mode:</p>
         * <ul>
         * <li>0: The request is routed based on the content of the request.</li>
         * <li>1: Proportional routing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanaryModel")
        public Integer canaryModel;

        /**
         * <p>Lane status:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Whether the traffic rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRules")
        public Boolean enableRules;

        /**
         * <p>The ID of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>16401</p>
         */
        @NameInMap("LaneId")
        public Long laneId;

        /**
         * <p>The name of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LaneName")
        public String laneName;

        /**
         * <p>The tag of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
         */
        @NameInMap("LaneTag")
        public String laneTag;

        /**
         * <p>MSE gateway routing</p>
         */
        @NameInMap("MseGatewayEntryRule")
        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule mseGatewayEntryRule;

        public static ListAllSwimmingLanesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllSwimmingLanesResponseBodyData self = new ListAllSwimmingLanesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllSwimmingLanesResponseBodyData setAppEntryRule(ListAllSwimmingLanesResponseBodyDataAppEntryRule appEntryRule) {
            this.appEntryRule = appEntryRule;
            return this;
        }
        public ListAllSwimmingLanesResponseBodyDataAppEntryRule getAppEntryRule() {
            return this.appEntryRule;
        }

        public ListAllSwimmingLanesResponseBodyData setApps(java.util.List<ListAllSwimmingLanesResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<ListAllSwimmingLanesResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public ListAllSwimmingLanesResponseBodyData setCanaryModel(Integer canaryModel) {
            this.canaryModel = canaryModel;
            return this;
        }
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        public ListAllSwimmingLanesResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListAllSwimmingLanesResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public ListAllSwimmingLanesResponseBodyData setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

        public ListAllSwimmingLanesResponseBodyData setLaneName(String laneName) {
            this.laneName = laneName;
            return this;
        }
        public String getLaneName() {
            return this.laneName;
        }

        public ListAllSwimmingLanesResponseBodyData setLaneTag(String laneTag) {
            this.laneTag = laneTag;
            return this;
        }
        public String getLaneTag() {
            return this.laneTag;
        }

        public ListAllSwimmingLanesResponseBodyData setMseGatewayEntryRule(ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule mseGatewayEntryRule) {
            this.mseGatewayEntryRule = mseGatewayEntryRule;
            return this;
        }
        public ListAllSwimmingLanesResponseBodyDataMseGatewayEntryRule getMseGatewayEntryRule() {
            return this.mseGatewayEntryRule;
        }

    }

}
