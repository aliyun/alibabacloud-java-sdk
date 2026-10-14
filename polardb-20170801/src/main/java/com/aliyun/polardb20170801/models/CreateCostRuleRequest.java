// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCostRuleRequest extends TeaModel {
    /**
     * <p>The cache read cost points per million tokens. Default value: 0.</p>
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
     * <p>The effective start time in the yyyy-MM-dd HH:mm:ss format. If this parameter is not specified, the rule takes effect immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-14 00:00:00</p>
     */
    @NameInMap("EffectiveStartTime")
    public String effectiveStartTime;

    /**
     * <p>The effective target type. Valid values: global, consumerGroup, and consumer. Default value: global.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("EffectiveTargetType")
    public String effectiveTargetType;

    /**
     * <p>The effective target value. This parameter is required when the effective target type is not global.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EffectiveTargetValue")
    public String effectiveTargetValue;

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
     * <p>pg-xxxxxxx</p>
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
     * <p>The tiered price for input tokens (non-cumulative). The value is a JSON array character string. Each element contains Tier and InputCostPointsPerMillion. Valid values for Tier: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+. Example: [{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1000&quot;},{&quot;Tier&quot;:&quot;32K-64K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1800&quot;}]. If this parameter is specified, it takes precedence over InputCostPointsPerMillion. An empty array [] is not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1000&quot;},{&quot;Tier&quot;:&quot;32K-64K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1800&quot;}]</p>
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
     * <p>0</p>
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

    public static CreateCostRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostRuleRequest self = new CreateCostRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCostRuleRequest setCacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
        this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
        return this;
    }
    public String getCacheCostPointsPerMillion() {
        return this.cacheCostPointsPerMillion;
    }

    public CreateCostRuleRequest setCacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
        this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
        return this;
    }
    public String getCacheCreationCostPointsPerMillion() {
        return this.cacheCreationCostPointsPerMillion;
    }

    public CreateCostRuleRequest setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public CreateCostRuleRequest setEffectiveTargetType(String effectiveTargetType) {
        this.effectiveTargetType = effectiveTargetType;
        return this;
    }
    public String getEffectiveTargetType() {
        return this.effectiveTargetType;
    }

    public CreateCostRuleRequest setEffectiveTargetValue(String effectiveTargetValue) {
        this.effectiveTargetValue = effectiveTargetValue;
        return this;
    }
    public String getEffectiveTargetValue() {
        return this.effectiveTargetValue;
    }

    public CreateCostRuleRequest setExplicitCacheCostPointsPerMillion(String explicitCacheCostPointsPerMillion) {
        this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
        return this;
    }
    public String getExplicitCacheCostPointsPerMillion() {
        return this.explicitCacheCostPointsPerMillion;
    }

    public CreateCostRuleRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateCostRuleRequest setImageCostPointsPerCount(String imageCostPointsPerCount) {
        this.imageCostPointsPerCount = imageCostPointsPerCount;
        return this;
    }
    public String getImageCostPointsPerCount() {
        return this.imageCostPointsPerCount;
    }

    public CreateCostRuleRequest setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
        this.inputCostPointsPerMillion = inputCostPointsPerMillion;
        return this;
    }
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
    }

    public CreateCostRuleRequest setInputTokenTiers(String inputTokenTiers) {
        this.inputTokenTiers = inputTokenTiers;
        return this;
    }
    public String getInputTokenTiers() {
        return this.inputTokenTiers;
    }

    public CreateCostRuleRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateCostRuleRequest setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public CreateCostRuleRequest setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
        this.outputCostPointsPerMillion = outputCostPointsPerMillion;
        return this;
    }
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    public CreateCostRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCostRuleRequest setVideoCostPointsPerSecond(String videoCostPointsPerSecond) {
        this.videoCostPointsPerSecond = videoCostPointsPerSecond;
        return this;
    }
    public String getVideoCostPointsPerSecond() {
        return this.videoCostPointsPerSecond;
    }

}
