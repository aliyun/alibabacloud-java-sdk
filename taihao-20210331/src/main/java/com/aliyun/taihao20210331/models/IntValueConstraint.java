// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IntValueConstraint extends TeaModel {
    // defaultValue
    @NameInMap("defaultValue")
    public Long defaultValue;

    // max
    @NameInMap("max")
    public Long max;

    // min
    @NameInMap("min")
    public Long min;

    // step
    @NameInMap("step")
    public Long step;

    // type
    @NameInMap("type")
    public String type;

    // values
    @NameInMap("values")
    public java.util.List<Long> values;

    public static IntValueConstraint build(java.util.Map<String, ?> map) throws Exception {
        IntValueConstraint self = new IntValueConstraint();
        return TeaModel.build(map, self);
    }

    public IntValueConstraint setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public Long getDefaultValue() {
        return this.defaultValue;
    }

    public IntValueConstraint setMax(Long max) {
        this.max = max;
        return this;
    }
    public Long getMax() {
        return this.max;
    }

    public IntValueConstraint setMin(Long min) {
        this.min = min;
        return this;
    }
    public Long getMin() {
        return this.min;
    }

    public IntValueConstraint setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public IntValueConstraint setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IntValueConstraint setValues(java.util.List<Long> values) {
        this.values = values;
        return this;
    }
    public java.util.List<Long> getValues() {
        return this.values;
    }

}
