// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable access log collection. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogEnabled")
    public Boolean accessLogEnabled;

    /**
     * <p>Specifies whether to enable access log collection. Valid values:</p>
     * <br>
     * <p>*   "": disables access log collection.</p>
     * <p>*   `/dev/stdout`: enables access log collection. Access logs are written to /dev/stdout.</p>
     */
    @NameInMap("AccessLogFile")
    public String accessLogFile;

    /**
     * <p>Custom fields of access logs. To set this parameter, you must enable access log collection. Otherwise, you cannot set this parameter. The value must be a JSON string. The following key values must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.</p>
     */
    @NameInMap("AccessLogFormat")
    public String accessLogFormat;

    /**
     * <p>The SLS project from which access logs are collected.</p>
     */
    @NameInMap("AccessLogProject")
    public String accessLogProject;

    /**
     * <p>Specifies whether to enable gRPC Access Log Service (ALS) of Envoy. gRPC is short for Google Remote Procedure Call. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("AccessLogServiceEnabled")
    public Boolean accessLogServiceEnabled;

    /**
     * <p>The endpoint of Envoy\"s gRPC ALS.</p>
     */
    @NameInMap("AccessLogServiceHost")
    public String accessLogServiceHost;

    /**
     * <p>The port of Envoy\"s gRPC ALS.</p>
     */
    @NameInMap("AccessLogServicePort")
    public Integer accessLogServicePort;

    /**
     * <p>The type of the SLB instance that is bound to Istio Pilot. Valid values: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`, `slb.s3.small`, `slb.s3.medium`, and `slb.s3.large`.</p>
     */
    @NameInMap("ApiServerLoadBalancerSpec")
    public String apiServerLoadBalancerSpec;

    /**
     * <p>Specifies whether to expose the API server to the Internet. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     * <br>
     * <p>> If you set this parameter to `false`, the API server cannot be accessed over the Internet.</p>
     */
    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    /**
     * <p>The name of the Log Service project that is used for mesh audit.</p>
     * <br>
     * <p>Default value: mesh-log-{ASM instance ID}.</p>
     */
    @NameInMap("AuditProject")
    public String auditProject;

    /**
     * <p>Specifies whether to enable auto-renewal for the SLB instance if the SLB instance uses the subscription billing method. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <br>
     * <p>- false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period of the SLB instance. This parameter is valid only if the `ChargeType` parameter is set to `PrePay`. If the original subscription period of the SLB instance is less than one year, the value of this parameter indicates the number of months for auto-renewal. If the original subscription period of the SLB instance is more than one year, the value of this parameter indicates the number of years for auto-renewal.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>Specifies whether to allow the Kubernetes API of clusters on the data plane to access Istio resources. The version of the ASM instance must be V1.9.7.93 or later. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CRAggregationEnabled")
    public Boolean CRAggregationEnabled;

    /**
     * <p>The billing method of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   `PayOnDemand`: pay-as-you-go.</p>
     * <p>*   `PrePay`: subscription.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The edition of the ASM instance. Valid values:</p>
     * <br>
     * <p>- `standard`: Standard Edition</p>
     * <br>
     * <p>- `enterprise`: Enterprise Edition</p>
     * <br>
     * <p>- `ultimate`: Ultimate Edition</p>
     */
    @NameInMap("ClusterSpec")
    public String clusterSpec;

    /**
     * <p>Specifies whether to enable the external service registry. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
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
     * <p>Specifies whether to enable the collection of control plane logs. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ControlPlaneLogEnabled")
    public Boolean controlPlaneLogEnabled;

    /**
     * <p>The name of the Log Service project that is used to collect the logs of the control plane.</p>
     */
    @NameInMap("ControlPlaneLogProject")
    public String controlPlaneLogProject;

    /**
     * <p>Specifies whether to use a custom Prometheus instance. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CustomizedPrometheus")
    public Boolean customizedPrometheus;

    /**
     * <p>Specifies whether to use a self-managed Zipkin system to collect tracing data. Valid values:</p>
     * <br>
     * <p>*   `true`: uses a self-managed Zipkin system to collect tracing data.</p>
     * <p>*   `false`: uses Alibaba Cloud Tracing Analysis to collect tracing data.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    /**
     * <p>Specifies whether to enable the DNS proxy feature. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("DNSProxyingEnabled")
    public Boolean DNSProxyingEnabled;

    /**
     * <p>Specifies whether to enable Dubbo Filter. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("DubboFilterEnabled")
    public Boolean dubboFilterEnabled;

    /**
     * <p>The edition of the ASM instance.</p>
     */
    @NameInMap("Edition")
    public String edition;

    @NameInMap("EnableAmbient")
    public Boolean enableAmbient;

    /**
     * <p>Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated [Log Service](https://sls.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>Specifies whether to enable the rollback feature for Istio resources. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableCRHistory")
    public Boolean enableCRHistory;

    /**
     * <p>Specifies whether to enable Secret Discovery Service (SDS). Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("EnableSDSServer")
    public Boolean enableSDSServer;

    /**
     * <p>The IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
     */
    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    /**
     * <p>The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).</p>
     */
    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    /**
     * <p>The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).</p>
     */
    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    /**
     * <p>The existing CA certificate, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-cert.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
     */
    @NameInMap("ExistingCaCert")
    public String existingCaCert;

    /**
     * <p>The existing CA key, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-key.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
     */
    @NameInMap("ExistingCaKey")
    public String existingCaKey;

    /**
     * <p>The type of the existing CA certificate. Valid values:</p>
     * <br>
     * <p>*   1: Self-signed certificate generated by istiod. The certificate corresponds to the secret named istio-ca-secret in the istio-system namespace. If you use this type of certificate, you must set the `ExistingCaCert` and `ExsitingCaKey` parameters.</p>
     * <p>*   2: Administrator-specified certificate. For more information, see [plugin ca cert](https://istio.io/latest/docs/tasks/security/cert-management/plugin-ca-cert/). In most cases, the certificate corresponds to the secret named cacerts in the istio-system namespace. If you use this type of certificate, you must set the `ExisingRootCaCert` and `ExisingRootCaKey` parameters.</p>
     */
    @NameInMap("ExistingCaType")
    public String existingCaType;

    /**
     * <p>The existing root certificate, which is encoded in Base64.</p>
     */
    @NameInMap("ExistingRootCaCert")
    public String existingRootCaCert;

    /**
     * <p>The private key that corresponds to the root certificate, which is encoded in Base64.</p>
     */
    @NameInMap("ExistingRootCaKey")
    public String existingRootCaKey;

    /**
     * <p>Specifies whether to enable gateway configuration filtering. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("FilterGatewayClusterConfig")
    public Boolean filterGatewayClusterConfig;

    /**
     * <p>Specifies whether to enable Gateway API. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("GatewayAPIEnabled")
    public Boolean gatewayAPIEnabled;

    /**
     * <p>After this ASM instance is successfully created, automatically add an ACK cluster to it. </p>
     * <p>Make sure this ASM instance and ACK cluster have same VPC, VSwitch, cluster domain.</p>
     */
    @NameInMap("GuestCluster")
    public String guestCluster;

    /**
     * <p>The IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
     */
    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    /**
     * <p>The Istio version of the ASM instance.</p>
     */
    @NameInMap("IstioVersion")
    public String istioVersion;

    /**
     * <p>Specifies whether to enable the mesh topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, you must set this parameter to `false`.`` Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("KialiEnabled")
    public Boolean kialiEnabled;

    /**
     * <p>The configurations for the access to the nearest instance.</p>
     */
    @NameInMap("LocalityLBConf")
    public String localityLBConf;

    /**
     * <p>Specifies whether to route traffic to the nearest instance. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    /**
     * <p>Specifies whether to enable Microservices Engine (MSE). Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("MSEEnabled")
    public Boolean MSEEnabled;

    /**
     * <p>Specifies whether to enable MultiBuffer-based Transport Layer Security (TLS) acceleration. Valid values:</p>
     * <br>
     * <p>- `true`</p>
     * <br>
     * <p>- `false`</p>
     * <br>
     * <br>
     * <p>Default value: `true`</p>
     */
    @NameInMap("MultiBufferEnabled")
    public Boolean multiBufferEnabled;

    /**
     * <p>The pull-request latency. Default value: 30. Unit: seconds.</p>
     */
    @NameInMap("MultiBufferPollDelay")
    public String multiBufferPollDelay;

    /**
     * <p>Specifies whether to enable MySQL Filter. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("MysqlFilterEnabled")
    public Boolean mysqlFilterEnabled;

    /**
     * <p>The name of the ASM instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of CPU cores that are available to the OPA container.</p>
     */
    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.</p>
     */
    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    /**
     * <p>The log level of the OPA container.</p>
     */
    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    /**
     * <p>The minimum number of CPU cores that are required by the OPA container. You can specify the parameter value in the standard representation form of CPUs in Kubernetes. For example, if you set the value to 1, one CPU core is required.</p>
     */
    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    /**
     * <p>The minimum size of the memory that is required by the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.</p>
     */
    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    /**
     * <p>Specifies whether to enable the OPA plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("OpaEnabled")
    public Boolean opaEnabled;

    /**
     * <p>Specifies whether to install the Open Policy Agent (OPA) plug-in. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    /**
     * <p>The auto-renewal period of the SLB instance. This parameter is valid only if `ChargeType` is set to `PrePaid`. The value of this parameter indicates the purchased month of the SLB instance when the subscription billing method is used. For example, if the subscription period is one year, set this parameter to 12.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The type of the SLB instance that is bound to Istio Pilot. Valid values: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`, `slb.s3.small`, `slb.s3.medium`, and `slb.s3.large`.</p>
     */
    @NameInMap("PilotLoadBalancerSpec")
    public String pilotLoadBalancerSpec;

    /**
     * <p>The endpoint of the custom Prometheus instance.</p>
     */
    @NameInMap("PrometheusUrl")
    public String prometheusUrl;

    /**
     * <p>The maximum number of CPU cores that are available to the proxy container.</p>
     */
    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    /**
     * <p>The maximum size of the memory that is available to the proxy container.</p>
     */
    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    /**
     * <p>The minimum number of CPU cores that are required by the proxy container.</p>
     */
    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    /**
     * <p>The minimum size of the memory that is required by the proxy container.</p>
     */
    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    /**
     * <p>Specifies whether to enable Redis Filter. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("RedisFilterEnabled")
    public Boolean redisFilterEnabled;

    /**
     * <p>The ID of the region in which the ASM instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<CreateServiceMeshRequestTag> tag;

    /**
     * <p>Specifies whether to enable Prometheus monitoring. We recommend that you use Prometheus Service of [Application Real-Time Monitoring Service (ARMS)](https://arms.console.aliyun.com/). Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Telemetry")
    public Boolean telemetry;

    /**
     * <p>Specifies whether to enable Thrift Filter. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("ThriftFilterEnabled")
    public Boolean thriftFilterEnabled;

    /**
     * <p>The sampling percentage of Tracing Analysis.</p>
     */
    @NameInMap("TraceSampling")
    public Float traceSampling;

    /**
     * <p>Specifies whether to enable the Tracing Analysis feature. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("Tracing")
    public Boolean tracing;

    /**
     * <p>Specifies whether to use an existing CA certificate and private key.</p>
     */
    @NameInMap("UseExistingCA")
    public Boolean useExistingCA;

    /**
     * <p>The ID of the vSwitch to which the ASM instance is connected.</p>
     */
    @NameInMap("VSwitches")
    public String vSwitches;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the ASM instance resides.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
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
        @NameInMap("Key")
        public String key;

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
