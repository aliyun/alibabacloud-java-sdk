// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSwimmingLaneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSwimmingLaneResponseBodyData data;

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
     * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
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
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSwimmingLaneResponseBody self = new DescribeSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSwimmingLaneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSwimmingLaneResponseBody setData(DescribeSwimmingLaneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSwimmingLaneResponseBodyData getData() {
        return this.data;
    }

    public DescribeSwimmingLaneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSwimmingLaneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSwimmingLaneResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("Value")
        public String value;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions self = new DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataAppEntryRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        @NameInMap("Conditions")
        public java.util.List<DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("PercentageByPath")
        public java.util.Map<String, Integer> percentageByPath;

        public static DescribeSwimmingLaneResponseBodyDataAppEntryRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataAppEntryRule self = new DescribeSwimmingLaneResponseBodyDataAppEntryRule();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRule setConditionJoiner(String conditionJoiner) {
            this.conditionJoiner = conditionJoiner;
            return this;
        }
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRule setConditions(java.util.List<DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeSwimmingLaneResponseBodyDataAppEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRule setIndependentPercentageEnable(Boolean independentPercentageEnable) {
            this.independentPercentageEnable = independentPercentageEnable;
            return this;
        }
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRule setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public DescribeSwimmingLaneResponseBodyDataAppEntryRule setPercentageByPath(java.util.Map<String, Integer> percentageByPath) {
            this.percentageByPath = percentageByPath;
            return this;
        }
        public java.util.Map<String, Integer> getPercentageByPath() {
            return this.percentageByPath;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataApps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6b4c0f64-f679-4580-8105-91eac4******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>mse-cn-53y49******</p>
         */
        @NameInMap("MseAppId")
        public String mseAppId;

        /**
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("MseAppName")
        public String mseAppName;

        /**
         * <strong>example:</strong>
         * <p>6733e538-d52f-48e6-91a4-192f91******</p>
         */
        @NameInMap("mseNamespaceId")
        public String mseNamespaceId;

        public static DescribeSwimmingLaneResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataApps self = new DescribeSwimmingLaneResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeSwimmingLaneResponseBodyDataApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeSwimmingLaneResponseBodyDataApps setMseAppId(String mseAppId) {
            this.mseAppId = mseAppId;
            return this;
        }
        public String getMseAppId() {
            return this.mseAppId;
        }

        public DescribeSwimmingLaneResponseBodyDataApps setMseAppName(String mseAppName) {
            this.mseAppName = mseAppName;
            return this;
        }
        public String getMseAppName() {
            return this.mseAppName;
        }

        public DescribeSwimmingLaneResponseBodyDataApps setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions self = new DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate extends TeaModel {
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

        public static DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate self = new DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate extends TeaModel {
        @NameInMap("PathPredicate")
        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate pathPredicate;

        public static DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate self = new DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate setPathPredicate(DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate pathPredicate) {
            this.pathPredicate = pathPredicate;
            return this;
        }
        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicatePathPredicate getPathPredicate() {
            return this.pathPredicate;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9504</p>
         */
        @NameInMap("RouteId")
        public Long routeId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("RoutePredicate")
        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate routePredicate;

        public static DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes self = new DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes setRoutePredicate(DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate routePredicate) {
            this.routePredicate = routePredicate;
            return this;
        }
        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutesRoutePredicate getRoutePredicate() {
            return this.routePredicate;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        @NameInMap("Conditions")
        public java.util.List<DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("PercentageByRoute")
        public java.util.Map<String, Integer> percentageByRoute;

        @NameInMap("RouteIds")
        public java.util.List<Long> routeIds;

        @NameInMap("Routes")
        public java.util.List<DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes> routes;

        public static DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule self = new DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setConditionJoiner(String conditionJoiner) {
            this.conditionJoiner = conditionJoiner;
            return this;
        }
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setConditions(java.util.List<DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setIndependentPercentageEnable(Boolean independentPercentageEnable) {
            this.independentPercentageEnable = independentPercentageEnable;
            return this;
        }
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setPercentageByRoute(java.util.Map<String, Integer> percentageByRoute) {
            this.percentageByRoute = percentageByRoute;
            return this;
        }
        public java.util.Map<String, Integer> getPercentageByRoute() {
            return this.percentageByRoute;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setRouteIds(java.util.List<Long> routeIds) {
            this.routeIds = routeIds;
            return this;
        }
        public java.util.List<Long> getRouteIds() {
            return this.routeIds;
        }

        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule setRoutes(java.util.List<DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRuleRoutes> getRoutes() {
            return this.routes;
        }

    }

    public static class DescribeSwimmingLaneResponseBodyData extends TeaModel {
        @NameInMap("AppEntryRule")
        public DescribeSwimmingLaneResponseBodyDataAppEntryRule appEntryRule;

        @NameInMap("Apps")
        public java.util.List<DescribeSwimmingLaneResponseBodyDataApps> apps;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanaryModel")
        public Integer canaryModel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRules")
        public Boolean enableRules;

        /**
         * <strong>example:</strong>
         * <p>9488</p>
         */
        @NameInMap("LaneId")
        public Long laneId;

        /**
         * <strong>example:</strong>
         * <p>mse-test</p>
         */
        @NameInMap("LaneName")
        public String laneName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
         */
        @NameInMap("LaneTag")
        public String laneTag;

        @NameInMap("MseGatewayEntryRule")
        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule mseGatewayEntryRule;

        public static DescribeSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSwimmingLaneResponseBodyData self = new DescribeSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSwimmingLaneResponseBodyData setAppEntryRule(DescribeSwimmingLaneResponseBodyDataAppEntryRule appEntryRule) {
            this.appEntryRule = appEntryRule;
            return this;
        }
        public DescribeSwimmingLaneResponseBodyDataAppEntryRule getAppEntryRule() {
            return this.appEntryRule;
        }

        public DescribeSwimmingLaneResponseBodyData setApps(java.util.List<DescribeSwimmingLaneResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<DescribeSwimmingLaneResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public DescribeSwimmingLaneResponseBodyData setCanaryModel(Integer canaryModel) {
            this.canaryModel = canaryModel;
            return this;
        }
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        public DescribeSwimmingLaneResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeSwimmingLaneResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public DescribeSwimmingLaneResponseBodyData setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

        public DescribeSwimmingLaneResponseBodyData setLaneName(String laneName) {
            this.laneName = laneName;
            return this;
        }
        public String getLaneName() {
            return this.laneName;
        }

        public DescribeSwimmingLaneResponseBodyData setLaneTag(String laneTag) {
            this.laneTag = laneTag;
            return this;
        }
        public String getLaneTag() {
            return this.laneTag;
        }

        public DescribeSwimmingLaneResponseBodyData setMseGatewayEntryRule(DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule mseGatewayEntryRule) {
            this.mseGatewayEntryRule = mseGatewayEntryRule;
            return this;
        }
        public DescribeSwimmingLaneResponseBodyDataMseGatewayEntryRule getMseGatewayEntryRule() {
            return this.mseGatewayEntryRule;
        }

    }

}
