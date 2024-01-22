// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("applicationID")
    public String applicationID;

    @NameInMap("applicationId")
    public String applicationId;

    @NameInMap("applicationName")
    public String applicationName;

    @NameInMap("args")
    public String args;

    @NameInMap("caPort")
    public Integer caPort;

    @NameInMap("codeChecksum")
    public String codeChecksum;

    @NameInMap("codeSize")
    public Long codeSize;

    @NameInMap("command")
    public String command;

    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("customDNS")
    public CustomDNS customDNS;

    @NameInMap("customDomainName")
    public String customDomainName;

    @NameInMap("customHealthCheckConfig")
    public CustomHealthCheckConfig customHealthCheckConfig;

    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("enableAppMetric")
    public Boolean enableAppMetric;

    @NameInMap("enableArmsAdvanced")
    public Boolean enableArmsAdvanced;

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

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("layers")
    public java.util.List<String> layers;

    @NameInMap("layersArnV2")
    public java.util.List<String> layersArnV2;

    @NameInMap("livenessProbe")
    public Probe livenessProbe;

    @NameInMap("logConfig")
    public LogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("namespaceID")
    public String namespaceID;

    @NameInMap("namespaceName")
    public String namespaceName;

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

    @NameInMap("urlInternet")
    public String urlInternet;

    @NameInMap("urlIntranet")
    public String urlIntranet;

    @NameInMap("version")
    public Version version;

    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static Application build(java.util.Map<String, ?> map) throws Exception {
        Application self = new Application();
        return TeaModel.build(map, self);
    }

    public Application setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Application setApplicationID(String applicationID) {
        this.applicationID = applicationID;
        return this;
    }
    public String getApplicationID() {
        return this.applicationID;
    }

    public Application setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public Application setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public Application setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public Application setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public Application setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public Application setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }
    public Long getCodeSize() {
        return this.codeSize;
    }

    public Application setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public Application setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public Application setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Application setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public Application setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
        return this;
    }
    public String getCustomDomainName() {
        return this.customDomainName;
    }

    public Application setCustomHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
        this.customHealthCheckConfig = customHealthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    public Application setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public Application setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Application setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public Application setEnableAppMetric(Boolean enableAppMetric) {
        this.enableAppMetric = enableAppMetric;
        return this;
    }
    public Boolean getEnableAppMetric() {
        return this.enableAppMetric;
    }

    public Application setEnableArmsAdvanced(Boolean enableArmsAdvanced) {
        this.enableArmsAdvanced = enableArmsAdvanced;
        return this;
    }
    public Boolean getEnableArmsAdvanced() {
        return this.enableArmsAdvanced;
    }

    public Application setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public Application setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    public Application setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public Application setHttpTriggerConfig(HTTPTriggerConfig httpTriggerConfig) {
        this.httpTriggerConfig = httpTriggerConfig;
        return this;
    }
    public HTTPTriggerConfig getHttpTriggerConfig() {
        return this.httpTriggerConfig;
    }

    public Application setImageConfig(ImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    public Application setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public Application setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public Application setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public Application setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public Application setInstanceSoftConcurrency(Integer instanceSoftConcurrency) {
        this.instanceSoftConcurrency = instanceSoftConcurrency;
        return this;
    }
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    public Application setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public Application setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public Application setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Application setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public Application setLayersArnV2(java.util.List<String> layersArnV2) {
        this.layersArnV2 = layersArnV2;
        return this;
    }
    public java.util.List<String> getLayersArnV2() {
        return this.layersArnV2;
    }

    public Application setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }
    public Probe getLivenessProbe() {
        return this.livenessProbe;
    }

    public Application setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public Application setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public Application setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Application setNamespaceID(String namespaceID) {
        this.namespaceID = namespaceID;
        return this;
    }
    public String getNamespaceID() {
        return this.namespaceID;
    }

    public Application setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public Application setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public Application setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public Application setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public Application setScaleConfig(ScaleConfig scaleConfig) {
        this.scaleConfig = scaleConfig;
        return this;
    }
    public ScaleConfig getScaleConfig() {
        return this.scaleConfig;
    }

    public Application setSlsConfig(SLSConfig slsConfig) {
        this.slsConfig = slsConfig;
        return this;
    }
    public SLSConfig getSlsConfig() {
        return this.slsConfig;
    }

    public Application setStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public Probe getStartupProbe() {
        return this.startupProbe;
    }

    public Application setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public Application setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public Application setUrlInternet(String urlInternet) {
        this.urlInternet = urlInternet;
        return this;
    }
    public String getUrlInternet() {
        return this.urlInternet;
    }

    public Application setUrlIntranet(String urlIntranet) {
        this.urlIntranet = urlIntranet;
        return this;
    }
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

    public Application setVersion(Version version) {
        this.version = version;
        return this;
    }
    public Version getVersion() {
        return this.version;
    }

    public Application setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
