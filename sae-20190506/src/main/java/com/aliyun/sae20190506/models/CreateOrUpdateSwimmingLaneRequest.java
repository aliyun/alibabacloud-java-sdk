// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The gateway routing configuration.</p>
     * <blockquote>
     * <p>This parameter is required when the gateway entry of the traffic lane group is Java.</p>
     * </blockquote>
     */
    @NameInMap("AppEntryRule")
    public CreateOrUpdateSwimmingLaneRequestAppEntryRule appEntryRule;

    /**
     * <p>The end-to-end canary release mode. Valid values:</p>
     * <ul>
     * <li><p>0: Routes traffic based on request content.</p>
     * </li>
     * <li><p>1: Routes traffic based on proportion.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <p>Specifies whether the traffic lane is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The ID of the traffic lane group to which the traffic lane belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the traffic lane.</p>
     * 
     * <strong>example:</strong>
     * <p>13857</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the traffic lane.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("LaneName")
    public String laneName;

    /**
     * <p>The tag of the traffic lane.</p>
     * 
     * <strong>example:</strong>
     * <p>g1</p>
     */
    @NameInMap("LaneTag")
    public String laneTag;

    /**
     * <p>The MSE gateway routing configuration.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>EntryAppType</strong> is set to <strong>apig</strong> or <strong>mse-gw</strong>.</p>
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
         * <p>The matching rule. Valid values:</p>
         * <ul>
         * <li>==: Exact match. The traffic value must be exactly equal to the condition value.</li>
         * <li>!=: Exact match. The traffic value must be exactly equal to the condition value.</li>
         * <li>in: Inclusion match. The condition is met when the traffic value is in the specified list.</li>
         * <li>百分比: Percentage match. The condition is met when <code>hash(get(key)) % 100 &lt; value</code> evaluates to true.</li>
         * <li>正则匹配: Regular expression match. The condition is met when the value matches the regular expression.</li>
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
         * <li><p>header: Header</p>
         * </li>
         * <li><p>param: Parameter</p>
         * </li>
         * <li><p>cookie: Cookie</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The matching value of the condition.</p>
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
         * <p>The logical operator between conditions. Valid values:</p>
         * <ul>
         * <li>AND: All conditions must be met.</li>
         * <li>OR: Any condition must be met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestAppEntryRuleConditions> conditions;

        /**
         * <p>Specifies whether to enable proportion-based canary release. Valid values:</p>
         * <ul>
         * <li>true: Enabled. If enabled, you must configure PercentageByPath.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The matched URI of the request paths.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The traffic proportion used for proportion-based routing. Valid values: 0 to 100.</p>
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
         * <p>The matching rule. Valid values:</p>
         * <ul>
         * <li>==: Exact match.</li>
         * <li>!=: Exact match.</li>
         * <li>in: Inclusion match.</li>
         * <li>百分比: Percentage match.</li>
         * <li>正则匹配: Regular expression match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The name of the condition parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li><p>header: Header</p>
         * </li>
         * <li><p>param: Parameter</p>
         * </li>
         * <li><p>cookie: Cookie</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The matching value of the condition.</p>
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
         * <p>The logical operator between conditions. Valid values:</p>
         * <ul>
         * <li>AND: All conditions must be met.</li>
         * <li>OR: Any condition must be met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("ConditionJoiner")
        public String conditionJoiner;

        /**
         * <p>The routing conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateOrUpdateSwimmingLaneRequestMseGatewayEntryRuleConditions> conditions;

        /**
         * <p>Specifies whether to enable proportion-based canary release. Valid values:</p>
         * <ul>
         * <li>true: Enabled. If enabled, you must configure PercentageByPath.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentPercentageEnable")
        public Boolean independentPercentageEnable;

        /**
         * <p>The traffic replication proportion (%). Valid values: 0 to 100.</p>
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
