// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
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

}
