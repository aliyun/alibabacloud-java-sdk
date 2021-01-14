// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ServiceMeshes")
    @Validation(required = true)
    public java.util.List<DescribeServiceMeshesResponseServiceMeshes> serviceMeshes;

    public static DescribeServiceMeshesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshesResponse self = new DescribeServiceMeshesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshesResponse setServiceMeshes(java.util.List<DescribeServiceMeshesResponseServiceMeshes> serviceMeshes) {
        this.serviceMeshes = serviceMeshes;
        return this;
    }
    public java.util.List<DescribeServiceMeshesResponseServiceMeshes> getServiceMeshes() {
        return this.serviceMeshes;
    }

    public static class DescribeServiceMeshesResponseServiceMeshesEndpoints extends TeaModel {
        @NameInMap("IntranetApiServerEndpoint")
        @Validation(required = true)
        public String intranetApiServerEndpoint;

        @NameInMap("IntranetPilotEndpoint")
        @Validation(required = true)
        public String intranetPilotEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        @Validation(required = true)
        public String publicApiServerEndpoint;

        @NameInMap("PublicPilotEndpoint")
        @Validation(required = true)
        public String publicPilotEndpoint;

        @NameInMap("ReverseTunnelEndpoint")
        @Validation(required = true)
        public String reverseTunnelEndpoint;

        public static DescribeServiceMeshesResponseServiceMeshesEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesEndpoints self = new DescribeServiceMeshesResponseServiceMeshesEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeServiceMeshesResponseServiceMeshesEndpoints setIntranetPilotEndpoint(String intranetPilotEndpoint) {
            this.intranetPilotEndpoint = intranetPilotEndpoint;
            return this;
        }
        public String getIntranetPilotEndpoint() {
            return this.intranetPilotEndpoint;
        }

        public DescribeServiceMeshesResponseServiceMeshesEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

        public DescribeServiceMeshesResponseServiceMeshesEndpoints setPublicPilotEndpoint(String publicPilotEndpoint) {
            this.publicPilotEndpoint = publicPilotEndpoint;
            return this;
        }
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

        public DescribeServiceMeshesResponseServiceMeshesEndpoints setReverseTunnelEndpoint(String reverseTunnelEndpoint) {
            this.reverseTunnelEndpoint = reverseTunnelEndpoint;
            return this;
        }
        public String getReverseTunnelEndpoint() {
            return this.reverseTunnelEndpoint;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ServiceMeshId")
        @Validation(required = true)
        public String serviceMeshId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo self = new DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer extends TeaModel {
        @NameInMap("ApiServerLoadbalancerId")
        @Validation(required = true)
        public String apiServerLoadbalancerId;

        @NameInMap("ApiServerPublicEip")
        @Validation(required = true)
        public Boolean apiServerPublicEip;

        @NameInMap("PilotPublicEip")
        @Validation(required = true)
        public Boolean pilotPublicEip;

        @NameInMap("PilotPublicLoadbalancerId")
        @Validation(required = true)
        public String pilotPublicLoadbalancerId;

        public static DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer self = new DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer setApiServerLoadbalancerId(String apiServerLoadbalancerId) {
            this.apiServerLoadbalancerId = apiServerLoadbalancerId;
            return this;
        }
        public String getApiServerLoadbalancerId() {
            return this.apiServerLoadbalancerId;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer setApiServerPublicEip(Boolean apiServerPublicEip) {
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }
        public Boolean getApiServerPublicEip() {
            return this.apiServerPublicEip;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer setPilotPublicEip(Boolean pilotPublicEip) {
            this.pilotPublicEip = pilotPublicEip;
            return this;
        }
        public Boolean getPilotPublicEip() {
            return this.pilotPublicEip;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer setPilotPublicLoadbalancerId(String pilotPublicLoadbalancerId) {
            this.pilotPublicLoadbalancerId = pilotPublicLoadbalancerId;
            return this;
        }
        public String getPilotPublicLoadbalancerId() {
            return this.pilotPublicLoadbalancerId;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot extends TeaModel {
        @NameInMap("TraceSampling")
        @Validation(required = true)
        public Float traceSampling;

        @NameInMap("Http10Enabled")
        @Validation(required = true)
        public Boolean http10Enabled;

        public static DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot self = new DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot setTraceSampling(Float traceSampling) {
            this.traceSampling = traceSampling;
            return this;
        }
        public Float getTraceSampling() {
            return this.traceSampling;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot setHttp10Enabled(Boolean http10Enabled) {
            this.http10Enabled = http10Enabled;
            return this;
        }
        public Boolean getHttp10Enabled() {
            return this.http10Enabled;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration extends TeaModel {
        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("ExcludeNamespaces")
        @Validation(required = true)
        public String excludeNamespaces;

        public static DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration self = new DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration setExcludeNamespaces(String excludeNamespaces) {
            this.excludeNamespaces = excludeNamespaces;
            return this;
        }
        public String getExcludeNamespaces() {
            return this.excludeNamespaces;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector extends TeaModel {
        @NameInMap("EnableNamespacesByDefault")
        @Validation(required = true)
        public Boolean enableNamespacesByDefault;

        @NameInMap("AutoInjectionPolicyEnabled")
        @Validation(required = true)
        public Boolean autoInjectionPolicyEnabled;

        @NameInMap("InitCNIConfiguration")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration;

        public static DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector self = new DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }
        public Boolean getEnableNamespacesByDefault() {
            return this.enableNamespacesByDefault;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }
        public Boolean getAutoInjectionPolicyEnabled() {
            return this.autoInjectionPolicyEnabled;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector setInitCNIConfiguration(DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration) {
            this.initCNIConfiguration = initCNIConfiguration;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjectorInitCNIConfiguration getInitCNIConfiguration() {
            return this.initCNIConfiguration;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig extends TeaModel {
        @NameInMap("Mtls")
        @Validation(required = true)
        public Boolean mtls;

        @NameInMap("OutboundTrafficPolicy")
        @Validation(required = true)
        public String outboundTrafficPolicy;

        @NameInMap("StrictMtls")
        @Validation(required = true)
        public Boolean strictMtls;

        @NameInMap("Tracing")
        @Validation(required = true)
        public Boolean tracing;

        @NameInMap("Telemetry")
        @Validation(required = true)
        public Boolean telemetry;

        @NameInMap("Pilot")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot pilot;

        @NameInMap("SidecarInjector")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector sidecarInjector;

        public static DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig self = new DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setMtls(Boolean mtls) {
            this.mtls = mtls;
            return this;
        }
        public Boolean getMtls() {
            return this.mtls;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setOutboundTrafficPolicy(String outboundTrafficPolicy) {
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }
        public String getOutboundTrafficPolicy() {
            return this.outboundTrafficPolicy;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setStrictMtls(Boolean strictMtls) {
            this.strictMtls = strictMtls;
            return this;
        }
        public Boolean getStrictMtls() {
            return this.strictMtls;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setTracing(Boolean tracing) {
            this.tracing = tracing;
            return this;
        }
        public Boolean getTracing() {
            return this.tracing;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setTelemetry(Boolean telemetry) {
            this.telemetry = telemetry;
            return this;
        }
        public Boolean getTelemetry() {
            return this.telemetry;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setPilot(DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot pilot) {
            this.pilot = pilot;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigPilot getPilot() {
            return this.pilot;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig setSidecarInjector(DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector sidecarInjector) {
            this.sidecarInjector = sidecarInjector;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfigSidecarInjector getSidecarInjector() {
            return this.sidecarInjector;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecNetwork extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitches")
        @Validation(required = true)
        public java.util.List<String> vSwitches;

        public static DescribeServiceMeshesResponseServiceMeshesSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecNetwork self = new DescribeServiceMeshesResponseServiceMeshesSpecNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpecNetwork setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpec extends TeaModel {
        @NameInMap("LoadBalancer")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig meshConfig;

        @NameInMap("Network")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecNetwork network;

        public static DescribeServiceMeshesResponseServiceMeshesSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpec self = new DescribeServiceMeshesResponseServiceMeshesSpec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshesSpec setLoadBalancer(DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer getLoadBalancer() {
            return this.loadBalancer;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpec setMeshConfig(DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig meshConfig) {
            this.meshConfig = meshConfig;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        public DescribeServiceMeshesResponseServiceMeshesSpec setNetwork(DescribeServiceMeshesResponseServiceMeshesSpecNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpecNetwork getNetwork() {
            return this.network;
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshes extends TeaModel {
        @NameInMap("Endpoints")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesEndpoints endpoints;

        @NameInMap("ServiceMeshInfo")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpec spec;

        @NameInMap("Clusters")
        @Validation(required = true)
        public java.util.List<String> clusters;

        public static DescribeServiceMeshesResponseServiceMeshes build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshes self = new DescribeServiceMeshesResponseServiceMeshes();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshesResponseServiceMeshes setEndpoints(DescribeServiceMeshesResponseServiceMeshesEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeServiceMeshesResponseServiceMeshes setServiceMeshInfo(DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo serviceMeshInfo) {
            this.serviceMeshInfo = serviceMeshInfo;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo getServiceMeshInfo() {
            return this.serviceMeshInfo;
        }

        public DescribeServiceMeshesResponseServiceMeshes setSpec(DescribeServiceMeshesResponseServiceMeshesSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeServiceMeshesResponseServiceMeshesSpec getSpec() {
            return this.spec;
        }

        public DescribeServiceMeshesResponseServiceMeshes setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

    }

}
