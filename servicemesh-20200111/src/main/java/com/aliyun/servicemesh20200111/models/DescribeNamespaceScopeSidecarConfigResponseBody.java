// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNamespaceScopeSidecarConfigResponseBody extends TeaModel {
    /**
     * <p>The namespace-level sidecar proxy configurations.</p>
     */
    @NameInMap("ConfigPatches")
    public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches configPatches;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNamespaceScopeSidecarConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceScopeSidecarConfigResponseBody self = new DescribeNamespaceScopeSidecarConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceScopeSidecarConfigResponseBody setConfigPatches(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches configPatches) {
        this.configPatches = configPatches;
        return this;
    }
    public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches getConfigPatches() {
        return this.configPatches;
    }

    public DescribeNamespaceScopeSidecarConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher extends TeaModel {
        /**
         * <p>The prefixes of the custom Envoy statistics that are reported by the sidecar proxy.</p>
         */
        @NameInMap("InclusionPrefixes")
        public java.util.List<String> inclusionPrefixes;

        /**
         * <p>The regular expressions for specifying the custom Envoy statistics that are reported by the sidecar proxy.</p>
         */
        @NameInMap("InclusionRegexps")
        public java.util.List<String> inclusionRegexps;

        /**
         * <p>The suffixes of the custom Envoy statistics that are reported by the sidecar proxy.</p>
         */
        @NameInMap("InclusionSuffixes")
        public java.util.List<String> inclusionSuffixes;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher setInclusionPrefixes(java.util.List<String> inclusionPrefixes) {
            this.inclusionPrefixes = inclusionPrefixes;
            return this;
        }
        public java.util.List<String> getInclusionPrefixes() {
            return this.inclusionPrefixes;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher setInclusionRegexps(java.util.List<String> inclusionRegexps) {
            this.inclusionRegexps = inclusionRegexps;
            return this;
        }
        public java.util.List<String> getInclusionRegexps() {
            return this.inclusionRegexps;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher setInclusionSuffixes(java.util.List<String> inclusionSuffixes) {
            this.inclusionSuffixes = inclusionSuffixes;
            return this;
        }
        public java.util.List<String> getInclusionSuffixes() {
            return this.inclusionSuffixes;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource extends TeaModel {
        @NameInMap("Limits")
        public java.util.Map<String, String> limits;

        @NameInMap("Requests")
        public java.util.Map<String, String> requests;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource setLimits(java.util.Map<String, String> limits) {
            this.limits = limits;
            return this;
        }
        public java.util.Map<String, String> getLimits() {
            return this.limits;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource setRequests(java.util.Map<String, String> requests) {
            this.requests = requests;
            return this;
        }
        public java.util.Map<String, String> getRequests() {
            return this.requests;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource extends TeaModel {
        @NameInMap("Limits")
        public java.util.Map<String, String> limits;

        @NameInMap("Requests")
        public java.util.Map<String, String> requests;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource setLimits(java.util.Map<String, String> limits) {
            this.limits = limits;
            return this;
        }
        public java.util.Map<String, String> getLimits() {
            return this.limits;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource setRequests(java.util.Map<String, String> requests) {
            this.requests = requests;
            return this;
        }
        public java.util.Map<String, String> getRequests() {
            return this.requests;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit extends TeaModel {
        /**
         * <p>The maximum number of CPU cores.</p>
         */
        @NameInMap("ResourceCPULimit")
        public String resourceCPULimit;

        /**
         * <p>The maximum size of the memory.</p>
         */
        @NameInMap("ResourceMemoryLimit")
        public String resourceMemoryLimit;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit setResourceCPULimit(String resourceCPULimit) {
            this.resourceCPULimit = resourceCPULimit;
            return this;
        }
        public String getResourceCPULimit() {
            return this.resourceCPULimit;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit setResourceMemoryLimit(String resourceMemoryLimit) {
            this.resourceMemoryLimit = resourceMemoryLimit;
            return this;
        }
        public String getResourceMemoryLimit() {
            return this.resourceMemoryLimit;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest extends TeaModel {
        /**
         * <p>The minimum number of CPU cores.</p>
         */
        @NameInMap("ResourceCPURequest")
        public String resourceCPURequest;

        /**
         * <p>The minimum size of the memory.</p>
         */
        @NameInMap("ResourceMemoryRequest")
        public String resourceMemoryRequest;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest setResourceCPURequest(String resourceCPURequest) {
            this.resourceCPURequest = resourceCPURequest;
            return this;
        }
        public String getResourceCPURequest() {
            return this.resourceCPURequest;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest setResourceMemoryRequest(String resourceMemoryRequest) {
            this.resourceMemoryRequest = resourceMemoryRequest;
            return this;
        }
        public String getResourceMemoryRequest() {
            return this.resourceMemoryRequest;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit extends TeaModel {
        /**
         * <p>The maximum number of CPU cores.</p>
         */
        @NameInMap("ResourceCPULimit")
        public String resourceCPULimit;

        /**
         * <p>The maximum size of the memory.</p>
         */
        @NameInMap("ResourceMemoryLimit")
        public String resourceMemoryLimit;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit setResourceCPULimit(String resourceCPULimit) {
            this.resourceCPULimit = resourceCPULimit;
            return this;
        }
        public String getResourceCPULimit() {
            return this.resourceCPULimit;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit setResourceMemoryLimit(String resourceMemoryLimit) {
            this.resourceMemoryLimit = resourceMemoryLimit;
            return this;
        }
        public String getResourceMemoryLimit() {
            return this.resourceMemoryLimit;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest extends TeaModel {
        /**
         * <p>The minimum number of CPU cores.</p>
         */
        @NameInMap("ResourceCPURequest")
        public String resourceCPURequest;

        /**
         * <p>The minimum size of the memory.</p>
         */
        @NameInMap("ResourceMemoryRequest")
        public String resourceMemoryRequest;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest setResourceCPURequest(String resourceCPURequest) {
            this.resourceCPURequest = resourceCPURequest;
            return this;
        }
        public String getResourceCPURequest() {
            return this.resourceCPURequest;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest setResourceMemoryRequest(String resourceMemoryRequest) {
            this.resourceMemoryRequest = resourceMemoryRequest;
            return this;
        }
        public String getResourceMemoryRequest() {
            return this.resourceMemoryRequest;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing extends TeaModel {
        /**
         * <p>The custom tags added to reported spans. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:</p>
         * <br>
         * <p>*   `literal`: The tag value is a fixed value in the JSON format. This tag must contain the `value` field that specifies a literal. Example: `{"value":"test"}`.</p>
         * <p>*   `header`: The tag value is a request header in the JSON format. This tag must contain the `name` field and the `defaultValue` field. The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: `{"name":"test","defaultValue":"test"}`.</p>
         * <p>*   `environment`: The tag value is an environment variable in the JSON format. This tag must contain the `name` field and the `defaultValue` field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: `{"name":"test","defaultValue":"test"}`.</p>
         */
        @NameInMap("CustomTags")
        public java.util.Map<String, ?> customTags;

        /**
         * <p>The maximum tag length.</p>
         */
        @NameInMap("MaxPathTagLength")
        public Integer maxPathTagLength;

        /**
         * <p>The sampling rate.</p>
         */
        @NameInMap("Sampling")
        public Double sampling;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing setCustomTags(java.util.Map<String, ?> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.Map<String, ?> getCustomTags() {
            return this.customTags;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing setMaxPathTagLength(Integer maxPathTagLength) {
            this.maxPathTagLength = maxPathTagLength;
            return this;
        }
        public Integer getMaxPathTagLength() {
            return this.maxPathTagLength;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing setSampling(Double sampling) {
            this.sampling = sampling;
            return this;
        }
        public Double getSampling() {
            return this.sampling;
        }

    }

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches extends TeaModel {
        /**
         * <p>The number of worker threads to run in the istio-proxy container.</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
         */
        @NameInMap("ExcludeInboundPorts")
        public String excludeInboundPorts;

        /**
         * <p>The outbound IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
         */
        @NameInMap("ExcludeOutboundIPRanges")
        public String excludeOutboundIPRanges;

        /**
         * <p>The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
         */
        @NameInMap("ExcludeOutboundPorts")
        public String excludeOutboundPorts;

        /**
         * <p>Indicates whether applications can be started only after the istio-proxy container starts. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   false</p>
         */
        @NameInMap("HoldApplicationUntilProxyStarts")
        public Boolean holdApplicationUntilProxyStarts;

        /**
         * <p>The inbound ports for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
         */
        @NameInMap("IncludeInboundPorts")
        public String includeInboundPorts;

        /**
         * <p>The outbound IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
         */
        @NameInMap("IncludeOutboundIPRanges")
        public String includeOutboundIPRanges;

        /**
         * <p>The outbound ports for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
         */
        @NameInMap("IncludeOutboundPorts")
        public String includeOutboundPorts;

        /**
         * <p>The mode in which the sidecar proxy intercepts inbound traffic. Valid values:</p>
         * <br>
         * <p>*   `REDIRECT` (default): In this mode, source IP addresses are lost during traffic redirection to the sidecar proxy.</p>
         * <p>*   `TPROXY`: In this mode, both the source and destination IP addresses and ports are preserved.</p>
         */
        @NameInMap("InterceptionMode")
        public String interceptionMode;

        /**
         * <p>Indicates whether the Domain Name System (DNS) proxy feature is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         */
        @NameInMap("IstioDNSProxyEnabled")
        public Boolean istioDNSProxyEnabled;

        /**
         * <p>The JSON string that describes the lifecycle of the sidecar proxy.</p>
         */
        @NameInMap("LifecycleStr")
        public String lifecycleStr;

        /**
         * <p>The log level. Valid values: `info`, `debug`, `trace`, and `error`.</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("ProxyMetadata")
        public java.util.Map<String, String> proxyMetadata;

        /**
         * <p>The custom Envoy statistics that are reported by the sidecar proxy.</p>
         */
        @NameInMap("ProxyStatsMatcher")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher proxyStatsMatcher;

        @NameInMap("SidecarProxyAckSloResource")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource sidecarProxyAckSloResource;

        @NameInMap("SidecarProxyInitAckSloResource")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource sidecarProxyInitAckSloResource;

        /**
         * <p>The maximum size of resources that are available to the istio-init container in the pod into which the sidecar proxy is injected. The istio-init container is used in this topic.</p>
         */
        @NameInMap("SidecarProxyInitResourceLimit")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        /**
         * <p>The minimum size of resources that are required by the istio-init container.</p>
         */
        @NameInMap("SidecarProxyInitResourceRequest")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        /**
         * <p>The maximum size of resources that are available to the sidecar proxy container.</p>
         */
        @NameInMap("SidecarProxyResourceLimit")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit sidecarProxyResourceLimit;

        /**
         * <p>The minimum size of resources that are required by the sidecar proxy container.</p>
         */
        @NameInMap("SidecarProxyResourceRequest")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest sidecarProxyResourceRequest;

        /**
         * <p>The maximum period of time allowed for connections to complete on sidecar proxy shutdown.</p>
         */
        @NameInMap("TerminationDrainDuration")
        public String terminationDrainDuration;

        /**
         * <p>The custom configurations of Tracing Analysis.</p>
         */
        @NameInMap("Tracing")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing tracing;

        public static DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches self = new DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setExcludeInboundPorts(String excludeInboundPorts) {
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }
        public String getExcludeInboundPorts() {
            return this.excludeInboundPorts;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setExcludeOutboundIPRanges(String excludeOutboundIPRanges) {
            this.excludeOutboundIPRanges = excludeOutboundIPRanges;
            return this;
        }
        public String getExcludeOutboundIPRanges() {
            return this.excludeOutboundIPRanges;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setExcludeOutboundPorts(String excludeOutboundPorts) {
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }
        public String getExcludeOutboundPorts() {
            return this.excludeOutboundPorts;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setHoldApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
            this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
            return this;
        }
        public Boolean getHoldApplicationUntilProxyStarts() {
            return this.holdApplicationUntilProxyStarts;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setIncludeInboundPorts(String includeInboundPorts) {
            this.includeInboundPorts = includeInboundPorts;
            return this;
        }
        public String getIncludeInboundPorts() {
            return this.includeInboundPorts;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setIncludeOutboundIPRanges(String includeOutboundIPRanges) {
            this.includeOutboundIPRanges = includeOutboundIPRanges;
            return this;
        }
        public String getIncludeOutboundIPRanges() {
            return this.includeOutboundIPRanges;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setIncludeOutboundPorts(String includeOutboundPorts) {
            this.includeOutboundPorts = includeOutboundPorts;
            return this;
        }
        public String getIncludeOutboundPorts() {
            return this.includeOutboundPorts;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setInterceptionMode(String interceptionMode) {
            this.interceptionMode = interceptionMode;
            return this;
        }
        public String getInterceptionMode() {
            return this.interceptionMode;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setIstioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
            this.istioDNSProxyEnabled = istioDNSProxyEnabled;
            return this;
        }
        public Boolean getIstioDNSProxyEnabled() {
            return this.istioDNSProxyEnabled;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setLifecycleStr(String lifecycleStr) {
            this.lifecycleStr = lifecycleStr;
            return this;
        }
        public String getLifecycleStr() {
            return this.lifecycleStr;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setProxyMetadata(java.util.Map<String, String> proxyMetadata) {
            this.proxyMetadata = proxyMetadata;
            return this;
        }
        public java.util.Map<String, String> getProxyMetadata() {
            return this.proxyMetadata;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setProxyStatsMatcher(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher proxyStatsMatcher) {
            this.proxyStatsMatcher = proxyStatsMatcher;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher getProxyStatsMatcher() {
            return this.proxyStatsMatcher;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setSidecarProxyAckSloResource(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource sidecarProxyAckSloResource) {
            this.sidecarProxyAckSloResource = sidecarProxyAckSloResource;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyAckSloResource getSidecarProxyAckSloResource() {
            return this.sidecarProxyAckSloResource;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setSidecarProxyInitAckSloResource(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource sidecarProxyInitAckSloResource) {
            this.sidecarProxyInitAckSloResource = sidecarProxyInitAckSloResource;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitAckSloResource getSidecarProxyInitAckSloResource() {
            return this.sidecarProxyInitAckSloResource;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setSidecarProxyInitResourceLimit(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
            this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit getSidecarProxyInitResourceLimit() {
            return this.sidecarProxyInitResourceLimit;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setSidecarProxyInitResourceRequest(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
            this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest getSidecarProxyInitResourceRequest() {
            return this.sidecarProxyInitResourceRequest;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setSidecarProxyResourceLimit(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit sidecarProxyResourceLimit) {
            this.sidecarProxyResourceLimit = sidecarProxyResourceLimit;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit getSidecarProxyResourceLimit() {
            return this.sidecarProxyResourceLimit;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setSidecarProxyResourceRequest(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest sidecarProxyResourceRequest) {
            this.sidecarProxyResourceRequest = sidecarProxyResourceRequest;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest getSidecarProxyResourceRequest() {
            return this.sidecarProxyResourceRequest;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setTerminationDrainDuration(String terminationDrainDuration) {
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }
        public String getTerminationDrainDuration() {
            return this.terminationDrainDuration;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setTracing(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing tracing) {
            this.tracing = tracing;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesTracing getTracing() {
            return this.tracing;
        }

    }

}
