// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshRequest extends TeaModel {
    /**
     * <p>Specifies whether to use a custom Prometheus instance. Valid values:</p>
     * <br>
     * <p>*   `true`: uses a custom Prometheus instance.</p>
     * <p>*   `false`: does not use a custom Prometheus instance.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogEnabled")
    public Boolean accessLogEnabled;

    /**
     * <p>The name of the Log Service project that is used to collect access logs.</p>
     */
    @NameInMap("AccessLogFile")
    public String accessLogFile;

    /**
     * <p>Specifies whether to enable access logging. Valid values:</p>
     * <br>
     * <p>*   "": disables access logging.</p>
     * <p>*   `/dev/stdout`: enables access logging. Access logs are written to /dev/stdout.</p>
     */
    @NameInMap("AccessLogFormat")
    public String accessLogFormat;

    /**
     * <p>Specifies whether to enable the rollback feature for Istio resources. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the rollback feature for Istio resources.</p>
     * <p>*   `false`: disables the rollback feature for Istio resources.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogProject")
    public String accessLogProject;

    /**
     * <p>The endpoint of gRPC ALS for Envoy.</p>
     */
    @NameInMap("AccessLogServiceEnabled")
    public Boolean accessLogServiceEnabled;

    /**
     * <p>The port of gRPC ALS for Envoy.</p>
     */
    @NameInMap("AccessLogServiceHost")
    public String accessLogServiceHost;

    /**
     * <p>Specifies whether to enable Gateway API. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Gateway API.</p>
     * <p>*   `false`: disables Gateway API.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogServicePort")
    public Integer accessLogServicePort;

    /**
     * <p>The instance type of the SLB instance bound to Istio Pilot. Valid values: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`, `slb.s3.small`, `slb.s3.medium`, and `slb.s3.large`.</p>
     */
    @NameInMap("ApiServerLoadBalancerSpec")
    public String apiServerLoadBalancerSpec;

    /**
     * <p>Specifies whether to enable the Tracing Analysis feature. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the Tracing Analysis feature.</p>
     * <p>*   `false`: disables the Tracing Analysis feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    /**
     * <p>The number of CPU cores that are requested by the proxy container.</p>
     */
    @NameInMap("AuditProject")
    public String auditProject;

    /**
     * <p>The auto-renewal period of the SLB instance. This parameter is valid only if the `ChargeType` parameter is set to `PrePaid`. If the subscription period of the SLB instance is less than one year, the value of this parameter indicates the number of months for auto-renewal. If the subscription period of the SLB instance is more than one year, the value of this parameter indicates the number of years for auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The specification of the ASM instance. Valid values:</p>
     * <br>
     * <p>*   `standard`: Standard Edition</p>
     * <p>*   `enterprise`: Enterprise Edition</p>
     * <p>*   `ultimate`: Ultimate Edition</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>Specifies whether to enable Application High Availability Service (AHAS)-based throttling. Valid values:</p>
     * <br>
     * <p>*   `true`: enables AHAS-based throttling.</p>
     * <p>*   `false`: disables AHAS-based throttling.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CRAggregationEnabled")
    public Boolean CRAggregationEnabled;

    /**
     * <p>The subscription period of the SLB instance. Unit: month. This parameter is valid only if the ChargeType parameter is set to PrePaid. For example, if the subscription period is one year, set this parameter to 12.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to enable MultiBuffer-based Transport Layer Security (TLS) acceleration. Valid values:</p>
     * <br>
     * <p>*   `true`: enables MultiBuffer-based TLS acceleration.</p>
     * <p>*   `false`: disables MultiBuffer-based TLS acceleration.</p>
     * <br>
     * <p>Default value: `true`</p>
     */
    @NameInMap("ClusterSpec")
    public String clusterSpec;

    /**
     * <p>The instance ID of the Nacos registry.</p>
     */
    @NameInMap("ConfigSourceEnabled")
    public Boolean configSourceEnabled;

    /**
     * <p>Specifies whether to enable Dubbo Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Dubbo Filter.</p>
     * <p>*   `false`: disables Dubbo Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ConfigSourceNacosID")
    public String configSourceNacosID;

    /**
     * <p>The name of the Log Service project that is used to collect the logs of the control plane.</p>
     */
    @NameInMap("ControlPlaneLogEnabled")
    public Boolean controlPlaneLogEnabled;

    /**
     * <p>The custom format of access logs. To set this parameter, you must enable access log collection. Otherwise, you cannot set this parameter. The value must be a JSON string. The following key names must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.</p>
     */
    @NameInMap("ControlPlaneLogProject")
    public String controlPlaneLogProject;

    /**
     * <p>The endpoint of the custom Prometheus instance.</p>
     */
    @NameInMap("CustomizedPrometheus")
    public Boolean customizedPrometheus;

    /**
     * <p>Specifies whether to route traffic to the nearest instance. Valid values:</p>
     * <br>
     * <p>*   `true`: routes traffic to the nearest instance.</p>
     * <p>*   `false`: does not route traffic to the nearest instance.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    /**
     * <p>The edition of the ASM instance.</p>
     */
    @NameInMap("DNSProxyingEnabled")
    public Boolean DNSProxyingEnabled;

    /**
     * <p>Specifies whether to enable gateway configuration filtering. Valid values:</p>
     * <br>
     * <p>*   `true`: enables gateway configuration filtering.</p>
     * <p>*   `false`: disables gateway configuration filtering.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("DubboFilterEnabled")
    public Boolean dubboFilterEnabled;

    /**
     * <p>Specifies whether to enable the external service registry. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the external service registry.</p>
     * <p>*   `false`: disables the external service registry.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The name of the Log Service project that is used for mesh audit.</p>
     * <br>
     * <p>Default value: mesh-log-{ASM instance ID}.</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>Specifies whether to allow the Kubernetes API of clusters on the data plane to access Istio resources. To use this feature, the version of the ASM instance must be V1.9.7.93 or later. Valid values:</p>
     * <br>
     * <p>*   `true`: allows the Kubernetes API of clusters on the data plane to access Istio resources.</p>
     * <p>*   `false`: does not allow the Kubernetes API of clusters on the data plane to access Istio resources.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableCRHistory")
    public Boolean enableCRHistory;

    /**
     * <p>Specifies whether to enable gRPC Access Log Service (ALS) for Envoy. Valid values:</p>
     * <br>
     * <p>*   `true`: enables gRPC ALS.</p>
     * <p>*   `false`: disables gRPC ALS.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableSDSServer")
    public Boolean enableSDSServer;

    /**
     * <p>The outbound ports to be excluded from redirection to the sidecar proxies in the ASM instance. Separate multiple port numbers with commas (,).</p>
     */
    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    /**
     * <p>Specifies whether to enable the OPA plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the OPA plug-in.</p>
     * <p>*   `false`: disables the OPA plug-in.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    /**
     * <p>The inbound ports to be excluded from redirection to the sidecar proxies in the ASM instance. Separate multiple port numbers with commas (,).</p>
     */
    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    /**
     * <p>The existing CA key, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-key.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
     */
    @NameInMap("ExistingCaCert")
    public String existingCaCert;

    /**
     * <p>The type of the existing CA certificate. Valid values:</p>
     * <br>
     * <p>*   1: Self-signed certificate generated by Istiod. The certificate corresponds to the secret named istio-ca-secret in the istio-system namespace. If you use this type of certificate, you must set `ExistingCaCert` and `ExsitingCaKey` parameters.</p>
     * <p>*   2: Administrator-specified certificate. For more information, see [plugin ca cert](https://istio.io/latest/docs/tasks/security/cert-management/plugin-ca-cert/). In most cases, the certificate corresponds to the secret named cacerts in the istio-system namespace. If you use this type of certificate, you must set `ExisingRootCaCert` and `ExisingRootCaKey` parameters.</p>
     */
    @NameInMap("ExistingCaKey")
    public String existingCaKey;

    /**
     * <p>The existing root certificate, which is encoded in Base64.</p>
     */
    @NameInMap("ExistingCaType")
    public String existingCaType;

    /**
     * <p>The private key that corresponds to the root certificate, which is encoded in Base64.</p>
     */
    @NameInMap("ExistingRootCaCert")
    public String existingRootCaCert;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ExistingRootCaKey")
    public String existingRootCaKey;

    /**
     * <p>Specifies whether to enable Secret Discovery Service (SDS). Valid values:</p>
     * <br>
     * <p>*   `true`: enables SDS.</p>
     * <p>*   `false`: disables SDS.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("FilterGatewayClusterConfig")
    public Boolean filterGatewayClusterConfig;

    /**
     * <p>Specifies whether to enable the collection of control-plane logs. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the collection of control-plane logs.</p>
     * <p>*   `false`: disables the collection of control-plane logs.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("GatewayAPIEnabled")
    public Boolean gatewayAPIEnabled;

    /**
     * <p>The IP ranges in CIDR form to be excluded from redirection to sidecar proxies in the ASM instance.</p>
     */
    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("IstioVersion")
    public String istioVersion;

    /**
     * <p>Specifies whether to enable access log collection. Valid values:</p>
     * <br>
     * <p>*   `true`: enables access log collection.</p>
     * <p>*   `false`: disables access log collection.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("KialiEnabled")
    public Boolean kialiEnabled;

    /**
     * <p>Specifies whether to enable Prometheus monitoring. We recommend that you use Prometheus Service of [Application Real-Time Monitoring Service (ARMS)](https://arms.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`: enables Prometheus monitoring.</p>
     * <p>*   `false`: does not enable Prometheus monitoring.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("LocalityLBConf")
    public String localityLBConf;

    /**
     * <p>The configurations for the access to the nearest instance.</p>
     */
    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    /**
     * <p>Specifies whether to enable the DNS proxy feature. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the DNS proxy feature.</p>
     * <p>*   `false`: disables the DNS proxy feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("MSEEnabled")
    public Boolean MSEEnabled;

    /**
     * <p>The pull-request latency. Default value: `30`. Unit: seconds.</p>
     */
    @NameInMap("MultiBufferEnabled")
    public Boolean multiBufferEnabled;

    /**
     * <p>Specifies whether to use an existing CA certificate and private key.</p>
     */
    @NameInMap("MultiBufferPollDelay")
    public String multiBufferPollDelay;

    /**
     * <p>Specifies whether to enable Thrift Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Thrift Filter.</p>
     * <p>*   `false`: disables Thrift Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("MysqlFilterEnabled")
    public Boolean mysqlFilterEnabled;

    /**
     * <p>The ID of the vSwitch to which the ASM instance is connected.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum size of the memory that is available for OPA. You can specify the parameter value in the standard quantity representation used by Kubernetes. For example, a value of 1 Mi represents a memory size of 1,024 KB.</p>
     */
    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    /**
     * <p>Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated [Log Service](https://sls.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`: enables the mesh audit feature.</p>
     * <p>*   `false`: disables the mesh audit feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    /**
     * <p>The number of CPU cores that are requested by OPA. You can specify the parameter value in the standard representation form of CPUs in Kubernetes. For example, a value of 1 represents one CPU core.</p>
     */
    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    /**
     * <p>The size of the memory that is requested by OPA. You can specify the parameter value in the standard quantity representation used by Kubernetes. For example, a value of 1 Mi represents a memory size of 1,024 KB.</p>
     */
    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    /**
     * <p>The maximum number of CPU cores that are available for OPA.</p>
     */
    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    /**
     * <p>Specifies whether to enable the mesh topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, you must set this parameter to `false`. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the mesh topology feature.</p>
     * <p>*   `false`: disables the mesh topology feature.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("OpaEnabled")
    public Boolean opaEnabled;

    /**
     * <p>The log level of OPA.</p>
     */
    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    /**
     * <p>Specifies whether to enable auto-renewal for the SLB instance if the SLB instance uses the subscription billing method. Valid values:</p>
     * <br>
     * <p>*   `true`: enables auto-renewal.</p>
     * <p>*   `false`: disables auto-renewal.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing method of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   `PayOnDemand`: pay-as-you-go.</p>
     * <p>*   `PrePaid`: subscription.</p>
     */
    @NameInMap("PilotLoadBalancerSpec")
    public String pilotLoadBalancerSpec;

    /**
     * <p>Specifies whether to enable Redis Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Redis Filter.</p>
     * <p>*   `false`: disables Redis Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("PrometheusUrl")
    public String prometheusUrl;

    /**
     * <p>The maximum size of the memory that is available for the proxy container.</p>
     */
    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    /**
     * <p>The IP ranges in CIDR form to redirect to sidecar proxies in the ASM instance.</p>
     */
    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    /**
     * <p>The size of the memory that is requested by the proxy container.</p>
     */
    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    /**
     * <p>The maximum number of CPU cores that are available for the proxy container.</p>
     */
    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    /**
     * <p>Specifies whether to enable MySQL Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables MySQL Filter.</p>
     * <p>*   `false`: disables MySQL Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("RedisFilterEnabled")
    public Boolean redisFilterEnabled;

    /**
     * <p>The Istio version of the ASM instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to install the Open Policy Agent (OPA) plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`: installs the OPA plug-in.</p>
     * <p>*   `false`: does not install the OPA plug-in.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Telemetry")
    public Boolean telemetry;

    /**
     * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
     * <br>
     * <p>*   `true`: enables WebAssembly Filter.</p>
     * <p>*   `false`: disables WebAssembly Filter.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ThriftFilterEnabled")
    public Boolean thriftFilterEnabled;

    /**
     * <p>Specifies whether to use a self-managed Zipkin system to collect tracing data. Valid values:</p>
     * <br>
     * <p>*   `true`: uses a self-managed Zipkin system to collect tracing data.</p>
     * <p>*   `false`: uses Alibaba Cloud Tracing Analysis to collect tracing data.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("TraceSampling")
    public Float traceSampling;

    /**
     * <p>The name of the ASM instance.</p>
     */
    @NameInMap("Tracing")
    public Boolean tracing;

    /**
     * <p>The existing CA certificate, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-cert.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
     */
    @NameInMap("UseExistingCA")
    public Boolean useExistingCA;

    /**
     * <p>The sampling percentage of tracing analysis.</p>
     */
    @NameInMap("VSwitches")
    public String vSwitches;

    /**
     * <p>Specifies whether to expose the API server to the Internet. Valid values:</p>
     * <br>
     * <p>*   `true`: exposes the API server to the Internet.</p>
     * <p>*   `false`: does not expose the API server to the Internet.</p>
     * <br>
     * <p>Default value: `false`.</p>
     * <br>
     * <p>>  If you set this parameter to `false`, the API server cannot be accessed over the Internet.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether to enable Microservices Engine (MSE). Valid values:</p>
     * <br>
     * <p>*   `true`: enables MSE.</p>
     * <p>*   `false`: disables MSE.</p>
     * <br>
     * <p>Default value: `false`.</p>
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

    public CreateServiceMeshRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
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

}
