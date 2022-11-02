// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateNamespaceScopeSidecarConfigRequest extends TeaModel {
    @NameInMap("Concurrency")
    public Integer concurrency;

    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    @NameInMap("HoldApplicationUntilProxyStarts")
    public Boolean holdApplicationUntilProxyStarts;

    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    @NameInMap("IncludeInboundPorts")
    public String includeInboundPorts;

    @NameInMap("IncludeOutboundPorts")
    public String includeOutboundPorts;

    @NameInMap("IstioDNSProxyEnabled")
    public Boolean istioDNSProxyEnabled;

    @NameInMap("Lifecycle")
    public String lifecycle;

    @NameInMap("LogLevel")
    public String logLevel;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PostStart")
    public String postStart;

    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("ProxyInitCPUResourceLimit")
    public String proxyInitCPUResourceLimit;

    @NameInMap("ProxyInitCPUResourceRequest")
    public String proxyInitCPUResourceRequest;

    @NameInMap("ProxyInitMemoryResourceLimit")
    public String proxyInitMemoryResourceLimit;

    @NameInMap("ProxyInitMemoryResourceRequest")
    public String proxyInitMemoryResourceRequest;

    @NameInMap("ProxyStatsMatcher")
    public String proxyStatsMatcher;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("SidecarProxyCPUResourceLimit")
    public String sidecarProxyCPUResourceLimit;

    @NameInMap("SidecarProxyCPUResourceRequest")
    public String sidecarProxyCPUResourceRequest;

    @NameInMap("SidecarProxyMemoryResourceLimit")
    public String sidecarProxyMemoryResourceLimit;

    @NameInMap("SidecarProxyMemoryResourceRequest")
    public String sidecarProxyMemoryResourceRequest;

    @NameInMap("TerminationDrainDuration")
    public String terminationDrainDuration;

    @NameInMap("Tracing")
    public String tracing;

    public static UpdateNamespaceScopeSidecarConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceScopeSidecarConfigRequest self = new UpdateNamespaceScopeSidecarConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceScopeSidecarConfigRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setHoldApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
        this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
        return this;
    }
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.holdApplicationUntilProxyStarts;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setIncludeInboundPorts(String includeInboundPorts) {
        this.includeInboundPorts = includeInboundPorts;
        return this;
    }
    public String getIncludeInboundPorts() {
        return this.includeInboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setIncludeOutboundPorts(String includeOutboundPorts) {
        this.includeOutboundPorts = includeOutboundPorts;
        return this;
    }
    public String getIncludeOutboundPorts() {
        return this.includeOutboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setIstioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
        this.istioDNSProxyEnabled = istioDNSProxyEnabled;
        return this;
    }
    public Boolean getIstioDNSProxyEnabled() {
        return this.istioDNSProxyEnabled;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
        this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
        return this;
    }
    public String getProxyInitCPUResourceLimit() {
        return this.proxyInitCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
        this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
        return this;
    }
    public String getProxyInitCPUResourceRequest() {
        return this.proxyInitCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
        this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
        return this;
    }
    public String getProxyInitMemoryResourceLimit() {
        return this.proxyInitMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
        this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
        return this;
    }
    public String getProxyInitMemoryResourceRequest() {
        return this.proxyInitMemoryResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyStatsMatcher(String proxyStatsMatcher) {
        this.proxyStatsMatcher = proxyStatsMatcher;
        return this;
    }
    public String getProxyStatsMatcher() {
        return this.proxyStatsMatcher;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyCPUResourceLimit(String sidecarProxyCPUResourceLimit) {
        this.sidecarProxyCPUResourceLimit = sidecarProxyCPUResourceLimit;
        return this;
    }
    public String getSidecarProxyCPUResourceLimit() {
        return this.sidecarProxyCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyCPUResourceRequest(String sidecarProxyCPUResourceRequest) {
        this.sidecarProxyCPUResourceRequest = sidecarProxyCPUResourceRequest;
        return this;
    }
    public String getSidecarProxyCPUResourceRequest() {
        return this.sidecarProxyCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyMemoryResourceLimit(String sidecarProxyMemoryResourceLimit) {
        this.sidecarProxyMemoryResourceLimit = sidecarProxyMemoryResourceLimit;
        return this;
    }
    public String getSidecarProxyMemoryResourceLimit() {
        return this.sidecarProxyMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyMemoryResourceRequest(String sidecarProxyMemoryResourceRequest) {
        this.sidecarProxyMemoryResourceRequest = sidecarProxyMemoryResourceRequest;
        return this;
    }
    public String getSidecarProxyMemoryResourceRequest() {
        return this.sidecarProxyMemoryResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setTerminationDrainDuration(String terminationDrainDuration) {
        this.terminationDrainDuration = terminationDrainDuration;
        return this;
    }
    public String getTerminationDrainDuration() {
        return this.terminationDrainDuration;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setTracing(String tracing) {
        this.tracing = tracing;
        return this;
    }
    public String getTracing() {
        return this.tracing;
    }

}
