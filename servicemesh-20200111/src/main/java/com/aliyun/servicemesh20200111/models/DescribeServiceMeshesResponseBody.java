// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        @NameInMap("IntranetPilotEndpoint")
        public String intranetPilotEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        public String publicApiServerEndpoint;

        @NameInMap("PublicPilotEndpoint")
        public String publicPilotEndpoint;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Name")
        public String name;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdateTime")
        public String updateTime;

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
        @NameInMap("ApiServerLoadbalancerId")
        public String apiServerLoadbalancerId;

        @NameInMap("ApiServerPublicEip")
        public Boolean apiServerPublicEip;

        @NameInMap("PilotPublicEip")
        public Boolean pilotPublicEip;

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
        @NameInMap("Http10Enabled")
        public Boolean http10Enabled;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("AutoInjectionPolicyEnabled")
        public Boolean autoInjectionPolicyEnabled;

        @NameInMap("EnableNamespacesByDefault")
        public Boolean enableNamespacesByDefault;

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
        @NameInMap("Mtls")
        public Boolean mtls;

        @NameInMap("OutboundTrafficPolicy")
        public String outboundTrafficPolicy;

        @NameInMap("Pilot")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigPilot pilot;

        @NameInMap("SidecarInjector")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfigSidecarInjector sidecarInjector;

        @NameInMap("StrictMtls")
        public Boolean strictMtls;

        @NameInMap("Telemetry")
        public Boolean telemetry;

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
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

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
        @NameInMap("LoadBalancer")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpecMeshConfig meshConfig;

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
        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Endpoints")
        public DescribeServiceMeshesResponseBodyServiceMeshesEndpoints endpoints;

        @NameInMap("ServiceMeshInfo")
        public DescribeServiceMeshesResponseBodyServiceMeshesServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        public DescribeServiceMeshesResponseBodyServiceMeshesSpec spec;

        public static DescribeServiceMeshesResponseBodyServiceMeshes build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseBodyServiceMeshes self = new DescribeServiceMeshesResponseBodyServiceMeshes();
            return TeaModel.build(map, self);
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
