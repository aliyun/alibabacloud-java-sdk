// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Tracing")
    public Boolean tracing;

    @NameInMap("TraceSampling")
    public Float traceSampling;

    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    @NameInMap("Telemetry")
    public Boolean telemetry;

    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    @NameInMap("AuditProject")
    public String auditProject;

    @NameInMap("ClusterDomain")
    public String clusterDomain;

    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    @NameInMap("OutboundTrafficPolicy")
    public String outboundTrafficPolicy;

    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    @NameInMap("EnableNamespacesByDefault")
    public Boolean enableNamespacesByDefault;

    @NameInMap("AutoInjectionPolicyEnabled")
    public Boolean autoInjectionPolicyEnabled;

    @NameInMap("SidecarInjectorRequestCPU")
    public String sidecarInjectorRequestCPU;

    @NameInMap("SidecarInjectorRequestMemory")
    public String sidecarInjectorRequestMemory;

    @NameInMap("SidecarInjectorLimitCPU")
    public String sidecarInjectorLimitCPU;

    @NameInMap("SidecarInjectorLimitMemory")
    public String sidecarInjectorLimitMemory;

    @NameInMap("SidecarInjectorWebhookAsYaml")
    public String sidecarInjectorWebhookAsYaml;

    @NameInMap("CniEnabled")
    public Boolean cniEnabled;

    @NameInMap("CniExcludeNamespaces")
    public String cniExcludeNamespaces;

    @NameInMap("OpaEnabled")
    public Boolean opaEnabled;

    @NameInMap("Http10Enabled")
    public Boolean http10Enabled;

    @NameInMap("KialiEnabled")
    public Boolean kialiEnabled;

    @NameInMap("CustomizedPrometheus")
    public Boolean customizedPrometheus;

    @NameInMap("PrometheusUrl")
    public String prometheusUrl;

    @NameInMap("AccessLogEnabled")
    public Boolean accessLogEnabled;

    @NameInMap("MSEEnabled")
    public Boolean MSEEnabled;

    @NameInMap("RedisFilterEnabled")
    public Boolean redisFilterEnabled;

    @NameInMap("MysqlFilterEnabled")
    public Boolean mysqlFilterEnabled;

    @NameInMap("ThriftFilterEnabled")
    public Boolean thriftFilterEnabled;

    @NameInMap("WebAssemblyFilterEnabled")
    public Boolean webAssemblyFilterEnabled;

    @NameInMap("DNSProxyingEnabled")
    public Boolean DNSProxyingEnabled;

    @NameInMap("DubboFilterEnabled")
    public Boolean dubboFilterEnabled;

    @NameInMap("FilterGatewayClusterConfig")
    public Boolean filterGatewayClusterConfig;

    @NameInMap("EnableSDSServer")
    public Boolean enableSDSServer;

    @NameInMap("AccessLogServiceEnabled")
    public Boolean accessLogServiceEnabled;

    @NameInMap("AccessLogServiceHost")
    public String accessLogServiceHost;

    @NameInMap("AccessLogServicePort")
    public Integer accessLogServicePort;

    @NameInMap("GatewayAPIEnabled")
    public Boolean gatewayAPIEnabled;

    @NameInMap("ConfigSourceEnabled")
    public Boolean configSourceEnabled;

    @NameInMap("ConfigSourceNacosID")
    public String configSourceNacosID;

    public static UpdateMeshFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshFeatureRequest self = new UpdateMeshFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshFeatureRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateMeshFeatureRequest setTracing(Boolean tracing) {
        this.tracing = tracing;
        return this;
    }
    public Boolean getTracing() {
        return this.tracing;
    }

    public UpdateMeshFeatureRequest setTraceSampling(Float traceSampling) {
        this.traceSampling = traceSampling;
        return this;
    }
    public Float getTraceSampling() {
        return this.traceSampling;
    }

    public UpdateMeshFeatureRequest setLocalityLoadBalancing(Boolean localityLoadBalancing) {
        this.localityLoadBalancing = localityLoadBalancing;
        return this;
    }
    public Boolean getLocalityLoadBalancing() {
        return this.localityLoadBalancing;
    }

    public UpdateMeshFeatureRequest setTelemetry(Boolean telemetry) {
        this.telemetry = telemetry;
        return this;
    }
    public Boolean getTelemetry() {
        return this.telemetry;
    }

    public UpdateMeshFeatureRequest setOpenAgentPolicy(Boolean openAgentPolicy) {
        this.openAgentPolicy = openAgentPolicy;
        return this;
    }
    public Boolean getOpenAgentPolicy() {
        return this.openAgentPolicy;
    }

    public UpdateMeshFeatureRequest setOPALogLevel(String OPALogLevel) {
        this.OPALogLevel = OPALogLevel;
        return this;
    }
    public String getOPALogLevel() {
        return this.OPALogLevel;
    }

    public UpdateMeshFeatureRequest setOPARequestCPU(String OPARequestCPU) {
        this.OPARequestCPU = OPARequestCPU;
        return this;
    }
    public String getOPARequestCPU() {
        return this.OPARequestCPU;
    }

    public UpdateMeshFeatureRequest setOPARequestMemory(String OPARequestMemory) {
        this.OPARequestMemory = OPARequestMemory;
        return this;
    }
    public String getOPARequestMemory() {
        return this.OPARequestMemory;
    }

    public UpdateMeshFeatureRequest setOPALimitCPU(String OPALimitCPU) {
        this.OPALimitCPU = OPALimitCPU;
        return this;
    }
    public String getOPALimitCPU() {
        return this.OPALimitCPU;
    }

    public UpdateMeshFeatureRequest setOPALimitMemory(String OPALimitMemory) {
        this.OPALimitMemory = OPALimitMemory;
        return this;
    }
    public String getOPALimitMemory() {
        return this.OPALimitMemory;
    }

    public UpdateMeshFeatureRequest setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public UpdateMeshFeatureRequest setAuditProject(String auditProject) {
        this.auditProject = auditProject;
        return this;
    }
    public String getAuditProject() {
        return this.auditProject;
    }

    public UpdateMeshFeatureRequest setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public UpdateMeshFeatureRequest setCustomizedZipkin(Boolean customizedZipkin) {
        this.customizedZipkin = customizedZipkin;
        return this;
    }
    public Boolean getCustomizedZipkin() {
        return this.customizedZipkin;
    }

    public UpdateMeshFeatureRequest setOutboundTrafficPolicy(String outboundTrafficPolicy) {
        this.outboundTrafficPolicy = outboundTrafficPolicy;
        return this;
    }
    public String getOutboundTrafficPolicy() {
        return this.outboundTrafficPolicy;
    }

    public UpdateMeshFeatureRequest setProxyRequestCPU(String proxyRequestCPU) {
        this.proxyRequestCPU = proxyRequestCPU;
        return this;
    }
    public String getProxyRequestCPU() {
        return this.proxyRequestCPU;
    }

    public UpdateMeshFeatureRequest setProxyRequestMemory(String proxyRequestMemory) {
        this.proxyRequestMemory = proxyRequestMemory;
        return this;
    }
    public String getProxyRequestMemory() {
        return this.proxyRequestMemory;
    }

    public UpdateMeshFeatureRequest setProxyLimitCPU(String proxyLimitCPU) {
        this.proxyLimitCPU = proxyLimitCPU;
        return this;
    }
    public String getProxyLimitCPU() {
        return this.proxyLimitCPU;
    }

    public UpdateMeshFeatureRequest setProxyLimitMemory(String proxyLimitMemory) {
        this.proxyLimitMemory = proxyLimitMemory;
        return this;
    }
    public String getProxyLimitMemory() {
        return this.proxyLimitMemory;
    }

    public UpdateMeshFeatureRequest setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    public UpdateMeshFeatureRequest setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    public UpdateMeshFeatureRequest setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    public UpdateMeshFeatureRequest setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    public UpdateMeshFeatureRequest setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
        this.enableNamespacesByDefault = enableNamespacesByDefault;
        return this;
    }
    public Boolean getEnableNamespacesByDefault() {
        return this.enableNamespacesByDefault;
    }

    public UpdateMeshFeatureRequest setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
        this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
        return this;
    }
    public Boolean getAutoInjectionPolicyEnabled() {
        return this.autoInjectionPolicyEnabled;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorRequestCPU(String sidecarInjectorRequestCPU) {
        this.sidecarInjectorRequestCPU = sidecarInjectorRequestCPU;
        return this;
    }
    public String getSidecarInjectorRequestCPU() {
        return this.sidecarInjectorRequestCPU;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorRequestMemory(String sidecarInjectorRequestMemory) {
        this.sidecarInjectorRequestMemory = sidecarInjectorRequestMemory;
        return this;
    }
    public String getSidecarInjectorRequestMemory() {
        return this.sidecarInjectorRequestMemory;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorLimitCPU(String sidecarInjectorLimitCPU) {
        this.sidecarInjectorLimitCPU = sidecarInjectorLimitCPU;
        return this;
    }
    public String getSidecarInjectorLimitCPU() {
        return this.sidecarInjectorLimitCPU;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorLimitMemory(String sidecarInjectorLimitMemory) {
        this.sidecarInjectorLimitMemory = sidecarInjectorLimitMemory;
        return this;
    }
    public String getSidecarInjectorLimitMemory() {
        return this.sidecarInjectorLimitMemory;
    }

    public UpdateMeshFeatureRequest setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
        this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
        return this;
    }
    public String getSidecarInjectorWebhookAsYaml() {
        return this.sidecarInjectorWebhookAsYaml;
    }

    public UpdateMeshFeatureRequest setCniEnabled(Boolean cniEnabled) {
        this.cniEnabled = cniEnabled;
        return this;
    }
    public Boolean getCniEnabled() {
        return this.cniEnabled;
    }

    public UpdateMeshFeatureRequest setCniExcludeNamespaces(String cniExcludeNamespaces) {
        this.cniExcludeNamespaces = cniExcludeNamespaces;
        return this;
    }
    public String getCniExcludeNamespaces() {
        return this.cniExcludeNamespaces;
    }

    public UpdateMeshFeatureRequest setOpaEnabled(Boolean opaEnabled) {
        this.opaEnabled = opaEnabled;
        return this;
    }
    public Boolean getOpaEnabled() {
        return this.opaEnabled;
    }

    public UpdateMeshFeatureRequest setHttp10Enabled(Boolean http10Enabled) {
        this.http10Enabled = http10Enabled;
        return this;
    }
    public Boolean getHttp10Enabled() {
        return this.http10Enabled;
    }

    public UpdateMeshFeatureRequest setKialiEnabled(Boolean kialiEnabled) {
        this.kialiEnabled = kialiEnabled;
        return this;
    }
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    public UpdateMeshFeatureRequest setCustomizedPrometheus(Boolean customizedPrometheus) {
        this.customizedPrometheus = customizedPrometheus;
        return this;
    }
    public Boolean getCustomizedPrometheus() {
        return this.customizedPrometheus;
    }

    public UpdateMeshFeatureRequest setPrometheusUrl(String prometheusUrl) {
        this.prometheusUrl = prometheusUrl;
        return this;
    }
    public String getPrometheusUrl() {
        return this.prometheusUrl;
    }

    public UpdateMeshFeatureRequest setAccessLogEnabled(Boolean accessLogEnabled) {
        this.accessLogEnabled = accessLogEnabled;
        return this;
    }
    public Boolean getAccessLogEnabled() {
        return this.accessLogEnabled;
    }

    public UpdateMeshFeatureRequest setMSEEnabled(Boolean MSEEnabled) {
        this.MSEEnabled = MSEEnabled;
        return this;
    }
    public Boolean getMSEEnabled() {
        return this.MSEEnabled;
    }

    public UpdateMeshFeatureRequest setRedisFilterEnabled(Boolean redisFilterEnabled) {
        this.redisFilterEnabled = redisFilterEnabled;
        return this;
    }
    public Boolean getRedisFilterEnabled() {
        return this.redisFilterEnabled;
    }

    public UpdateMeshFeatureRequest setMysqlFilterEnabled(Boolean mysqlFilterEnabled) {
        this.mysqlFilterEnabled = mysqlFilterEnabled;
        return this;
    }
    public Boolean getMysqlFilterEnabled() {
        return this.mysqlFilterEnabled;
    }

    public UpdateMeshFeatureRequest setThriftFilterEnabled(Boolean thriftFilterEnabled) {
        this.thriftFilterEnabled = thriftFilterEnabled;
        return this;
    }
    public Boolean getThriftFilterEnabled() {
        return this.thriftFilterEnabled;
    }

    public UpdateMeshFeatureRequest setWebAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
        this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
        return this;
    }
    public Boolean getWebAssemblyFilterEnabled() {
        return this.webAssemblyFilterEnabled;
    }

    public UpdateMeshFeatureRequest setDNSProxyingEnabled(Boolean DNSProxyingEnabled) {
        this.DNSProxyingEnabled = DNSProxyingEnabled;
        return this;
    }
    public Boolean getDNSProxyingEnabled() {
        return this.DNSProxyingEnabled;
    }

    public UpdateMeshFeatureRequest setDubboFilterEnabled(Boolean dubboFilterEnabled) {
        this.dubboFilterEnabled = dubboFilterEnabled;
        return this;
    }
    public Boolean getDubboFilterEnabled() {
        return this.dubboFilterEnabled;
    }

    public UpdateMeshFeatureRequest setFilterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
        this.filterGatewayClusterConfig = filterGatewayClusterConfig;
        return this;
    }
    public Boolean getFilterGatewayClusterConfig() {
        return this.filterGatewayClusterConfig;
    }

    public UpdateMeshFeatureRequest setEnableSDSServer(Boolean enableSDSServer) {
        this.enableSDSServer = enableSDSServer;
        return this;
    }
    public Boolean getEnableSDSServer() {
        return this.enableSDSServer;
    }

    public UpdateMeshFeatureRequest setAccessLogServiceEnabled(Boolean accessLogServiceEnabled) {
        this.accessLogServiceEnabled = accessLogServiceEnabled;
        return this;
    }
    public Boolean getAccessLogServiceEnabled() {
        return this.accessLogServiceEnabled;
    }

    public UpdateMeshFeatureRequest setAccessLogServiceHost(String accessLogServiceHost) {
        this.accessLogServiceHost = accessLogServiceHost;
        return this;
    }
    public String getAccessLogServiceHost() {
        return this.accessLogServiceHost;
    }

    public UpdateMeshFeatureRequest setAccessLogServicePort(Integer accessLogServicePort) {
        this.accessLogServicePort = accessLogServicePort;
        return this;
    }
    public Integer getAccessLogServicePort() {
        return this.accessLogServicePort;
    }

    public UpdateMeshFeatureRequest setGatewayAPIEnabled(Boolean gatewayAPIEnabled) {
        this.gatewayAPIEnabled = gatewayAPIEnabled;
        return this;
    }
    public Boolean getGatewayAPIEnabled() {
        return this.gatewayAPIEnabled;
    }

    public UpdateMeshFeatureRequest setConfigSourceEnabled(Boolean configSourceEnabled) {
        this.configSourceEnabled = configSourceEnabled;
        return this;
    }
    public Boolean getConfigSourceEnabled() {
        return this.configSourceEnabled;
    }

    public UpdateMeshFeatureRequest setConfigSourceNacosID(String configSourceNacosID) {
        this.configSourceNacosID = configSourceNacosID;
        return this;
    }
    public String getConfigSourceNacosID() {
        return this.configSourceNacosID;
    }

}
