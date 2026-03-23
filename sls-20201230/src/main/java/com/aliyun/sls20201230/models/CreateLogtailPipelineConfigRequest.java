// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogtailPipelineConfigRequest extends TeaModel {
    /**
     * <p>The list of aggregation plugins.</p>
     * <blockquote>
     * <p>Notice: This parameter is valid only when you use extension processing plugins. You can use a maximum of one aggregation plugin.</p>
     * </blockquote>
     */
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    /**
     * <p>The name of the configuration.</p>
     * <blockquote>
     * <p>The configuration name must be unique within the project and cannot be modified after the configuration is created. The name must follow these rules:</p>
     * <ul>
     * <li><p>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>It must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>It must be 2 to 128 characters in length.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The list of output plugins.</p>
     * <blockquote>
     * <p>Notice: Currently, you can add only one flusher_sls plugin.</p>
     * </blockquote>
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
     * <p>The list of input plugins.</p>
     * <blockquote>
     * <p>Notice: Currently, you can configure only one input plugin.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    /**
     * <p>A sample log. Multiple log entries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>The list of processing plugins.</p>
     * <blockquote>
     * <p>Processing plugins are classified into native processing plugins and extension processing plugins. For more information, see <a href="https://help.aliyun.com/document_detail/64957.html">Processing plugins</a>.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><p>Native plugins can be used only to collect text logs.</p>
     * </li>
     * <li><p>You cannot add native plugins and extension plugins at the same time.</p>
     * </li>
     * <li><p>When you use native plugins, the following requirements must be met:</p>
     * <ul>
     * <li><p>The first processing plugin must be a regular expression-based parsing plugin, a separator-based parsing plugin, a JSON-based parsing plugin, an NGINX-based parsing plugin, an Apache-based parsing plugin, or an IIS-based parsing plugin.</p>
     * </li>
     * <li><p>After the first processing plugin, you can add only one time parsing processing plugin, one filter plugin, and multiple data masking plugins.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    /**
     * <p>The task configuration.</p>
     */
    @NameInMap("task")
    public java.util.Map<String, ?> task;

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

    public CreateLogtailPipelineConfigRequest setTask(java.util.Map<String, ?> task) {
        this.task = task;
        return this;
    }
    public java.util.Map<String, ?> getTask() {
        return this.task;
    }

}
