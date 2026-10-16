// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAutoGroupingRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9EA4F962-1A2E-4AFE-BE0C-B14736FC46CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule information.</p>
     */
    @NameInMap("Rule")
    public GetAutoGroupingRuleResponseBodyRule rule;

    public static GetAutoGroupingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoGroupingRuleResponseBody self = new GetAutoGroupingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoGroupingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoGroupingRuleResponseBody setRule(GetAutoGroupingRuleResponseBodyRule rule) {
        this.rule = rule;
        return this;
    }
    public GetAutoGroupingRuleResponseBodyRule getRule() {
        return this.rule;
    }

    public static class GetAutoGroupingRuleResponseBodyRuleRuleContents extends TeaModel {
        /**
         * <p>The scope condition for automatic group transfer, which specifies the range of resources to be automatically transferred to a resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;{\&quot;env\&quot;:\&quot;online\&quot;, \&quot;project\&quot;:\&quot;A\&quot;}&quot;,&quot;featurePath&quot;:&quot;$.tags&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;TagMatchAll&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("AutoGroupingScopeCondition")
        public String autoGroupingScopeCondition;

        /**
         * <p>The rule content ID.</p>
         * 
         * <strong>example:</strong>
         * <p>grc-acfo******fwybpq</p>
         */
        @NameInMap("RuleContentId")
        public String ruleContentId;

        /**
         * <p>The target resource group condition, which specifies the destination resource group for automatic grouping.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;rg-aek2********qcy&quot;,&quot;featurePath&quot;:&quot;$.resourceGroupId&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;StringEquals&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("TargetResourceGroupCondition")
        public String targetResourceGroupCondition;

        public static GetAutoGroupingRuleResponseBodyRuleRuleContents build(java.util.Map<String, ?> map) throws Exception {
            GetAutoGroupingRuleResponseBodyRuleRuleContents self = new GetAutoGroupingRuleResponseBodyRuleRuleContents();
            return TeaModel.build(map, self);
        }

        public GetAutoGroupingRuleResponseBodyRuleRuleContents setAutoGroupingScopeCondition(String autoGroupingScopeCondition) {
            this.autoGroupingScopeCondition = autoGroupingScopeCondition;
            return this;
        }
        public String getAutoGroupingScopeCondition() {
            return this.autoGroupingScopeCondition;
        }

        public GetAutoGroupingRuleResponseBodyRuleRuleContents setRuleContentId(String ruleContentId) {
            this.ruleContentId = ruleContentId;
            return this;
        }
        public String getRuleContentId() {
            return this.ruleContentId;
        }

        public GetAutoGroupingRuleResponseBodyRuleRuleContents setTargetResourceGroupCondition(String targetResourceGroupCondition) {
            this.targetResourceGroupCondition = targetResourceGroupCondition;
            return this;
        }
        public String getTargetResourceGroupCondition() {
            return this.targetResourceGroupCondition;
        }

    }

    public static class GetAutoGroupingRuleResponseBodyRule extends TeaModel {
        /**
         * <p>The time when the rule was created, in RFC 3339 format with a UTC offset of +08:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T10:00:00+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The excluded region IDs. Multiple region IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou,cn-shanghai</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The excluded resource group IDs. Multiple resource group IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz<strong><strong><strong>4b5ea,rg-aek2</strong></strong></strong>fxykq</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The excluded resource IDs. Multiple resource IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The excluded resource types. Multiple resource types are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.instance,vpc.vpc</p>
         */
        @NameInMap("ExcludeResourceTypesScope")
        public String excludeResourceTypesScope;

        /**
         * <p>The time when the rule was last modified, in RFC 3339 format with a UTC offset of +08:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T10:00:00+08:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The region IDs in scope. Multiple region IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou,cn-shanghai</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The resource group IDs in scope. Multiple resource group IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz<strong><strong><strong>4b5ea,rg-aek2</strong></strong></strong>fxykq</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The resource IDs in scope. Multiple resource IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The resource types in scope. Multiple resource types are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.instance,vpc.vpc</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The list of rule contents.</p>
         */
        @NameInMap("RuleContents")
        public java.util.List<GetAutoGroupingRuleResponseBodyRuleRuleContents> ruleContents;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Transfer resources with tags {&quot;env&quot;: &quot;online&quot;} and {&quot;project&quot;: &quot;A&quot;} to resource group rg-aek2********qcy</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gr-acfo******hy6a</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatic group transfer rule for Project A online resources</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li>custom_condition: Transfer based on custom rules.</li>
         * <li>associated_transfer: Transfer associated resources together.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>associated_transfer</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static GetAutoGroupingRuleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            GetAutoGroupingRuleResponseBodyRule self = new GetAutoGroupingRuleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public GetAutoGroupingRuleResponseBodyRule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAutoGroupingRuleResponseBodyRule setExcludeRegionIdsScope(String excludeRegionIdsScope) {
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setExcludeResourceTypesScope(String excludeResourceTypesScope) {
            this.excludeResourceTypesScope = excludeResourceTypesScope;
            return this;
        }
        public String getExcludeResourceTypesScope() {
            return this.excludeResourceTypesScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetAutoGroupingRuleResponseBodyRule setRegionIdsScope(String regionIdsScope) {
            this.regionIdsScope = regionIdsScope;
            return this;
        }
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setResourceGroupIdsScope(String resourceGroupIdsScope) {
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setResourceIdsScope(String resourceIdsScope) {
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public GetAutoGroupingRuleResponseBodyRule setRuleContents(java.util.List<GetAutoGroupingRuleResponseBodyRuleRuleContents> ruleContents) {
            this.ruleContents = ruleContents;
            return this;
        }
        public java.util.List<GetAutoGroupingRuleResponseBodyRuleRuleContents> getRuleContents() {
            return this.ruleContents;
        }

        public GetAutoGroupingRuleResponseBodyRule setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public GetAutoGroupingRuleResponseBodyRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetAutoGroupingRuleResponseBodyRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetAutoGroupingRuleResponseBodyRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
