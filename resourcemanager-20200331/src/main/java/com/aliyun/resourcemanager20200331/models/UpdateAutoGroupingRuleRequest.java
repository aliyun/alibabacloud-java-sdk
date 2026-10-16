// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingRuleRequest extends TeaModel {
    /**
     * <p>The excluded scope of region IDs. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing,cn-guangzhou</p>
     */
    @NameInMap("ExcludeRegionIdsScope")
    public String excludeRegionIdsScope;

    /**
     * <p>The excluded scope of resource group IDs. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz<strong><strong><strong>zj2oi,rg-aekz</strong></strong></strong>r62ua</p>
     */
    @NameInMap("ExcludeResourceGroupIdsScope")
    public String excludeResourceGroupIdsScope;

    /**
     * <p>The excluded scope of resource IDs. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pc-uf6p******4h784y,rmq-cn-******ny0y</p>
     */
    @NameInMap("ExcludeResourceIdsScope")
    public String excludeResourceIdsScope;

    /**
     * <p>The excluded scope of resource types. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>mse.cluster,slb.loadbalancer</p>
     */
    @NameInMap("ExcludeResourceTypesScope")
    public String excludeResourceTypesScope;

    /**
     * <p>The scope of region IDs. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou,cn-shanghai</p>
     */
    @NameInMap("RegionIdsScope")
    public String regionIdsScope;

    /**
     * <p>The scope of resource group IDs. Separate multiple resource group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz<strong><strong><strong>4b5ea,rg-aek2</strong></strong></strong>fxykq</p>
     */
    @NameInMap("ResourceGroupIdsScope")
    public String resourceGroupIdsScope;

    /**
     * <p>The scope of resource IDs. Separate multiple resource IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
     */
    @NameInMap("ResourceIdsScope")
    public String resourceIdsScope;

    /**
     * <p>The scope of resource types. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rds.dbinstance,oss.bucket</p>
     */
    @NameInMap("ResourceTypesScope")
    public String resourceTypesScope;

    /**
     * <p>The list of rule contents.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleContents")
    public java.util.List<UpdateAutoGroupingRuleRequestRuleContents> ruleContents;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-acfo******hy6a</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The rule name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automatic resource group transfer rule for Project A online resources</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateAutoGroupingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingRuleRequest self = new UpdateAutoGroupingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingRuleRequest setExcludeRegionIdsScope(String excludeRegionIdsScope) {
        this.excludeRegionIdsScope = excludeRegionIdsScope;
        return this;
    }
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    public UpdateAutoGroupingRuleRequest setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
        this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
        return this;
    }
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    public UpdateAutoGroupingRuleRequest setExcludeResourceIdsScope(String excludeResourceIdsScope) {
        this.excludeResourceIdsScope = excludeResourceIdsScope;
        return this;
    }
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    public UpdateAutoGroupingRuleRequest setExcludeResourceTypesScope(String excludeResourceTypesScope) {
        this.excludeResourceTypesScope = excludeResourceTypesScope;
        return this;
    }
    public String getExcludeResourceTypesScope() {
        return this.excludeResourceTypesScope;
    }

    public UpdateAutoGroupingRuleRequest setRegionIdsScope(String regionIdsScope) {
        this.regionIdsScope = regionIdsScope;
        return this;
    }
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    public UpdateAutoGroupingRuleRequest setResourceGroupIdsScope(String resourceGroupIdsScope) {
        this.resourceGroupIdsScope = resourceGroupIdsScope;
        return this;
    }
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    public UpdateAutoGroupingRuleRequest setResourceIdsScope(String resourceIdsScope) {
        this.resourceIdsScope = resourceIdsScope;
        return this;
    }
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    public UpdateAutoGroupingRuleRequest setResourceTypesScope(String resourceTypesScope) {
        this.resourceTypesScope = resourceTypesScope;
        return this;
    }
    public String getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    public UpdateAutoGroupingRuleRequest setRuleContents(java.util.List<UpdateAutoGroupingRuleRequestRuleContents> ruleContents) {
        this.ruleContents = ruleContents;
        return this;
    }
    public java.util.List<UpdateAutoGroupingRuleRequestRuleContents> getRuleContents() {
        return this.ruleContents;
    }

    public UpdateAutoGroupingRuleRequest setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public UpdateAutoGroupingRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateAutoGroupingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class UpdateAutoGroupingRuleRequestRuleContents extends TeaModel {
        /**
         * <p>The scope condition for automatic resource group transfer. This parameter specifies the scope of resources that need to be automatically transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:{&quot;env&quot;:&quot;online&quot;,&quot;project&quot;:&quot;A&quot;},&quot;featurePath&quot;:&quot;$.tags&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;TagMatchAll&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
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
         * <p>The target resource group condition. This parameter specifies the target resource group for automatic resource group transfer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;rg-aek2********qcy&quot;,&quot;featurePath&quot;:&quot;$.resourceGroupId&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;StringEquals&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("TargetResourceGroupCondition")
        public String targetResourceGroupCondition;

        public static UpdateAutoGroupingRuleRequestRuleContents build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoGroupingRuleRequestRuleContents self = new UpdateAutoGroupingRuleRequestRuleContents();
            return TeaModel.build(map, self);
        }

        public UpdateAutoGroupingRuleRequestRuleContents setAutoGroupingScopeCondition(String autoGroupingScopeCondition) {
            this.autoGroupingScopeCondition = autoGroupingScopeCondition;
            return this;
        }
        public String getAutoGroupingScopeCondition() {
            return this.autoGroupingScopeCondition;
        }

        public UpdateAutoGroupingRuleRequestRuleContents setRuleContentId(String ruleContentId) {
            this.ruleContentId = ruleContentId;
            return this;
        }
        public String getRuleContentId() {
            return this.ruleContentId;
        }

        public UpdateAutoGroupingRuleRequestRuleContents setTargetResourceGroupCondition(String targetResourceGroupCondition) {
            this.targetResourceGroupCondition = targetResourceGroupCondition;
            return this;
        }
        public String getTargetResourceGroupCondition() {
            return this.targetResourceGroupCondition;
        }

    }

}
