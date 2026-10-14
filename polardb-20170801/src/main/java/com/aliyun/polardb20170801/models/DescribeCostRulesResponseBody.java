// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCostRulesResponseBody extends TeaModel {
    /**
     * <p>The list of cost rules.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCostRulesResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The number of entries per page. Valid values: 30, 50, and 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeCostRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostRulesResponseBody self = new DescribeCostRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostRulesResponseBody setItems(java.util.List<DescribeCostRulesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCostRulesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCostRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCostRulesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCostRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCostRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostRulesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeCostRulesResponseBodyItemsInputTokenTiers extends TeaModel {
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

        public static DescribeCostRulesResponseBodyItemsInputTokenTiers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostRulesResponseBodyItemsInputTokenTiers self = new DescribeCostRulesResponseBodyItemsInputTokenTiers();
            return TeaModel.build(map, self);
        }

        public DescribeCostRulesResponseBodyItemsInputTokenTiers setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItemsInputTokenTiers setTier(String tier) {
            this.tier = tier;
            return this;
        }
        public String getTier() {
            return this.tier;
        }

    }

    public static class DescribeCostRulesResponseBodyItems extends TeaModel {
        /**
         * <p>The cache read cost points per million tokens. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CacheCostPointsPerMillion")
        public String cacheCostPointsPerMillion;

        /**
         * <p>The cache creation or write cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("CacheCreationCostPointsPerMillion")
        public String cacheCreationCostPointsPerMillion;

        /**
         * <p>The ID of the cost rule.</p>
         * 
         * <strong>example:</strong>
         * <p>924d450014e64e88ac6e8486f8e990**</p>
         */
        @NameInMap("CostRuleId")
        public String costRuleId;

        /**
         * <p>The end time of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T00:00:00Z</p>
         */
        @NameInMap("EffectiveEndTime")
        public String effectiveEndTime;

        /**
         * <p>The start time of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("EffectiveStartTime")
        public String effectiveStartTime;

        /**
         * <p>The type of the effective target.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("EffectiveTargetType")
        public String effectiveTargetType;

        /**
         * <p>The value of the effective target.</p>
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
         * <p>The time when the cost rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-04T16:09:29+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the cost rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The gateway instance ID.</p>
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
         * <p>The input token tier. An empty value indicates a legacy or default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>0-32K</p>
         */
        @NameInMap("InputTokenTier")
        public String inputTokenTier;

        /**
         * <p>The non-cumulative tiered pricing for input tokens. Each element includes the tier and the input cost points per million tokens.</p>
         */
        @NameInMap("InputTokenTiers")
        public java.util.List<DescribeCostRulesResponseBodyItemsInputTokenTiers> inputTokenTiers;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>gpt-4</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The ID of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-xxxxxxxxx</p>
         */
        @NameInMap("ModelServiceId")
        public String modelServiceId;

        /**
         * <p>The model service name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-service</p>
         */
        @NameInMap("ModelServiceName")
        public String modelServiceName;

        /**
         * <p>The output cost points per million tokens. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutputCostPointsPerMillion")
        public String outputCostPointsPerMillion;

        /**
         * <p>The video input cost points per second.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoCostPointsPerSecond")
        public String videoCostPointsPerSecond;

        public static DescribeCostRulesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostRulesResponseBodyItems self = new DescribeCostRulesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCostRulesResponseBodyItems setCacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
            this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
            return this;
        }
        public String getCacheCostPointsPerMillion() {
            return this.cacheCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setCacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
            this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
            return this;
        }
        public String getCacheCreationCostPointsPerMillion() {
            return this.cacheCreationCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setCostRuleId(String costRuleId) {
            this.costRuleId = costRuleId;
            return this;
        }
        public String getCostRuleId() {
            return this.costRuleId;
        }

        public DescribeCostRulesResponseBodyItems setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public DescribeCostRulesResponseBodyItems setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public DescribeCostRulesResponseBodyItems setEffectiveTargetType(String effectiveTargetType) {
            this.effectiveTargetType = effectiveTargetType;
            return this;
        }
        public String getEffectiveTargetType() {
            return this.effectiveTargetType;
        }

        public DescribeCostRulesResponseBodyItems setEffectiveTargetValue(String effectiveTargetValue) {
            this.effectiveTargetValue = effectiveTargetValue;
            return this;
        }
        public String getEffectiveTargetValue() {
            return this.effectiveTargetValue;
        }

        public DescribeCostRulesResponseBodyItems setExplicitCacheCostPointsPerMillion(String explicitCacheCostPointsPerMillion) {
            this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
            return this;
        }
        public String getExplicitCacheCostPointsPerMillion() {
            return this.explicitCacheCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCostRulesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCostRulesResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeCostRulesResponseBodyItems setImageCostPointsPerCount(String imageCostPointsPerCount) {
            this.imageCostPointsPerCount = imageCostPointsPerCount;
            return this;
        }
        public String getImageCostPointsPerCount() {
            return this.imageCostPointsPerCount;
        }

        public DescribeCostRulesResponseBodyItems setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setInputTokenTier(String inputTokenTier) {
            this.inputTokenTier = inputTokenTier;
            return this;
        }
        public String getInputTokenTier() {
            return this.inputTokenTier;
        }

        public DescribeCostRulesResponseBodyItems setInputTokenTiers(java.util.List<DescribeCostRulesResponseBodyItemsInputTokenTiers> inputTokenTiers) {
            this.inputTokenTiers = inputTokenTiers;
            return this;
        }
        public java.util.List<DescribeCostRulesResponseBodyItemsInputTokenTiers> getInputTokenTiers() {
            return this.inputTokenTiers;
        }

        public DescribeCostRulesResponseBodyItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeCostRulesResponseBodyItems setModelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        public DescribeCostRulesResponseBodyItems setModelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        public DescribeCostRulesResponseBodyItems setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }
        public String getOutputCostPointsPerMillion() {
            return this.outputCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setVideoCostPointsPerSecond(String videoCostPointsPerSecond) {
            this.videoCostPointsPerSecond = videoCostPointsPerSecond;
            return this;
        }
        public String getVideoCostPointsPerSecond() {
            return this.videoCostPointsPerSecond;
        }

    }

}
