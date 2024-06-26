// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogtailPipelineConfigRequest extends TeaModel {
    /**
     * <p>The aggregation plug-ins.</p>
     */
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    /**
     * <p>The name of the configuration.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The data output plug-ins.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("flushers")
    public java.util.List<java.util.Map<String, ?>> flushers;

    /**
     * <p>The global configuration.</p>
     */
    @NameInMap("global")
    public java.util.Map<String, ?> global;

    /**
     * <p>The data source plug-ins.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    /**
     * <p>The sample log.</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>The processing plug-ins.</p>
     */
    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    public static CreateLogtailPipelineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogtailPipelineConfigRequest self = new CreateLogtailPipelineConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogtailPipelineConfigRequest setAggregators(java.util.List<java.util.Map<String, ?>> aggregators) {
        this.aggregators = aggregators;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getAggregators() {
        return this.aggregators;
    }

    public CreateLogtailPipelineConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public CreateLogtailPipelineConfigRequest setFlushers(java.util.List<java.util.Map<String, ?>> flushers) {
        this.flushers = flushers;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getFlushers() {
        return this.flushers;
    }

    public CreateLogtailPipelineConfigRequest setGlobal(java.util.Map<String, ?> global) {
        this.global = global;
        return this;
    }
    public java.util.Map<String, ?> getGlobal() {
        return this.global;
    }

    public CreateLogtailPipelineConfigRequest setInputs(java.util.List<java.util.Map<String, ?>> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getInputs() {
        return this.inputs;
    }

    public CreateLogtailPipelineConfigRequest setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public CreateLogtailPipelineConfigRequest setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

}
