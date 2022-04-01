// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class Constraint extends TeaModel {
    // max
    @NameInMap("max")
    public Long max;

    // min
    @NameInMap("min")
    public Long min;

    // type
    @NameInMap("type")
    public String type;

    // values
    @NameInMap("values")
    public java.util.List<String> values;

    public static Constraint build(java.util.Map<String, ?> map) throws Exception {
        Constraint self = new Constraint();
        return TeaModel.build(map, self);
    }

    public Constraint setMax(Long max) {
        this.max = max;
        return this;
    }
    public Long getMax() {
        return this.max;
    }

    public Constraint setMin(Long min) {
        this.min = min;
        return this;
    }
    public Long getMin() {
        return this.min;
    }

    public Constraint setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Constraint setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
