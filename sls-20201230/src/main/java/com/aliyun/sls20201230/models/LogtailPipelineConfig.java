// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailPipelineConfig extends TeaModel {
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    @NameInMap("configName")
    public String configName;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("flushers")
    public java.util.List<java.util.Map<String, ?>> flushers;

    @NameInMap("global")
    public java.util.Map<String, ?> global;

    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("logSample")
    public String logSample;

    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    public static LogtailPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
        LogtailPipelineConfig self = new LogtailPipelineConfig();
        return TeaModel.build(map, self);
    }

    public LogtailPipelineConfig setAggregators(java.util.List<java.util.Map<String, ?>> aggregators) {
        this.aggregators = aggregators;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getAggregators() {
        return this.aggregators;
    }

    public LogtailPipelineConfig setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public LogtailPipelineConfig setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public LogtailPipelineConfig setFlushers(java.util.List<java.util.Map<String, ?>> flushers) {
        this.flushers = flushers;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getFlushers() {
        return this.flushers;
    }

    public LogtailPipelineConfig setGlobal(java.util.Map<String, ?> global) {
        this.global = global;
        return this;
    }
    public java.util.Map<String, ?> getGlobal() {
        return this.global;
    }

    public LogtailPipelineConfig setInputs(java.util.List<java.util.Map<String, ?>> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getInputs() {
        return this.inputs;
    }

    public LogtailPipelineConfig setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public LogtailPipelineConfig setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public LogtailPipelineConfig setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

}
