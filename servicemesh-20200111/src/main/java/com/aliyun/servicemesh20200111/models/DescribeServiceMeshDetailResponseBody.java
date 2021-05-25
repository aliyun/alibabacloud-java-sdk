// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("IntranetPilotEndpoint")
        public String intranetPilotEndpoint;

        @NameInMap("PublicPilotEndpoint")
        public String publicPilotEndpoint;

        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        public String publicApiServerEndpoint;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints self = new DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setIntranetPilotEndpoint(String intranetPilotEndpoint) {
            this.intranetPilotEndpoint = intranetPilotEndpoint;
            return this;
        }
        public String getIntranetPilotEndpoint() {
            return this.intranetPilotEndpoint;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setPublicPilotEndpoint(String publicPilotEndpoint) {
            this.publicPilotEndpoint = publicPilotEndpoint;
            return this;
        }
        public String getPublicPilotEndpoint() {
            return this.publicPilotEndpoint;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo extends TeaModel {
        @NameInMap("Profile")
        public String profile;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Version")
        public String version;

        @NameInMap("State")
        public String state;

        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo self = new DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer extends TeaModel {
        @NameInMap("PilotPublicEip")
        public Boolean pilotPublicEip;

        @NameInMap("PilotPublicLoadbalancerId")
        public String pilotPublicLoadbalancerId;

        @NameInMap("ApiServerLoadbalancerId")
        public String apiServerLoadbalancerId;

        @NameInMap("ApiServerPublicEip")
        public Boolean apiServerPublicEip;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA extends TeaModel {
        @NameInMap("RequestMemory")
        public String requestMemory;

        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("LimitMemory")
        public String limitMemory;

        @NameInMap("RequestCPU")
        public String requestCPU;

        @NameInMap("LimitCPU")
        public String limitCPU;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus extends TeaModel {
        @NameInMap("UseExternal")
        public Boolean useExternal;

        @NameInMap("ExternalUrl")
        public String externalUrl;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus setUseExternal(Boolean useExternal) {
            this.useExternal = useExternal;
            return this;
        }
        public Boolean getUseExternal() {
            return this.useExternal;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

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

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature extends TeaModel {
        @NameInMap("FilterGatewayClusterConfig")
        public Boolean filterGatewayClusterConfig;

        @NameInMap("EnableSDSServer")
        public Boolean enableSDSServer;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature setFilterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
            this.filterGatewayClusterConfig = filterGatewayClusterConfig;
            return this;
        }
        public Boolean getFilterGatewayClusterConfig() {
            return this.filterGatewayClusterConfig;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature setEnableSDSServer(Boolean enableSDSServer) {
            this.enableSDSServer = enableSDSServer;
            return this;
        }
        public Boolean getEnableSDSServer() {
            return this.enableSDSServer;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot extends TeaModel {
        @NameInMap("Http10Enabled")
        public Boolean http10Enabled;

        @NameInMap("TraceSampling")
        public Float traceSampling;

        @NameInMap("Feature")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature feature;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot();
            return TeaModel.build(map, self);
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

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot setFeature(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature feature) {
            this.feature = feature;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature getFeature() {
            return this.feature;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE extends TeaModel {
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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration extends TeaModel {
        @NameInMap("ExcludeNamespaces")
        public String excludeNamespaces;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration setExcludeNamespaces(String excludeNamespaces) {
            this.excludeNamespaces = excludeNamespaces;
            return this;
        }
        public String getExcludeNamespaces() {
            return this.excludeNamespaces;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector extends TeaModel {
        @NameInMap("EnableNamespacesByDefault")
        public Boolean enableNamespacesByDefault;

        @NameInMap("RequestMemory")
        public String requestMemory;

        @NameInMap("LimitMemory")
        public String limitMemory;

        @NameInMap("RequestCPU")
        public String requestCPU;

        @NameInMap("AutoInjectionPolicyEnabled")
        public Boolean autoInjectionPolicyEnabled;

        @NameInMap("LimitCPU")
        public String limitCPU;

        @NameInMap("InitCNIConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration;

        @NameInMap("SidecarInjectorWebhookAsYaml")
        public String sidecarInjectorWebhookAsYaml;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }
        public Boolean getEnableNamespacesByDefault() {
            return this.enableNamespacesByDefault;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
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

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }
        public Boolean getAutoInjectionPolicyEnabled() {
            return this.autoInjectionPolicyEnabled;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setInitCNIConfiguration(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration) {
            this.initCNIConfiguration = initCNIConfiguration;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration getInitCNIConfiguration() {
            return this.initCNIConfiguration;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
            this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
            return this;
        }
        public String getSidecarInjectorWebhookAsYaml() {
            return this.sidecarInjectorWebhookAsYaml;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport extends TeaModel {
        @NameInMap("MysqlFilterEnabled")
        public Boolean mysqlFilterEnabled;

        @NameInMap("RedisFilterEnabled")
        public Boolean redisFilterEnabled;

        @NameInMap("ThriftFilterEnabled")
        public Boolean thriftFilterEnabled;

        @NameInMap("DubboFilterEnabled")
        public Boolean dubboFilterEnabled;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport();
            return TeaModel.build(map, self);
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

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport setDubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }
        public Boolean getDubboFilterEnabled() {
            return this.dubboFilterEnabled;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment extends TeaModel {
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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Project")
        public String project;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit();
            return TeaModel.build(map, self);
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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy extends TeaModel {
        @NameInMap("RequestMemory")
        public String requestMemory;

        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("LimitMemory")
        public String limitMemory;

        @NameInMap("RequestCPU")
        public String requestCPU;

        @NameInMap("EnableDNSProxying")
        public Boolean enableDNSProxying;

        @NameInMap("LimitCPU")
        public String limitCPU;

        @NameInMap("AccessLogServiceEnabled")
        public Boolean accessLogServiceEnabled;

        @NameInMap("AccessLogServiceHost")
        public String accessLogServiceHost;

        @NameInMap("AccessLogServicePort")
        public Integer accessLogServicePort;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
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

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport extends TeaModel {
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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig extends TeaModel {
        @NameInMap("OPA")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA OPA;

        @NameInMap("Prometheus")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus prometheus;

        @NameInMap("AccessLog")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog accessLog;

        @NameInMap("Pilot")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot pilot;

        @NameInMap("MSE")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE MSE;

        @NameInMap("CustomizedZipkin")
        public Boolean customizedZipkin;

        @NameInMap("SidecarInjector")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector sidecarInjector;

        @NameInMap("IncludeIPRanges")
        public String includeIPRanges;

        @NameInMap("ExcludeIPRanges")
        public String excludeIPRanges;

        @NameInMap("ExcludeOutboundPorts")
        public String excludeOutboundPorts;

        @NameInMap("ExcludeInboundPorts")
        public String excludeInboundPorts;

        @NameInMap("Telemetry")
        public Boolean telemetry;

        @NameInMap("Edition")
        public String edition;

        @NameInMap("ProtocolSupport")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport protocolSupport;

        @NameInMap("OutboundTrafficPolicy")
        public String outboundTrafficPolicy;

        @NameInMap("Kiali")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali kiali;

        @NameInMap("Tracing")
        public Boolean tracing;

        @NameInMap("WebAssemblyFilterDeployment")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigWebAssemblyFilterDeployment webAssemblyFilterDeployment;

        @NameInMap("EnableLocalityLB")
        public Boolean enableLocalityLB;

        @NameInMap("Audit")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit audit;

        @NameInMap("Proxy")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy proxy;

        @NameInMap("K8sNewAPIsSupport")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport k8sNewAPIsSupport;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setOPA(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA OPA) {
            this.OPA = OPA;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA getOPA() {
            return this.OPA;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setPrometheus(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus prometheus) {
            this.prometheus = prometheus;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus getPrometheus() {
            return this.prometheus;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setAccessLog(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog getAccessLog() {
            return this.accessLog;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setPilot(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot pilot) {
            this.pilot = pilot;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot getPilot() {
            return this.pilot;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setMSE(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE MSE) {
            this.MSE = MSE;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE getMSE() {
            return this.MSE;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setCustomizedZipkin(Boolean customizedZipkin) {
            this.customizedZipkin = customizedZipkin;
            return this;
        }
        public Boolean getCustomizedZipkin() {
            return this.customizedZipkin;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setSidecarInjector(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector sidecarInjector) {
            this.sidecarInjector = sidecarInjector;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector getSidecarInjector() {
            return this.sidecarInjector;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setIncludeIPRanges(String includeIPRanges) {
            this.includeIPRanges = includeIPRanges;
            return this;
        }
        public String getIncludeIPRanges() {
            return this.includeIPRanges;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExcludeIPRanges(String excludeIPRanges) {
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }
        public String getExcludeIPRanges() {
            return this.excludeIPRanges;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExcludeOutboundPorts(String excludeOutboundPorts) {
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }
        public String getExcludeOutboundPorts() {
            return this.excludeOutboundPorts;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setExcludeInboundPorts(String excludeInboundPorts) {
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }
        public String getExcludeInboundPorts() {
            return this.excludeInboundPorts;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setTelemetry(Boolean telemetry) {
            this.telemetry = telemetry;
            return this;
        }
        public Boolean getTelemetry() {
            return this.telemetry;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setProtocolSupport(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport protocolSupport) {
            this.protocolSupport = protocolSupport;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport getProtocolSupport() {
            return this.protocolSupport;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setOutboundTrafficPolicy(String outboundTrafficPolicy) {
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }
        public String getOutboundTrafficPolicy() {
            return this.outboundTrafficPolicy;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setKiali(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali kiali) {
            this.kiali = kiali;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali getKiali() {
            return this.kiali;
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

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setEnableLocalityLB(Boolean enableLocalityLB) {
            this.enableLocalityLB = enableLocalityLB;
            return this;
        }
        public Boolean getEnableLocalityLB() {
            return this.enableLocalityLB;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setAudit(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit audit) {
            this.audit = audit;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit getAudit() {
            return this.audit;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setProxy(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy proxy) {
            this.proxy = proxy;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy getProxy() {
            return this.proxy;
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig setK8sNewAPIsSupport(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport k8sNewAPIsSupport) {
            this.k8sNewAPIsSupport = k8sNewAPIsSupport;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport getK8sNewAPIsSupport() {
            return this.k8sNewAPIsSupport;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpec extends TeaModel {
        @NameInMap("Network")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork network;

        @NameInMap("LoadBalancer")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig meshConfig;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpec self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec setNetwork(DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecNetwork getNetwork() {
            return this.network;
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

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMesh extends TeaModel {
        @NameInMap("Endpoints")
        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints endpoints;

        @NameInMap("ServiceMeshInfo")
        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpec spec;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        public static DescribeServiceMeshDetailResponseBodyServiceMesh build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMesh self = new DescribeServiceMeshDetailResponseBodyServiceMesh();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMesh setEndpoints(DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints getEndpoints() {
            return this.endpoints;
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

        public DescribeServiceMeshDetailResponseBodyServiceMesh setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

    }

}
