// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the ASM instance.</p>
     */
    @NameInMap("ServiceMesh")
    public DescribeServiceMeshDetailResponseBodyServiceMesh serviceMesh;

    public static DescribeServiceMeshDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshDetailResponseBody self = new DescribeServiceMeshDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshDetailResponseBody setServiceMesh(DescribeServiceMeshDetailResponseBodyServiceMesh serviceMesh) {
        this.serviceMesh = serviceMesh;
        return this;
    }
    public DescribeServiceMeshDetailResponseBodyServiceMesh getServiceMesh() {
        return this.serviceMesh;
    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints extends TeaModel {
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

        public static DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints self = new DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setIntranetPilotEndpoint(String intranetPilotEndpoint) {
            this.intranetPilotEndpoint = intranetPilotEndpoint;
            return this;
        }
        public String getIntranetPilotEndpoint() {
            return this.intranetPilotEndpoint;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setPublicPilotEndpoint(String publicPilotEndpoint) {
            this.publicPilotEndpoint = publicPilotEndpoint;
            return this;
        }
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo extends TeaModel {
        /**
         * <p>The time when the ASM instance was created.</p>
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
         * <p>The edition of the ASM instance. Valid values:</p>
         * <br>
         * <p>*   `Default`: Standard Edition</p>
         * <p>*   `Pro`: Professional Edition</p>
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
         * <p>The time when the ASM instance was last modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version of the ASM instance.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo self = new DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer extends TeaModel {
        /**
         * <p>The ID of the SLB instance that is used when the API server is exposed to the Internet.</p>
         */
        @NameInMap("ApiServerLoadbalancerId")
        public String apiServerLoadbalancerId;

        /**
         * <p>Indicates whether the API server is exposed to the Internet. Valid values:</p>
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

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer setApiServerLoadbalancerId(String apiServerLoadbalancerId) {
            this.apiServerLoadbalancerId = apiServerLoadbalancerId;
            return this;
        }
        public String getApiServerLoadbalancerId() {
            return this.apiServerLoadbalancerId;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer setApiServerPublicEip(Boolean apiServerPublicEip) {
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }
        public Boolean getApiServerPublicEip() {
            return this.apiServerPublicEip;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer setPilotPublicEip(Boolean pilotPublicEip) {
            this.pilotPublicEip = pilotPublicEip;
            return this;
        }
        public Boolean getPilotPublicEip() {
            return this.pilotPublicEip;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer setPilotPublicLoadbalancerId(String pilotPublicLoadbalancerId) {
            this.pilotPublicLoadbalancerId = pilotPublicLoadbalancerId;
            return this;
        }
        public String getPilotPublicLoadbalancerId() {
            return this.pilotPublicLoadbalancerId;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog extends TeaModel {
        /**
         * <p>Indicates whether access log collection is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Access log collection is enabled.</p>
         * <p>*   `false`: Access log collection is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The name of the Log Service project that stores access logs.</p>
         */
        @NameInMap("Project")
        public String project;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit extends TeaModel {
        /**
         * <p>Indicates whether an audit project exists in the ASM instance. Valid values:</p>
         * <br>
         * <p>*   `audit_project_exist`: An audit project exists.</p>
         * <p>*   `audit_project_not_exist`: No audit project exists.</p>
         */
        @NameInMap("AuditProjectStatus")
        public String auditProjectStatus;

        /**
         * <p>Indicates whether mesh audit is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Mesh audit is enabled.</p>
         * <p>*   `false`: Mesh audit is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The name of the Log Service project that is used for mesh audit.</p>
         */
        @NameInMap("Project")
        public String project;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit setAuditProjectStatus(String auditProjectStatus) {
            this.auditProjectStatus = auditProjectStatus;
            return this;
        }
        public String getAuditProjectStatus() {
            return this.auditProjectStatus;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo extends TeaModel {
        /**
         * <p>Indicates whether the collection of control-plane logs is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The collection of control-plane logs is enabled.</p>
         * <p>*   `false`: The collection of control-plane logs is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("LogTTL")
        public Integer logTTL;

        /**
         * <p>The name of the Log Service project that stores control-plane logs.</p>
         */
        @NameInMap("Project")
        public String project;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo setLogTTL(Integer logTTL) {
            this.logTTL = logTTL;
            return this;
        }
        public Integer getLogTTL() {
            return this.logTTL;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition extends TeaModel {
        /**
         * <p>The version of the Istiod image.</p>
         */
        @NameInMap("IstiodImageTag")
        public String istiodImageTag;

        /**
         * <p>The name of the edition.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the Istio Proxy image.</p>
         */
        @NameInMap("ProxyImageTag")
        public String proxyImageTag;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition setIstiodImageTag(String istiodImageTag) {
            this.istiodImageTag = istiodImageTag;
            return this;
        }
        public String getIstiodImageTag() {
            return this.istiodImageTag;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition setProxyImageTag(String proxyImageTag) {
            this.proxyImageTag = proxyImageTag;
            return this;
        }
        public String getProxyImageTag() {
            return this.proxyImageTag;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf extends TeaModel {
        @NameInMap("GatewayEnabled")
        public Boolean gatewayEnabled;

        /**
         * <p>The retention period for the access logs of the ingress gateway. Unit: day. The logs are collected by using the Log Service. For example, a value of 30 indicates that the logs are retained for 30 days.</p>
         */
        @NameInMap("GatewayLifecycle")
        public Integer gatewayLifecycle;

        @NameInMap("SidecarEnabled")
        public Boolean sidecarEnabled;

        /**
         * <p>The retention period for the access logs of sidecar proxies. Unit: day. The logs are collected by using the Log Service. For example, a value of 30 indicates that the logs are retained for 30 days.</p>
         */
        @NameInMap("SidecarLifecycle")
        public Integer sidecarLifecycle;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf setGatewayEnabled(Boolean gatewayEnabled) {
            this.gatewayEnabled = gatewayEnabled;
            return this;
        }
        public Boolean getGatewayEnabled() {
            return this.gatewayEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf setGatewayLifecycle(Integer gatewayLifecycle) {
            this.gatewayLifecycle = gatewayLifecycle;
            return this;
        }
        public Integer getGatewayLifecycle() {
            return this.gatewayLifecycle;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf setSidecarEnabled(Boolean sidecarEnabled) {
            this.sidecarEnabled = sidecarEnabled;
            return this;
        }
        public Boolean getSidecarEnabled() {
            return this.sidecarEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf setSidecarLifecycle(Integer sidecarLifecycle) {
            this.sidecarLifecycle = sidecarLifecycle;
            return this;
        }
        public Integer getSidecarLifecycle() {
            return this.sidecarLifecycle;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu extends TeaModel {
        /**
         * <p>The expected CPU utilization when HPA is enabled. Valid values: 1 to 100. If the CPU utilization exceeds this value, the number of pod replicas increases. If the CPU utilization is less than this value, the number of pod replicas decreases.</p>
         */
        @NameInMap("TargetAverageUtilization")
        public Integer targetAverageUtilization;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu setTargetAverageUtilization(Integer targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }
        public Integer getTargetAverageUtilization() {
            return this.targetAverageUtilization;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory extends TeaModel {
        /**
         * <p>The expected memory usage when HPA is enabled. Valid values: 1 to 100. If the memory usage exceeds this value, the number of pod replicas increases. If the memory usage is less than this value, the number of pod replicas decreases.</p>
         */
        @NameInMap("TargetAverageUtilization")
        public Integer targetAverageUtilization;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory setTargetAverageUtilization(Integer targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }
        public Integer getTargetAverageUtilization() {
            return this.targetAverageUtilization;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources extends TeaModel {
        /**
         * <p>The resources that are available to the egress gateway.</p>
         */
        @NameInMap("Limits")
        public java.util.Map<String, ?> limits;

        /**
         * <p>The resources that are requested by the egress gateway.</p>
         */
        @NameInMap("Requests")
        public java.util.Map<String, ?> requests;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources setLimits(java.util.Map<String, ?> limits) {
            this.limits = limits;
            return this;
        }
        public java.util.Map<String, ?> getLimits() {
            return this.limits;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources setRequests(java.util.Map<String, ?> requests) {
            this.requests = requests;
            return this;
        }
        public java.util.Map<String, ?> getRequests() {
            return this.requests;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration extends TeaModel {
        /**
         * <p>Indicates whether Horizontal Pod Autoscaling (HPA) is enabled for the egress gateway.</p>
         */
        @NameInMap("EgressAutoscaleEnabled")
        public Boolean egressAutoscaleEnabled;

        /**
         * <p>The CPU resource configurations of the egress gateway when HPA is enabled.</p>
         */
        @NameInMap("EgressHpaCpu")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu egressHpaCpu;

        /**
         * <p>The memory resource configurations of the egress gateway when HPA is enabled.</p>
         */
        @NameInMap("EgressHpaMemory")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory egressHpaMemory;

        /**
         * <p>The maximum number of egress gateway pod replicas when HPA is enabled.</p>
         */
        @NameInMap("EgressMaxReplica")
        public Integer egressMaxReplica;

        /**
         * <p>The minimum number of egress gateway pod replicas when HPA is enabled.</p>
         */
        @NameInMap("EgressMinReplica")
        public Integer egressMinReplica;

        /**
         * <p>The number of the egress gateway pod replicas.</p>
         */
        @NameInMap("EgressReplicaCount")
        public Integer egressReplicaCount;

        /**
         * <p>The resource configurations of the egress gateway that is used by adaptive xDS optimization.</p>
         */
        @NameInMap("EgressResources")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources egressResources;

        /**
         * <p>Indicates whether adaptive xDS optimization is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressAutoscaleEnabled(Boolean egressAutoscaleEnabled) {
            this.egressAutoscaleEnabled = egressAutoscaleEnabled;
            return this;
        }
        public Boolean getEgressAutoscaleEnabled() {
            return this.egressAutoscaleEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressHpaCpu(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu egressHpaCpu) {
            this.egressHpaCpu = egressHpaCpu;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaCpu getEgressHpaCpu() {
            return this.egressHpaCpu;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressHpaMemory(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory egressHpaMemory) {
            this.egressHpaMemory = egressHpaMemory;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressHpaMemory getEgressHpaMemory() {
            return this.egressHpaMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressMaxReplica(Integer egressMaxReplica) {
            this.egressMaxReplica = egressMaxReplica;
            return this;
        }
        public Integer getEgressMaxReplica() {
            return this.egressMaxReplica;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressMinReplica(Integer egressMinReplica) {
            this.egressMinReplica = egressMinReplica;
            return this;
        }
        public Integer getEgressMinReplica() {
            return this.egressMinReplica;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressReplicaCount(Integer egressReplicaCount) {
            this.egressReplicaCount = egressReplicaCount;
            return this;
        }
        public Integer getEgressReplicaCount() {
            return this.egressReplicaCount;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEgressResources(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources egressResources) {
            this.egressResources = egressResources;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfigurationEgressResources getEgressResources() {
            return this.egressResources;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis extends TeaModel {
        /**
         * <p>Indicates whether automatic diagnosis is enabled for the ASM instance. If you enable this feature, the ASM instance is automatically diagnosed five minutes after you modify an Istio resource.</p>
         */
        @NameInMap("AutoDiagnosisEnabled")
        public Boolean autoDiagnosisEnabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis setAutoDiagnosisEnabled(Boolean autoDiagnosisEnabled) {
            this.autoDiagnosisEnabled = autoDiagnosisEnabled;
            return this;
        }
        public Boolean getAutoDiagnosisEnabled() {
            return this.autoDiagnosisEnabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration extends TeaModel {
        /**
         * <p>Indicates whether Istio resources can be accessed by using the Kubernetes API on the data plane.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory extends TeaModel {
        /**
         * <p>Indicates whether the rollback feature for Istio resources is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The rollback feature for Istio resources is enabled.</p>
         * <p>*   `false`: The rollback feature for Istio resources is disabled.</p>
         */
        @NameInMap("EnableHistory")
        public Boolean enableHistory;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory setEnableHistory(Boolean enableHistory) {
            this.enableHistory = enableHistory;
            return this;
        }
        public Boolean getEnableHistory() {
            return this.enableHistory;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec extends TeaModel {
        /**
         * <p>The executed command.</p>
         */
        @NameInMap("command")
        public java.util.List<String> command;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders extends TeaModel {
        /**
         * <p>The name of the HTTP request header.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the HTTP request header field.</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet extends TeaModel {
        /**
         * <p>The URL of the request.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The HTTP request headers.</p>
         */
        @NameInMap("httpHeaders")
        public java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders> httpHeaders;

        /**
         * <p>The port number of the request.</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <p>The request method. Valid values: `http` and `https`.</p>
         */
        @NameInMap("scheme")
        public String scheme;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet setHttpHeaders(java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket extends TeaModel {
        /**
         * <p>The URL of the TCP socket request.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The port number of the TCP socket request.</p>
         */
        @NameInMap("port")
        public String port;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart extends TeaModel {
        /**
         * <p>The post-start script.</p>
         */
        @NameInMap("exec")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec exec;

        /**
         * <p>The HTTP GET request that is sent before the instance stops.</p>
         */
        @NameInMap("httpGet")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet httpGet;

        /**
         * <p>The TCP socket request that is sent.</p>
         */
        @NameInMap("tcpSocket")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket tcpSocket;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart setExec(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec exec) {
            this.exec = exec;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec getExec() {
            return this.exec;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart setHttpGet(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart setTcpSocket(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec extends TeaModel {
        /**
         * <p>The executed command.</p>
         */
        @NameInMap("command")
        public java.util.List<String> command;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders extends TeaModel {
        /**
         * <p>The name of the HTTP request header.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the HTTP request header field.</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet extends TeaModel {
        /**
         * <p>The URL of the request.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The HTTP request headers.</p>
         */
        @NameInMap("httpHeaders")
        public java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders> httpHeaders;

        /**
         * <p>The port number of the request.</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <p>The request method. Valid values: `http` and `https`.</p>
         */
        @NameInMap("scheme")
        public String scheme;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet setHttpHeaders(java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket extends TeaModel {
        /**
         * <p>The URL of the request.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The port number of the request.</p>
         */
        @NameInMap("port")
        public String port;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop extends TeaModel {
        /**
         * <p>The pre-close script.</p>
         */
        @NameInMap("exec")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec exec;

        /**
         * <p>The HTTP GET request that is sent before the instance stops.</p>
         */
        @NameInMap("httpGet")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet httpGet;

        /**
         * <p>The TCP socket request that is sent.</p>
         */
        @NameInMap("tcpSocket")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket tcpSocket;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop setExec(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec exec) {
            this.exec = exec;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec getExec() {
            return this.exec;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop setHttpGet(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop setTcpSocket(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle extends TeaModel {
        /**
         * <p>The post-start parameters.</p>
         */
        @NameInMap("postStart")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart postStart;

        /**
         * <p>The pre-close parameters.</p>
         */
        @NameInMap("preStop")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop preStop;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle setPostStart(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart postStart) {
            this.postStart = postStart;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart getPostStart() {
            return this.postStart;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle setPreStop(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop preStop) {
            this.preStop = preStop;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStop getPreStop() {
            return this.preStop;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer extends TeaModel {
        /**
         * <p>Indicates whether MulitiBuffer-based TLS acceleration is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: MulitiBuffer-based TLS acceleration is enabled.</p>
         * <p>*   `false`: MulitiBuffer-based TLS acceleration is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The pull-request latency.</p>
         */
        @NameInMap("PollDelay")
        public String pollDelay;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer setPollDelay(String pollDelay) {
            this.pollDelay = pollDelay;
            return this;
        }
        public String getPollDelay() {
            return this.pollDelay;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration extends TeaModel {
        /**
         * <p>Indicates whether NFD is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether feature labels on nodes are cleared when NFD is disabled.</p>
         */
        @NameInMap("NFDLabelPruned")
        public Boolean NFDLabelPruned;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration setNFDLabelPruned(Boolean NFDLabelPruned) {
            this.NFDLabelPruned = NFDLabelPruned;
            return this;
        }
        public Boolean getNFDLabelPruned() {
            return this.NFDLabelPruned;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection extends TeaModel {
        /**
         * <p>Indicates whether the feature of controlling the OPA injection scope is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The feature is enabled.</p>
         * <p>*   `false`: The feature is disabled.</p>
         */
        @NameInMap("OPAScopeInjected")
        public Boolean OPAScopeInjected;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection setOPAScopeInjected(Boolean OPAScopeInjected) {
            this.OPAScopeInjected = OPAScopeInjected;
            return this;
        }
        public Boolean getOPAScopeInjected() {
            return this.OPAScopeInjected;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit extends TeaModel {
        /**
         * <p>The maximum number of CPU cores that are available to the istio-init container.</p>
         */
        @NameInMap("ResourceCPULimit")
        public String resourceCPULimit;

        /**
         * <p>The maximum size of the memory that is available to the istio-init container.</p>
         */
        @NameInMap("ResourceMemoryLimit")
        public String resourceMemoryLimit;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit setResourceCPULimit(String resourceCPULimit) {
            this.resourceCPULimit = resourceCPULimit;
            return this;
        }
        public String getResourceCPULimit() {
            return this.resourceCPULimit;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit setResourceMemoryLimit(String resourceMemoryLimit) {
            this.resourceMemoryLimit = resourceMemoryLimit;
            return this;
        }
        public String getResourceMemoryLimit() {
            return this.resourceMemoryLimit;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest extends TeaModel {
        /**
         * <p>The number of CPU cores that are requested by the istio-init container.</p>
         */
        @NameInMap("ResourceCPURequest")
        public String resourceCPURequest;

        /**
         * <p>The size of the memory that is requested by the istio-init container.</p>
         */
        @NameInMap("ResourceMemoryRequest")
        public String resourceMemoryRequest;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest setResourceCPURequest(String resourceCPURequest) {
            this.resourceCPURequest = resourceCPURequest;
            return this;
        }
        public String getResourceCPURequest() {
            return this.resourceCPURequest;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest setResourceMemoryRequest(String resourceMemoryRequest) {
            this.resourceMemoryRequest = resourceMemoryRequest;
            return this;
        }
        public String getResourceMemoryRequest() {
            return this.resourceMemoryRequest;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration extends TeaModel {
        /**
         * <p>The configurations of additional features for access log collection</p>
         */
        @NameInMap("AccessLogExtraConf")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf accessLogExtraConf;

        /**
         * <p>The configurations of adaptive xDS optimization.</p>
         */
        @NameInMap("AdaptiveXdsConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration adaptiveXdsConfiguration;

        /**
         * <p>The configurations of automatic diagnosis for the ASM instance.</p>
         */
        @NameInMap("AutoDiagnosis")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis autoDiagnosis;

        /**
         * <p>Access to Istio resources by using the Kubernetes API on the data plane.</p>
         */
        @NameInMap("CRAggregationConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration CRAggregationConfiguration;

        /**
         * <p>Indicates whether the Kubernetes API of clusters on the data plane can be used to access Istio resources. Valid values:</p>
         * <br>
         * <p>*   `true`: The Kubernetes API of clusters on the data plane can be used to access Istio resources.</p>
         * <p>*   `false`: The Kubernetes API of clusters on the data plane cannot be used to access Istio resources.</p>
         */
        @NameInMap("CRAggregationEnabled")
        public Boolean CRAggregationEnabled;

        /**
         * <p>The label selectors used to specify namespaces on the data plane. The control plane discovers and process only application services in the specified namespaces.</p>
         */
        @NameInMap("DiscoverySelectors")
        public java.util.List<java.util.Map<String, ?>> discoverySelectors;

        /**
         * <p>The configurations of the rollback feature for Istio resources.</p>
         */
        @NameInMap("IstioCRHistory")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory istioCRHistory;

        /**
         * <p>The lifecycle of Istio Proxy.</p>
         */
        @NameInMap("Lifecycle")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle lifecycle;

        /**
         * <p>The information about Transport Layer Security (TLS) acceleration based on MulitiBuffer.</p>
         */
        @NameInMap("MultiBuffer")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer multiBuffer;

        /**
         * <p>The configurations of Node Feature Discovery (NFD).</p>
         */
        @NameInMap("NFDConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration NFDConfiguration;

        /**
         * <p>The configurations of the feature of controlling the OPA injection scope.</p>
         */
        @NameInMap("OPAScopeInjection")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection OPAScopeInjection;

        /**
         * <p>The resource limits on the istio-init container.</p>
         */
        @NameInMap("SidecarProxyInitResourceLimit")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        /**
         * <p>The resources that are requested by the istio-init container.</p>
         */
        @NameInMap("SidecarProxyInitResourceRequest")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        /**
         * <p>The maximum period of time that Istio Proxy waits for a request to end.</p>
         */
        @NameInMap("TerminationDrainDuration")
        public String terminationDrainDuration;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setAccessLogExtraConf(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf accessLogExtraConf) {
            this.accessLogExtraConf = accessLogExtraConf;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAccessLogExtraConf getAccessLogExtraConf() {
            return this.accessLogExtraConf;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setAdaptiveXdsConfiguration(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration adaptiveXdsConfiguration) {
            this.adaptiveXdsConfiguration = adaptiveXdsConfiguration;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAdaptiveXdsConfiguration getAdaptiveXdsConfiguration() {
            return this.adaptiveXdsConfiguration;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setAutoDiagnosis(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis autoDiagnosis) {
            this.autoDiagnosis = autoDiagnosis;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationAutoDiagnosis getAutoDiagnosis() {
            return this.autoDiagnosis;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setCRAggregationConfiguration(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration CRAggregationConfiguration) {
            this.CRAggregationConfiguration = CRAggregationConfiguration;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration getCRAggregationConfiguration() {
            return this.CRAggregationConfiguration;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setCRAggregationEnabled(Boolean CRAggregationEnabled) {
            this.CRAggregationEnabled = CRAggregationEnabled;
            return this;
        }
        public Boolean getCRAggregationEnabled() {
            return this.CRAggregationEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setDiscoverySelectors(java.util.List<java.util.Map<String, ?>> discoverySelectors) {
            this.discoverySelectors = discoverySelectors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDiscoverySelectors() {
            return this.discoverySelectors;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setIstioCRHistory(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory istioCRHistory) {
            this.istioCRHistory = istioCRHistory;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory getIstioCRHistory() {
            return this.istioCRHistory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setLifecycle(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle getLifecycle() {
            return this.lifecycle;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setMultiBuffer(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer multiBuffer) {
            this.multiBuffer = multiBuffer;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer getMultiBuffer() {
            return this.multiBuffer;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setNFDConfiguration(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration NFDConfiguration) {
            this.NFDConfiguration = NFDConfiguration;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration getNFDConfiguration() {
            return this.NFDConfiguration;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setOPAScopeInjection(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection OPAScopeInjection) {
            this.OPAScopeInjection = OPAScopeInjection;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection getOPAScopeInjection() {
            return this.OPAScopeInjection;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setSidecarProxyInitResourceLimit(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
            this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit getSidecarProxyInitResourceLimit() {
            return this.sidecarProxyInitResourceLimit;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setSidecarProxyInitResourceRequest(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
            this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest getSidecarProxyInitResourceRequest() {
            return this.sidecarProxyInitResourceRequest;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setTerminationDrainDuration(String terminationDrainDuration) {
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }
        public String getTerminationDrainDuration() {
            return this.terminationDrainDuration;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport extends TeaModel {
        /**
         * <p>Indicates whether Gateway API is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Gateway API is enabled.</p>
         * <p>*   `false`: Gateway API is disabled.</p>
         */
        @NameInMap("GatewayAPIEnabled")
        public Boolean gatewayAPIEnabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport setGatewayAPIEnabled(Boolean gatewayAPIEnabled) {
            this.gatewayAPIEnabled = gatewayAPIEnabled;
            return this;
        }
        public Boolean getGatewayAPIEnabled() {
            return this.gatewayAPIEnabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali extends TeaModel {
        /**
         * <p>Indicates whether mesh topology is enabled. Mesh topology can be enabled only when Prometheus monitoring is enabled. If Prometheus monitoring is disabled, you must set this parameter to `false`. Valid values:</p>
         * <br>
         * <p>*   `true`: Mesh topology is enabled.</p>
         * <p>*   `false`: Mesh topology is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The endpoint of the mesh topology service.</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB extends TeaModel {
        /**
         * <p>The configurations of cross-region traffic distribution.</p>
         * <br>
         * <p>>  Only one of `Failover` and Distribute parameters can be set. If you set the `Distribute` parameter, you cannot set the Failover parameter.</p>
         */
        @NameInMap("Distribute")
        public java.util.Map<String, ?> distribute;

        /**
         * <p>Indicates whether cross-region load balancing is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Cross-region load balancing is enabled.</p>
         * <p>*   `false`: Cross-region load balancing is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The configurations of cross-region failover.</p>
         * <br>
         * <p>>  Only one of Failover and `Distribute` parameters can be set. If you set the `Failover` parameter, you cannot set the `Distribute` parameter.</p>
         */
        @NameInMap("Failover")
        public java.util.Map<String, ?> failover;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB setDistribute(java.util.Map<String, ?> distribute) {
            this.distribute = distribute;
            return this;
        }
        public java.util.Map<String, ?> getDistribute() {
            return this.distribute;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB setFailover(java.util.Map<String, ?> failover) {
            this.failover = failover;
            return this;
        }
        public java.util.Map<String, ?> getFailover() {
            return this.failover;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE extends TeaModel {
        /**
         * <p>Indicates whether MSE is enabled. Valid values:</p>
         * <br>
         * <p>- `true`: MSE is enabled.</p>
         * <p>- `false`: MSE is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA extends TeaModel {
        /**
         * <p>Indicates whether the OPA plug-in is installed. Valid values:</p>
         * <br>
         * <p>*   `true`: The OPA plug-in is installed.</p>
         * <p>*   `false`: The OPA plug-in is not installed.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of CPU cores that are available to the OPA proxy container.</p>
         */
        @NameInMap("LimitCPU")
        public String limitCPU;

        /**
         * <p>The maximum size of the memory that is available to the OPA proxy container.</p>
         */
        @NameInMap("LimitMemory")
        public String limitMemory;

        /**
         * <p>The level of the logs to be generated for OPA.</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        /**
         * <p>The number of CPU cores that are requested by the OPA proxy container.</p>
         */
        @NameInMap("RequestCPU")
        public String requestCPU;

        /**
         * <p>The size of the memory that is requested by the OPA proxy container.</p>
         */
        @NameInMap("RequestMemory")
        public String requestMemory;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource extends TeaModel {
        /**
         * <p>Indicates whether communication is allowed between external services and services in the mesh. Valid values:</p>
         * <br>
         * <p>*   `true`: The communication is allowed.</p>
         * <p>*   `false`: The communication is not allowed.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the Nacos instance that provides external service information.</p>
         */
        @NameInMap("NacosID")
        public String nacosID;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource setNacosID(String nacosID) {
            this.nacosID = nacosID;
            return this;
        }
        public String getNacosID() {
            return this.nacosID;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature extends TeaModel {
        /**
         * <p>Indicates whether Secret Discovery Service (SDS) is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: SDS is enabled.</p>
         * <p>*   `false`: SDS is disabled.</p>
         */
        @NameInMap("EnableSDSServer")
        public Boolean enableSDSServer;

        /**
         * <p>Indicates whether gateway configuration filtering is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Gateway configuration filtering is enabled.</p>
         * <p>*   `false`: Gateway configuration filtering is disabled.</p>
         */
        @NameInMap("FilterGatewayClusterConfig")
        public Boolean filterGatewayClusterConfig;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature setEnableSDSServer(Boolean enableSDSServer) {
            this.enableSDSServer = enableSDSServer;
            return this;
        }
        public Boolean getEnableSDSServer() {
            return this.enableSDSServer;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature setFilterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
            this.filterGatewayClusterConfig = filterGatewayClusterConfig;
            return this;
        }
        public Boolean getFilterGatewayClusterConfig() {
            return this.filterGatewayClusterConfig;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot extends TeaModel {
        /**
         * <p>The configurations of communication between external services and services in the mesh.</p>
         */
        @NameInMap("ConfigSource")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource configSource;

        /**
         * <p>The configurations of Pilot features.</p>
         */
        @NameInMap("Feature")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature feature;

        /**
         * <p>Indicates whether HTTP/1.0 is supported. Valid values:</p>
         * <br>
         * <p>*   `true`: HTTP/1.0 is supported.</p>
         * <p>*   `false`: HTTP/1.0 is not supported.</p>
         */
        @NameInMap("Http10Enabled")
        public Boolean http10Enabled;

        /**
         * <p>The sampling percentage of tracing analysis.</p>
         */
        @NameInMap("TraceSampling")
        public Float traceSampling;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot setConfigSource(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource configSource) {
            this.configSource = configSource;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource getConfigSource() {
            return this.configSource;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot setFeature(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature feature) {
            this.feature = feature;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature getFeature() {
            return this.feature;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot setHttp10Enabled(Boolean http10Enabled) {
            this.http10Enabled = http10Enabled;
            return this;
        }
        public Boolean getHttp10Enabled() {
            return this.http10Enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot setTraceSampling(Float traceSampling) {
            this.traceSampling = traceSampling;
            return this;
        }
        public Float getTraceSampling() {
            return this.traceSampling;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus extends TeaModel {
        /**
         * <p>The endpoint of Prometheus monitoring. If you use a custom Prometheus instance, this parameter is populated by the system.</p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        /**
         * <p>Indicates whether a custom Prometheus instance is used. Valid values:</p>
         * <br>
         * <p>*   `true`: A custom Prometheus instance is used.</p>
         * <p>*   `false`: No custom Prometheus instance is used.</p>
         */
        @NameInMap("UseExternal")
        public Boolean useExternal;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus setUseExternal(Boolean useExternal) {
            this.useExternal = useExternal;
            return this;
        }
        public Boolean getUseExternal() {
            return this.useExternal;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport extends TeaModel {
        /**
         * <p>Indicates whether Dubbo Filter is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Dubbo Filter is enabled.</p>
         * <p>*   `false`: Dubbo Filter is disabled.</p>
         */
        @NameInMap("DubboFilterEnabled")
        public Boolean dubboFilterEnabled;

        /**
         * <p>Indicates whether MySQL Filter is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: MySQL Filter is enabled.</p>
         * <p>*   `false`: MySQL Filter is disabled.</p>
         */
        @NameInMap("MysqlFilterEnabled")
        public Boolean mysqlFilterEnabled;

        /**
         * <p>Indicates whether Redis Filter is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Redis Filter is enabled.</p>
         * <p>*   `false`: Redis Filter is disabled.</p>
         */
        @NameInMap("RedisFilterEnabled")
        public Boolean redisFilterEnabled;

        /**
         * <p>Indicates whether Thrift Filter is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Thrift Filter is enabled.</p>
         * <p>*   `false`: Thrift Filter is disabled.</p>
         */
        @NameInMap("ThriftFilterEnabled")
        public Boolean thriftFilterEnabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport setDubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }
        public Boolean getDubboFilterEnabled() {
            return this.dubboFilterEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport setMysqlFilterEnabled(Boolean mysqlFilterEnabled) {
            this.mysqlFilterEnabled = mysqlFilterEnabled;
            return this;
        }
        public Boolean getMysqlFilterEnabled() {
            return this.mysqlFilterEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport setRedisFilterEnabled(Boolean redisFilterEnabled) {
            this.redisFilterEnabled = redisFilterEnabled;
            return this;
        }
        public Boolean getRedisFilterEnabled() {
            return this.redisFilterEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport setThriftFilterEnabled(Boolean thriftFilterEnabled) {
            this.thriftFilterEnabled = thriftFilterEnabled;
            return this;
        }
        public Boolean getThriftFilterEnabled() {
            return this.thriftFilterEnabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy extends TeaModel {
        /**
         * <p>The path to the file that stores the access logs of sidecar proxies.</p>
         */
        @NameInMap("AccessLogFile")
        public String accessLogFile;

        /**
         * <p>The format of the access logs of sidecar proxies.</p>
         */
        @NameInMap("AccessLogFormat")
        public String accessLogFormat;

        /**
         * <p>Indicates whether gRPC Access Log Service (ALS) for Envoy is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: gRPC ALS for Envoy is enabled.</p>
         * <p>*   `false`: gRPC ALS for Envoy is disabled.</p>
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
         * <p>The trusted domain.</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        /**
         * <p>Indicates whether the Domain Name System (DNS) proxy feature is enabled. Valid values: Valid values:</p>
         * <br>
         * <p>*   `true`: The DNS proxy feature is enabled.</p>
         * <p>*   `false`: The DNS proxy feature is disabled.</p>
         */
        @NameInMap("EnableDNSProxying")
        public Boolean enableDNSProxying;

        /**
         * <p>The maximum number of CPU cores.</p>
         */
        @NameInMap("LimitCPU")
        public String limitCPU;

        /**
         * <p>The maximum size of the memory.</p>
         */
        @NameInMap("LimitMemory")
        public String limitMemory;

        /**
         * <p>The number of CPU cores that are requested.</p>
         */
        @NameInMap("RequestCPU")
        public String requestCPU;

        /**
         * <p>The size of the memory that is requested.</p>
         */
        @NameInMap("RequestMemory")
        public String requestMemory;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setAccessLogFile(String accessLogFile) {
            this.accessLogFile = accessLogFile;
            return this;
        }
        public String getAccessLogFile() {
            return this.accessLogFile;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setAccessLogFormat(String accessLogFormat) {
            this.accessLogFormat = accessLogFormat;
            return this;
        }
        public String getAccessLogFormat() {
            return this.accessLogFormat;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setAccessLogServiceEnabled(Boolean accessLogServiceEnabled) {
            this.accessLogServiceEnabled = accessLogServiceEnabled;
            return this;
        }
        public Boolean getAccessLogServiceEnabled() {
            return this.accessLogServiceEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setAccessLogServiceHost(String accessLogServiceHost) {
            this.accessLogServiceHost = accessLogServiceHost;
            return this;
        }
        public String getAccessLogServiceHost() {
            return this.accessLogServiceHost;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setAccessLogServicePort(Integer accessLogServicePort) {
            this.accessLogServicePort = accessLogServicePort;
            return this;
        }
        public Integer getAccessLogServicePort() {
            return this.accessLogServicePort;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setEnableDNSProxying(Boolean enableDNSProxying) {
            this.enableDNSProxying = enableDNSProxying;
            return this;
        }
        public Boolean getEnableDNSProxying() {
            return this.enableDNSProxying;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration extends TeaModel {
        /**
         * <p>Indicates whether the CNI plug-in is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The CNI plug-in is enabled.</p>
         * <p>*   `false`: The CNI plug-in is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The namespaces to exclude. The CNI plug-in ignores pods in the excluded namespaces.</p>
         */
        @NameInMap("ExcludeNamespaces")
        public String excludeNamespaces;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration setExcludeNamespaces(String excludeNamespaces) {
            this.excludeNamespaces = excludeNamespaces;
            return this;
        }
        public String getExcludeNamespaces() {
            return this.excludeNamespaces;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector extends TeaModel {
        /**
         * <p>Indicates whether automatic sidecar injection can be enabled by using pod annotations. Valid values:</p>
         * <br>
         * <p>*   `true`: Automatic sidecar injection can be enabled by using pod annotations.</p>
         * <p>*   `false`: Automatic sidecar injection cannot be enabled by using pod annotations.</p>
         */
        @NameInMap("AutoInjectionPolicyEnabled")
        public Boolean autoInjectionPolicyEnabled;

        /**
         * <p>Indicates whether automatic sidecar injection is enabled for all namespaces. Valid values:</p>
         * <br>
         * <p>*   `true`: Automatic sidecar injection is enabled for all namespaces.</p>
         * <p>*   `false`: Automatic sidecar injection is not enabled for all namespaces.</p>
         */
        @NameInMap("EnableNamespacesByDefault")
        public Boolean enableNamespacesByDefault;

        /**
         * <p>The configurations of Container Network Interface (CNI).</p>
         */
        @NameInMap("InitCNIConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration;

        /**
         * <p>The maximum number of CPU cores that are available to the sidecar injector pod.</p>
         */
        @NameInMap("LimitCPU")
        public String limitCPU;

        /**
         * <p>The maximum size of the memory that is available to the sidecar injector pod.</p>
         */
        @NameInMap("LimitMemory")
        public String limitMemory;

        /**
         * <p>The number of CPU cores that are requested by the sidecar injector pod.</p>
         */
        @NameInMap("RequestCPU")
        public String requestCPU;

        /**
         * <p>The size of the memory that is requested by the sidecar injector pod.</p>
         */
        @NameInMap("RequestMemory")
        public String requestMemory;

        /**
         * <p>The number of component replicas that are used for sidecar injection. Default value: `1`.</p>
         */
        @NameInMap("SidecarInjectorNum")
        public Integer sidecarInjectorNum;

        /**
         * <p>Other configurations of automatic sidecar injection, in the YAML format. For more information, see [Enable automatic sidecar injection by using multiple methods](~~186136~~).</p>
         */
        @NameInMap("SidecarInjectorWebhookAsYaml")
        public String sidecarInjectorWebhookAsYaml;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }
        public Boolean getAutoInjectionPolicyEnabled() {
            return this.autoInjectionPolicyEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }
        public Boolean getEnableNamespacesByDefault() {
            return this.enableNamespacesByDefault;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setInitCNIConfiguration(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration) {
            this.initCNIConfiguration = initCNIConfiguration;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration getInitCNIConfiguration() {
            return this.initCNIConfiguration;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setSidecarInjectorNum(Integer sidecarInjectorNum) {
            this.sidecarInjectorNum = sidecarInjectorNum;
            return this;
        }
        public Integer getSidecarInjectorNum() {
            return this.sidecarInjectorNum;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
            this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
            return this;
        }
        public String getSidecarInjectorWebhookAsYaml() {
            return this.sidecarInjectorWebhookAsYaml;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment extends TeaModel {
        /**
         * <p>Indicates whether WebAssembly Filter is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`:WebAssembly Filter is enabled.</p>
         * <p>*   `false`: WebAssembly Filter is disabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig extends TeaModel {
        /**
         * <p>The configurations of access log collection.</p>
         */
        @NameInMap("AccessLog")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog accessLog;

        /**
         * <p>The information about mesh audit.</p>
         */
        @NameInMap("Audit")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit audit;

        /**
         * <p>The configurations of control-plane log collection.</p>
         */
        @NameInMap("ControlPlaneLogInfo")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo controlPlaneLogInfo;

        /**
         * <p>Indicates whether a custom Zipkin system is used. Valid values:</p>
         * <br>
         * <p>*   `true`: A custom Zipkin system is used.</p>
         * <p>*   `false`: No custom Zipkin system is used.</p>
         */
        @NameInMap("CustomizedZipkin")
        public Boolean customizedZipkin;

        /**
         * <p>The information about the edition.</p>
         */
        @NameInMap("Edition")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition edition;

        /**
         * <p>Indicates whether the feature that routes traffic to the nearest instance is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: The feature is enabled.</p>
         * <p>*   `false`: The feature is disabled.</p>
         */
        @NameInMap("EnableLocalityLB")
        public Boolean enableLocalityLB;

        /**
         * <p>The IP ranges in CIDR form to be excluded from redirection to sidecar proxies in the ASM instance.</p>
         */
        @NameInMap("ExcludeIPRanges")
        public String excludeIPRanges;

        /**
         * <p>The inbound ports to be excluded from redirection to sidecar proxies in the ASM instance.</p>
         */
        @NameInMap("ExcludeInboundPorts")
        public String excludeInboundPorts;

        /**
         * <p>The outbound ports to be excluded from redirection to sidecar proxies in the ASM instance.</p>
         */
        @NameInMap("ExcludeOutboundPorts")
        public String excludeOutboundPorts;

        /**
         * <p>The configurations of additional features for the ASM instance.</p>
         */
        @NameInMap("ExtraConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration extraConfiguration;

        /**
         * <p>The IP ranges in CIDR form to redirect to the sidecar proxies in the ASM instance.</p>
         */
        @NameInMap("IncludeIPRanges")
        public String includeIPRanges;

        /**
         * <p>The information about the Kubernetes API.</p>
         */
        @NameInMap("K8sNewAPIsSupport")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport k8sNewAPIsSupport;

        /**
         * <p>The configurations of mesh topology.</p>
         */
        @NameInMap("Kiali")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali kiali;

        /**
         * <p>The configurations of cross-region load balancing.</p>
         */
        @NameInMap("LocalityLB")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB localityLB;

        /**
         * <p>The configurations of Microservices Engine (MSE).</p>
         */
        @NameInMap("MSE")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE MSE;

        /**
         * <p>The information about the Open Policy Agent (OPA) plug-in.</p>
         */
        @NameInMap("OPA")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA OPA;

        /**
         * <p>The outbound traffic policy. Valid values:</p>
         * <br>
         * <p>*   `ALLOW_ANY`: Outbound traffic to all external services is allowed.</p>
         * <p>*   `REGISTRY_ONLY`: Outbound traffic is allowed to only external services that are defined in the service registry of the ASM instance.</p>
         */
        @NameInMap("OutboundTrafficPolicy")
        public String outboundTrafficPolicy;

        /**
         * <p>The Pilot configurations.</p>
         */
        @NameInMap("Pilot")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot pilot;

        /**
         * <p>The configurations of Prometheus monitoring.</p>
         */
        @NameInMap("Prometheus")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus prometheus;

        /**
         * <p>The configurations of protocol support.</p>
         */
        @NameInMap("ProtocolSupport")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport protocolSupport;

        /**
         * <p>The proxy configurations.</p>
         */
        @NameInMap("Proxy")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy proxy;

        /**
         * <p>The configurations of the sidecar injector.</p>
         */
        @NameInMap("SidecarInjector")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector sidecarInjector;

        /**
         * <p>Indicates whether Prometheus monitoring is enabled. We recommend that you use [Prometheus Service of Application Real-Time Monitoring Service (ARMS)](https://arms.console.aliyun.com/). Valid values:</p>
         * <br>
         * <p>*   `true`: Prometheus monitoring is enabled.</p>
         * <p>*   `false`: Prometheus monitoring is disabled.</p>
         */
        @NameInMap("Telemetry")
        public Boolean telemetry;

        /**
         * <p>Indicates whether tracing analysis is enabled. This feature can be enabled only after [Tracing Analysis](https://tracing-analysis.console.aliyun.com/) is activated. Valid values:</p>
         * <br>
         * <p>*   `true`: Tracing analysis is enabled.</p>
         * <p>*   `false`: Tracing analysis is disabled.</p>
         */
        @NameInMap("Tracing")
        public Boolean tracing;

        /**
         * <p>The configurations of WebAssembly Filter.</p>
         */
        @NameInMap("WebAssemblyFilterDeployment")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment webAssemblyFilterDeployment;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setAccessLog(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog getAccessLog() {
            return this.accessLog;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setAudit(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit audit) {
            this.audit = audit;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit getAudit() {
            return this.audit;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setControlPlaneLogInfo(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo controlPlaneLogInfo) {
            this.controlPlaneLogInfo = controlPlaneLogInfo;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo getControlPlaneLogInfo() {
            return this.controlPlaneLogInfo;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setCustomizedZipkin(Boolean customizedZipkin) {
            this.customizedZipkin = customizedZipkin;
            return this;
        }
        public Boolean getCustomizedZipkin() {
            return this.customizedZipkin;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setEdition(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition edition) {
            this.edition = edition;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition getEdition() {
            return this.edition;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setEnableLocalityLB(Boolean enableLocalityLB) {
            this.enableLocalityLB = enableLocalityLB;
            return this;
        }
        public Boolean getEnableLocalityLB() {
            return this.enableLocalityLB;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExcludeIPRanges(String excludeIPRanges) {
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }
        public String getExcludeIPRanges() {
            return this.excludeIPRanges;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExcludeInboundPorts(String excludeInboundPorts) {
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }
        public String getExcludeInboundPorts() {
            return this.excludeInboundPorts;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExcludeOutboundPorts(String excludeOutboundPorts) {
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }
        public String getExcludeOutboundPorts() {
            return this.excludeOutboundPorts;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExtraConfiguration(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration extraConfiguration) {
            this.extraConfiguration = extraConfiguration;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration getExtraConfiguration() {
            return this.extraConfiguration;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setIncludeIPRanges(String includeIPRanges) {
            this.includeIPRanges = includeIPRanges;
            return this;
        }
        public String getIncludeIPRanges() {
            return this.includeIPRanges;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setK8sNewAPIsSupport(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport k8sNewAPIsSupport) {
            this.k8sNewAPIsSupport = k8sNewAPIsSupport;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport getK8sNewAPIsSupport() {
            return this.k8sNewAPIsSupport;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setKiali(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali kiali) {
            this.kiali = kiali;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali getKiali() {
            return this.kiali;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setLocalityLB(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB localityLB) {
            this.localityLB = localityLB;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB getLocalityLB() {
            return this.localityLB;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setMSE(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE MSE) {
            this.MSE = MSE;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE getMSE() {
            return this.MSE;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setOPA(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA OPA) {
            this.OPA = OPA;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA getOPA() {
            return this.OPA;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setOutboundTrafficPolicy(String outboundTrafficPolicy) {
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }
        public String getOutboundTrafficPolicy() {
            return this.outboundTrafficPolicy;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setPilot(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot pilot) {
            this.pilot = pilot;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot getPilot() {
            return this.pilot;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setPrometheus(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus prometheus) {
            this.prometheus = prometheus;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus getPrometheus() {
            return this.prometheus;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setProtocolSupport(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport protocolSupport) {
            this.protocolSupport = protocolSupport;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport getProtocolSupport() {
            return this.protocolSupport;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setProxy(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy proxy) {
            this.proxy = proxy;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy getProxy() {
            return this.proxy;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setSidecarInjector(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector sidecarInjector) {
            this.sidecarInjector = sidecarInjector;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector getSidecarInjector() {
            return this.sidecarInjector;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setTelemetry(Boolean telemetry) {
            this.telemetry = telemetry;
            return this;
        }
        public Boolean getTelemetry() {
            return this.telemetry;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setTracing(Boolean tracing) {
            this.tracing = tracing;
            return this;
        }
        public Boolean getTracing() {
            return this.tracing;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setWebAssemblyFilterDeployment(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment webAssemblyFilterDeployment) {
            this.webAssemblyFilterDeployment = webAssemblyFilterDeployment;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment getWebAssemblyFilterDeployment() {
            return this.webAssemblyFilterDeployment;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork extends TeaModel {
        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpec extends TeaModel {
        /**
         * <p>The information about load balancing.</p>
         */
        @NameInMap("LoadBalancer")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer loadBalancer;

        /**
         * <p>The configurations of the ASM instance.</p>
         */
        @NameInMap("MeshConfig")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig meshConfig;

        /**
         * <p>The network configurations of the ASM instance.</p>
         */
        @NameInMap("Network")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork network;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpec self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec setLoadBalancer(DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer getLoadBalancer() {
            return this.loadBalancer;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec setMeshConfig(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig meshConfig) {
            this.meshConfig = meshConfig;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec setNetwork(DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork getNetwork() {
            return this.network;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMesh extends TeaModel {
        /**
         * <p>The specification of the ASM instance. Valid values:</p>
         * <br>
         * <p>- `standard`: Standard Edition</p>
         * <p>- `enterprise`: Enterprise Edition</p>
         * <p>- `ultimate`: Ultimate Edition</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The list of clusters.</p>
         */
        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        /**
         * <p>The endpoints of the ASM instance.</p>
         */
        @NameInMap("Endpoints")
        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints endpoints;

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
        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo serviceMeshInfo;

        /**
         * <p>The specifications of the ASM instance.</p>
         */
        @NameInMap("Spec")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec spec;

        public static DescribeServiceMeshDetailResponseBodyServiceMesh build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMesh self = new DescribeServiceMeshDetailResponseBodyServiceMesh();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setEndpoints(DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setServiceMeshInfo(DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo serviceMeshInfo) {
            this.serviceMeshInfo = serviceMeshInfo;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo getServiceMeshInfo() {
            return this.serviceMeshInfo;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setSpec(DescribeServiceMeshDetailResponseBodyServiceMeshSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec getSpec() {
            return this.spec;
        }

    }

}
