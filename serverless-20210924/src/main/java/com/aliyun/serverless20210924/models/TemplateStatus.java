// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TemplateStatus extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("observedGeneration")
    public Integer observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("outputs")
    public java.util.List<OutputValue> outputs;

    @NameInMap("phase")
    public String phase;

    @NameInMap("variables")
    public java.util.List<InputVariable> variables;

    public static TemplateStatus build(java.util.Map<String, ?> map) throws Exception {
        TemplateStatus self = new TemplateStatus();
        return TeaModel.build(map, self);
    }

    public TemplateStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TemplateStatus setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public TemplateStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public TemplateStatus setOutputs(java.util.List<OutputValue> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<OutputValue> getOutputs() {
        return this.outputs;
    }

    public TemplateStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public TemplateStatus setVariables(java.util.List<InputVariable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<InputVariable> getVariables() {
        return this.variables;
    }

}
