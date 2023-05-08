// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateNamespaceScopeSidecarConfigRequest extends TeaModel {
    /**
     * <p>The number of worker threads to run in Istio Proxy.</p>
     */
    @NameInMap("Concurrency")
    public Integer concurrency;

    /**
     * <p>The range of IP addresses that are allowed to access external services. (`global.proxy.excludelPRanges`)</p>
     */
    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    /**
     * <p>The port that the inbound traffic of the sidecar proxy does not pass through.</p>
     */
    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    /**
     * <p>The port that the outbound traffic of the sidecar proxy does not pass through.</p>
     */
    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    /**
     * <p>Specifies whether applications can be started only after Istio Proxy starts. Valid values:</p>
     * <br>
     * <p>*   `true`: Applications can be started only after Istio Proxy starts.</p>
     * <p>*   `false`: Applications can be started before Istio Proxy starts.</p>
     */
    @NameInMap("HoldApplicationUntilProxyStarts")
    public Boolean holdApplicationUntilProxyStarts;

    /**
     * <p>The range of IP addresses that are denied to access external services. (`global.proxy.includelPRanges`)</p>
     */
    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    /**
     * <p>The port that the inbound traffic of the sidecar proxy passes through.</p>
     */
    @NameInMap("IncludeInboundPorts")
    public String includeInboundPorts;

    /**
     * <p>The port that the outbound traffic of the sidecar proxy passes through.</p>
     */
    @NameInMap("IncludeOutboundPorts")
    public String includeOutboundPorts;

    /**
     * <p>The mode in which the sidecar proxy intercepts inbound traffic. Valid values:</p>
     * <br>
     * <p>*   `REDIRECT`: The sidecar proxy intercepts inbound traffic in the REDIRECT mode.</p>
     * <p>*   `TPROXY`: The sidecar proxy intercepts inbound traffic in the TPROXY mode.</p>
     */
    @NameInMap("InterceptionMode")
    public String interceptionMode;

    /**
     * <p>Specifies whether to enable the Domain Name System (DNS) proxy feature. Valid values:</p>
     * <br>
     * <p>*   `true`: The DNS proxy feature is enabled.</p>
     * <p>*   `false`: The DNS proxy feature is disabled.</p>
     */
    @NameInMap("IstioDNSProxyEnabled")
    public Boolean istioDNSProxyEnabled;

    /**
     * <p>The lifecycle of the sidecar proxy.</p>
     */
    @NameInMap("Lifecycle")
    public String lifecycle;

    /**
     * <p>The log level. Valid values: `info`, `debug`, `tracing`, and `error`.</p>
     */
    @NameInMap("LogLevel")
    public String logLevel;

    /**
     * <p>The namespace for which you want to update the sidecar proxy configurations.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The post-start parameters of Istio Proxy.</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The pre-close parameters of Istio Proxy.</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("ProxyInitAckSloCPUResourceLimit")
    public String proxyInitAckSloCPUResourceLimit;

    @NameInMap("ProxyInitAckSloCPUResourceRequest")
    public String proxyInitAckSloCPUResourceRequest;

    @NameInMap("ProxyInitAckSloMemoryResourceLimit")
    public String proxyInitAckSloMemoryResourceLimit;

    @NameInMap("ProxyInitAckSloMemoryResourceRequest")
    public String proxyInitAckSloMemoryResourceRequest;

    /**
     * <p>The maximum number of CPU cores that are available to the sidecar proxy init container.</p>
     */
    @NameInMap("ProxyInitCPUResourceLimit")
    public String proxyInitCPUResourceLimit;

    /**
     * <p>The minimum number of CPU cores that are requested by the sidecar proxy init container.</p>
     */
    @NameInMap("ProxyInitCPUResourceRequest")
    public String proxyInitCPUResourceRequest;

    /**
     * <p>The maximum size of memory that is available to the sidecar proxy init container.</p>
     */
    @NameInMap("ProxyInitMemoryResourceLimit")
    public String proxyInitMemoryResourceLimit;

    /**
     * <p>The minimum size of memory that is requested by the sidecar proxy init container.</p>
     */
    @NameInMap("ProxyInitMemoryResourceRequest")
    public String proxyInitMemoryResourceRequest;

    @NameInMap("ProxyMetadata")
    public String proxyMetadata;

    /**
     * <p>The monitoring metrics for data collected by Envoy proxies. The value is in the JSON format.</p>
     */
    @NameInMap("ProxyStatsMatcher")
    public String proxyStatsMatcher;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("SidecarProxyAckSloCPUResourceLimit")
    public String sidecarProxyAckSloCPUResourceLimit;

    @NameInMap("SidecarProxyAckSloCPUResourceRequest")
    public String sidecarProxyAckSloCPUResourceRequest;

    @NameInMap("SidecarProxyAckSloMemoryResourceLimit")
    public String sidecarProxyAckSloMemoryResourceLimit;

    @NameInMap("SidecarProxyAckSloMemoryResourceRequest")
    public String sidecarProxyAckSloMemoryResourceRequest;

    /**
     * <p>The maximum number of CPU cores that are available to the sidecar proxy container.</p>
     */
    @NameInMap("SidecarProxyCPUResourceLimit")
    public String sidecarProxyCPUResourceLimit;

    /**
     * <p>The minimum number of CPU cores that are requested by the sidecar proxy container.</p>
     */
    @NameInMap("SidecarProxyCPUResourceRequest")
    public String sidecarProxyCPUResourceRequest;

    /**
     * <p>The maximum size of memory that is available to the sidecar proxy container.</p>
     */
    @NameInMap("SidecarProxyMemoryResourceLimit")
    public String sidecarProxyMemoryResourceLimit;

    /**
     * <p>The minimum size of memory that is requested by the sidecar proxy container.</p>
     */
    @NameInMap("SidecarProxyMemoryResourceRequest")
    public String sidecarProxyMemoryResourceRequest;

    /**
     * <p>The maximum period of time that the sidecar proxy waits for a request to end.</p>
     */
    @NameInMap("TerminationDrainDuration")
    public String terminationDrainDuration;

    /**
     * <p>The custom configurations of Tracing Analysis. The configurations must be serialized into JSON strings. The configurations contain the following parameters:</p>
     * <br>
     * <p>*   `sampling`: The sampling rate, which is of the DOUBLE type.</p>
     * <br>
     * <p>*   `custom_tags`: The custom tags added to reported spans, which are of the MAP type. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:</p>
     * <br>
     * <p>    *   `literal`: The tag value is a fixed value in the JSON format. This tag must contain the `value` field that specifies a literal. Example: `{"value":"test"}`.</p>
     * <p>    *   `header`: The tag value is a request header in the JSON format. This tag must contain the `name` field and `defaultValue` field.The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: `{"name":"test","defaultValue":"test"}`.</p>
     * <p>    *   `environment`: The tag value is an environment variable in the JSON format. This tag must contain the `name` field and `defaultValue` field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: `{"name":"test","defaultValue":"test"}`.</p>
     */
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

    public UpdateNamespaceScopeSidecarConfigRequest setInterceptionMode(String interceptionMode) {
        this.interceptionMode = interceptionMode;
        return this;
    }
    public String getInterceptionMode() {
        return this.interceptionMode;
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

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitAckSloCPUResourceLimit(String proxyInitAckSloCPUResourceLimit) {
        this.proxyInitAckSloCPUResourceLimit = proxyInitAckSloCPUResourceLimit;
        return this;
    }
    public String getProxyInitAckSloCPUResourceLimit() {
        return this.proxyInitAckSloCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitAckSloCPUResourceRequest(String proxyInitAckSloCPUResourceRequest) {
        this.proxyInitAckSloCPUResourceRequest = proxyInitAckSloCPUResourceRequest;
        return this;
    }
    public String getProxyInitAckSloCPUResourceRequest() {
        return this.proxyInitAckSloCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitAckSloMemoryResourceLimit(String proxyInitAckSloMemoryResourceLimit) {
        this.proxyInitAckSloMemoryResourceLimit = proxyInitAckSloMemoryResourceLimit;
        return this;
    }
    public String getProxyInitAckSloMemoryResourceLimit() {
        return this.proxyInitAckSloMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setProxyInitAckSloMemoryResourceRequest(String proxyInitAckSloMemoryResourceRequest) {
        this.proxyInitAckSloMemoryResourceRequest = proxyInitAckSloMemoryResourceRequest;
        return this;
    }
    public String getProxyInitAckSloMemoryResourceRequest() {
        return this.proxyInitAckSloMemoryResourceRequest;
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

    public UpdateNamespaceScopeSidecarConfigRequest setProxyMetadata(String proxyMetadata) {
        this.proxyMetadata = proxyMetadata;
        return this;
    }
    public String getProxyMetadata() {
        return this.proxyMetadata;
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

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyAckSloCPUResourceLimit(String sidecarProxyAckSloCPUResourceLimit) {
        this.sidecarProxyAckSloCPUResourceLimit = sidecarProxyAckSloCPUResourceLimit;
        return this;
    }
    public String getSidecarProxyAckSloCPUResourceLimit() {
        return this.sidecarProxyAckSloCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyAckSloCPUResourceRequest(String sidecarProxyAckSloCPUResourceRequest) {
        this.sidecarProxyAckSloCPUResourceRequest = sidecarProxyAckSloCPUResourceRequest;
        return this;
    }
    public String getSidecarProxyAckSloCPUResourceRequest() {
        return this.sidecarProxyAckSloCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyAckSloMemoryResourceLimit(String sidecarProxyAckSloMemoryResourceLimit) {
        this.sidecarProxyAckSloMemoryResourceLimit = sidecarProxyAckSloMemoryResourceLimit;
        return this;
    }
    public String getSidecarProxyAckSloMemoryResourceLimit() {
        return this.sidecarProxyAckSloMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigRequest setSidecarProxyAckSloMemoryResourceRequest(String sidecarProxyAckSloMemoryResourceRequest) {
        this.sidecarProxyAckSloMemoryResourceRequest = sidecarProxyAckSloMemoryResourceRequest;
        return this;
    }
    public String getSidecarProxyAckSloMemoryResourceRequest() {
        return this.sidecarProxyAckSloMemoryResourceRequest;
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
