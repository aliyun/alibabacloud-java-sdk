// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SplitTrafficControlTargetRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SetPoints")
    public java.util.List<Long> setPoints;

    @NameInMap("SetValues")
    public java.util.List<Long> setValues;

    @NameInMap("TimePoints")
    public java.util.List<Long> timePoints;

    public static SplitTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitTrafficControlTargetRequest self = new SplitTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public SplitTrafficControlTargetRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public SplitTrafficControlTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SplitTrafficControlTargetRequest setSetPoints(java.util.List<Long> setPoints) {
        this.setPoints = setPoints;
        return this;
    }
    public java.util.List<Long> getSetPoints() {
        return this.setPoints;
    }

    public SplitTrafficControlTargetRequest setSetValues(java.util.List<Long> setValues) {
        this.setValues = setValues;
        return this;
    }
    public java.util.List<Long> getSetValues() {
        return this.setValues;
    }

    public SplitTrafficControlTargetRequest setTimePoints(java.util.List<Long> timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public java.util.List<Long> getTimePoints() {
        return this.timePoints;
    }

}
