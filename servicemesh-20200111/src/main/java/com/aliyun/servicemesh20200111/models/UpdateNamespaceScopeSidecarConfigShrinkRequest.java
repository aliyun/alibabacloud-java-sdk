// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateNamespaceScopeSidecarConfigShrinkRequest extends TeaModel {
    /**
     * <p>The number of worker threads to run in Istio Proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Concurrency")
    public Integer concurrency;

    /**
     * <p>Specifies whether to enable the core dump feature for the sidecar proxy containers. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCoreDump")
    public Boolean enableCoreDump;

    /**
     * <p>The range of IP addresses that are allowed to access external services. (<code>global.proxy.excludelPRanges</code>)</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/12</p>
     */
    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    /**
     * <p>The port that the inbound traffic of the sidecar proxy does not pass through.</p>
     * 
     * <strong>example:</strong>
     * <p>82</p>
     */
    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    /**
     * <p>The port that the outbound traffic of the sidecar proxy does not pass through.</p>
     * 
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    /**
     * <p>Specifies whether applications can be started only after Istio Proxy starts. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Applications can be started only after Istio Proxy starts.</li>
     * <li><code>false</code>: Applications can be started before Istio Proxy starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HoldApplicationUntilProxyStarts")
    public Boolean holdApplicationUntilProxyStarts;

    /**
     * <p>The range of IP addresses that are denied to access external services. (<code>global.proxy.includelPRanges</code>)</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    /**
     * <p>The port that the inbound traffic of the sidecar proxy passes through.</p>
     * 
     * <strong>example:</strong>
     * <p>83</p>
     */
    @NameInMap("IncludeInboundPorts")
    public String includeInboundPorts;

    /**
     * <p>The port that the outbound traffic of the sidecar proxy passes through.</p>
     * 
     * <strong>example:</strong>
     * <p>84</p>
     */
    @NameInMap("IncludeOutboundPorts")
    public String includeOutboundPorts;

    /**
     * <p>The mode in which the sidecar proxy intercepts inbound traffic. Valid values:</p>
     * <ul>
     * <li><code>REDIRECT</code>: The sidecar proxy intercepts inbound traffic in the REDIRECT mode.</li>
     * <li><code>TPROXY</code>: The sidecar proxy intercepts inbound traffic in the TPROXY mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TPROXY</p>
     */
    @NameInMap("InterceptionMode")
    public String interceptionMode;

    /**
     * <p>Specifies whether to enable the Domain Name System (DNS) proxy feature. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The DNS proxy feature is enabled.</li>
     * <li><code>false</code>: The DNS proxy feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IstioDNSProxyEnabled")
    public Boolean istioDNSProxyEnabled;

    /**
     * <p>The lifecycle of the sidecar proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;postStart&quot;:{&quot;exec&quot;:{&quot;command&quot;:[&quot;pilot-agent&quot;,&quot;wait&quot;]}},&quot;preStop&quot;:{&quot;exec&quot;:{&quot;command&quot;:[&quot;/bin/sh&quot;,&quot;-c&quot;,&quot;sleep 15&quot;]}}}</p>
     */
    @NameInMap("Lifecycle")
    public String lifecycle;

    /**
     * <p>The log level. Valid values: <code>info</code>, <code>debug</code>, <code>tracing</code>, and <code>error</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>info</p>
     */
    @NameInMap("LogLevel")
    public String logLevel;

    /**
     * <p>The namespace for which you want to update the sidecar proxy configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The post-start parameters of Istio Proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;pilot-agent&quot;,&quot;wait&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The pre-close parameters of Istio Proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;/bin/sh&quot;,&quot;-c&quot;,&quot;sleep 15&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>Specifies whether to enable the privileged mode in the security context of the sidecar proxy containers. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the privileged mode. This means that the sidecar proxy containers run in privileged mode.</li>
     * <li><code>false</code>: does not enable the privileged mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Privileged")
    public Boolean privileged;

    /**
     * <p>The maximum number of reclaimed CPU cores provided by Container Service for Kubernetes (ACK) that are available to the istio-init container. Reclaimed resources, including CPU cores and memory, are resources that can be dynamically overcommitted. This configuration item is used to set the maximum number of CPU cores that are available to the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("ProxyInitAckSloCPUResourceLimit")
    public String proxyInitAckSloCPUResourceLimit;

    /**
     * <p>The minimum number of reclaimed CPU cores provided by ACK that the istio-init container requires at runtime. This configuration item is used to set the minimum number of reclaimed CPU cores for the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProxyInitAckSloCPUResourceRequest")
    public String proxyInitAckSloCPUResourceRequest;

    /**
     * <p>The maximum size of reclaimed memory resources provided by ACK that are available to the istio-init container. This configuration item is used to set the maximum size of memory that is available to the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2048Mi</p>
     */
    @NameInMap("ProxyInitAckSloMemoryResourceLimit")
    public String proxyInitAckSloMemoryResourceLimit;

    /**
     * <p>The minimum size of reclaimed memory provided by ACK that the istio-init container requires at runtime. This configuration item is used to set the minimum size of reclaimed memory for the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>128Mi</p>
     */
    @NameInMap("ProxyInitAckSloMemoryResourceRequest")
    public String proxyInitAckSloMemoryResourceRequest;

    /**
     * <p>The maximum number of CPU cores that are available to the sidecar proxy init container.</p>
     * 
     * <strong>example:</strong>
     * <p>2000 m</p>
     */
    @NameInMap("ProxyInitCPUResourceLimit")
    public String proxyInitCPUResourceLimit;

    /**
     * <p>The minimum number of CPU cores that are requested by the sidecar proxy init container.</p>
     * 
     * <strong>example:</strong>
     * <p>60 m</p>
     */
    @NameInMap("ProxyInitCPUResourceRequest")
    public String proxyInitCPUResourceRequest;

    /**
     * <p>The maximum size of memory that is available to the sidecar proxy init container.</p>
     * 
     * <strong>example:</strong>
     * <p>50 Mi</p>
     */
    @NameInMap("ProxyInitMemoryResourceLimit")
    public String proxyInitMemoryResourceLimit;

    /**
     * <p>The minimum size of memory that is requested by the sidecar proxy init container.</p>
     * 
     * <strong>example:</strong>
     * <p>30 Mi</p>
     */
    @NameInMap("ProxyInitMemoryResourceRequest")
    public String proxyInitMemoryResourceRequest;

    /**
     * <p>The environment variables that are added to a sidecar proxy. The environment variables are represented as JSON objects. The keys and values in the JSON objects represent the keys and values added to the environment variables of the sidecar proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EXIT_ON_ZERO_ACTIVE_CONNECTIONS&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("ProxyMetadata")
    public String proxyMetadata;

    /**
     * <p>The monitoring metrics for data collected by Envoy proxies. The value is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;inclusionPrefixes&quot;: [ &quot;cluster.outbound&quot;, &quot;cluster_manager&quot;, &quot;listener_manager&quot;, &quot;server&quot;, &quot;cluster.xds-grpc&quot; ], &quot;inclusionRegexps&quot;: [ &quot;listener.<em>.downstream_cx_total&quot;, &quot;listener.</em>.downstream_cx_active&quot; ] }</p>
     */
    @NameInMap("ProxyStatsMatcher")
    public String proxyStatsMatcher;

    /**
     * <p>The number of readiness check failures required before marking a sidecar proxy container as not ready.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadinessFailureThreshold")
    public Integer readinessFailureThreshold;

    /**
     * <p>The amount of time to wait before the first readiness check of a sidecar proxy container is performed. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReadinessInitialDelaySeconds")
    public Integer readinessInitialDelaySeconds;

    /**
     * <p>The interval between two readiness checks of a sidecar proxy container. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReadinessPeriodSeconds")
    public Integer readinessPeriodSeconds;

    /**
     * <p>Indicates the runtime parameters of Envoy proxy processes in the sidecar proxy container. This parameter is a serialized JSON string. The keys and values of a JSON object are the keys and the values of a Envoy Runtime Parameter respectively.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>global_downstream_max_connections: indicates that the limits on the number of connections from downstream to Envoy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;overload.global_downstream_max_connections&quot;:&quot;65536&quot;}</p>
     */
    @NameInMap("RuntimeValues")
    public String runtimeValues;

    /**
     * <p>Specifies whether to enable Shared Memory Communications over Remote Direct Memory Access (SMC-R) optimization. The SMC-R optimization feature uses Alibaba Cloud Linux 3 and elastic remote direct memory access (eRDMA) network devices, which optimizes cross-node communication.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SMCEnabled")
    public Boolean SMCEnabled;

    @NameInMap("ScaledSidecarResource")
    public String scaledSidecarResourceShrink;

    /**
     * <p>The ID of the ASM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca04bc38979214bf2882be79d39b4****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The maximum number of reclaimed CPU cores provided by ACK that are available to the sidecar proxy container. This configuration item is used to set the maximum number of CPU cores that are available to the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("SidecarProxyAckSloCPUResourceLimit")
    public String sidecarProxyAckSloCPUResourceLimit;

    /**
     * <p>The minimum number of reclaimed CPU cores provided by ACK that the sidecar proxy container requires at runtime. This configuration item is used to set the minimum number of reclaimed CPU cores for the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SidecarProxyAckSloCPUResourceRequest")
    public String sidecarProxyAckSloCPUResourceRequest;

    /**
     * <p>The maximum size of reclaimed memory resources provided by ACK that are available to the sidecar proxy container. This configuration item is used to set the maximum size of memory that is available to the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2048Mi</p>
     */
    @NameInMap("SidecarProxyAckSloMemoryResourceLimit")
    public String sidecarProxyAckSloMemoryResourceLimit;

    /**
     * <p>The minimum size of reclaimed memory provided by ACK that the sidecar proxy container requires at runtime. This configuration item is used to set the minimum size of reclaimed memory for the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>128Mi</p>
     */
    @NameInMap("SidecarProxyAckSloMemoryResourceRequest")
    public String sidecarProxyAckSloMemoryResourceRequest;

    /**
     * <p>The maximum number of CPU cores that are available to the sidecar proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>2000 m</p>
     */
    @NameInMap("SidecarProxyCPUResourceLimit")
    public String sidecarProxyCPUResourceLimit;

    /**
     * <p>The minimum number of CPU cores that are requested by the sidecar proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>60 m</p>
     */
    @NameInMap("SidecarProxyCPUResourceRequest")
    public String sidecarProxyCPUResourceRequest;

    /**
     * <p>The maximum size of memory that is available to the sidecar proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>50 Mi</p>
     */
    @NameInMap("SidecarProxyMemoryResourceLimit")
    public String sidecarProxyMemoryResourceLimit;

    /**
     * <p>The minimum size of memory that is requested by the sidecar proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>30 Mi</p>
     */
    @NameInMap("SidecarProxyMemoryResourceRequest")
    public String sidecarProxyMemoryResourceRequest;

    /**
     * <p>The maximum period of time that the sidecar proxy waits for a request to end.</p>
     * 
     * <strong>example:</strong>
     * <p>6s</p>
     */
    @NameInMap("TerminationDrainDuration")
    public String terminationDrainDuration;

    /**
     * <p>The custom configurations of Tracing Analysis. The configurations must be serialized into JSON strings. The configurations contain the following parameters:</p>
     * <ul>
     * <li><p><code>sampling</code>: The sampling rate, which is of the DOUBLE type.</p>
     * </li>
     * <li><p><code>custom_tags</code>: The custom tags added to reported spans, which are of the MAP type. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:</p>
     * <ul>
     * <li><code>literal</code>: The tag value is a fixed value in the JSON format. This tag must contain the <code>value</code> field that specifies a literal. Example: <code>{&quot;value&quot;:&quot;test&quot;}</code>.</li>
     * <li><code>header</code>: The tag value is a request header in the JSON format. This tag must contain the <code>name</code> field and <code>defaultValue</code> field.The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: <code>{&quot;name&quot;:&quot;test&quot;,&quot;defaultValue&quot;:&quot;test&quot;}</code>.</li>
     * <li><code>environment</code>: The tag value is an environment variable in the JSON format. This tag must contain the <code>name</code> field and <code>defaultValue</code> field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: <code>{&quot;name&quot;:&quot;test&quot;,&quot;defaultValue&quot;:&quot;test&quot;}</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sampling&quot;:99.8,&quot;custom_tags&quot;:{&quot;test&quot;:{&quot;literal&quot;:{&quot;value&quot;:&quot;testnamespace&quot;}}}}</p>
     */
    @NameInMap("Tracing")
    public String tracing;

    public static UpdateNamespaceScopeSidecarConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceScopeSidecarConfigShrinkRequest self = new UpdateNamespaceScopeSidecarConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setEnableCoreDump(Boolean enableCoreDump) {
        this.enableCoreDump = enableCoreDump;
        return this;
    }
    public Boolean getEnableCoreDump() {
        return this.enableCoreDump;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setHoldApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
        this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
        return this;
    }
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.holdApplicationUntilProxyStarts;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setIncludeInboundPorts(String includeInboundPorts) {
        this.includeInboundPorts = includeInboundPorts;
        return this;
    }
    public String getIncludeInboundPorts() {
        return this.includeInboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setIncludeOutboundPorts(String includeOutboundPorts) {
        this.includeOutboundPorts = includeOutboundPorts;
        return this;
    }
    public String getIncludeOutboundPorts() {
        return this.includeOutboundPorts;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setInterceptionMode(String interceptionMode) {
        this.interceptionMode = interceptionMode;
        return this;
    }
    public String getInterceptionMode() {
        return this.interceptionMode;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setIstioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
        this.istioDNSProxyEnabled = istioDNSProxyEnabled;
        return this;
    }
    public Boolean getIstioDNSProxyEnabled() {
        return this.istioDNSProxyEnabled;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitAckSloCPUResourceLimit(String proxyInitAckSloCPUResourceLimit) {
        this.proxyInitAckSloCPUResourceLimit = proxyInitAckSloCPUResourceLimit;
        return this;
    }
    public String getProxyInitAckSloCPUResourceLimit() {
        return this.proxyInitAckSloCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitAckSloCPUResourceRequest(String proxyInitAckSloCPUResourceRequest) {
        this.proxyInitAckSloCPUResourceRequest = proxyInitAckSloCPUResourceRequest;
        return this;
    }
    public String getProxyInitAckSloCPUResourceRequest() {
        return this.proxyInitAckSloCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitAckSloMemoryResourceLimit(String proxyInitAckSloMemoryResourceLimit) {
        this.proxyInitAckSloMemoryResourceLimit = proxyInitAckSloMemoryResourceLimit;
        return this;
    }
    public String getProxyInitAckSloMemoryResourceLimit() {
        return this.proxyInitAckSloMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitAckSloMemoryResourceRequest(String proxyInitAckSloMemoryResourceRequest) {
        this.proxyInitAckSloMemoryResourceRequest = proxyInitAckSloMemoryResourceRequest;
        return this;
    }
    public String getProxyInitAckSloMemoryResourceRequest() {
        return this.proxyInitAckSloMemoryResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
        this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
        return this;
    }
    public String getProxyInitCPUResourceLimit() {
        return this.proxyInitCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
        this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
        return this;
    }
    public String getProxyInitCPUResourceRequest() {
        return this.proxyInitCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
        this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
        return this;
    }
    public String getProxyInitMemoryResourceLimit() {
        return this.proxyInitMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
        this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
        return this;
    }
    public String getProxyInitMemoryResourceRequest() {
        return this.proxyInitMemoryResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyMetadata(String proxyMetadata) {
        this.proxyMetadata = proxyMetadata;
        return this;
    }
    public String getProxyMetadata() {
        return this.proxyMetadata;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setProxyStatsMatcher(String proxyStatsMatcher) {
        this.proxyStatsMatcher = proxyStatsMatcher;
        return this;
    }
    public String getProxyStatsMatcher() {
        return this.proxyStatsMatcher;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setReadinessFailureThreshold(Integer readinessFailureThreshold) {
        this.readinessFailureThreshold = readinessFailureThreshold;
        return this;
    }
    public Integer getReadinessFailureThreshold() {
        return this.readinessFailureThreshold;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setReadinessInitialDelaySeconds(Integer readinessInitialDelaySeconds) {
        this.readinessInitialDelaySeconds = readinessInitialDelaySeconds;
        return this;
    }
    public Integer getReadinessInitialDelaySeconds() {
        return this.readinessInitialDelaySeconds;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setReadinessPeriodSeconds(Integer readinessPeriodSeconds) {
        this.readinessPeriodSeconds = readinessPeriodSeconds;
        return this;
    }
    public Integer getReadinessPeriodSeconds() {
        return this.readinessPeriodSeconds;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setRuntimeValues(String runtimeValues) {
        this.runtimeValues = runtimeValues;
        return this;
    }
    public String getRuntimeValues() {
        return this.runtimeValues;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSMCEnabled(Boolean SMCEnabled) {
        this.SMCEnabled = SMCEnabled;
        return this;
    }
    public Boolean getSMCEnabled() {
        return this.SMCEnabled;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setScaledSidecarResourceShrink(String scaledSidecarResourceShrink) {
        this.scaledSidecarResourceShrink = scaledSidecarResourceShrink;
        return this;
    }
    public String getScaledSidecarResourceShrink() {
        return this.scaledSidecarResourceShrink;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyAckSloCPUResourceLimit(String sidecarProxyAckSloCPUResourceLimit) {
        this.sidecarProxyAckSloCPUResourceLimit = sidecarProxyAckSloCPUResourceLimit;
        return this;
    }
    public String getSidecarProxyAckSloCPUResourceLimit() {
        return this.sidecarProxyAckSloCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyAckSloCPUResourceRequest(String sidecarProxyAckSloCPUResourceRequest) {
        this.sidecarProxyAckSloCPUResourceRequest = sidecarProxyAckSloCPUResourceRequest;
        return this;
    }
    public String getSidecarProxyAckSloCPUResourceRequest() {
        return this.sidecarProxyAckSloCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyAckSloMemoryResourceLimit(String sidecarProxyAckSloMemoryResourceLimit) {
        this.sidecarProxyAckSloMemoryResourceLimit = sidecarProxyAckSloMemoryResourceLimit;
        return this;
    }
    public String getSidecarProxyAckSloMemoryResourceLimit() {
        return this.sidecarProxyAckSloMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyAckSloMemoryResourceRequest(String sidecarProxyAckSloMemoryResourceRequest) {
        this.sidecarProxyAckSloMemoryResourceRequest = sidecarProxyAckSloMemoryResourceRequest;
        return this;
    }
    public String getSidecarProxyAckSloMemoryResourceRequest() {
        return this.sidecarProxyAckSloMemoryResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyCPUResourceLimit(String sidecarProxyCPUResourceLimit) {
        this.sidecarProxyCPUResourceLimit = sidecarProxyCPUResourceLimit;
        return this;
    }
    public String getSidecarProxyCPUResourceLimit() {
        return this.sidecarProxyCPUResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyCPUResourceRequest(String sidecarProxyCPUResourceRequest) {
        this.sidecarProxyCPUResourceRequest = sidecarProxyCPUResourceRequest;
        return this;
    }
    public String getSidecarProxyCPUResourceRequest() {
        return this.sidecarProxyCPUResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyMemoryResourceLimit(String sidecarProxyMemoryResourceLimit) {
        this.sidecarProxyMemoryResourceLimit = sidecarProxyMemoryResourceLimit;
        return this;
    }
    public String getSidecarProxyMemoryResourceLimit() {
        return this.sidecarProxyMemoryResourceLimit;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setSidecarProxyMemoryResourceRequest(String sidecarProxyMemoryResourceRequest) {
        this.sidecarProxyMemoryResourceRequest = sidecarProxyMemoryResourceRequest;
        return this;
    }
    public String getSidecarProxyMemoryResourceRequest() {
        return this.sidecarProxyMemoryResourceRequest;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setTerminationDrainDuration(String terminationDrainDuration) {
        this.terminationDrainDuration = terminationDrainDuration;
        return this;
    }
    public String getTerminationDrainDuration() {
        return this.terminationDrainDuration;
    }

    public UpdateNamespaceScopeSidecarConfigShrinkRequest setTracing(String tracing) {
        this.tracing = tracing;
        return this;
    }
    public String getTracing() {
        return this.tracing;
    }

}
