// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogtailPipelineConfigRequest extends TeaModel {
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    @NameInMap("configName")
    public String configName;

    @NameInMap("flushers")
    public java.util.List<java.util.Map<String, ?>> flushers;

    @NameInMap("global")
    public java.util.Map<String, ?> global;

    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    @NameInMap("logSample")
    public String logSample;

    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    public static UpdateLogtailPipelineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogtailPipelineConfigRequest self = new UpdateLogtailPipelineConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogtailPipelineConfigRequest setAggregators(java.util.List<java.util.Map<String, ?>> aggregators) {
        this.aggregators = aggregators;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getAggregators() {
        return this.aggregators;
    }

    public UpdateLogtailPipelineConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public UpdateLogtailPipelineConfigRequest setFlushers(java.util.List<java.util.Map<String, ?>> flushers) {
        this.flushers = flushers;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getFlushers() {
        return this.flushers;
    }

    public UpdateLogtailPipelineConfigRequest setGlobal(java.util.Map<String, ?> global) {
        this.global = global;
        return this;
    }
    public java.util.Map<String, ?> getGlobal() {
        return this.global;
    }

    public UpdateLogtailPipelineConfigRequest setInputs(java.util.List<java.util.Map<String, ?>> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getInputs() {
        return this.inputs;
    }

    public UpdateLogtailPipelineConfigRequest setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public UpdateLogtailPipelineConfigRequest setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

}
