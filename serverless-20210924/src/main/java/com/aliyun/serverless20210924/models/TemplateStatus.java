// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TemplateStatus extends TeaModel {
    // A human-readable message indicating details about why the Template is in this condition.
    @NameInMap("message")
    public String message;

    // The most recent generation observed.
    @NameInMap("observedGeneration")
    public Integer observedGeneration;

    // Time when the last update of the status is observed.
    @NameInMap("observedTime")
    public String observedTime;

    // The definition of output values of the template parsed from the template content.
    @NameInMap("outputs")
    public java.util.List<OutputValue> outputs;

    // A simple, high-level summary of where the Template is in its lifecycle.
    @NameInMap("phase")
    public String phase;

    // The definition of input variables of the template parsed from the template content.
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
