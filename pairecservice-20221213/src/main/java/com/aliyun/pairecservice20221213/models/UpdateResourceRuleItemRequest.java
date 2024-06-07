// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateResourceRuleItemRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxValue")
    public Double maxValue;

    @NameInMap("MinValue")
    public Double minValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public Double value;

    public static UpdateResourceRuleItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRuleItemRequest self = new UpdateResourceRuleItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRuleItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateResourceRuleItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateResourceRuleItemRequest setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    public Double getMaxValue() {
        return this.maxValue;
    }

    public UpdateResourceRuleItemRequest setMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }
    public Double getMinValue() {
        return this.minValue;
    }

    public UpdateResourceRuleItemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateResourceRuleItemRequest setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
