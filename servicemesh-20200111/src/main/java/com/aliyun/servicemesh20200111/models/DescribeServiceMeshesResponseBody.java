// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the ASM instances.</p>
     */
    @NameInMap("ServiceMeshes")
    public java.util.List<DescribeServiceMeshesResponseBodyServiceMeshes> serviceMeshes;

    public static DescribeServiceMeshesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshesResponseBody self = new DescribeServiceMeshesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshesResponseBody setServiceMeshes(java.util.List<DescribeServiceMeshesResponseBodyServiceMeshes> serviceMeshes) {
        this.serviceMeshes = serviceMeshes;
        return this;
    }
    public java.util.List<DescribeServiceMeshesResponseBodyServiceMeshes> getServiceMeshes() {
        return this.serviceMeshes;
    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesEndpoints extends TeaModel {
        /**
         * <p>The endpoint that is used to access the API server from the internal network.</p>
         */
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        /**
         * <p>The endpoint that is used to access Istio Pilot from the internal network.</p>
         */
        @NameInMap("IntranetPilotEndpoint")
        public String intranetPilotEndpoint;

        /**
         * <p>The endpoint that is used to expose the API server to the Internet.</p>
         */
        @NameInMap("PublicApiServerEndpoint")
        public String publicApiServerEndpoint;

        /**
         * <p>The endpoint that is used to expose Istio Pilot to the Internet.</p>
         */
        @NameInMap("PublicPilotEndpoint")
        public String publicPilotEndpoint;

        /**
         * <p>The endpoint of the reverse tunnel.</p>
         */
        @NameInMap("ReverseTunnelEndpoint")
        public String reverseTunnelEndpoint;

        public static DescribeServiceMeshesResponseBodyServiceMeshesEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesEndpoints self = new DescribeServiceMeshesResponseBodyServiceMeshesEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints setIntranetPilotEndpoint(String intranetPilotEndpoint) {
            this.intranetPilotEndpoint = intranetPilotEndpoint;
            return this;
        }
        public String getIntranetPilotEndpoint() {
            return this.intranetPilotEndpoint;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints setPublicPilotEndpoint(String publicPilotEndpoint) {
            this.publicPilotEndpoint = publicPilotEndpoint;
            return this;
        }
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints setReverseTunnelEndpoint(String reverseTunnelEndpoint) {
            this.reverseTunnelEndpoint = reverseTunnelEndpoint;
            return this;
        }
        public String getReverseTunnelEndpoint() {
            return this.reverseTunnelEndpoint;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo extends TeaModel {
        /**
         * <p>The point in time when the ASM instance was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error message that is returned when the call failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the ASM instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The edition of the ASM instance before ASM is available for commercial use. Valid values:</p>
         * <br>
         * <p>*   `Pro`: Professional Edition</p>
         * <p>*   `Default`: Standard Edition</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The ID of the region in which the ASM instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the ASM instance.</p>
         */
        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        /**
         * <p>The status of the ASM instance.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The point in time when the ASM instance was last modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version number of the ASM instance.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo self = new DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer extends TeaModel {
        /**
         * <p>The ID of the SLB instance that is used when the API server is exposed to the Internet.</p>
         */
        @NameInMap("ApiServerLoadbalancerId")
        public String apiServerLoadbalancerId;

        /**
         * <p>Indicates whether the API Server is exposed to the Internet. Valid values:</p>
         * <br>
         * <p>*   `true`: The API server is exposed to the Internet.</p>
         * <p>*   `false`: The API server is not exposed to the Internet.</p>
         */
        @NameInMap("ApiServerPublicEip")
        public Boolean apiServerPublicEip;

        /**
         * <p>Indicates whether Istio Pilot is exposed to the Internet. Valid values:</p>
         * <br>
         * <p>*   `true`: Istio Pilot is exposed to the Internet.</p>
         * <p>*   `false`: Istio Pilot is not exposed to the Internet.</p>
         */
        @NameInMap("PilotPublicEip")
        public Boolean pilotPublicEip;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance that is used when Istio Pilot is exposed to the Internet.</p>
         */
        @NameInMap("PilotPublicLoadbalancerId")
        public String pilotPublicLoadbalancerId;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer self = new DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer setApiServerLoadbalancerId(String apiServerLoadbalancerId) {
            this.apiServerLoadbalancerId = apiServerLoadbalancerId;
            return this;
        }
        public String getApiServerLoadbalancerId() {
            return this.apiServerLoadbalancerId;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer setApiServerPublicEip(Boolean apiServerPublicEip) {
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }
        public Boolean getApiServerPublicEip() {
            return this.apiServerPublicEip;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer setPilotPublicEip(Boolean pilotPublicEip) {
            this.pilotPublicEip = pilotPublicEip;
            return this;
        }
        public Boolean getPilotPublicEip() {
            return this.pilotPublicEip;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer setPilotPublicLoadbalancerId(String pilotPublicLoadbalancerId) {
            this.pilotPublicLoadbalancerId = pilotPublicLoadbalancerId;
            return this;
        }
        public String getPilotPublicLoadbalancerId() {
            return this.pilotPublicLoadbalancerId;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot extends TeaModel {
        /**
         * <p>Indicates whether the support for HTTP 1.0 is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The support for HTTP 1.0 is enabled.</p>
         * <p>*   `false`: The support for HTTP 1.0 is disabled.</p>
         */
        @NameInMap("Http10Enabled")
        public Boolean http10Enabled;

        /**
         * <p>The sampling percentage of tracing.</p>
         */
        @NameInMap("TraceSampling")
        public Float traceSampling;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot self = new DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot setHttp10Enabled(Boolean http10Enabled) {
            this.http10Enabled = http10Enabled;
            return this;
        }
        public Boolean getHttp10Enabled() {
            return this.http10Enabled;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot setTraceSampling(Float traceSampling) {
            this.traceSampling = traceSampling;
            return this;
        }
        public Float getTraceSampling() {
            return this.traceSampling;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration extends TeaModel {
        /**
         * <p>Indicates whether elevated privileges are required for the istio-init container when you perform traffic redirection for the istio-proxy container. Valid values:</p>
         * <br>
         * <p>*   `true`: Elevated privileges are required for the istio-init container.</p>
         * <p>*   `false`: Elevated privileges are not required for the istio-init container.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The namespace for which sidecar injection is disabled.</p>
         */
        @NameInMap("ExcludeNamespaces")
        public String excludeNamespaces;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration self = new DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration setExcludeNamespaces(String excludeNamespaces) {
            this.excludeNamespaces = excludeNamespaces;
            return this;
        }
        public String getExcludeNamespaces() {
            return this.excludeNamespaces;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector extends TeaModel {
        /**
         * <p>Indicates whether automatic sidecar injection is enabled by using annotations.</p>
         */
        @NameInMap("AutoInjectionPolicyEnabled")
        public Boolean autoInjectionPolicyEnabled;

        /**
         * <p>Indicates whether automatic sidecar injection is enabled for all namespaces. Valid values:</p>
         * <br>
         * <p>*   `true`: Automatic sidecar injection is enabled for all namespaces.</p>
         * <p>*   `false`: Automatic sidecar injection is disabled for all namespaces.</p>
         */
        @NameInMap("EnableNamespacesByDefault")
        public Boolean enableNamespacesByDefault;

        /**
         * <p>The initial configurations of Container Network Interface (CNI).</p>
         */
        @NameInMap("InitCNIConfiguration")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector self = new DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }
        public Boolean getAutoInjectionPolicyEnabled() {
            return this.autoInjectionPolicyEnabled;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }
        public Boolean getEnableNamespacesByDefault() {
            return this.enableNamespacesByDefault;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector setInitCNIConfiguration(DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration) {
            this.initCNIConfiguration = initCNIConfiguration;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration getInitCNIConfiguration() {
            return this.initCNIConfiguration;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig extends TeaModel {
        /**
         * <p>Indicates whether the feature of routing traffic to the nearest instance is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The feature is enabled.</p>
         * <p>*   `false`: The feature is disabled.</p>
         */
        @NameInMap("Mtls")
        public Boolean mtls;

        /**
         * <p>The outbound traffic policy. Valid values:</p>
         * <br>
         * <p>*   `ALLOW_ANY`: Outbound traffic to an external service is allowed.</p>
         * <p>*   `REGISTRY_ONLY`: Outbound traffic is allowed to only external services that are defined in the service registry of the ASM instance.</p>
         */
        @NameInMap("OutboundTrafficPolicy")
        public String outboundTrafficPolicy;

        /**
         * <p>The configurations of the control plane.</p>
         */
        @NameInMap("Pilot")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot pilot;

        /**
         * <p>The configurations of sidecar injection.</p>
         */
        @NameInMap("SidecarInjector")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector sidecarInjector;

        /**
         * <p>Indicates whether mutual Transport Layer Security (mTLS) is strictly enforced.</p>
         */
        @NameInMap("StrictMtls")
        public Boolean strictMtls;

        /**
         * <p>Indicates whether Prometheus monitoring is enabled. We recommend that you use Prometheus Service of Application Real-Time Monitoring Service (ARMS). Valid values:</p>
         * <br>
         * <p>*   `true`: Prometheus monitoring is enabled.</p>
         * <p>*   `false`: Prometheus monitoring is disabled.</p>
         */
        @NameInMap("Telemetry")
        public Boolean telemetry;

        /**
         * <p>Indicates whether the tracing feature is enabled. This feature can be enabled only after Tracing Analysis is activated. Valid values:</p>
         * <br>
         * <p>*   `true`: The tracing feature is enabled.</p>
         * <p>*   `false`: The tracing feature is disabled.</p>
         */
        @NameInMap("Tracing")
        public Boolean tracing;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig self = new DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setMtls(Boolean mtls) {
            this.mtls = mtls;
            return this;
        }
        public Boolean getMtls() {
            return this.mtls;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setOutboundTrafficPolicy(String outboundTrafficPolicy) {
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }
        public String getOutboundTrafficPolicy() {
            return this.outboundTrafficPolicy;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setPilot(DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot pilot) {
            this.pilot = pilot;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot getPilot() {
            return this.pilot;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setSidecarInjector(DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector sidecarInjector) {
            this.sidecarInjector = sidecarInjector;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector getSidecarInjector() {
            return this.sidecarInjector;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setStrictMtls(Boolean strictMtls) {
            this.strictMtls = strictMtls;
            return this;
        }
        public Boolean getStrictMtls() {
            return this.strictMtls;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setTelemetry(Boolean telemetry) {
            this.telemetry = telemetry;
            return this;
        }
        public Boolean getTelemetry() {
            return this.telemetry;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig setTracing(Boolean tracing) {
            this.tracing = tracing;
            return this;
        }
        public Boolean getTracing() {
            return this.tracing;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork extends TeaModel {
        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of vSwitches.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork self = new DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshesSpec extends TeaModel {
        /**
         * <p>The information about load balancing.</p>
         */
        @NameInMap("LoadBalancer")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer loadBalancer;

        /**
         * <p>The configurations of the ASM instance.</p>
         */
        @NameInMap("MeshConfig")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig meshConfig;

        /**
         * <p>The network configurations of the ASM instance.</p>
         */
        @NameInMap("Network")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork network;

        public static DescribeServiceMeshesResponseBodyServiceMeshesSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshesSpec self = new DescribeServiceMeshesResponseBodyServiceMeshesSpec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpec setLoadBalancer(DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer getLoadBalancer() {
            return this.loadBalancer;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpec setMeshConfig(DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig meshConfig) {
            this.meshConfig = meshConfig;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshesSpec setNetwork(DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecNetwork getNetwork() {
            return this.network;
        }

    }

    public static class DescribeServiceMeshesResponseBodyServiceMeshes extends TeaModel {
        /**
         * <p>The edition of the ASM instance. Valid values:</p>
         * <br>
         * <p>- `standard`: Standard Edition</p>
         * <p>- `enterprise`: Enterprise Edition</p>
         * <p>- `ultimate`: Ultimate Edition</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The information about the clusters.</p>
         */
        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        /**
         * <p>All endpoints of the ASM instance.</p>
         */
        @NameInMap("Endpoints")
        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints endpoints;

        /**
         * <p>The ID of the Alibaba Cloud service instance for which the ASM instance is created.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud service for which the ASM instance is created. Valid values:</p>
         * <br>
         * <p>- `ackone`: The ASM instance is created for Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
         * <p>- An empty value indicates that the ASM instance is created by the user.</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The basic information about the ASM instance.</p>
         */
        @NameInMap("ServiceMeshInfo")
        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo serviceMeshInfo;

        /**
         * <p>The specifications of the ASM instance.</p>
         */
        @NameInMap("Spec")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpec spec;

        public static DescribeServiceMeshesResponseBodyServiceMeshes build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshes self = new DescribeServiceMeshesResponseBodyServiceMeshes();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setEndpoints(DescribeServiceMeshesResponseBodyServiceMeshesEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setServiceMeshInfo(DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo serviceMeshInfo) {
            this.serviceMeshInfo = serviceMeshInfo;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo getServiceMeshInfo() {
            return this.serviceMeshInfo;
        }

        public DescribeServiceMeshesResponseBodyServiceMeshes setSpec(DescribeServiceMeshesResponseBodyServiceMeshesSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeServiceMeshesResponseBodyServiceMeshesSpec getSpec() {
            return this.spec;
        }

    }

}
