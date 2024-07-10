// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class Container extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</p>
     */
    @NameInMap("Args")
    public String args;

    /**
     * <strong>example:</strong>
     * <p>[&quot;/bin/sh&quot;]</p>
     */
    @NameInMap("Command")
    public String command;

    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/serverless_devsxxxxx</p>
     */
    @NameInMap("Image")
    public String image;

    @NameInMap("MetricsCollectConfig")
    public MetricsCollectConfig metricsCollectConfig;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RequestConcurrency")
    public Integer requestConcurrency;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resources")
    public ContainerResources resources;

    @NameInMap("SLSCollectConfigs")
    public SLSCollectConfigs SLSCollectConfigs;

    @NameInMap("StartupProbe")
    public StartupProbe startupProbe;

    @NameInMap("WebNASConfig")
    public WebNASConfig webNASConfig;

    @NameInMap("WebOSSConfig")
    public WebOSSConfig webOSSConfig;

    public static Container build(java.util.Map<String, ?> map) throws Exception {
        Container self = new Container();
        return TeaModel.build(map, self);
    }

    public Container setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public Container setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public Container setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public Container setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Container setMetricsCollectConfig(MetricsCollectConfig metricsCollectConfig) {
        this.metricsCollectConfig = metricsCollectConfig;
        return this;
    }
    public MetricsCollectConfig getMetricsCollectConfig() {
        return this.metricsCollectConfig;
    }

    public Container setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public Container setRequestConcurrency(Integer requestConcurrency) {
        this.requestConcurrency = requestConcurrency;
        return this;
    }
    public Integer getRequestConcurrency() {
        return this.requestConcurrency;
    }

    public Container setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public Container setResources(ContainerResources resources) {
        this.resources = resources;
        return this;
    }
    public ContainerResources getResources() {
        return this.resources;
    }

    public Container setSLSCollectConfigs(SLSCollectConfigs SLSCollectConfigs) {
        this.SLSCollectConfigs = SLSCollectConfigs;
        return this;
    }
    public SLSCollectConfigs getSLSCollectConfigs() {
        return this.SLSCollectConfigs;
    }

    public Container setStartupProbe(StartupProbe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public StartupProbe getStartupProbe() {
        return this.startupProbe;
    }

    public Container setWebNASConfig(WebNASConfig webNASConfig) {
        this.webNASConfig = webNASConfig;
        return this;
    }
    public WebNASConfig getWebNASConfig() {
        return this.webNASConfig;
    }

    public Container setWebOSSConfig(WebOSSConfig webOSSConfig) {
        this.webOSSConfig = webOSSConfig;
        return this;
    }
    public WebOSSConfig getWebOSSConfig() {
        return this.webOSSConfig;
    }

}
