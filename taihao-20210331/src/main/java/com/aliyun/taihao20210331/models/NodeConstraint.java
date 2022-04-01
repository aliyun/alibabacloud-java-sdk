// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeConstraint extends TeaModel {
    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

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

    public static NodeConstraint build(java.util.Map<String, ?> map) throws Exception {
        NodeConstraint self = new NodeConstraint();
        return TeaModel.build(map, self);
    }

    public NodeConstraint setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public NodeConstraint setMax(Long max) {
        this.max = max;
        return this;
    }
    public Long getMax() {
        return this.max;
    }

    public NodeConstraint setMin(Long min) {
        this.min = min;
        return this;
    }
    public Long getMin() {
        return this.min;
    }

    public NodeConstraint setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public NodeConstraint setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NodeConstraint setValues(java.util.List<Long> values) {
        this.values = values;
        return this;
    }
    public java.util.List<Long> getValues() {
        return this.values;
    }

}
