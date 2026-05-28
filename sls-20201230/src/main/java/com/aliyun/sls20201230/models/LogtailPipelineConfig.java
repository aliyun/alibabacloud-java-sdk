// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailPipelineConfig extends TeaModel {
    /**
     * <p>The aggregation plug-ins.</p>
     */
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    /**
     * <p>The name of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The creation time. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The data output plug-ins.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("flushers")
    public java.util.List<java.util.Map<String, ?>> flushers;

    /**
     * <p>The global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;TopicType&quot;: &quot;custom&quot;,     &quot;TopicFormat&quot;: &quot;aaa&quot;,     &quot;EnableAlwaysOnline&quot;: true,     &quot;EnableTimestampNanosecond&quot;: true,     &quot;UsingOldContentTag&quot;: true }</p>
     */
    @NameInMap("global")
    public java.util.Map<String, ?> global;

    /**
     * <p>The data source plug-ins.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    /**
     * <p>The last modification time. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The sample log.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1 - - [10/Jun/2022:12:36:49 +0800] &quot;GET /index.html HTTP/1.1&quot; 200</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>The processing plug-ins.</p>
     */
    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;task_example&quot;}</p>
     */
    @NameInMap("task")
    public java.util.Map<String, ?> task;

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

    public LogtailPipelineConfig setTask(java.util.Map<String, ?> task) {
        this.task = task;
        return this;
    }
    public java.util.Map<String, ?> getTask() {
        return this.task;
    }

}
