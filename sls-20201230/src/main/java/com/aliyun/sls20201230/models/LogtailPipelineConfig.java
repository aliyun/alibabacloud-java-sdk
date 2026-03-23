// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailPipelineConfig extends TeaModel {
    /**
     * <p>聚合插件</p>
     */
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    /**
     * <p>配置名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>创建时间，UNIX时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>输出插件</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("flushers")
    public java.util.List<java.util.Map<String, ?>> flushers;

    /**
     * <p>全局信息</p>
     */
    @NameInMap("global")
    public java.util.Map<String, ?> global;

    /**
     * <p>输入插件</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    /**
     * <p>最后修改时间，UNIX时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>日志样例</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1 - - [10/Jun/2022:12:36:49 +0800] &quot;GET /index.html HTTP/1.1&quot; 200</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>处理插件</p>
     */
    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    /**
     * <p>任务配置</p>
     * 
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
