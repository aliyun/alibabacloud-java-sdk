// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCostRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CacheCostPointsPerMillion")
    public String cacheCostPointsPerMillion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>924d450014e64e88ac6e8486f8e990**</p>
     */
    @NameInMap("CostRuleId")
    public String costRuleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InputCostPointsPerMillion")
    public String inputCostPointsPerMillion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpt-4</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-xxxxxx</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OutputCostPointsPerMillion")
    public String outputCostPointsPerMillion;

    @NameInMap("RegionId")
    public String regionId;

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

    public ModifyCostRuleRequest setCostRuleId(String costRuleId) {
        this.costRuleId = costRuleId;
        return this;
    }
    public String getCostRuleId() {
        return this.costRuleId;
    }

    public ModifyCostRuleRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyCostRuleRequest setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
        this.inputCostPointsPerMillion = inputCostPointsPerMillion;
        return this;
    }
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
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

}
