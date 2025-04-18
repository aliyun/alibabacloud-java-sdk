// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAutoGroupingRulesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned for a single request. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListAutoGroupingRulesResponseBodyRules> rules;

    public static ListAutoGroupingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoGroupingRulesResponseBody self = new ListAutoGroupingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoGroupingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoGroupingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoGroupingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoGroupingRulesResponseBody setRules(java.util.List<ListAutoGroupingRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListAutoGroupingRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class ListAutoGroupingRulesResponseBodyRulesRuleContents extends TeaModel {
        /**
         * <p>The condition for the range of resources that are automatically transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;{\&quot;env\&quot;:\&quot;online\&quot;, \&quot;project\&quot;:\&quot;A\&quot;}&quot;,&quot;featurePath&quot;:&quot;$.tags&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;TagMatchAll&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("AutoGroupingScopeCondition")
        public String autoGroupingScopeCondition;

        /**
         * <p>The ID of the content record.</p>
         * 
         * <strong>example:</strong>
         * <p>grc-acfo******fwybpq</p>
         */
        @NameInMap("RuleContentId")
        public String ruleContentId;

        /**
         * <p>The condition for the destination resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;rg-aek2********qcy&quot;,&quot;featurePath&quot;:&quot;$.resourceGroupId&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;StringEquals&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("TargetResourceGroupCondition")
        public String targetResourceGroupCondition;

        public static ListAutoGroupingRulesResponseBodyRulesRuleContents build(java.util.Map<String, ?> map) throws Exception {
            ListAutoGroupingRulesResponseBodyRulesRuleContents self = new ListAutoGroupingRulesResponseBodyRulesRuleContents();
            return TeaModel.build(map, self);
        }

        public ListAutoGroupingRulesResponseBodyRulesRuleContents setAutoGroupingScopeCondition(String autoGroupingScopeCondition) {
            this.autoGroupingScopeCondition = autoGroupingScopeCondition;
            return this;
        }
        public String getAutoGroupingScopeCondition() {
            return this.autoGroupingScopeCondition;
        }

        public ListAutoGroupingRulesResponseBodyRulesRuleContents setRuleContentId(String ruleContentId) {
            this.ruleContentId = ruleContentId;
            return this;
        }
        public String getRuleContentId() {
            return this.ruleContentId;
        }

        public ListAutoGroupingRulesResponseBodyRulesRuleContents setTargetResourceGroupCondition(String targetResourceGroupCondition) {
            this.targetResourceGroupCondition = targetResourceGroupCondition;
            return this;
        }
        public String getTargetResourceGroupCondition() {
            return this.targetResourceGroupCondition;
        }

    }

    public static class ListAutoGroupingRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T10:00:00+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The IDs of excluded regions. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou,cn-shanghai</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The IDs of excluded resource groups. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz<strong><strong>ql4b5ea,rg-aek2</strong></strong>akfxykq</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The IDs of excluded resources. Multiple IDs are separated by commas (,).</p>
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
         * <p>The time when the rule was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T10:00:00+08:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The IDs of regions. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou,cn-shanghai</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The IDs of resource groups. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz<strong><strong>ql4b5ea,rg-aek2</strong></strong>akfxykq</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The IDs of resources. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The resource types. Multiple resource types are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.instance,vpc.vpc</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The content records of the rule.</p>
         */
        @NameInMap("RuleContents")
        public java.util.List<ListAutoGroupingRulesResponseBodyRulesRuleContents> ruleContents;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Transfer resources to which the {&quot;env&quot;: &quot;online&quot;} and {&quot;project&quot;: &quot;A&quot;} tags are added to the resource group rg-aek2********qcy.</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>gr-acfo******hy6a</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Transfer Rule for Online Resources of Project A</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>custom_condition: custom transfer rule</li>
         * <li>associated_transfer: transfer rule for associated resources</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom_condition</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static ListAutoGroupingRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListAutoGroupingRulesResponseBodyRules self = new ListAutoGroupingRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListAutoGroupingRulesResponseBodyRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAutoGroupingRulesResponseBodyRules setExcludeRegionIdsScope(String excludeRegionIdsScope) {
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setExcludeResourceTypesScope(String excludeResourceTypesScope) {
            this.excludeResourceTypesScope = excludeResourceTypesScope;
            return this;
        }
        public String getExcludeResourceTypesScope() {
            return this.excludeResourceTypesScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAutoGroupingRulesResponseBodyRules setRegionIdsScope(String regionIdsScope) {
            this.regionIdsScope = regionIdsScope;
            return this;
        }
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setResourceGroupIdsScope(String resourceGroupIdsScope) {
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setResourceIdsScope(String resourceIdsScope) {
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public ListAutoGroupingRulesResponseBodyRules setRuleContents(java.util.List<ListAutoGroupingRulesResponseBodyRulesRuleContents> ruleContents) {
            this.ruleContents = ruleContents;
            return this;
        }
        public java.util.List<ListAutoGroupingRulesResponseBodyRulesRuleContents> getRuleContents() {
            return this.ruleContents;
        }

        public ListAutoGroupingRulesResponseBodyRules setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListAutoGroupingRulesResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListAutoGroupingRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAutoGroupingRulesResponseBodyRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
