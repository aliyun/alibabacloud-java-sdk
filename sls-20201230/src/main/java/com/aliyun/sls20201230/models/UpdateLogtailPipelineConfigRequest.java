// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogtailPipelineConfigRequest extends TeaModel {
    /**
     * <p>The list of aggregator plug-ins.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is valid only when you use an extension processing plug-in. You can use a maximum of one aggregator plug-in.</p>
     */
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    /**
     * <p>The name of the configuration.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The name must be the same as the value of the configName parameter in the request path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The list of output plug-ins.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Currently, you can add only one SLS output plug-in.</p>
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
     * <p>The list of input plug-ins.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Currently, you can configure only one input plug-in.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    /**
     * <p>A sample log. Multiple logs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>The list of processing plug-ins.</p>
     * <blockquote>
     * <p>Processing plug-ins are classified into native processing plug-ins and extension processing plug-ins. For more information, see <a href="https://help.aliyun.com/document_detail/64957.html">Processing plug-ins</a>.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><p>Native plug-ins can be used only to collect text logs.</p>
     * </li>
     * <li><p>You cannot add native plug-ins and extension plug-ins at the same time.</p>
     * </li>
     * <li><p>When you use native plug-ins, the following requirements must be met:</p>
     * <ul>
     * <li><p>The first processing plug-in must be a regular expression-based parsing plug-in, a separator-based parsing plug-in, a JSON-based parsing plug-in, an NGINX-based parsing plug-in, an Apache-based parsing plug-in, or an IIS-based parsing plug-in.</p>
     * </li>
     * <li><p>After the first processing plug-in, you can add only one time parsing plug-in, one filter plug-in, and multiple data masking plug-ins.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    @NameInMap("task")
    public java.util.Map<String, ?> task;

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

    public UpdateLogtailPipelineConfigRequest setTask(java.util.Map<String, ?> task) {
        this.task = task;
        return this;
    }
    public java.util.Map<String, ?> getTask() {
        return this.task;
    }

}
