// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable access log collection. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AccessLogEnabled")
    public Boolean accessLogEnabled;

    /**
     * <p>Specifies whether to enable access log collection. Valid values:</p>
     * <ul>
     * <li>&quot;&quot;: disables access log collection.</li>
     * <li><code>/dev/stdout</code>: enables access log collection. Access logs are written to /dev/stdout.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/dev/stdout</p>
     */
    @NameInMap("AccessLogFile")
    public String accessLogFile;

    /**
     * <p>Custom fields of access logs. To set this parameter, you must enable access log collection. Otherwise, you cannot set this parameter. The value must be a JSON string. The following key values must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;authority_for&quot;:&quot;%REQ(:AUTHORITY)%&quot;,&quot;bytes_received&quot;:&quot;%BYTES_RECEIVED%&quot;,&quot;bytes_sent&quot;:&quot;%BYTES_SENT%&quot;,&quot;downstream_local_address&quot;:&quot;%DOWNSTREAM_LOCAL_ADDRESS%&quot;,&quot;downstream_remote_address&quot;:&quot;%DOWNSTREAM_REMOTE_ADDRESS%&quot;,&quot;duration&quot;:&quot;%DURATION%&quot;,&quot;istio_policy_status&quot;:&quot;%DYNAMIC_METADATA(istio.mixer:status)%&quot;,&quot;method&quot;:&quot;%REQ(:METHOD)%&quot;,&quot;path&quot;:&quot;%REQ(X-ENVOY-ORIGINAL-PATH?:PATH)%&quot;,&quot;protocol&quot;:&quot;%PROTOCOL%&quot;,&quot;request_id&quot;:&quot;%REQ(X-REQUEST-ID)%&quot;,&quot;requested_server_name&quot;:&quot;%REQUESTED_SERVER_NAME%&quot;,&quot;response_code&quot;:&quot;%RESPONSE_CODE%&quot;,&quot;response_flags&quot;:&quot;%RESPONSE_FLAGS%&quot;,&quot;route_name&quot;:&quot;%ROUTE_NAME%&quot;,&quot;start_time&quot;:&quot;%START_TIME%&quot;,&quot;trace_id&quot;:&quot;%REQ(X-B3-TRACEID)%&quot;,&quot;upstream_cluster&quot;:&quot;%UPSTREAM_CLUSTER%&quot;,&quot;upstream_host&quot;:&quot;%UPSTREAM_HOST%&quot;,&quot;upstream_local_address&quot;:&quot;%UPSTREAM_LOCAL_ADDRESS%&quot;,&quot;upstream_service_time&quot;:&quot;%RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)%&quot;,&quot;upstream_transport_failure_reason&quot;:&quot;%UPSTREAM_TRANSPORT_FAILURE_REASON%&quot;,&quot;user_agent&quot;:&quot;%REQ(USER-AGENT)%&quot;,&quot;x_forwarded_for&quot;:&quot;%REQ(X-FORWARDED-FOR)%&quot;}</p>
     */
    @NameInMap("AccessLogFormat")
    public String accessLogFormat;

    /**
     * <p>The SLS project from which access logs are collected.</p>
     * 
     * <strong>example:</strong>
     * <p>mesh-log-cf245a429b6ff4b6e97f20797758*****</p>
     */
    @NameInMap("AccessLogProject")
    public String accessLogProject;

    /**
     * <p>Specifies whether to enable gRPC Access Log Service (ALS) of Envoy. gRPC is short for Google Remote Procedure Call. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AccessLogServiceEnabled")
    public Boolean accessLogServiceEnabled;

    /**
     * <p>The endpoint of Envoy\&quot;s gRPC ALS.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0</p>
     */
    @NameInMap("AccessLogServiceHost")
    public String accessLogServiceHost;

    /**
     * <p>The port of Envoy\&quot;s gRPC ALS.</p>
     * 
     * <strong>example:</strong>
     * <p>9999</p>
     */
    @NameInMap("AccessLogServicePort")
    public Integer accessLogServicePort;

    /**
     * <p>The type of the Classic Load Balancer (CLB) instance that is bound to the API server. Valid values: <code>slb.s1.small</code>, <code>slb.s2.small</code>, <code>slb.s2.medium</code>, <code>slb.s3.small</code>, <code>slb.s3.medium</code>, and <code>slb.s3.large</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("ApiServerLoadBalancerSpec")
    public String apiServerLoadBalancerSpec;

    /**
     * <p>Specifies whether to expose the API server to the Internet. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p>If you set this parameter to <code>false</code>, the API server cannot be accessed over the Internet.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    /**
     * <p>The name of the Log Service project that is used for mesh audit.</p>
     * <p>Default value: mesh-log-{ASM instance ID}.</p>
     * 
     * <strong>example:</strong>
     * <p>mesh-log-xxxx</p>
     */
    @NameInMap("AuditProject")
    public String auditProject;

    /**
     * <p>Specifies whether to enable auto-renewal for the CLB instance if the CLB instance uses the subscription billing method. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period of the subscription CLB instance. This parameter is valid only if <code>ChargeType</code> is set to <code>PrePay</code>. If the original subscription period of the CLB instance is less than one year, the value of this parameter indicates the number of months for auto-renewal. If the original subscription period of the CLB instance is more than one year, the value of this parameter indicates the number of years for auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>Specifies whether to allow the Kubernetes API of clusters on the data plane to access Istio resources. The version of the ASM instance must be V1.9.7.93 or later. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CRAggregationEnabled")
    public Boolean CRAggregationEnabled;

    /**
     * <p>The certificate chain from the CA certificate to the root certificate. At least two certificates are included in the chain.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64 encoded PEM certificate chain.</p>
     */
    @NameInMap("CertChain")
    public String certChain;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <ul>
     * <li><code>PayOnDemand</code>: pay-as-you-go</li>
     * <li><code>PrePay</code>: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePay</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>ASM cluster domain.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("ClusterDomain")
    public String clusterDomain;

    /**
     * <p>The edition of the ASM instance. Valid values:</p>
     * <ul>
     * <li><p><code>standard</code>: Standard Edition</p>
     * </li>
     * <li><p><code>enterprise</code>: Enterprise Edition</p>
     * </li>
     * <li><p><code>ultimate</code>: Ultimate Edition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("ClusterSpec")
    public String clusterSpec;

    /**
     * <p>Specifies whether to enable the external service registry. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigSourceEnabled")
    public Boolean configSourceEnabled;

    /**
     * <p>The instance ID of the Nacos registry.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-tl326******</p>
     */
    @NameInMap("ConfigSourceNacosID")
    public String configSourceNacosID;

    /**
     * <p>Specifies whether to enable the collection of control plane logs. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ControlPlaneLogEnabled")
    public Boolean controlPlaneLogEnabled;

    /**
     * <p>The name of the Log Service project that is used to collect the logs of the control plane.</p>
     * 
     * <strong>example:</strong>
     * <p>mesh-log-cf245a429b6ff4b6e97f20797758*****</p>
     */
    @NameInMap("ControlPlaneLogProject")
    public String controlPlaneLogProject;

    /**
     * <p>Specifies whether to use a custom Prometheus instance. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CustomizedPrometheus")
    public Boolean customizedPrometheus;

    /**
     * <p>Specifies whether to use a self-managed Zipkin system to collect tracing data. Valid values:</p>
     * <ul>
     * <li><code>true</code>: uses a self-managed Zipkin system to collect tracing data.</li>
     * <li><code>false</code>: uses Alibaba Cloud Tracing Analysis to collect tracing data.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    /**
     * <p>Specifies whether to enable the DNS proxy feature. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DNSProxyingEnabled")
    public Boolean DNSProxyingEnabled;

    /**
     * <p>Specifies whether to enable Dubbo Filter. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DubboFilterEnabled")
    public Boolean dubboFilterEnabled;

    /**
     * <p>The edition of the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Pro</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>Specifies whether to enable the ACMG mode for the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableACMG")
    public Boolean enableACMG;

    /**
     * <p>Specifies whether to enable the Ambient Mesh mode for the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAmbient")
    public Boolean enableAmbient;

    /**
     * <p>Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated <a href="https://sls.console.aliyun.com/">Log Service</a>. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>Specifies whether to enable the rollback feature for Istio resources. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCRHistory")
    public Boolean enableCRHistory;

    /**
     * <p>Specifies whether to enable Secret Discovery Service (SDS). Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSDSServer")
    public Boolean enableSDSServer;

    /**
     * <p>The IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>100.100.10*.***</p>
     */
    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    /**
     * <p>The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>80,81</p>
     */
    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    /**
     * <p>The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>80,81</p>
     */
    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    /**
     * <p>The existing CA certificate, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-cert.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
     * 
     * <strong>example:</strong>
     * <p>CA cert content, base64 encoded format.</p>
     */
    @NameInMap("ExistingCaCert")
    public String existingCaCert;

    /**
     * <p>The existing CA key, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-key.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
     * 
     * <strong>example:</strong>
     * <p>CA key content, base64 encoded format.</p>
     */
    @NameInMap("ExistingCaKey")
    public String existingCaKey;

    /**
     * <p>The type of the existing CA certificate. Valid values:</p>
     * <ul>
     * <li>1: Self-signed certificate generated by istiod. The certificate corresponds to the secret named istio-ca-secret in the istio-system namespace. If you use this type of certificate, you must set the <code>ExistingCaCert</code> and <code>ExistingCaKey</code> parameters.</li>
     * <li>2: Administrator-specified certificate. For more information, see <a href="https://istio.io/latest/docs/tasks/security/cert-management/plugin-ca-cert/">plugin ca cert</a>. In most cases, the certificate corresponds to the secret named cacerts in the istio-system namespace. If you use this type of certificate, you must set the <code>ExisingRootCaCert</code> and <code>ExisingRootCaKey</code> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExistingCaType")
    @Deprecated
    public String existingCaType;

    /**
     * <p>The existing root certificate, which is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>Existing CA cert content, base64 encoded format.</p>
     */
    @NameInMap("ExistingRootCaCert")
    public String existingRootCaCert;

    /**
     * <p>The private key that corresponds to the root certificate, which is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>Existing CA key content, base64 encoded format.</p>
     */
    @NameInMap("ExistingRootCaKey")
    @Deprecated
    public String existingRootCaKey;

    /**
     * <p>Specifies whether to enable gateway configuration filtering. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterGatewayClusterConfig")
    public Boolean filterGatewayClusterConfig;

    /**
     * <p>Specifies whether to enable Gateway API. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GatewayAPIEnabled")
    public Boolean gatewayAPIEnabled;

    /**
     * <p>When you create an ASM instance, you can add a cluster to the ASM instance. If you do not specify this parameter, no cluster is added to the ASM instance. The cluster and the ASM instance must be in the same vSwitch of the same VPC and have the same domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>ACK cluster id</p>
     */
    @NameInMap("GuestCluster")
    public String guestCluster;

    /**
     * <p>The IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    /**
     * <p>The Istio version of the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.5.4.1-g5960ec40-aliyun</p>
     */
    @NameInMap("IstioVersion")
    public String istioVersion;

    /**
     * <p>Specifies whether to enable the mesh topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, you must set this parameter to <code>false</code>.`` Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KialiEnabled")
    public Boolean kialiEnabled;

    /**
     * <p>The configurations for the access to the nearest instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failover&quot;:[{&quot;from&quot;:&quot;cn-hangzhou&quot;,&quot;to&quot;:&quot;cn-shanghai&quot;}]}</p>
     */
    @NameInMap("LocalityLBConf")
    public String localityLBConf;

    /**
     * <p>Specifies whether to route traffic to the nearest instance. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    /**
     * <p>Specifies whether to enable Microservices Engine (MSE). Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MSEEnabled")
    public Boolean MSEEnabled;

    /**
     * <p>Specifies whether to enable MultiBuffer-based Transport Layer Security (TLS) acceleration. Valid values:</p>
     * <ul>
     * <li><p><code>true</code></p>
     * </li>
     * <li><p><code>false</code></p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MultiBufferEnabled")
    public Boolean multiBufferEnabled;

    /**
     * <p>The pull-request latency. Default value: 30. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30s</p>
     */
    @NameInMap("MultiBufferPollDelay")
    public String multiBufferPollDelay;

    /**
     * <p>Specifies whether to enable MySQL Filter. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MysqlFilterEnabled")
    public Boolean mysqlFilterEnabled;

    /**
     * <p>The name of the ASM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mesh1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of CPU cores that are available to the OPA container.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024Mi</p>
     */
    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    /**
     * <p>The log level of the OPA container.</p>
     * 
     * <strong>example:</strong>
     * <p>info</p>
     */
    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    /**
     * <p>The minimum number of CPU cores that are required by the OPA container. You can specify the parameter value in the standard representation form of CPUs in Kubernetes. For example, if you set the value to 1, one CPU core is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    /**
     * <p>The minimum size of the memory that is required by the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>512Mi</p>
     */
    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    /**
     * <p>Specifies whether to enable the OPA plug-in. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpaEnabled")
    public Boolean opaEnabled;

    /**
     * <p>Specifies whether to install the Open Policy Agent (OPA) plug-in. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    /**
     * <p>The subscription period of the CLB instance. This parameter is valid only if <code>ChargeType</code> is set to <code>PrePay</code>. The value of this parameter indicates the subscription period of the CLB instance. Unit: month. For example, if the subscription period is one year, set this parameter to 12.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The type of the CLB instance that is bound to Istio Pilot. Valid values: <code>slb.s1.small</code>, <code>slb.s2.small</code>, <code>slb.s2.medium</code>, <code>slb.s3.small</code>, <code>slb.s3.medium</code>, and <code>slb.s3.large</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("PilotLoadBalancerSpec")
    public String pilotLoadBalancerSpec;

    /**
     * <p>The playground scenario. If you specify this parameter, an ASM playground instance is created. Valid values:</p>
     * <ul>
     * <li>ewmaLb: the exponentially weighted moving average (EWMA) load balancing algorithm.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ewmaLb</p>
     */
    @NameInMap("PlaygroundScene")
    public String playgroundScene;

    /**
     * <p>The endpoint of the custom Prometheus instance.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://prometheus:9090">http://prometheus:9090</a></p>
     */
    @NameInMap("PrometheusUrl")
    public String prometheusUrl;

    /**
     * <p>The maximum number of CPU cores that are available to the proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>2000m</p>
     */
    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>1024Mi</p>
     */
    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    /**
     * <p>The minimum number of CPU cores that are required by the proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>100m</p>
     */
    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    /**
     * <p>The minimum size of the memory that is required by the proxy container.</p>
     * 
     * <strong>example:</strong>
     * <p>128Mi</p>
     */
    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    /**
     * <p>Specifies whether to enable Redis Filter. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RedisFilterEnabled")
    public Boolean redisFilterEnabled;

    /**
     * <p>The ID of the region in which the ASM instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Tag of the ASM instance. A tag contains the following information:</p>
     * <ul>
     * <li>key: the name of the tag</li>
     * <li>value: the value of the tag</li>
     * </ul>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServiceMeshRequestTag> tag;

    /**
     * <p>Specifies whether to enable Prometheus monitoring. We recommend that you use Prometheus Service of <a href="https://arms.console.aliyun.com/">Application Real-Time Monitoring Service (ARMS)</a>. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Telemetry")
    public Boolean telemetry;

    /**
     * <p>Specifies whether to enable Thrift Filter. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThriftFilterEnabled")
    public Boolean thriftFilterEnabled;

    /**
     * <p>The sampling percentage of Tracing Analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TraceSampling")
    public Float traceSampling;

    /**
     * <p>Specifies whether to enable the Tracing Analysis feature. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Tracing")
    public Boolean tracing;

    /**
     * <p>Specifies whether to use an existing CA certificate and private key.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseExistingCA")
    public Boolean useExistingCA;

    /**
     * <p>The ID of the vSwitch to which the ASM instance is connected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-xzegf5dndkbf4m6eg****&quot;]</p>
     */
    @NameInMap("VSwitches")
    public String vSwitches;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the ASM instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xzelac2tw4ic7wz31****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WebAssemblyFilterEnabled")
    public Boolean webAssemblyFilterEnabled;

    public static CreateServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceMeshRequest self = new CreateServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceMeshRequest setAccessLogEnabled(Boolean accessLogEnabled) {
        this.accessLogEnabled = accessLogEnabled;
        return this;
    }
    public Boolean getAccessLogEnabled() {
        return this.accessLogEnabled;
    }

    public CreateServiceMeshRequest setAccessLogFile(String accessLogFile) {
        this.accessLogFile = accessLogFile;
        return this;
    }
    public String getAccessLogFile() {
        return this.accessLogFile;
    }

    public CreateServiceMeshRequest setAccessLogFormat(String accessLogFormat) {
        this.accessLogFormat = accessLogFormat;
        return this;
    }
    public String getAccessLogFormat() {
        return this.accessLogFormat;
    }

    public CreateServiceMeshRequest setAccessLogProject(String accessLogProject) {
        this.accessLogProject = accessLogProject;
        return this;
    }
    public String getAccessLogProject() {
        return this.accessLogProject;
    }

    public CreateServiceMeshRequest setAccessLogServiceEnabled(Boolean accessLogServiceEnabled) {
        this.accessLogServiceEnabled = accessLogServiceEnabled;
        return this;
    }
    public Boolean getAccessLogServiceEnabled() {
        return this.accessLogServiceEnabled;
    }

    public CreateServiceMeshRequest setAccessLogServiceHost(String accessLogServiceHost) {
        this.accessLogServiceHost = accessLogServiceHost;
        return this;
    }
    public String getAccessLogServiceHost() {
        return this.accessLogServiceHost;
    }

    public CreateServiceMeshRequest setAccessLogServicePort(Integer accessLogServicePort) {
        this.accessLogServicePort = accessLogServicePort;
        return this;
    }
    public Integer getAccessLogServicePort() {
        return this.accessLogServicePort;
    }

    public CreateServiceMeshRequest setApiServerLoadBalancerSpec(String apiServerLoadBalancerSpec) {
        this.apiServerLoadBalancerSpec = apiServerLoadBalancerSpec;
        return this;
    }
    public String getApiServerLoadBalancerSpec() {
        return this.apiServerLoadBalancerSpec;
    }

    public CreateServiceMeshRequest setApiServerPublicEip(Boolean apiServerPublicEip) {
        this.apiServerPublicEip = apiServerPublicEip;
        return this;
    }
    public Boolean getApiServerPublicEip() {
        return this.apiServerPublicEip;
    }

    public CreateServiceMeshRequest setAuditProject(String auditProject) {
        this.auditProject = auditProject;
        return this;
    }
    public String getAuditProject() {
        return this.auditProject;
    }

    public CreateServiceMeshRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateServiceMeshRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateServiceMeshRequest setCRAggregationEnabled(Boolean CRAggregationEnabled) {
        this.CRAggregationEnabled = CRAggregationEnabled;
        return this;
    }
    public Boolean getCRAggregationEnabled() {
        return this.CRAggregationEnabled;
    }

    public CreateServiceMeshRequest setCertChain(String certChain) {
        this.certChain = certChain;
        return this;
    }
    public String getCertChain() {
        return this.certChain;
    }

    public CreateServiceMeshRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateServiceMeshRequest setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public CreateServiceMeshRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public CreateServiceMeshRequest setConfigSourceEnabled(Boolean configSourceEnabled) {
        this.configSourceEnabled = configSourceEnabled;
        return this;
    }
    public Boolean getConfigSourceEnabled() {
        return this.configSourceEnabled;
    }

    public CreateServiceMeshRequest setConfigSourceNacosID(String configSourceNacosID) {
        this.configSourceNacosID = configSourceNacosID;
        return this;
    }
    public String getConfigSourceNacosID() {
        return this.configSourceNacosID;
    }

    public CreateServiceMeshRequest setControlPlaneLogEnabled(Boolean controlPlaneLogEnabled) {
        this.controlPlaneLogEnabled = controlPlaneLogEnabled;
        return this;
    }
    public Boolean getControlPlaneLogEnabled() {
        return this.controlPlaneLogEnabled;
    }

    public CreateServiceMeshRequest setControlPlaneLogProject(String controlPlaneLogProject) {
        this.controlPlaneLogProject = controlPlaneLogProject;
        return this;
    }
    public String getControlPlaneLogProject() {
        return this.controlPlaneLogProject;
    }

    public CreateServiceMeshRequest setCustomizedPrometheus(Boolean customizedPrometheus) {
        this.customizedPrometheus = customizedPrometheus;
        return this;
    }
    public Boolean getCustomizedPrometheus() {
        return this.customizedPrometheus;
    }

    public CreateServiceMeshRequest setCustomizedZipkin(Boolean customizedZipkin) {
        this.customizedZipkin = customizedZipkin;
        return this;
    }
    public Boolean getCustomizedZipkin() {
        return this.customizedZipkin;
    }

    public CreateServiceMeshRequest setDNSProxyingEnabled(Boolean DNSProxyingEnabled) {
        this.DNSProxyingEnabled = DNSProxyingEnabled;
        return this;
    }
    public Boolean getDNSProxyingEnabled() {
        return this.DNSProxyingEnabled;
    }

    public CreateServiceMeshRequest setDubboFilterEnabled(Boolean dubboFilterEnabled) {
        this.dubboFilterEnabled = dubboFilterEnabled;
        return this;
    }
    public Boolean getDubboFilterEnabled() {
        return this.dubboFilterEnabled;
    }

    public CreateServiceMeshRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public CreateServiceMeshRequest setEnableACMG(Boolean enableACMG) {
        this.enableACMG = enableACMG;
        return this;
    }
    public Boolean getEnableACMG() {
        return this.enableACMG;
    }

    public CreateServiceMeshRequest setEnableAmbient(Boolean enableAmbient) {
        this.enableAmbient = enableAmbient;
        return this;
    }
    public Boolean getEnableAmbient() {
        return this.enableAmbient;
    }

    public CreateServiceMeshRequest setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public CreateServiceMeshRequest setEnableCRHistory(Boolean enableCRHistory) {
        this.enableCRHistory = enableCRHistory;
        return this;
    }
    public Boolean getEnableCRHistory() {
        return this.enableCRHistory;
    }

    public CreateServiceMeshRequest setEnableSDSServer(Boolean enableSDSServer) {
        this.enableSDSServer = enableSDSServer;
        return this;
    }
    public Boolean getEnableSDSServer() {
        return this.enableSDSServer;
    }

    public CreateServiceMeshRequest setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    public CreateServiceMeshRequest setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    public CreateServiceMeshRequest setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    public CreateServiceMeshRequest setExistingCaCert(String existingCaCert) {
        this.existingCaCert = existingCaCert;
        return this;
    }
    public String getExistingCaCert() {
        return this.existingCaCert;
    }

    public CreateServiceMeshRequest setExistingCaKey(String existingCaKey) {
        this.existingCaKey = existingCaKey;
        return this;
    }
    public String getExistingCaKey() {
        return this.existingCaKey;
    }

    @Deprecated
    public CreateServiceMeshRequest setExistingCaType(String existingCaType) {
        this.existingCaType = existingCaType;
        return this;
    }
    public String getExistingCaType() {
        return this.existingCaType;
    }

    public CreateServiceMeshRequest setExistingRootCaCert(String existingRootCaCert) {
        this.existingRootCaCert = existingRootCaCert;
        return this;
    }
    public String getExistingRootCaCert() {
        return this.existingRootCaCert;
    }

    @Deprecated
    public CreateServiceMeshRequest setExistingRootCaKey(String existingRootCaKey) {
        this.existingRootCaKey = existingRootCaKey;
        return this;
    }
    public String getExistingRootCaKey() {
        return this.existingRootCaKey;
    }

    public CreateServiceMeshRequest setFilterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
        this.filterGatewayClusterConfig = filterGatewayClusterConfig;
        return this;
    }
    public Boolean getFilterGatewayClusterConfig() {
        return this.filterGatewayClusterConfig;
    }

    public CreateServiceMeshRequest setGatewayAPIEnabled(Boolean gatewayAPIEnabled) {
        this.gatewayAPIEnabled = gatewayAPIEnabled;
        return this;
    }
    public Boolean getGatewayAPIEnabled() {
        return this.gatewayAPIEnabled;
    }

    public CreateServiceMeshRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public CreateServiceMeshRequest setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    public CreateServiceMeshRequest setIstioVersion(String istioVersion) {
        this.istioVersion = istioVersion;
        return this;
    }
    public String getIstioVersion() {
        return this.istioVersion;
    }

    public CreateServiceMeshRequest setKialiEnabled(Boolean kialiEnabled) {
        this.kialiEnabled = kialiEnabled;
        return this;
    }
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    public CreateServiceMeshRequest setLocalityLBConf(String localityLBConf) {
        this.localityLBConf = localityLBConf;
        return this;
    }
    public String getLocalityLBConf() {
        return this.localityLBConf;
    }

    public CreateServiceMeshRequest setLocalityLoadBalancing(Boolean localityLoadBalancing) {
        this.localityLoadBalancing = localityLoadBalancing;
        return this;
    }
    public Boolean getLocalityLoadBalancing() {
        return this.localityLoadBalancing;
    }

    public CreateServiceMeshRequest setMSEEnabled(Boolean MSEEnabled) {
        this.MSEEnabled = MSEEnabled;
        return this;
    }
    public Boolean getMSEEnabled() {
        return this.MSEEnabled;
    }

    public CreateServiceMeshRequest setMultiBufferEnabled(Boolean multiBufferEnabled) {
        this.multiBufferEnabled = multiBufferEnabled;
        return this;
    }
    public Boolean getMultiBufferEnabled() {
        return this.multiBufferEnabled;
    }

    public CreateServiceMeshRequest setMultiBufferPollDelay(String multiBufferPollDelay) {
        this.multiBufferPollDelay = multiBufferPollDelay;
        return this;
    }
    public String getMultiBufferPollDelay() {
        return this.multiBufferPollDelay;
    }

    public CreateServiceMeshRequest setMysqlFilterEnabled(Boolean mysqlFilterEnabled) {
        this.mysqlFilterEnabled = mysqlFilterEnabled;
        return this;
    }
    public Boolean getMysqlFilterEnabled() {
        return this.mysqlFilterEnabled;
    }

    public CreateServiceMeshRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceMeshRequest setOPALimitCPU(String OPALimitCPU) {
        this.OPALimitCPU = OPALimitCPU;
        return this;
    }
    public String getOPALimitCPU() {
        return this.OPALimitCPU;
    }

    public CreateServiceMeshRequest setOPALimitMemory(String OPALimitMemory) {
        this.OPALimitMemory = OPALimitMemory;
        return this;
    }
    public String getOPALimitMemory() {
        return this.OPALimitMemory;
    }

    public CreateServiceMeshRequest setOPALogLevel(String OPALogLevel) {
        this.OPALogLevel = OPALogLevel;
        return this;
    }
    public String getOPALogLevel() {
        return this.OPALogLevel;
    }

    public CreateServiceMeshRequest setOPARequestCPU(String OPARequestCPU) {
        this.OPARequestCPU = OPARequestCPU;
        return this;
    }
    public String getOPARequestCPU() {
        return this.OPARequestCPU;
    }

    public CreateServiceMeshRequest setOPARequestMemory(String OPARequestMemory) {
        this.OPARequestMemory = OPARequestMemory;
        return this;
    }
    public String getOPARequestMemory() {
        return this.OPARequestMemory;
    }

    public CreateServiceMeshRequest setOpaEnabled(Boolean opaEnabled) {
        this.opaEnabled = opaEnabled;
        return this;
    }
    public Boolean getOpaEnabled() {
        return this.opaEnabled;
    }

    public CreateServiceMeshRequest setOpenAgentPolicy(Boolean openAgentPolicy) {
        this.openAgentPolicy = openAgentPolicy;
        return this;
    }
    public Boolean getOpenAgentPolicy() {
        return this.openAgentPolicy;
    }

    public CreateServiceMeshRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateServiceMeshRequest setPilotLoadBalancerSpec(String pilotLoadBalancerSpec) {
        this.pilotLoadBalancerSpec = pilotLoadBalancerSpec;
        return this;
    }
    public String getPilotLoadBalancerSpec() {
        return this.pilotLoadBalancerSpec;
    }

    public CreateServiceMeshRequest setPlaygroundScene(String playgroundScene) {
        this.playgroundScene = playgroundScene;
        return this;
    }
    public String getPlaygroundScene() {
        return this.playgroundScene;
    }

    public CreateServiceMeshRequest setPrometheusUrl(String prometheusUrl) {
        this.prometheusUrl = prometheusUrl;
        return this;
    }
    public String getPrometheusUrl() {
        return this.prometheusUrl;
    }

    public CreateServiceMeshRequest setProxyLimitCPU(String proxyLimitCPU) {
        this.proxyLimitCPU = proxyLimitCPU;
        return this;
    }
    public String getProxyLimitCPU() {
        return this.proxyLimitCPU;
    }

    public CreateServiceMeshRequest setProxyLimitMemory(String proxyLimitMemory) {
        this.proxyLimitMemory = proxyLimitMemory;
        return this;
    }
    public String getProxyLimitMemory() {
        return this.proxyLimitMemory;
    }

    public CreateServiceMeshRequest setProxyRequestCPU(String proxyRequestCPU) {
        this.proxyRequestCPU = proxyRequestCPU;
        return this;
    }
    public String getProxyRequestCPU() {
        return this.proxyRequestCPU;
    }

    public CreateServiceMeshRequest setProxyRequestMemory(String proxyRequestMemory) {
        this.proxyRequestMemory = proxyRequestMemory;
        return this;
    }
    public String getProxyRequestMemory() {
        return this.proxyRequestMemory;
    }

    public CreateServiceMeshRequest setRedisFilterEnabled(Boolean redisFilterEnabled) {
        this.redisFilterEnabled = redisFilterEnabled;
        return this;
    }
    public Boolean getRedisFilterEnabled() {
        return this.redisFilterEnabled;
    }

    public CreateServiceMeshRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceMeshRequest setTag(java.util.List<CreateServiceMeshRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateServiceMeshRequestTag> getTag() {
        return this.tag;
    }

    public CreateServiceMeshRequest setTelemetry(Boolean telemetry) {
        this.telemetry = telemetry;
        return this;
    }
    public Boolean getTelemetry() {
        return this.telemetry;
    }

    public CreateServiceMeshRequest setThriftFilterEnabled(Boolean thriftFilterEnabled) {
        this.thriftFilterEnabled = thriftFilterEnabled;
        return this;
    }
    public Boolean getThriftFilterEnabled() {
        return this.thriftFilterEnabled;
    }

    public CreateServiceMeshRequest setTraceSampling(Float traceSampling) {
        this.traceSampling = traceSampling;
        return this;
    }
    public Float getTraceSampling() {
        return this.traceSampling;
    }

    public CreateServiceMeshRequest setTracing(Boolean tracing) {
        this.tracing = tracing;
        return this;
    }
    public Boolean getTracing() {
        return this.tracing;
    }

    public CreateServiceMeshRequest setUseExistingCA(Boolean useExistingCA) {
        this.useExistingCA = useExistingCA;
        return this;
    }
    public Boolean getUseExistingCA() {
        return this.useExistingCA;
    }

    public CreateServiceMeshRequest setVSwitches(String vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public String getVSwitches() {
        return this.vSwitches;
    }

    public CreateServiceMeshRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateServiceMeshRequest setWebAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
        this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
        return this;
    }
    public Boolean getWebAssemblyFilterEnabled() {
        return this.webAssemblyFilterEnabled;
    }

    public static class CreateServiceMeshRequestTag extends TeaModel {
        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServiceMeshRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceMeshRequestTag self = new CreateServiceMeshRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServiceMeshRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceMeshRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
