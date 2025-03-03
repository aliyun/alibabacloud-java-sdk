// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateAutoGroupingRuleRequest extends TeaModel {
    /**
     * <p>The IDs of regions to be excluded. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing,cn-guangzhou</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz<strong><strong><strong>zj2oi,rg-aekz</strong></strong></strong>r62ua</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The IDs of resources to be excluded. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pc-uf6p******4h784y,rmq-cn-******ny0y</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The resource types to be excluded. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>mse.cluster,slb.loadbalancer</p>
     */
    @NameInMap("ExcludeResourceTypesScope")
    public String excludeResourceTypesScope;

    /**
     * <p>The IDs of regions. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou,cn-shanghai</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The IDs of resource groups. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz<strong><strong><strong>4b5ea,rg-aek2</strong></strong></strong>fxykq</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The IDs of resources. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The resource types. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rds.dbinstance,oss.bucket</p>
     */
    @NameInMap("ResourceTypesScope")
    public String resourceTypesScope;

    /**
     * <p>The content records of the rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleContents")
    public java.util.List<CreateAutoGroupingRuleRequestRuleContents> ruleContents;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Transfer resources to which the {&quot;env&quot;: &quot;online&quot;} and {&quot;project&quot;: &quot;A&quot;} tags are added to the resource group rg-aek2********qcy.</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_condition</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static CreateAutoGroupingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoGroupingRuleRequest self = new CreateAutoGroupingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoGroupingRuleRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public CreateAutoGroupingRuleRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public CreateAutoGroupingRuleRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public CreateAutoGroupingRuleRequest setExcludeResourceTypesScope(String excludeResourceTypesScope) {
        this.excludeResourceTypesScope = excludeResourceTypesScope;
        return this;
    }
    public String getExcludeResourceTypesScope() {
        return this.excludeResourceTypesScope;
    }

    public CreateAutoGroupingRuleRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public CreateAutoGroupingRuleRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public CreateAutoGroupingRuleRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public CreateAutoGroupingRuleRequest setResourceTypesScope(String resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }
    public String getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    public CreateAutoGroupingRuleRequest setRuleContents(java.util.List<CreateAutoGroupingRuleRequestRuleContents> ruleContents) {
        this.ruleContents = ruleContents;
        return this;
    }
    public java.util.List<CreateAutoGroupingRuleRequestRuleContents> getRuleContents() {
        return this.ruleContents;
    }

    public CreateAutoGroupingRuleRequest setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public CreateAutoGroupingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateAutoGroupingRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public static class CreateAutoGroupingRuleRequestRuleContents extends TeaModel {
        /**
         * <p>The condition for the range of resources to be automatically transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;{\&quot;env\&quot;:\&quot;online\&quot;, \&quot;project\&quot;:\&quot;A\&quot;}&quot;,&quot;featurePath&quot;:&quot;$.tags&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;TagMatchAll&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("AutoGroupingScopeCondition")
        public String autoGroupingScopeCondition;

        /**
         * <p>The condition for the destination resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;rg-aek2********qcy&quot;,&quot;featurePath&quot;:&quot;$.resourceGroupId&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;StringEquals&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("TargetResourceGroupCondition")
        public String targetResourceGroupCondition;

        public static CreateAutoGroupingRuleRequestRuleContents build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoGroupingRuleRequestRuleContents self = new CreateAutoGroupingRuleRequestRuleContents();
            return TeaModel.build(map, self);
        }

        public CreateAutoGroupingRuleRequestRuleContents setAutoGroupingScopeCondition(String autoGroupingScopeCondition) {
            this.autoGroupingScopeCondition = autoGroupingScopeCondition;
            return this;
        }
        public String getAutoGroupingScopeCondition() {
            return this.autoGroupingScopeCondition;
        }

        public CreateAutoGroupingRuleRequestRuleContents setTargetResourceGroupCondition(String targetResourceGroupCondition) {
            this.targetResourceGroupCondition = targetResourceGroupCondition;
            return this;
        }
        public String getTargetResourceGroupCondition() {
            return this.targetResourceGroupCondition;
        }

    }

}
