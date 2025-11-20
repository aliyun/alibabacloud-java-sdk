// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The route configuration of the gateway.</p>
     * <blockquote>
     * <p> This parameter is required if the gateway entry of the lane group is Java.</p>
     * </blockquote>
     */
    @NameInMap("AppEntryRule")
    public CreateOrUpdateSwimmingLaneRequestAppEntryRule appEntryRule;

    /**
     * <p>Full-link Grayscale Mode:</p>
     * <ul>
     * <li>0: The request is routed based on the content of the request.</li>
     * <li>1: routing based on percentages</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <p>Lane Status</p>
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
     * <p>The ID of the lane group to which the lane belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>13857</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the lane.</p>
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
     * <p>The route configuration of the MSE gateway.</p>
     * <blockquote>
     * <p> If the <strong>EntryAppType</strong> is set to <strong>apig</strong> or <strong>mse-gw</strong>, it is required.</p>
     * </blockquote>
     */
    @NameInMap("MseGatewayEntryRule")
    public CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRule mseGatewayEntryRule;

    /**
     * <p>The namespace ID.</p>
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
         * <p>Matching Rule:</p>
         * <ul>
         * <li>The exact match. The condition is met if the traffic value and the condition value are exactly the same.</li>
         * <li>The exact match. The condition is met if the traffic value and the condition value are exactly the same.</li>
         * <li>The inclusive match. The condition is met if the traffic value is included in the specified list.</li>
         * <li>The percentage match. Principle: The condition is met if \&quot;hash(get(<code>key</code>)) % 100 &lt; value\&quot;.</li>
         * <li>Regular match: a regular expression match. The condition is met when the match is based on regular expression rules.</li>
         * </ul>
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
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li>header</li>
         * <li>param</li>
         * <li>Cookie: forwards requests based on cookies.</li>
         * </ul>
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
         * <p>The conditions that trigger circuit breaking.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions> conditions;

        /**
         * <p>Whether to enable proportional grayscale.</p>
         * <ul>
         * <li>true: enabled. After you enable this parameter, you must configure the PercentageByPath.</li>
         * <li>false: disables the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The matched request path.</p>
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
         * <p>The traffic configuration.</p>
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
         * <li>\==: exact match.</li>
         * <li>! =: exact match.</li>
         * <li>in: contains matches.</li>
         * <li>Percentage: Percentage matching.</li>
         * <li>Regular matching: specifies whether a regular expression is used to search for the original string.</li>
         * </ul>
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
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li>header</li>
         * <li>param</li>
         * <li>Cookie: forwards requests based on cookies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>header</p>
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
         * <p>Routing Condition</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions> conditions;

        /**
         * <p>Whether to enable proportional grayscale.</p>
         * <ul>
         * <li>true: Enabled. After you enable this parameter, you must configure the PercentageByPath.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The percentage of traffic replication. Valid values: 0 to 100.</p>
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
         * <p>The ID of the route.</p>
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
