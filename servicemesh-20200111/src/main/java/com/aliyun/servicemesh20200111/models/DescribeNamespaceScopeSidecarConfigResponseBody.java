// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNamespaceScopeSidecarConfigResponseBody extends TeaModel {
    @NameInMap("ConfigPatches")
    public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches configPatches;

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
        @NameInMap("InclusionPrefixes")
        public java.util.List<String> inclusionPrefixes;

        @NameInMap("InclusionRegexps")
        public java.util.List<String> inclusionRegexps;

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

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit extends TeaModel {
        @NameInMap("ResourceCPULimit")
        public String resourceCPULimit;

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
        @NameInMap("ResourceCPURequest")
        public String resourceCPURequest;

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
        @NameInMap("ResourceCPULimit")
        public String resourceCPULimit;

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
        @NameInMap("ResourceCPURequest")
        public String resourceCPURequest;

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

    public static class DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches extends TeaModel {
        @NameInMap("Concurrency")
        public Integer concurrency;

        @NameInMap("ExcludeInboundPorts")
        public String excludeInboundPorts;

        @NameInMap("ExcludeOutboundIPRanges")
        public String excludeOutboundIPRanges;

        @NameInMap("ExcludeOutboundPorts")
        public String excludeOutboundPorts;

        @NameInMap("HoldApplicationUntilProxyStarts")
        public Boolean holdApplicationUntilProxyStarts;

        @NameInMap("IncludeInboundPorts")
        public String includeInboundPorts;

        @NameInMap("IncludeOutboundIPRanges")
        public String includeOutboundIPRanges;

        @NameInMap("IncludeOutboundPorts")
        public String includeOutboundPorts;

        @NameInMap("IstioDNSProxyEnabled")
        public Boolean istioDNSProxyEnabled;

        @NameInMap("LifecycleStr")
        public String lifecycleStr;

        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("ProxyStatsMatcher")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher proxyStatsMatcher;

        @NameInMap("SidecarProxyInitResourceLimit")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        @NameInMap("SidecarProxyInitResourceRequest")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        @NameInMap("SidecarProxyResourceLimit")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceLimit sidecarProxyResourceLimit;

        @NameInMap("SidecarProxyResourceRequest")
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesSidecarProxyResourceRequest sidecarProxyResourceRequest;

        @NameInMap("TerminationDrainDuration")
        public String terminationDrainDuration;

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

        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatches setProxyStatsMatcher(DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher proxyStatsMatcher) {
            this.proxyStatsMatcher = proxyStatsMatcher;
            return this;
        }
        public DescribeNamespaceScopeSidecarConfigResponseBodyConfigPatchesProxyStatsMatcher getProxyStatsMatcher() {
            return this.proxyStatsMatcher;
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

    }

}
