// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The configuration of the gateway route.</p>
     * <blockquote>
     * <p>This parameter is required if the gateway entry application for the swimlane group is a Java application.</p>
     * </blockquote>
     */
    @NameInMap("AppEntryRule")
    public CreateOrUpdateSwimmingLaneRequestAppEntryRule appEntryRule;

    /**
     * <p>The end-to-end canary release mode.</p>
     * <ul>
     * <li><p><code>0</code>: content-based routing</p>
     * </li>
     * <li><p><code>1</code>: percentage-based routing</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <p>The status of the swimlane.</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The ID of the swimlane group.</p>
     * 
     * <strong>example:</strong>
     * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the swimlane.</p>
     * 
     * <strong>example:</strong>
     * <p>13857</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the swimlane.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("LaneName")
    public String laneName;

    /**
     * <p>The tag of the swimlane.</p>
     * 
     * <strong>example:</strong>
     * <p>g1</p>
     */
    @NameInMap("LaneTag")
    public String laneTag;

    /**
     * <p>Configuration for the MSE gateway route.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>EntryAppType</strong> parameter is set to <strong>apig</strong> or <strong>mse-gw</strong>.</p>
     * </blockquote>
     */
    @NameInMap("MseGatewayEntryRule")
    public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule mseGatewayEntryRule;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static CreateOrUpdateSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneRequest self = new CreateOrUpdateSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneRequest setAppEntryRule(CreateOrUpdateSwimmingLaneRequestAppEntryRule appEntryRule) {
        this.appEntryRule = appEntryRule;
        return this;
    }
    public CreateOrUpdateSwimmingLaneRequestAppEntryRule getAppEntryRule() {
        return this.appEntryRule;
    }

    public CreateOrUpdateSwimmingLaneRequest setCanaryModel(Integer canaryModel) {
        this.canaryModel = canaryModel;
        return this;
    }
    public Integer getCanaryModel() {
        return this.canaryModel;
    }

    public CreateOrUpdateSwimmingLaneRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateOrUpdateSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateSwimmingLaneRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public CreateOrUpdateSwimmingLaneRequest setLaneName(String laneName) {
        this.laneName = laneName;
        return this;
    }
    public String getLaneName() {
        return this.laneName;
    }

    public CreateOrUpdateSwimmingLaneRequest setLaneTag(String laneTag) {
        this.laneTag = laneTag;
        return this;
    }
    public String getLaneTag() {
        return this.laneTag;
    }

    public CreateOrUpdateSwimmingLaneRequest setMseGatewayEntryRule(CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule mseGatewayEntryRule) {
        this.mseGatewayEntryRule = mseGatewayEntryRule;
        return this;
    }
    public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule getMseGatewayEntryRule() {
        return this.mseGatewayEntryRule;
    }

    public CreateOrUpdateSwimmingLaneRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static class CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions extends TeaModel {
        /**
         * <p>The matching rule.</p>
         * <ul>
         * <li><p><code>==</code>: Exact match. The attribute\&quot;s value must be identical to the value specified.</p>
         * </li>
         * <li><p><code>!=</code>: Negated exact match. The attribute\&quot;s value must not be identical to the value specified.</p>
         * </li>
         * <li><p><code>in</code>: Inclusion match. The attribute\&quot;s value must be present in the specified comma-separated list of values.</p>
         * </li>
         * <li><p><code>percentage</code>: Percentage-based match. The expression <code>hash(get(key)) % 100 &lt; value</code> must be true.</p>
         * </li>
         * <li><p><code>regex</code>: Regular expression match. The attribute\&quot;s value must match the specified regular expression.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The name of the header, parameter, or cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the request attribute to match.</p>
         * <ul>
         * <li><p><code>header</code>: A request header.</p>
         * </li>
         * <li><p><code>param</code>: A request parameter.</p>
         * </li>
         * <li><p><code>cookie</code>: A request cookie.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value to match against the request attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions self = new CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestAppEntryRule extends TeaModel {
        /**
         * <p>The logical operator used to combine conditions.</p>
         * <ul>
         * <li><p><code>AND</code>: All conditions must be met.</p>
         * </li>
         * <li><p><code>OR</code>: At least one of the conditions must be met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions> conditions;

        /**
         * <p>Specifies whether to enable percentage-based routing.</p>
         * <ul>
         * <li><p><code>true</code>: Enables percentage-based routing. You must also configure the <code>PercentageByPath</code> parameter.</p>
         * </li>
         * <li><p><code>false</code>: Disables percentage-based routing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The request paths to match.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The traffic percentage for percentage-based routing. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>An object that maps request paths to traffic percentages.</p>
         */
        @NameInMap("PercentageByPath")
        public java.util.Map<String, Integer> percentageByPath;

        public static CreateOrUpdateSwimmingLaneRequestAppEntryRule build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestAppEntryRule self = new CreateOrUpdateSwimmingLaneRequestAppEntryRule();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRule setConditionJoiner(String conditionJoiner) {
            this.conditionJoiner = conditionJoiner;
            return this;
        }
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRule setConditions(java.util.List<CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRule setIndependentPercentageEnable(Boolean independentPercentageEnable) {
            this.independentPercentageEnable = independentPercentageEnable;
            return this;
        }
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRule setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateOrUpdateSwimmingLaneRequestAppEntryRule setPercentageByPath(java.util.Map<String, Integer> percentageByPath) {
            this.percentageByPath = percentageByPath;
            return this;
        }
        public java.util.Map<String, Integer> getPercentageByPath() {
            return this.percentageByPath;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions extends TeaModel {
        /**
         * <p>The matching rule.</p>
         * <ul>
         * <li><p><code>==</code>: Exact match. The attribute\&quot;s value must be identical to the value specified.</p>
         * </li>
         * <li><p><code>!=</code>: Negated exact match. The attribute\&quot;s value must not be identical to the value specified.</p>
         * </li>
         * <li><p><code>in</code>: Inclusion match. The attribute\&quot;s value must be present in the specified comma-separated list of values.</p>
         * </li>
         * <li><p><code>percentage</code>: Percentage-based match. The expression <code>hash(get(key)) % 100 &lt; value</code> must be true.</p>
         * </li>
         * <li><p><code>regex</code>: Regular expression match. The attribute\&quot;s value must match the specified regular expression.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The name of the header, parameter, or cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the request attribute to match.</p>
         * <ul>
         * <li><p><code>header</code>: A request header.</p>
         * </li>
         * <li><p><code>param</code>: A request parameter.</p>
         * </li>
         * <li><p><code>cookie</code>: A request cookie.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value to match against the request attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>g1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions self = new CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule extends TeaModel {
        /**
         * <p>The logical operator used to combine conditions.</p>
         * <ul>
         * <li><p><code>AND</code>: All conditions must be met.</p>
         * </li>
         * <li><p><code>OR</code>: At least one of the conditions must be met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions> conditions;

        /**
         * <p>Specifies whether to enable percentage-based routing.</p>
         * <ul>
         * <li><p><code>true</code>: Enables percentage-based routing. You must also configure the <code>PercentageByRoute</code> parameter.</p>
         * </li>
         * <li><p><code>false</code>: Disables percentage-based routing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The traffic mirroring percentage. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>An object that maps route IDs to traffic percentages.</p>
         */
        @NameInMap("PercentageByRoute")
        public java.util.Map<String, Integer> percentageByRoute;

        /**
         * <p>The route IDs.</p>
         */
        @NameInMap("RouteIds")
        public java.util.List<Long> routeIds;

        public static CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule self = new CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule setConditionJoiner(String conditionJoiner) {
            this.conditionJoiner = conditionJoiner;
            return this;
        }
        public String getConditionJoiner() {
            return this.conditionJoiner;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule setConditions(java.util.List<CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions> getConditions() {
            return this.conditions;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule setIndependentPercentageEnable(Boolean independentPercentageEnable) {
            this.independentPercentageEnable = independentPercentageEnable;
            return this;
        }
        public Boolean getIndependentPercentageEnable() {
            return this.independentPercentageEnable;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule setPercentageByRoute(java.util.Map<String, Integer> percentageByRoute) {
            this.percentageByRoute = percentageByRoute;
            return this;
        }
        public java.util.Map<String, Integer> getPercentageByRoute() {
            return this.percentageByRoute;
        }

        public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule setRouteIds(java.util.List<Long> routeIds) {
            this.routeIds = routeIds;
            return this;
        }
        public java.util.List<Long> getRouteIds() {
            return this.routeIds;
        }

    }

}
