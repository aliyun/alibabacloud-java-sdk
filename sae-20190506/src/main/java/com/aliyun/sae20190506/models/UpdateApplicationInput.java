// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationInput extends TeaModel {
    @NameInMap("args")
    public String args;

    @NameInMap("caPort")
    public Integer caPort;

    @NameInMap("code")
    public InputCodeLocation code;

    @NameInMap("command")
    public String command;

    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("customDNS")
    public CustomDNS customDNS;

    @NameInMap("customHealthCheckConfig")
    public CustomHealthCheckConfig customHealthCheckConfig;

    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("effectiveImmediately")
    public Boolean effectiveImmediately;

    @NameInMap("enableAppMetric")
    public Boolean enableAppMetric;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    @NameInMap("handler")
    public String handler;

    @NameInMap("httpTriggerConfig")
    public HTTPTriggerConfig httpTriggerConfig;

    @NameInMap("imageConfig")
    public ImageConfig imageConfig;

    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    @NameInMap("initializer")
    public String initializer;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    @NameInMap("instanceSoftConcurrency")
    public Integer instanceSoftConcurrency;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("internetAccess")
    public Boolean internetAccess;

    @NameInMap("layers")
    public java.util.List<String> layers;

    @NameInMap("livenessProbe")
    public Probe livenessProbe;

    @NameInMap("logConfig")
    public LogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    @NameInMap("runtime")
    public String runtime;

    @NameInMap("scaleConfig")
    public ScaleConfig scaleConfig;

    @NameInMap("slsConfig")
    public SLSConfig slsConfig;

    @NameInMap("startupProbe")
    public Probe startupProbe;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static UpdateApplicationInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationInput self = new UpdateApplicationInput();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationInput setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public UpdateApplicationInput setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public UpdateApplicationInput setCode(InputCodeLocation code) {
        this.code = code;
        return this;
    }
    public InputCodeLocation getCode() {
        return this.code;
    }

    public UpdateApplicationInput setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public UpdateApplicationInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateApplicationInput setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public UpdateApplicationInput setCustomHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
        this.customHealthCheckConfig = customHealthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    public UpdateApplicationInput setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public UpdateApplicationInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpdateApplicationInput setEffectiveImmediately(Boolean effectiveImmediately) {
        this.effectiveImmediately = effectiveImmediately;
        return this;
    }
    public Boolean getEffectiveImmediately() {
        return this.effectiveImmediately;
    }

    public UpdateApplicationInput setEnableAppMetric(Boolean enableAppMetric) {
        this.enableAppMetric = enableAppMetric;
        return this;
    }
    public Boolean getEnableAppMetric() {
        return this.enableAppMetric;
    }

    public UpdateApplicationInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateApplicationInput setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    public UpdateApplicationInput setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public UpdateApplicationInput setHttpTriggerConfig(HTTPTriggerConfig httpTriggerConfig) {
        this.httpTriggerConfig = httpTriggerConfig;
        return this;
    }
    public HTTPTriggerConfig getHttpTriggerConfig() {
        return this.httpTriggerConfig;
    }

    public UpdateApplicationInput setImageConfig(ImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    public UpdateApplicationInput setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public UpdateApplicationInput setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public UpdateApplicationInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public UpdateApplicationInput setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public UpdateApplicationInput setInstanceSoftConcurrency(Integer instanceSoftConcurrency) {
        this.instanceSoftConcurrency = instanceSoftConcurrency;
        return this;
    }
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    public UpdateApplicationInput setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateApplicationInput setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public UpdateApplicationInput setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public UpdateApplicationInput setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }
    public Probe getLivenessProbe() {
        return this.livenessProbe;
    }

    public UpdateApplicationInput setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public UpdateApplicationInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public UpdateApplicationInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateApplicationInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public UpdateApplicationInput setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public UpdateApplicationInput setScaleConfig(ScaleConfig scaleConfig) {
        this.scaleConfig = scaleConfig;
        return this;
    }
    public ScaleConfig getScaleConfig() {
        return this.scaleConfig;
    }

    public UpdateApplicationInput setSlsConfig(SLSConfig slsConfig) {
        this.slsConfig = slsConfig;
        return this;
    }
    public SLSConfig getSlsConfig() {
        return this.slsConfig;
    }

    public UpdateApplicationInput setStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public Probe getStartupProbe() {
        return this.startupProbe;
    }

    public UpdateApplicationInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateApplicationInput setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public UpdateApplicationInput setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
