// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCostRuleResponseBody extends TeaModel {
    /**
     * <p>The list of model API IDs affected by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ma-2ze3x6i1d7g5rto28&quot;]</p>
     */
    @NameInMap("AffectedModelApiIds")
    public java.util.List<String> affectedModelApiIds;

    /**
     * <p>The cache read cost points per million tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("CacheCostPointsPerMillion")
    public String cacheCostPointsPerMillion;

    /**
     * <p>The cache creation (write) cost points per million tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CacheCreationCostPointsPerMillion")
    public String cacheCreationCostPointsPerMillion;

    /**
     * <p>The cost rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>924d450014e64e88ac6e8486f8e990**</p>
     */
    @NameInMap("CostRuleId")
    public String costRuleId;

    /**
     * <p>The effective end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-01T00:00:00Z</p>
     */
    @NameInMap("EffectiveEndTime")
    public String effectiveEndTime;

    /**
     * <p>The effective start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01T00:00:00Z</p>
     */
    @NameInMap("EffectiveStartTime")
    public String effectiveStartTime;

    /**
     * <p>The effective target type. Valid values: global, consumerGroup, and consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("EffectiveTargetType")
    public String effectiveTargetType;

    /**
     * <p>The effective target value. This parameter has a value when the effective target type is not global.</p>
     * 
     * <strong>example:</strong>
     * <p>c-xxx</p>
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
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01T12:00:00Z</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01T12:00:00Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The ID of the gateway instance to which the cost rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-2ze3x6i1d7g5rto28</p>
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
     * <p>The input cost points per million tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("InputCostPointsPerMillion")
    public String inputCostPointsPerMillion;

    /**
     * <p>The input token tier. An empty value indicates the default tier.</p>
     * 
     * <strong>example:</strong>
     * <p>0-32K</p>
     */
    @NameInMap("InputTokenTier")
    public String inputTokenTier;

    /**
     * <p>The tiered pricing for input tokens. Pricing is applied per tier and is not cumulative. Each element contains Tier and InputCostPointsPerMillion.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1000&quot;}]</p>
     */
    @NameInMap("InputTokenTiers")
    public java.util.List<CreateCostRuleResponseBodyInputTokenTiers> inputTokenTiers;

    /**
     * <p>The name of the pricing model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The ID of the model service.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-2ze3x6i1d7g5rto28</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <p>The model service name.</p>
     * 
     * <strong>example:</strong>
     * <p>model-service-a</p>
     */
    @NameInMap("ModelServiceName")
    public String modelServiceName;

    /**
     * <p>The output cost points per million tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("OutputCostPointsPerMillion")
    public String outputCostPointsPerMillion;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>580EF224-9647-59E7-9950-D9EBFD6A2921</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The video input cost points per second.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("VideoCostPointsPerSecond")
    public String videoCostPointsPerSecond;

    public static CreateCostRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCostRuleResponseBody self = new CreateCostRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCostRuleResponseBody setAffectedModelApiIds(java.util.List<String> affectedModelApiIds) {
        this.affectedModelApiIds = affectedModelApiIds;
        return this;
    }
    public java.util.List<String> getAffectedModelApiIds() {
        return this.affectedModelApiIds;
    }

    public CreateCostRuleResponseBody setCacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
        this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
        return this;
    }
    public String getCacheCostPointsPerMillion() {
        return this.cacheCostPointsPerMillion;
    }

    public CreateCostRuleResponseBody setCacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
        this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
        return this;
    }
    public String getCacheCreationCostPointsPerMillion() {
        return this.cacheCreationCostPointsPerMillion;
    }

    public CreateCostRuleResponseBody setCostRuleId(String costRuleId) {
        this.costRuleId = costRuleId;
        return this;
    }
    public String getCostRuleId() {
        return this.costRuleId;
    }

    public CreateCostRuleResponseBody setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public CreateCostRuleResponseBody setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public CreateCostRuleResponseBody setEffectiveTargetType(String effectiveTargetType) {
        this.effectiveTargetType = effectiveTargetType;
        return this;
    }
    public String getEffectiveTargetType() {
        return this.effectiveTargetType;
    }

    public CreateCostRuleResponseBody setEffectiveTargetValue(String effectiveTargetValue) {
        this.effectiveTargetValue = effectiveTargetValue;
        return this;
    }
    public String getEffectiveTargetValue() {
        return this.effectiveTargetValue;
    }

    public CreateCostRuleResponseBody setExplicitCacheCostPointsPerMillion(String explicitCacheCostPointsPerMillion) {
        this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
        return this;
    }
    public String getExplicitCacheCostPointsPerMillion() {
        return this.explicitCacheCostPointsPerMillion;
    }

    public CreateCostRuleResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public CreateCostRuleResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateCostRuleResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateCostRuleResponseBody setImageCostPointsPerCount(String imageCostPointsPerCount) {
        this.imageCostPointsPerCount = imageCostPointsPerCount;
        return this;
    }
    public String getImageCostPointsPerCount() {
        return this.imageCostPointsPerCount;
    }

    public CreateCostRuleResponseBody setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
        this.inputCostPointsPerMillion = inputCostPointsPerMillion;
        return this;
    }
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
    }

    public CreateCostRuleResponseBody setInputTokenTier(String inputTokenTier) {
        this.inputTokenTier = inputTokenTier;
        return this;
    }
    public String getInputTokenTier() {
        return this.inputTokenTier;
    }

    public CreateCostRuleResponseBody setInputTokenTiers(java.util.List<CreateCostRuleResponseBodyInputTokenTiers> inputTokenTiers) {
        this.inputTokenTiers = inputTokenTiers;
        return this;
    }
    public java.util.List<CreateCostRuleResponseBodyInputTokenTiers> getInputTokenTiers() {
        return this.inputTokenTiers;
    }

    public CreateCostRuleResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateCostRuleResponseBody setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public CreateCostRuleResponseBody setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public CreateCostRuleResponseBody setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
        this.outputCostPointsPerMillion = outputCostPointsPerMillion;
        return this;
    }
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    public CreateCostRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCostRuleResponseBody setVideoCostPointsPerSecond(String videoCostPointsPerSecond) {
        this.videoCostPointsPerSecond = videoCostPointsPerSecond;
        return this;
    }
    public String getVideoCostPointsPerSecond() {
        return this.videoCostPointsPerSecond;
    }

    public static class CreateCostRuleResponseBodyInputTokenTiers extends TeaModel {
        /**
         * <p>The input cost points per million tokens for the tier.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("InputCostPointsPerMillion")
        public String inputCostPointsPerMillion;

        /**
         * <p>The token tier. Valid values: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+.</p>
         * 
         * <strong>example:</strong>
         * <p>0-32K</p>
         */
        @NameInMap("Tier")
        public String tier;

        public static CreateCostRuleResponseBodyInputTokenTiers build(java.util.Map<String, ?> map) throws Exception {
            CreateCostRuleResponseBodyInputTokenTiers self = new CreateCostRuleResponseBodyInputTokenTiers();
            return TeaModel.build(map, self);
        }

        public CreateCostRuleResponseBodyInputTokenTiers setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        public CreateCostRuleResponseBodyInputTokenTiers setTier(String tier) {
            this.tier = tier;
            return this;
        }
        public String getTier() {
            return this.tier;
        }

    }

}
