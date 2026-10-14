// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCostRuleRequest extends TeaModel {
    /**
     * <p>The cache cost points per million tokens. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CacheCostPointsPerMillion")
    public String cacheCostPointsPerMillion;

    /**
     * <p>The cache creation cost points per million tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CacheCreationCostPointsPerMillion")
    public String cacheCreationCostPointsPerMillion;

    /**
     * <p>The ID of the cost rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>924d450014e64e88ac6e8486f8e990**</p>
     */
    @NameInMap("CostRuleId")
    public String costRuleId;

    /**
     * <p>The explicit cache read cost points per million tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ExplicitCacheCostPointsPerMillion")
    public String explicitCacheCostPointsPerMillion;

    /**
     * <p>The gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The image input cost points per image.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ImageCostPointsPerCount")
    public String imageCostPointsPerCount;

    /**
     * <p>The input cost points per million tokens. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InputCostPointsPerMillion")
    public String inputCostPointsPerMillion;

    /**
     * <p>The input token tiered price (non-cumulative) specified as a JSON array character string. Each element contains Tier and InputCostPointsPerMillion. Valid values for Tier: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+. Example: [{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1200&quot;}]. A non-empty value replaces all existing tiers. If this parameter is not specified or is set to an empty string, the original tiers are retained. An empty array [] is not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1200&quot;}]</p>
     */
    @NameInMap("InputTokenTiers")
    public String inputTokenTiers;

    /**
     * <p>The name of the model, such as gpt-4 or qwen-turbo.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpt-4</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The ID of the model service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-xxxxxx</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <p>The output cost points per million tokens. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OutputCostPointsPerMillion")
    public String outputCostPointsPerMillion;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The video input cost points per second.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("VideoCostPointsPerSecond")
    public String videoCostPointsPerSecond;

    public static ModifyCostRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostRuleRequest self = new ModifyCostRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCostRuleRequest setCacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
        this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
        return this;
    }
    public String getCacheCostPointsPerMillion() {
        return this.cacheCostPointsPerMillion;
    }

    public ModifyCostRuleRequest setCacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
        this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
        return this;
    }
    public String getCacheCreationCostPointsPerMillion() {
        return this.cacheCreationCostPointsPerMillion;
    }

    public ModifyCostRuleRequest setCostRuleId(String costRuleId) {
        this.costRuleId = costRuleId;
        return this;
    }
    public String getCostRuleId() {
        return this.costRuleId;
    }

    public ModifyCostRuleRequest setExplicitCacheCostPointsPerMillion(String explicitCacheCostPointsPerMillion) {
        this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
        return this;
    }
    public String getExplicitCacheCostPointsPerMillion() {
        return this.explicitCacheCostPointsPerMillion;
    }

    public ModifyCostRuleRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyCostRuleRequest setImageCostPointsPerCount(String imageCostPointsPerCount) {
        this.imageCostPointsPerCount = imageCostPointsPerCount;
        return this;
    }
    public String getImageCostPointsPerCount() {
        return this.imageCostPointsPerCount;
    }

    public ModifyCostRuleRequest setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
        this.inputCostPointsPerMillion = inputCostPointsPerMillion;
        return this;
    }
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
    }

    public ModifyCostRuleRequest setInputTokenTiers(String inputTokenTiers) {
        this.inputTokenTiers = inputTokenTiers;
        return this;
    }
    public String getInputTokenTiers() {
        return this.inputTokenTiers;
    }

    public ModifyCostRuleRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModifyCostRuleRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public ModifyCostRuleRequest setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
        this.outputCostPointsPerMillion = outputCostPointsPerMillion;
        return this;
    }
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    public ModifyCostRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCostRuleRequest setVideoCostPointsPerSecond(String videoCostPointsPerSecond) {
        this.videoCostPointsPerSecond = videoCostPointsPerSecond;
        return this;
    }
    public String getVideoCostPointsPerSecond() {
        return this.videoCostPointsPerSecond;
    }

}
