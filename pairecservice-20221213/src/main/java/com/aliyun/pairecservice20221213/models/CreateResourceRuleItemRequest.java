// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateResourceRuleItemRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxValue")
    public Double maxValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MinValue")
    public Double minValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public Double value;

    public static CreateResourceRuleItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRuleItemRequest self = new CreateResourceRuleItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRuleItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceRuleItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateResourceRuleItemRequest setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }
    public Double getMaxValue() {
        return this.maxValue;
    }

    public CreateResourceRuleItemRequest setMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }
    public Double getMinValue() {
        return this.minValue;
    }

    public CreateResourceRuleItemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceRuleItemRequest setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
