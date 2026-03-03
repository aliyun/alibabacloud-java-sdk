// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RuleCondition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>header</p>
     */
    @NameInMap("position")
    public String position;

    /**
     * <strong>example:</strong>
     * <p>==</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("value")
    public String value;

    @NameInMap("valueType")
    public String valueType;

    public static RuleCondition build(java.util.Map<String, ?> map) throws Exception {
        RuleCondition self = new RuleCondition();
        return TeaModel.build(map, self);
    }

    public RuleCondition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RuleCondition setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public RuleCondition setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public RuleCondition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public RuleCondition setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
