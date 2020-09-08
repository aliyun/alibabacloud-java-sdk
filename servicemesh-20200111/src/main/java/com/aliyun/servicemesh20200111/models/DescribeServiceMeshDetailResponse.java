// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ServiceMesh")
    @Validation(required = true)
    public DescribeServiceMeshDetailResponseServiceMesh serviceMesh;

    public static DescribeServiceMeshDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshDetailResponse self = new DescribeServiceMeshDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshDetailResponse setServiceMesh(DescribeServiceMeshDetailResponseServiceMesh serviceMesh) {
        this.serviceMesh = serviceMesh;
        return this;
    }
    public DescribeServiceMeshDetailResponseServiceMesh getServiceMesh() {
        return this.serviceMesh;
    }

    public static class DescribeServiceMeshDetailResponseServiceMeshEndpoints extends TeaModel {
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

        public static DescribeServiceMeshDetailResponseServiceMeshEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshEndpoints self = new DescribeServiceMeshDetailResponseServiceMeshEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeServiceMeshDetailResponseServiceMeshEndpoints setIntranetPilotEndpoint(String intranetPilotEndpoint) {
            this.intranetPilotEndpoint = intranetPilotEndpoint;
            return this;
        }
        public String getIntranetPilotEndpoint() {
            return this.intranetPilotEndpoint;
        }

        public DescribeServiceMeshDetailResponseServiceMeshEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

        public DescribeServiceMeshDetailResponseServiceMeshEndpoints setPublicPilotEndpoint(String publicPilotEndpoint) {
            this.publicPilotEndpoint = publicPilotEndpoint;
            return this;
        }
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo extends TeaModel {
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

        public static DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo self = new DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer extends TeaModel {
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

        public static DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer self = new DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer setApiServerLoadbalancerId(String apiServerLoadbalancerId) {
            this.apiServerLoadbalancerId = apiServerLoadbalancerId;
            return this;
        }
        public String getApiServerLoadbalancerId() {
            return this.apiServerLoadbalancerId;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer setApiServerPublicEip(Boolean apiServerPublicEip) {
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }
        public Boolean getApiServerPublicEip() {
            return this.apiServerPublicEip;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer setPilotPublicEip(Boolean pilotPublicEip) {
            this.pilotPublicEip = pilotPublicEip;
            return this;
        }
        public Boolean getPilotPublicEip() {
            return this.pilotPublicEip;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer setPilotPublicLoadbalancerId(String pilotPublicLoadbalancerId) {
            this.pilotPublicLoadbalancerId = pilotPublicLoadbalancerId;
            return this;
        }
        public String getPilotPublicLoadbalancerId() {
            return this.pilotPublicLoadbalancerId;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot extends TeaModel {
        @NameInMap("TraceSampling")
        @Validation(required = true)
        public Float traceSampling;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot setTraceSampling(Float traceSampling) {
            this.traceSampling = traceSampling;
            return this;
        }
        public Float getTraceSampling() {
            return this.traceSampling;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA extends TeaModel {
        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("LogLevel")
        @Validation(required = true)
        public String logLevel;

        @NameInMap("RequestCPU")
        @Validation(required = true)
        public String requestCPU;

        @NameInMap("RequestMemory")
        @Validation(required = true)
        public String requestMemory;

        @NameInMap("LimitCPU")
        @Validation(required = true)
        public String limitCPU;

        @NameInMap("LimitMemory")
        @Validation(required = true)
        public String limitMemory;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit extends TeaModel {
        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy extends TeaModel {
        @NameInMap("ClusterDomain")
        @Validation(required = true)
        public String clusterDomain;

        @NameInMap("RequestCPU")
        @Validation(required = true)
        public String requestCPU;

        @NameInMap("RequestMemory")
        @Validation(required = true)
        public String requestMemory;

        @NameInMap("LimitCPU")
        @Validation(required = true)
        public String limitCPU;

        @NameInMap("LimitMemory")
        @Validation(required = true)
        public String limitMemory;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig extends TeaModel {
        @NameInMap("EnableLocalityLB")
        @Validation(required = true)
        public Boolean enableLocalityLB;

        @NameInMap("Telemetry")
        @Validation(required = true)
        public Boolean telemetry;

        @NameInMap("Tracing")
        @Validation(required = true)
        public Boolean tracing;

        @NameInMap("CustomizedZipkin")
        @Validation(required = true)
        public Boolean customizedZipkin;

        @NameInMap("OutboundTrafficPolicy")
        @Validation(required = true)
        public String outboundTrafficPolicy;

        @NameInMap("IncludeIPRanges")
        @Validation(required = true)
        public String includeIPRanges;

        @NameInMap("Pilot")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot pilot;

        @NameInMap("OPA")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA OPA;

        @NameInMap("Audit")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit audit;

        @NameInMap("Proxy")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy proxy;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setEnableLocalityLB(Boolean enableLocalityLB) {
            this.enableLocalityLB = enableLocalityLB;
            return this;
        }
        public Boolean getEnableLocalityLB() {
            return this.enableLocalityLB;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setTelemetry(Boolean telemetry) {
            this.telemetry = telemetry;
            return this;
        }
        public Boolean getTelemetry() {
            return this.telemetry;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setTracing(Boolean tracing) {
            this.tracing = tracing;
            return this;
        }
        public Boolean getTracing() {
            return this.tracing;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setCustomizedZipkin(Boolean customizedZipkin) {
            this.customizedZipkin = customizedZipkin;
            return this;
        }
        public Boolean getCustomizedZipkin() {
            return this.customizedZipkin;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setOutboundTrafficPolicy(String outboundTrafficPolicy) {
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }
        public String getOutboundTrafficPolicy() {
            return this.outboundTrafficPolicy;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setIncludeIPRanges(String includeIPRanges) {
            this.includeIPRanges = includeIPRanges;
            return this;
        }
        public String getIncludeIPRanges() {
            return this.includeIPRanges;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setPilot(DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot pilot) {
            this.pilot = pilot;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot getPilot() {
            return this.pilot;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setOPA(DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA OPA) {
            this.OPA = OPA;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA getOPA() {
            return this.OPA;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setAudit(DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit audit) {
            this.audit = audit;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit getAudit() {
            return this.audit;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig setProxy(DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy proxy) {
            this.proxy = proxy;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy getProxy() {
            return this.proxy;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecNetwork extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitches")
        @Validation(required = true)
        public java.util.List<String> vSwitches;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecNetwork self = new DescribeServiceMeshDetailResponseServiceMeshSpecNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpecNetwork setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpec extends TeaModel {
        @NameInMap("LoadBalancer")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig meshConfig;

        @NameInMap("Network")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecNetwork network;

        public static DescribeServiceMeshDetailResponseServiceMeshSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpec self = new DescribeServiceMeshDetailResponseServiceMeshSpec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpec setLoadBalancer(DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer getLoadBalancer() {
            return this.loadBalancer;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpec setMeshConfig(DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig meshConfig) {
            this.meshConfig = meshConfig;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        public DescribeServiceMeshDetailResponseServiceMeshSpec setNetwork(DescribeServiceMeshDetailResponseServiceMeshSpecNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpecNetwork getNetwork() {
            return this.network;
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMesh extends TeaModel {
        @NameInMap("Endpoints")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshEndpoints endpoints;

        @NameInMap("ServiceMeshInfo")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpec spec;

        @NameInMap("Clusters")
        @Validation(required = true)
        public java.util.List<String> clusters;

        public static DescribeServiceMeshDetailResponseServiceMesh build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMesh self = new DescribeServiceMeshDetailResponseServiceMesh();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseServiceMesh setEndpoints(DescribeServiceMeshDetailResponseServiceMeshEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeServiceMeshDetailResponseServiceMesh setServiceMeshInfo(DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo serviceMeshInfo) {
            this.serviceMeshInfo = serviceMeshInfo;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo getServiceMeshInfo() {
            return this.serviceMeshInfo;
        }

        public DescribeServiceMeshDetailResponseServiceMesh setSpec(DescribeServiceMeshDetailResponseServiceMeshSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeServiceMeshDetailResponseServiceMeshSpec getSpec() {
            return this.spec;
        }

        public DescribeServiceMeshDetailResponseServiceMesh setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

    }

}
