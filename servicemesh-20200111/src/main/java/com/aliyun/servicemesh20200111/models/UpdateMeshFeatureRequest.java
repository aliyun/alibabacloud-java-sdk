// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable access log collection. Valid values:</p>
     * <br>
     * <p>*   `true`: enables access log collection.</p>
     * <p>*   `false`: disables access log collection.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogEnabled")
    public Boolean accessLogEnabled;

    /**
     * <p>Specifies whether to enable access logging. Valid values:</p>
     * <br>
     * <p>*   `""`: disables access logging.</p>
     * <p>*   `/dev/stdout`: enables access logging. Access logs are written to /dev/stdout.</p>
     */
    @NameInMap("AccessLogFile")
    public String accessLogFile;

    /**
     * <p>The custom format of access logs. To set this parameter, make sure that you have enabled access log collection. The value must be a JSON string. The following key names must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.</p>
     */
    @NameInMap("AccessLogFormat")
    public String accessLogFormat;

    /**
     * <p>The retention period for the access logs of the sidecar proxy. Unit: day. The logs are collected by using Log Service. For example, `30` indicates 30 days.</p>
     */
    @NameInMap("AccessLogGatewayLifecycle")
    public Integer accessLogGatewayLifecycle;

    /**
     * <p>The custom project on which the Log Service collects logs.</p>
     */
    @NameInMap("AccessLogProject")
    public String accessLogProject;

    /**
     * <p>Specifies whether to enable gRPC Access Log Service (ALS) for Envoy. Valid values:</p>
     * <br>
     * <p>*   `true`: enables gRPC ALS for Envoy.</p>
     * <p>*   `false`: disables gRPC ALS for Envoy.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogServiceEnabled")
    public Boolean accessLogServiceEnabled;

    /**
     * <p>The endpoint of gRPC ALS for Envoy.</p>
     */
    @NameInMap("AccessLogServiceHost")
    public String accessLogServiceHost;

    /**
     * <p>The port of gRPC ALS for Envoy.</p>
     */
    @NameInMap("AccessLogServicePort")
    public Integer accessLogServicePort;

    /**
     * <p>Specifies whether to enable automatic diagnostics for the ASM instance. If you enable this feature, the ASM instance is automatically diagnosed when you modify Istio resources in the ASM instance.</p>
     */
    @NameInMap("AccessLogSidecarLifecycle")
    public Integer accessLogSidecarLifecycle;

    /**
     * <p>The name of the Log Service project that is used for mesh audit.</p>
     * <br>
     * <p>Default value: `mesh-log-{ASM instance ID}`.</p>
     */
    @NameInMap("AuditProject")
    public String auditProject;

    /**
     * <p>Specifies whether to enable automatic sidecar proxy injection by using pod annotations. Valid values:</p>
     * <br>
     * <p>*   `true`: enables automatic sidecar proxy injection by using pod annotations.</p>
     * <p>*   `false`: disables automatic sidecar proxy injection by using pod annotations.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AutoInjectionPolicyEnabled")
    public Boolean autoInjectionPolicyEnabled;

    /**
     * <p>Specifies whether to use the Kubernetes API of clusters on the data plane to access Istio resources. To use this feature, the version of the ASM instance must be V1.9.7.93 or later.</p>
     */
    @NameInMap("CRAggregationEnabled")
    public Boolean CRAggregationEnabled;

    /**
     * <p>Specifies whether to enable the feature of controlling the OPA injection scope. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the feature.</p>
     * <p>*   `false`: disables the feature.</p>
     */
    @NameInMap("ClusterSpec")
    public String clusterSpec;

    /**
     * <p>Specifies whether to enable the Container Network Interface (CNI) plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the CNI plug-in.</p>
     * <p>*   `false`: disables the CNI plug-in.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CniEnabled")
    public Boolean cniEnabled;

    /**
     * <p>The namespaces to be excluded for the CNI plug-in.</p>
     */
    @NameInMap("CniExcludeNamespaces")
    public String cniExcludeNamespaces;

    /**
     * <p>Specifies whether to delay application container startup until the sidecar proxy container is started in a pod.</p>
     */
    @NameInMap("Concurrency")
    public Integer concurrency;

    /**
     * <p>Specifies whether to enable the external service registry. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the external service registry.</p>
     * <p>*   `false`: disables the external service registry.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ConfigSourceEnabled")
    public Boolean configSourceEnabled;

    /**
     * <p>The instance ID of the Nacos registry.</p>
     */
    @NameInMap("ConfigSourceNacosID")
    public String configSourceNacosID;

    /**
     * <p>Specifies whether to use a custom Prometheus instance. Valid values:</p>
     * <br>
     * <p>*   `true`: uses a custom Prometheus instance.</p>
     * <p>*   `false`: does not use a custom Prometheus instance.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CustomizedPrometheus")
    public Boolean customizedPrometheus;

    /**
     * <p>Specifies whether to use a self-managed Zipkin system to collect tracing data. Valid values:</p>
     * <br>
     * <p>*   `true`: uses a self-managed Zipkin system.</p>
     * <p>*   `false`: does not use a self-managed Zipkin system.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    /**
     * <p>Specifies whether to enable DNS proxy. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the DNS proxy feature.</p>
     * <p>*   `false`: disables the DNS proxy feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("DNSProxyingEnabled")
    public Boolean DNSProxyingEnabled;

    /**
     * <p>Specifies the default scheduling configurations that ASM delivers to components on the data plane. You can configure nodeSelector and tolerations in the JSON format. </p>
     * <br>
     * <br>
     * <p>>* Modifying the value of this parameter is a high-risk operation. The modification will cause all components on the data plane of ASM to restart. Exercise caution before modifying the value of this parameter. </p>
     * <p>>* The configurations specified by this parameter do not apply to the ASM gateway. You can configure scheduling on the ASM gateway.</p>
     */
    @NameInMap("DefaultComponentsScheduleConfig")
    public String defaultComponentsScheduleConfig;

    /**
     * <p>The label selectors used to specify the namespaces of the clusters on the data plane for selective service discovery.</p>
     */
    @NameInMap("DiscoverySelectors")
    public String discoverySelectors;

    /**
     * <p>Specifies whether to enable Dubbo Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Dubbo Filter.</p>
     * <p>*   `false`: disables Dubbo Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("DubboFilterEnabled")
    public Boolean dubboFilterEnabled;

    /**
     * <p>Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated [Log Service](https://sls.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`: enables the mesh audit feature.</p>
     * <p>*   `false`: disables the mesh audit feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>The ports for which outbound traffic is redirected to the sidecar proxy.</p>
     */
    @NameInMap("EnableAutoDiagnosis")
    public Boolean enableAutoDiagnosis;

    /**
     * <p>Specifies the authentication token of an ARMS Prometheus instance when the Mesh Topology feature is enabled and ARMS Prometheus is used to collect monitoring metrics. The token is used to allow Mesh Topology to access the ARMS Prometheus instance. The token is in the JSON format. The key in the JSON object is the ID of the cluster on the data plane, and the value is the authentication token of the ARMS Prometheus instance deployed in the cluster.</p>
     */
    @NameInMap("EnableBootstrapXdsAgent")
    public Boolean enableBootstrapXdsAgent;

    /**
     * <p>Specifies whether to enable the rollback feature for Istio resources.</p>
     */
    @NameInMap("EnableCRHistory")
    public Boolean enableCRHistory;

    /**
     * <p>Specifies whether to enable automatic sidecar proxy injection for all namespaces. Valid values:</p>
     * <br>
     * <p>*   `true`: enables automatic sidecar proxy injection for all namespaces.</p>
     * <p>*   `false`: disables automatic sidecar proxy injection for all namespaces.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableNamespacesByDefault")
    public Boolean enableNamespacesByDefault;

    /**
     * <p>Specifies whether to enable Secret Discovery Service (SDS). Valid values:</p>
     * <br>
     * <p>*   `true`: enables SDS.</p>
     * <p>*   `false`: disables SDS.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableSDSServer")
    public Boolean enableSDSServer;

    /**
     * <p>The IP addresses of external services to which traffic is not intercepted.</p>
     */
    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    /**
     * <p>The ports for which inbound traffic is not redirected to the sidecar proxy. Separate multiple ports with commas (,).</p>
     */
    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    /**
     * <p>The ports for which outbound traffic is not redirected to the sidecar proxy. Separate multiple ports with commas (,).</p>
     */
    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    /**
     * <p>Specifies whether to enable gateway configuration filtering. Valid values:</p>
     * <br>
     * <p>*   `true`: enables gateway configuration filtering.</p>
     * <p>*   `false`: disables gateway configuration filtering.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("FilterGatewayClusterConfig")
    public Boolean filterGatewayClusterConfig;

    /**
     * <p>Specifies whether to enable Gateway API. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Gateway API.</p>
     * <p>*   `false`: disables Gateway API.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("GatewayAPIEnabled")
    public Boolean gatewayAPIEnabled;

    /**
     * <p>Other metrics of the sidecar proxy on the data plane.</p>
     */
    @NameInMap("HoldApplicationUntilProxyStarts")
    public Boolean holdApplicationUntilProxyStarts;

    /**
     * <p>Specifies whether to support HTTP 1.0. Valid values:</p>
     * <br>
     * <p>*   `true`: supports HTTP 1.0.</p>
     * <p>*   `false`: does not support HTTP 1.0.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Http10Enabled")
    public Boolean http10Enabled;

    /**
     * <p>The IP addresses of external services to which traffic is intercepted.</p>
     */
    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    /**
     * <p>The ports for which inbound traffic is redirected to the sidecar proxy.</p>
     */
    @NameInMap("IncludeInboundPorts")
    public String includeInboundPorts;

    /**
     * <p>The log level of the sidecar proxy on the data plane. Log levels include `none`, `error`, `warn`, `info`, and `debug`. The levels correspond to different amounts of information reported by the logs. For example, none-level logs report the least information, while debug-level logs report the most information.</p>
     */
    @NameInMap("IncludeOutboundPorts")
    public String includeOutboundPorts;

    /**
     * <p>Specifies whether to enable Node Feature Discovery (NFD).</p>
     */
    @NameInMap("IntegrateKiali")
    public Boolean integrateKiali;

    /**
     * <p>Specifies whether to load the bootstrap configuration before the sidecar proxy is started.</p>
     */
    @NameInMap("InterceptionMode")
    public String interceptionMode;

    /**
     * <p>Specifies the default scheduling configurations that ASM delivers to components on the data plane. You can configure `nodeSelector` and tolerations in the JSON format.</p>
     * <br>
     * <p>> *   Modifying the value of this parameter is a high-risk operation. The modification will cause all components on the data plane of ASM to restart. Exercise caution before modifying the value of this parameter.</p>
     * <p>>*   The configurations specified by this parameter do not apply to the ASM gateway. You can configure gateway-specific scheduling on the ASM gateway.</p>
     */
    @NameInMap("KialiArmsAuthTokens")
    public String kialiArmsAuthTokens;

    /**
     * <p>Specifies whether to enable the Mesh Topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, the Mesh Topology feature must be disabled. Valid values:````</p>
     * <br>
     * <p>*   `true`: enables the Mesh Topology feature.</p>
     * <p>*   `false`: disables the Mesh Topology feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("KialiEnabled")
    public Boolean kialiEnabled;

    /**
     * <p>当开启网格拓扑且为访问网格拓扑创建CLB时，通过此参数使用Annotation配置不同集群中网格拓扑服务的CLB。</p>
     * <br>
     * <p>参数格式为JSON编码的字符串，JSON对象中的键为数据面集群的集群ID，值为数据面集群中网格拓扑服务的Annotation内容。</p>
     * <br>
     * <p>有关如何通过注解配置CLB，参考 [通过Annotation配置传统型负载均衡CLB](https://help.aliyun.com/document_detail/86531.html)。</p>
     */
    @NameInMap("KialiServiceAnnotations")
    public String kialiServiceAnnotations;

    /**
     * <p>The lifecycle of the sidecar proxy.</p>
     */
    @NameInMap("Lifecycle")
    public String lifecycle;

    /**
     * <p>The configurations of cross-region load balancing. Valid values:</p>
     * <br>
     * <p>*   `failover`: the configurations of cross-region failover. Example:</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>    failover: [// Cross-region failover configurations of the struct type. </p>
     * <p>            {</p>
     * <p>                // If a service fails in the China (Beijing) region, the traffic is redirected to the same service in the China (Hangzhou) region. </p>
     * <p>                from: "cn-beijing", </p>
     * <p>                to: "cn-hangzhou",</p>
     * <p>            }</p>
     * <p>        ]</p>
     * <br>
     * <p>*   `distribute`: the configurations of cross-region traffic distribution. Example:</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>    distribute: [// Cross-region traffic distribution configurations of the struct type. </p>
     * <p>            {</p>
     * <p>                // For traffic that is routed to the China (Beijing) region, 70% of the traffic is allocated to the China (Beijing) region and the rest of the traffic is redirected to the China (Hangzhou) region. </p>
     * <p>                "from": "cn-beijing",</p>
     * <p>                "to": {</p>
     * <p>                    "cn-beijing": 70,</p>
     * <p>                    "cn-hangzhou": 30,</p>
     * <p>                }</p>
     * <p>            }</p>
     * <p>        ]</p>
     */
    @NameInMap("LocalityLBConf")
    public String localityLBConf;

    /**
     * <p>Specifies whether to enable cross-region load balancing. Valid values:</p>
     * <br>
     * <p>*   `true`: enables cross-region load balancing.</p>
     * <p>*   `false`: disables cross-region load balancing.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    /**
     * <p>The number of worker threads used by the sidecar proxy on the data plane.</p>
     */
    @NameInMap("LogLevel")
    public String logLevel;

    /**
     * <p>Specifies whether to enable Microservice Engine (MSE). Valid values:</p>
     * <br>
     * <p>*   `true`: enables MSE.</p>
     * <p>*   `false`: disables MSE.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("MSEEnabled")
    public Boolean MSEEnabled;

    /**
     * <p>Specifies whether to enable Transport Layer Security (TLS) acceleration based on MultiBuffer.</p>
     */
    @NameInMap("MultiBufferEnabled")
    public Boolean multiBufferEnabled;

    /**
     * <p>The pull-request latency. By default, this parameter is left empty.</p>
     */
    @NameInMap("MultiBufferPollDelay")
    public String multiBufferPollDelay;

    /**
     * <p>Specifies whether to enable MySQL Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables MySQL Filter.</p>
     * <p>*   `false`: disables MySQL Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("MysqlFilterEnabled")
    public Boolean mysqlFilterEnabled;

    /**
     * <p>Specifies whether to clear feature labels on nodes when NFD is disabled.</p>
     * <br>
     * <p>This parameter is valid only when the `NFDEnabled` parameter is set to `false`.</p>
     */
    @NameInMap("NFDEnabled")
    public Boolean NFDEnabled;

    /**
     * <p>The minimum number of CPU cores requested by the proxy service that exports Tracing Analysis data. For example, `1000m` indicates one CPU core.</p>
     */
    @NameInMap("NFDLabelPruned")
    public Boolean NFDLabelPruned;

    /**
     * <p>The maximum size of the memory that is available to the pod that injects OPA proxies into application pods. For example, `1024Mi` indicates 1024 MB.</p>
     */
    @NameInMap("OPAInjectorCPULimit")
    public String OPAInjectorCPULimit;

    /**
     * <p>The minimum size of the memory requested by the pod that injects OPA proxies into application pods. For example, `50 Mi` indicates 50 MB.</p>
     */
    @NameInMap("OPAInjectorCPURequirement")
    public String OPAInjectorCPURequirement;

    /**
     * <p>Specifies whether to create an SLB instance for accessing the ASM mesh topology.</p>
     */
    @NameInMap("OPAInjectorMemoryLimit")
    public String OPAInjectorMemoryLimit;

    /**
     * <p>The maximum number of CPU cores that are available to the pod that injects OPA proxies into application pods. For example, `1000m` indicates one CPU core.</p>
     */
    @NameInMap("OPAInjectorMemoryRequirement")
    public String OPAInjectorMemoryRequirement;

    /**
     * <p>The maximum number of CPU cores that are available to the OPA proxy container.</p>
     */
    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the OPA proxy container.</p>
     */
    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    /**
     * <p>The log level of the OPA proxy container.</p>
     * <br>
     * <p>*   `info`: outputs all information.</p>
     * <p>*   `debug`: outputs debugging and error information.</p>
     * <p>*   `error`: outputs only error information.</p>
     */
    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    /**
     * <p>The number of CPU cores that are requested by the OPA proxy container.</p>
     */
    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    /**
     * <p>The size of the memory that is requested by the OPA proxy container.</p>
     */
    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    /**
     * <p>The minimum number of CPU cores requested by the pod that injects OPA proxies into application pods. For example, `1000m` indicates one CPU core.</p>
     */
    @NameInMap("OPAScopeInjected")
    public Boolean OPAScopeInjected;

    /**
     * <p>Specifies whether to enable the OPA plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the OPA plug-in.</p>
     * <p>*   `false`: disables the OPA plug-in.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("OpaEnabled")
    public Boolean opaEnabled;

    /**
     * <p>Specifies whether to install the Open Policy Agent (OPA) plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`: installs the OPA plug-in.</p>
     * <p>*   `false`: does not install the OPA plug-in.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    /**
     * <p>The policy for accessing external services. Valid values:</p>
     * <br>
     * <p>*   `ALLOW_ANY`: allows access to all external services.</p>
     * <p>*   `REGISTRY_ONLY`: allows access to only the external services that are defined in the ServiceEntry of the ASM instance.</p>
     */
    @NameInMap("OutboundTrafficPolicy")
    public String outboundTrafficPolicy;

    /**
     * <p>The endpoint of Prometheus monitoring. If you use ARMS Prometheus, set this parameter to the endpoint of Prometheus provided by ARMS.</p>
     */
    @NameInMap("PrometheusUrl")
    public String prometheusUrl;

    /**
     * <p>The maximum number of CPU cores that are available to the istio-init container.</p>
     */
    @NameInMap("ProxyInitCPUResourceLimit")
    public String proxyInitCPUResourceLimit;

    /**
     * <p>The number of CPU cores that are requested by the istio-init container.</p>
     */
    @NameInMap("ProxyInitCPUResourceRequest")
    public String proxyInitCPUResourceRequest;

    /**
     * <p>The maximum size of the memory that is available to the istio-init container.</p>
     */
    @NameInMap("ProxyInitMemoryResourceLimit")
    public String proxyInitMemoryResourceLimit;

    /**
     * <p>The size of the memory that is requested by the istio-init container.</p>
     */
    @NameInMap("ProxyInitMemoryResourceRequest")
    public String proxyInitMemoryResourceRequest;

    /**
     * <p>The maximum number of CPU cores that are available to the sidecar proxy container.</p>
     */
    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the sidecar proxy container.</p>
     */
    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    /**
     * <p>The number of CPU cores that are requested by the sidecar proxy container.</p>
     */
    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    /**
     * <p>The size of the memory that is requested by the sidecar proxy container.</p>
     */
    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    /**
     * <p>The mode in which the sidecar proxy intercepts inbound traffic. Valid values:</p>
     * <br>
     * <p>*   `REDIRECT`: The sidecar proxy intercepts inbound traffic in the REDIRECT mode.</p>
     * <p>*   `TPROXY`: The sidecar proxy intercepts inbound traffic in the TPROXY mode.</p>
     */
    @NameInMap("ProxyStatsMatcher")
    public String proxyStatsMatcher;

    /**
     * <p>Specifies whether to enable Redis Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Redis Filter.</p>
     * <p>*   `false`: disables Redis Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("RedisFilterEnabled")
    public Boolean redisFilterEnabled;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The maximum number of CPU cores that are available to the pod where a sidecar proxy injector resides.</p>
     */
    @NameInMap("SidecarInjectorLimitCPU")
    public String sidecarInjectorLimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the pod where a sidecar proxy injector resides.</p>
     */
    @NameInMap("SidecarInjectorLimitMemory")
    public String sidecarInjectorLimitMemory;

    /**
     * <p>The number of CPU cores that are requested by the pod where a sidecar proxy injector resides.</p>
     */
    @NameInMap("SidecarInjectorRequestCPU")
    public String sidecarInjectorRequestCPU;

    /**
     * <p>The size of the memory that is requested by the pod where a sidecar proxy injector resides.</p>
     */
    @NameInMap("SidecarInjectorRequestMemory")
    public String sidecarInjectorRequestMemory;

    /**
     * <p>Other configurations of automatic sidecar proxy injection, in the YAML format.</p>
     */
    @NameInMap("SidecarInjectorWebhookAsYaml")
    public String sidecarInjectorWebhookAsYaml;

    /**
     * <p>Specifies whether to enable Prometheus monitoring. We recommend that you enable [ARMS Prometheus](https://arms.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`: enables Prometheus monitoring.</p>
     * <p>*   `false`: disables Prometheus monitoring.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Telemetry")
    public Boolean telemetry;

    /**
     * <p>The maximum period of time that the sidecar proxy waits for requests to be processed before the proxy is stopped. For example, if you want to specify a period of 5 seconds, set this parameter to 5s.</p>
     */
    @NameInMap("TerminationDrainDuration")
    public String terminationDrainDuration;

    /**
     * <p>Specifies whether to enable Thrift Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Thrift Filter.</p>
     * <p>*   `false`: disables Thrift Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ThriftFilterEnabled")
    public Boolean thriftFilterEnabled;

    /**
     * <p>The custom tag of Tracing Analysis. Specify this parameter in the JSON format.</p>
     * <br>
     * <p>    {</p>
     * <p>        "name1": CustomTag,</p>
     * <p>        "name2": CustomTag</p>
     * <p>    }</p>
     * <br>
     * <p>Tag key: literal, header, or environment.</p>
     * <br>
     * <p>    {</p>
     * <p>        "literal": {</p>
     * <p>            "value": "Fixed value"</p>
     * <p>        }</p>
     * <p>        "header": {</p>
     * <p>            "name": "Header name"</p>
     * <p>            "defaultValue": "Default value that is used if the specified header does not exist"</p>
     * <p>        }</p>
     * <p>        "environment": {</p>
     * <p>            "name": "Environment variable name"</p>
     * <p>            "defaultValue": "Default value that is used if the specified environment variable does not exist"</p>
     * <p>        }</p>
     * <p>    }</p>
     */
    @NameInMap("TraceCustomTags")
    public String traceCustomTags;

    /**
     * <p>The maximum length of the request path contained in the HttpUrl span tag. Default value: `256`.</p>
     */
    @NameInMap("TraceMaxPathTagLength")
    public String traceMaxPathTagLength;

    /**
     * <p>The sampling percentage of Tracing Analysis.</p>
     */
    @NameInMap("TraceSampling")
    public Float traceSampling;

    /**
     * <p>Specifies whether to enable the Tracing Analysis feature. To enable this feature, make sure that you have activated [Tracing Analysis](https://tracing-analysis.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`: enables the Tracing Analysis feature.</p>
     * <p>*   `false`: disables the Tracing Analysis feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Tracing")
    public Boolean tracing;

    /**
     * <p>The maximum size of the memory that is available to the proxy service that exports Tracing Analysis data. For example, `1Mi` indicates 1 MB.</p>
     */
    @NameInMap("TracingOnExtZipkinLimitCPU")
    public String tracingOnExtZipkinLimitCPU;

    /**
     * <p>The retention period for the access logs of the ingress gateway. Unit: day. The logs are collected by using Log Service. For example, `30` indicates 30 days.</p>
     */
    @NameInMap("TracingOnExtZipkinLimitMemory")
    public String tracingOnExtZipkinLimitMemory;

    /**
     * <p>The minimum size of the memory requested by the proxy service that exports Tracing Analysis data. For example, `1Mi` indicates 1 MB.</p>
     */
    @NameInMap("TracingOnExtZipkinRequestCPU")
    public String tracingOnExtZipkinRequestCPU;

    /**
     * <p>The maximum number of CPU cores that are available to the proxy service that exports Tracing Analysis data. For example, `1000m` indicates one CPU core.</p>
     */
    @NameInMap("TracingOnExtZipkinRequestMemory")
    public String tracingOnExtZipkinRequestMemory;

    /**
     * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables WebAssembly Filter.</p>
     * <p>*   `false`: disables WebAssembly Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("WebAssemblyFilterEnabled")
    public Boolean webAssemblyFilterEnabled;

    public static UpdateMeshFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshFeatureRequest self = new UpdateMeshFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshFeatureRequest setAccessLogEnabled(Boolean accessLogEnabled) {
        this.accessLogEnabled = accessLogEnabled;
        return this;
    }
    public Boolean getAccessLogEnabled() {
        return this.accessLogEnabled;
    }

    public UpdateMeshFeatureRequest setAccessLogFile(String accessLogFile) {
        this.accessLogFile = accessLogFile;
        return this;
    }
    public String getAccessLogFile() {
        return this.accessLogFile;
    }

    public UpdateMeshFeatureRequest setAccessLogFormat(String accessLogFormat) {
        this.accessLogFormat = accessLogFormat;
        return this;
    }
    public String getAccessLogFormat() {
        return this.accessLogFormat;
    }

    public UpdateMeshFeatureRequest setAccessLogGatewayLifecycle(Integer accessLogGatewayLifecycle) {
        this.accessLogGatewayLifecycle = accessLogGatewayLifecycle;
        return this;
    }
    public Integer getAccessLogGatewayLifecycle() {
        return this.accessLogGatewayLifecycle;
    }

    public UpdateMeshFeatureRequest setAccessLogProject(String accessLogProject) {
        this.accessLogProject = accessLogProject;
        return this;
    }
    public String getAccessLogProject() {
        return this.accessLogProject;
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

    public UpdateMeshFeatureRequest setAccessLogSidecarLifecycle(Integer accessLogSidecarLifecycle) {
        this.accessLogSidecarLifecycle = accessLogSidecarLifecycle;
        return this;
    }
    public Integer getAccessLogSidecarLifecycle() {
        return this.accessLogSidecarLifecycle;
    }

    public UpdateMeshFeatureRequest setAuditProject(String auditProject) {
        this.auditProject = auditProject;
        return this;
    }
    public String getAuditProject() {
        return this.auditProject;
    }

    public UpdateMeshFeatureRequest setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
        this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
        return this;
    }
    public Boolean getAutoInjectionPolicyEnabled() {
        return this.autoInjectionPolicyEnabled;
    }

    public UpdateMeshFeatureRequest setCRAggregationEnabled(Boolean CRAggregationEnabled) {
        this.CRAggregationEnabled = CRAggregationEnabled;
        return this;
    }
    public Boolean getCRAggregationEnabled() {
        return this.CRAggregationEnabled;
    }

    public UpdateMeshFeatureRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
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

    public UpdateMeshFeatureRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
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

    public UpdateMeshFeatureRequest setCustomizedPrometheus(Boolean customizedPrometheus) {
        this.customizedPrometheus = customizedPrometheus;
        return this;
    }
    public Boolean getCustomizedPrometheus() {
        return this.customizedPrometheus;
    }

    public UpdateMeshFeatureRequest setCustomizedZipkin(Boolean customizedZipkin) {
        this.customizedZipkin = customizedZipkin;
        return this;
    }
    public Boolean getCustomizedZipkin() {
        return this.customizedZipkin;
    }

    public UpdateMeshFeatureRequest setDNSProxyingEnabled(Boolean DNSProxyingEnabled) {
        this.DNSProxyingEnabled = DNSProxyingEnabled;
        return this;
    }
    public Boolean getDNSProxyingEnabled() {
        return this.DNSProxyingEnabled;
    }

    public UpdateMeshFeatureRequest setDefaultComponentsScheduleConfig(String defaultComponentsScheduleConfig) {
        this.defaultComponentsScheduleConfig = defaultComponentsScheduleConfig;
        return this;
    }
    public String getDefaultComponentsScheduleConfig() {
        return this.defaultComponentsScheduleConfig;
    }

    public UpdateMeshFeatureRequest setDiscoverySelectors(String discoverySelectors) {
        this.discoverySelectors = discoverySelectors;
        return this;
    }
    public String getDiscoverySelectors() {
        return this.discoverySelectors;
    }

    public UpdateMeshFeatureRequest setDubboFilterEnabled(Boolean dubboFilterEnabled) {
        this.dubboFilterEnabled = dubboFilterEnabled;
        return this;
    }
    public Boolean getDubboFilterEnabled() {
        return this.dubboFilterEnabled;
    }

    public UpdateMeshFeatureRequest setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public UpdateMeshFeatureRequest setEnableAutoDiagnosis(Boolean enableAutoDiagnosis) {
        this.enableAutoDiagnosis = enableAutoDiagnosis;
        return this;
    }
    public Boolean getEnableAutoDiagnosis() {
        return this.enableAutoDiagnosis;
    }

    public UpdateMeshFeatureRequest setEnableBootstrapXdsAgent(Boolean enableBootstrapXdsAgent) {
        this.enableBootstrapXdsAgent = enableBootstrapXdsAgent;
        return this;
    }
    public Boolean getEnableBootstrapXdsAgent() {
        return this.enableBootstrapXdsAgent;
    }

    public UpdateMeshFeatureRequest setEnableCRHistory(Boolean enableCRHistory) {
        this.enableCRHistory = enableCRHistory;
        return this;
    }
    public Boolean getEnableCRHistory() {
        return this.enableCRHistory;
    }

    public UpdateMeshFeatureRequest setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
        this.enableNamespacesByDefault = enableNamespacesByDefault;
        return this;
    }
    public Boolean getEnableNamespacesByDefault() {
        return this.enableNamespacesByDefault;
    }

    public UpdateMeshFeatureRequest setEnableSDSServer(Boolean enableSDSServer) {
        this.enableSDSServer = enableSDSServer;
        return this;
    }
    public Boolean getEnableSDSServer() {
        return this.enableSDSServer;
    }

    public UpdateMeshFeatureRequest setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    public UpdateMeshFeatureRequest setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    public UpdateMeshFeatureRequest setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    public UpdateMeshFeatureRequest setFilterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
        this.filterGatewayClusterConfig = filterGatewayClusterConfig;
        return this;
    }
    public Boolean getFilterGatewayClusterConfig() {
        return this.filterGatewayClusterConfig;
    }

    public UpdateMeshFeatureRequest setGatewayAPIEnabled(Boolean gatewayAPIEnabled) {
        this.gatewayAPIEnabled = gatewayAPIEnabled;
        return this;
    }
    public Boolean getGatewayAPIEnabled() {
        return this.gatewayAPIEnabled;
    }

    public UpdateMeshFeatureRequest setHoldApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
        this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
        return this;
    }
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.holdApplicationUntilProxyStarts;
    }

    public UpdateMeshFeatureRequest setHttp10Enabled(Boolean http10Enabled) {
        this.http10Enabled = http10Enabled;
        return this;
    }
    public Boolean getHttp10Enabled() {
        return this.http10Enabled;
    }

    public UpdateMeshFeatureRequest setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    public UpdateMeshFeatureRequest setIncludeInboundPorts(String includeInboundPorts) {
        this.includeInboundPorts = includeInboundPorts;
        return this;
    }
    public String getIncludeInboundPorts() {
        return this.includeInboundPorts;
    }

    public UpdateMeshFeatureRequest setIncludeOutboundPorts(String includeOutboundPorts) {
        this.includeOutboundPorts = includeOutboundPorts;
        return this;
    }
    public String getIncludeOutboundPorts() {
        return this.includeOutboundPorts;
    }

    public UpdateMeshFeatureRequest setIntegrateKiali(Boolean integrateKiali) {
        this.integrateKiali = integrateKiali;
        return this;
    }
    public Boolean getIntegrateKiali() {
        return this.integrateKiali;
    }

    public UpdateMeshFeatureRequest setInterceptionMode(String interceptionMode) {
        this.interceptionMode = interceptionMode;
        return this;
    }
    public String getInterceptionMode() {
        return this.interceptionMode;
    }

    public UpdateMeshFeatureRequest setKialiArmsAuthTokens(String kialiArmsAuthTokens) {
        this.kialiArmsAuthTokens = kialiArmsAuthTokens;
        return this;
    }
    public String getKialiArmsAuthTokens() {
        return this.kialiArmsAuthTokens;
    }

    public UpdateMeshFeatureRequest setKialiEnabled(Boolean kialiEnabled) {
        this.kialiEnabled = kialiEnabled;
        return this;
    }
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    public UpdateMeshFeatureRequest setKialiServiceAnnotations(String kialiServiceAnnotations) {
        this.kialiServiceAnnotations = kialiServiceAnnotations;
        return this;
    }
    public String getKialiServiceAnnotations() {
        return this.kialiServiceAnnotations;
    }

    public UpdateMeshFeatureRequest setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public UpdateMeshFeatureRequest setLocalityLBConf(String localityLBConf) {
        this.localityLBConf = localityLBConf;
        return this;
    }
    public String getLocalityLBConf() {
        return this.localityLBConf;
    }

    public UpdateMeshFeatureRequest setLocalityLoadBalancing(Boolean localityLoadBalancing) {
        this.localityLoadBalancing = localityLoadBalancing;
        return this;
    }
    public Boolean getLocalityLoadBalancing() {
        return this.localityLoadBalancing;
    }

    public UpdateMeshFeatureRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public UpdateMeshFeatureRequest setMSEEnabled(Boolean MSEEnabled) {
        this.MSEEnabled = MSEEnabled;
        return this;
    }
    public Boolean getMSEEnabled() {
        return this.MSEEnabled;
    }

    public UpdateMeshFeatureRequest setMultiBufferEnabled(Boolean multiBufferEnabled) {
        this.multiBufferEnabled = multiBufferEnabled;
        return this;
    }
    public Boolean getMultiBufferEnabled() {
        return this.multiBufferEnabled;
    }

    public UpdateMeshFeatureRequest setMultiBufferPollDelay(String multiBufferPollDelay) {
        this.multiBufferPollDelay = multiBufferPollDelay;
        return this;
    }
    public String getMultiBufferPollDelay() {
        return this.multiBufferPollDelay;
    }

    public UpdateMeshFeatureRequest setMysqlFilterEnabled(Boolean mysqlFilterEnabled) {
        this.mysqlFilterEnabled = mysqlFilterEnabled;
        return this;
    }
    public Boolean getMysqlFilterEnabled() {
        return this.mysqlFilterEnabled;
    }

    public UpdateMeshFeatureRequest setNFDEnabled(Boolean NFDEnabled) {
        this.NFDEnabled = NFDEnabled;
        return this;
    }
    public Boolean getNFDEnabled() {
        return this.NFDEnabled;
    }

    public UpdateMeshFeatureRequest setNFDLabelPruned(Boolean NFDLabelPruned) {
        this.NFDLabelPruned = NFDLabelPruned;
        return this;
    }
    public Boolean getNFDLabelPruned() {
        return this.NFDLabelPruned;
    }

    public UpdateMeshFeatureRequest setOPAInjectorCPULimit(String OPAInjectorCPULimit) {
        this.OPAInjectorCPULimit = OPAInjectorCPULimit;
        return this;
    }
    public String getOPAInjectorCPULimit() {
        return this.OPAInjectorCPULimit;
    }

    public UpdateMeshFeatureRequest setOPAInjectorCPURequirement(String OPAInjectorCPURequirement) {
        this.OPAInjectorCPURequirement = OPAInjectorCPURequirement;
        return this;
    }
    public String getOPAInjectorCPURequirement() {
        return this.OPAInjectorCPURequirement;
    }

    public UpdateMeshFeatureRequest setOPAInjectorMemoryLimit(String OPAInjectorMemoryLimit) {
        this.OPAInjectorMemoryLimit = OPAInjectorMemoryLimit;
        return this;
    }
    public String getOPAInjectorMemoryLimit() {
        return this.OPAInjectorMemoryLimit;
    }

    public UpdateMeshFeatureRequest setOPAInjectorMemoryRequirement(String OPAInjectorMemoryRequirement) {
        this.OPAInjectorMemoryRequirement = OPAInjectorMemoryRequirement;
        return this;
    }
    public String getOPAInjectorMemoryRequirement() {
        return this.OPAInjectorMemoryRequirement;
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

    public UpdateMeshFeatureRequest setOPAScopeInjected(Boolean OPAScopeInjected) {
        this.OPAScopeInjected = OPAScopeInjected;
        return this;
    }
    public Boolean getOPAScopeInjected() {
        return this.OPAScopeInjected;
    }

    public UpdateMeshFeatureRequest setOpaEnabled(Boolean opaEnabled) {
        this.opaEnabled = opaEnabled;
        return this;
    }
    public Boolean getOpaEnabled() {
        return this.opaEnabled;
    }

    public UpdateMeshFeatureRequest setOpenAgentPolicy(Boolean openAgentPolicy) {
        this.openAgentPolicy = openAgentPolicy;
        return this;
    }
    public Boolean getOpenAgentPolicy() {
        return this.openAgentPolicy;
    }

    public UpdateMeshFeatureRequest setOutboundTrafficPolicy(String outboundTrafficPolicy) {
        this.outboundTrafficPolicy = outboundTrafficPolicy;
        return this;
    }
    public String getOutboundTrafficPolicy() {
        return this.outboundTrafficPolicy;
    }

    public UpdateMeshFeatureRequest setPrometheusUrl(String prometheusUrl) {
        this.prometheusUrl = prometheusUrl;
        return this;
    }
    public String getPrometheusUrl() {
        return this.prometheusUrl;
    }

    public UpdateMeshFeatureRequest setProxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
        this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
        return this;
    }
    public String getProxyInitCPUResourceLimit() {
        return this.proxyInitCPUResourceLimit;
    }

    public UpdateMeshFeatureRequest setProxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
        this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
        return this;
    }
    public String getProxyInitCPUResourceRequest() {
        return this.proxyInitCPUResourceRequest;
    }

    public UpdateMeshFeatureRequest setProxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
        this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
        return this;
    }
    public String getProxyInitMemoryResourceLimit() {
        return this.proxyInitMemoryResourceLimit;
    }

    public UpdateMeshFeatureRequest setProxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
        this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
        return this;
    }
    public String getProxyInitMemoryResourceRequest() {
        return this.proxyInitMemoryResourceRequest;
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

    public UpdateMeshFeatureRequest setProxyStatsMatcher(String proxyStatsMatcher) {
        this.proxyStatsMatcher = proxyStatsMatcher;
        return this;
    }
    public String getProxyStatsMatcher() {
        return this.proxyStatsMatcher;
    }

    public UpdateMeshFeatureRequest setRedisFilterEnabled(Boolean redisFilterEnabled) {
        this.redisFilterEnabled = redisFilterEnabled;
        return this;
    }
    public Boolean getRedisFilterEnabled() {
        return this.redisFilterEnabled;
    }

    public UpdateMeshFeatureRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
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

    public UpdateMeshFeatureRequest setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
        this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
        return this;
    }
    public String getSidecarInjectorWebhookAsYaml() {
        return this.sidecarInjectorWebhookAsYaml;
    }

    public UpdateMeshFeatureRequest setTelemetry(Boolean telemetry) {
        this.telemetry = telemetry;
        return this;
    }
    public Boolean getTelemetry() {
        return this.telemetry;
    }

    public UpdateMeshFeatureRequest setTerminationDrainDuration(String terminationDrainDuration) {
        this.terminationDrainDuration = terminationDrainDuration;
        return this;
    }
    public String getTerminationDrainDuration() {
        return this.terminationDrainDuration;
    }

    public UpdateMeshFeatureRequest setThriftFilterEnabled(Boolean thriftFilterEnabled) {
        this.thriftFilterEnabled = thriftFilterEnabled;
        return this;
    }
    public Boolean getThriftFilterEnabled() {
        return this.thriftFilterEnabled;
    }

    public UpdateMeshFeatureRequest setTraceCustomTags(String traceCustomTags) {
        this.traceCustomTags = traceCustomTags;
        return this;
    }
    public String getTraceCustomTags() {
        return this.traceCustomTags;
    }

    public UpdateMeshFeatureRequest setTraceMaxPathTagLength(String traceMaxPathTagLength) {
        this.traceMaxPathTagLength = traceMaxPathTagLength;
        return this;
    }
    public String getTraceMaxPathTagLength() {
        return this.traceMaxPathTagLength;
    }

    public UpdateMeshFeatureRequest setTraceSampling(Float traceSampling) {
        this.traceSampling = traceSampling;
        return this;
    }
    public Float getTraceSampling() {
        return this.traceSampling;
    }

    public UpdateMeshFeatureRequest setTracing(Boolean tracing) {
        this.tracing = tracing;
        return this;
    }
    public Boolean getTracing() {
        return this.tracing;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinLimitCPU(String tracingOnExtZipkinLimitCPU) {
        this.tracingOnExtZipkinLimitCPU = tracingOnExtZipkinLimitCPU;
        return this;
    }
    public String getTracingOnExtZipkinLimitCPU() {
        return this.tracingOnExtZipkinLimitCPU;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinLimitMemory(String tracingOnExtZipkinLimitMemory) {
        this.tracingOnExtZipkinLimitMemory = tracingOnExtZipkinLimitMemory;
        return this;
    }
    public String getTracingOnExtZipkinLimitMemory() {
        return this.tracingOnExtZipkinLimitMemory;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinRequestCPU(String tracingOnExtZipkinRequestCPU) {
        this.tracingOnExtZipkinRequestCPU = tracingOnExtZipkinRequestCPU;
        return this;
    }
    public String getTracingOnExtZipkinRequestCPU() {
        return this.tracingOnExtZipkinRequestCPU;
    }

    public UpdateMeshFeatureRequest setTracingOnExtZipkinRequestMemory(String tracingOnExtZipkinRequestMemory) {
        this.tracingOnExtZipkinRequestMemory = tracingOnExtZipkinRequestMemory;
        return this;
    }
    public String getTracingOnExtZipkinRequestMemory() {
        return this.tracingOnExtZipkinRequestMemory;
    }

    public UpdateMeshFeatureRequest setWebAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
        this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
        return this;
    }
    public Boolean getWebAssemblyFilterEnabled() {
        return this.webAssemblyFilterEnabled;
    }

}
