// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCostRuleRequest extends TeaModel {
    /**
     * <p>The cost points per million cached tokens. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CacheCostPointsPerMillion")
    public String cacheCostPointsPerMillion;

    /**
     * <p>The effective target type. Valid values:</p>
     * <ul>
     * <li>global</li>
     * <li>consumerGroup</li>
     * <li>consumer</li>
     * </ul>
     * <p>Default value: global.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("EffectiveTargetType")
    public String effectiveTargetType;

    /**
     * <p>The effective target value. This parameter is required when EffectiveTargetType is not set to global.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EffectiveTargetValue")
    public String effectiveTargetValue;

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
     * <p>The cost points per million input tokens. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InputCostPointsPerMillion")
    public String inputCostPointsPerMillion;

    /**
     * <p>The model name, such as gpt-4 or qwen-turbo.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpt-4</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-xxxxxx</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <p>The cost points per million output tokens. Default value: 0.</p>
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
