// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCostRuleRequest extends TeaModel {
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
     * <p>pg-xxxxxxx</p>
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
     * <p>0</p>
     */
    @NameInMap("OutputCostPointsPerMillion")
    public String outputCostPointsPerMillion;

    @NameInMap("RegionId")
    public String regionId;

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

    public CreateCostRuleRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateCostRuleRequest setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
        this.inputCostPointsPerMillion = inputCostPointsPerMillion;
        return this;
    }
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
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

}
