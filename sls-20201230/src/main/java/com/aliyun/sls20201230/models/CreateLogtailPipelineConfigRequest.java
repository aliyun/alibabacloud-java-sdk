// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogtailPipelineConfigRequest extends TeaModel {
    /**
     * <p>The aggregation plug-ins.</p>
     * <blockquote>
     * <p> This parameter takes effect only when extended plug-ins are used. You can use only one aggregation plug-in.</p>
     * </blockquote>
     */
    @NameInMap("aggregators")
    public java.util.List<java.util.Map<String, ?>> aggregators;

    /**
     * <p>The name of the configuration.</p>
     * <blockquote>
     * <p> The name of the configuration must be unique in the project to which the configuration belongs. After the configuration is created, you cannot change the name of the configuration. The name must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name must be 2 to 128 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The output plug-ins.</p>
     * <blockquote>
     * <p> You can configure only one output plug-in.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("flushers")
    public java.util.List<java.util.Map<String, ?>> flushers;

    /**
     * <p>The global settings.</p>
     */
    @NameInMap("global")
    public java.util.Map<String, ?> global;

    /**
     * <p>The input plug-ins.</p>
     * <blockquote>
     * <p> You can configure only one input plug-in.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputs")
    public java.util.List<java.util.Map<String, ?>> inputs;

    /**
     * <p>The sample log. You can specify multiple sample logs.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>The processing plug-ins.</p>
     * <blockquote>
     * <p> Logtail plug-ins for data processing are classified into native plug-ins and extended plug-ins. For more information, see <a href="https://help.aliyun.com/document_detail/64957.html">Overview of Logtail plug-ins for data processing</a>.</p>
     * </blockquote>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can use native plug-ins only to collect text logs.</p>
     * </li>
     * <li><p>You cannot add native plug-ins and extended plug-ins at a time.</p>
     * </li>
     * <li><p>When you add native plug-ins, take note of the following items:</p>
     * <ul>
     * <li>You must add one of the following Logtail plug-ins for data processing as the first plug-in: Data Parsing (Regex Mode), Data Parsing (Delimiter Mode), Data Parsing (JSON Mode), Data Parsing (NGINX Mode), Data Parsing (Apache Mode), and Data Parsing (IIS Mode).</li>
     * <li>After you add the first plug-in, you can add one Time Parsing plug-in, one Data Filtering plug-in, and multiple Data Masking plug-ins.</li>
     * </ul>
     * </li>
     * </ul>
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
