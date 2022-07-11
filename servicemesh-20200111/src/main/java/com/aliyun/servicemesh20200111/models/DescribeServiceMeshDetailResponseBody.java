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
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        @NameInMap("IntranetPilotEndpoint")
        public String intranetPilotEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        public String publicApiServerEndpoint;

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
        @NameInMap("ApiServerLoadbalancerId")
        public String apiServerLoadbalancerId;

        @NameInMap("ApiServerPublicEip")
        public Boolean apiServerPublicEip;

        @NameInMap("PilotPublicEip")
        public Boolean pilotPublicEip;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("AuditProjectStatus")
        public String auditProjectStatus;

        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition extends TeaModel {
        @NameInMap("IstiodImageTag")
        public String istiodImageTag;

        @NameInMap("Name")
        public String name;

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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration extends TeaModel {
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
        @NameInMap("name")
        public String name;

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
        @NameInMap("host")
        public String host;

        @NameInMap("httpHeaders")
        public java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGetHttpHeaders> httpHeaders;

        @NameInMap("port")
        public String port;

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
        @NameInMap("host")
        public String host;

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
        @NameInMap("exec")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartExec exec;

        @NameInMap("httpGet")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStartHttpGet httpGet;

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
        @NameInMap("name")
        public String name;

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
        @NameInMap("host")
        public String host;

        @NameInMap("httpHeaders")
        public java.util.List<DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGetHttpHeaders> httpHeaders;

        @NameInMap("port")
        public String port;

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
        @NameInMap("host")
        public String host;

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
        @NameInMap("exec")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopExec exec;

        @NameInMap("httpGet")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePreStopHttpGet httpGet;

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
        @NameInMap("postStart")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecyclePostStart postStart;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit extends TeaModel {
        @NameInMap("EnableGlobalRateLimit")
        public Boolean enableGlobalRateLimit;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit setEnableGlobalRateLimit(Boolean enableGlobalRateLimit) {
            this.enableGlobalRateLimit = enableGlobalRateLimit;
            return this;
        }
        public Boolean getEnableGlobalRateLimit() {
            return this.enableGlobalRateLimit;
        }

    }

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit extends TeaModel {
        @NameInMap("ResourceCPULimit")
        public String resourceCPULimit;

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
        @NameInMap("ResourceCPURequest")
        public String resourceCPURequest;

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
        @NameInMap("CRAggregationConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationCRAggregationConfiguration CRAggregationConfiguration;

        @NameInMap("CRAggregationEnabled")
        public Boolean CRAggregationEnabled;

        @NameInMap("DiscoverySelectors")
        public java.util.List<java.util.Map<String, ?>> discoverySelectors;

        @NameInMap("IstioCRHistory")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationIstioCRHistory istioCRHistory;

        @NameInMap("Lifecycle")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationLifecycle lifecycle;

        @NameInMap("MultiBuffer")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationMultiBuffer multiBuffer;

        @NameInMap("NFDConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationNFDConfiguration NFDConfiguration;

        @NameInMap("OPAScopeInjection")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationOPAScopeInjection OPAScopeInjection;

        @NameInMap("RateLimit")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit rateLimit;

        @NameInMap("SidecarProxyInitResourceLimit")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        @NameInMap("SidecarProxyInitResourceRequest")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationSidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        @NameInMap("TerminationDrainDuration")
        public String terminationDrainDuration;

        public static DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration self = new DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration();
            return TeaModel.build(map, self);
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

        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration setRateLimit(DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfigurationRateLimit getRateLimit() {
            return this.rateLimit;
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

    public static class DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB extends TeaModel {
        @NameInMap("Distribute")
        public java.util.Map<String, ?> distribute;

        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("LimitCPU")
        public String limitCPU;

        @NameInMap("LimitMemory")
        public String limitMemory;

        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("RequestCPU")
        public String requestCPU;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("EnableSDSServer")
        public Boolean enableSDSServer;

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
        @NameInMap("ConfigSource")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotConfigSource configSource;

        @NameInMap("Feature")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilotFeature feature;

        @NameInMap("Http10Enabled")
        public Boolean http10Enabled;

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
        @NameInMap("ExternalUrl")
        public String externalUrl;

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
        @NameInMap("DubboFilterEnabled")
        public Boolean dubboFilterEnabled;

        @NameInMap("MysqlFilterEnabled")
        public Boolean mysqlFilterEnabled;

        @NameInMap("RedisFilterEnabled")
        public Boolean redisFilterEnabled;

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
        @NameInMap("AccessLogFile")
        public String accessLogFile;

        @NameInMap("AccessLogFormat")
        public String accessLogFormat;

        @NameInMap("AccessLogServiceEnabled")
        public Boolean accessLogServiceEnabled;

        @NameInMap("AccessLogServiceHost")
        public String accessLogServiceHost;

        @NameInMap("AccessLogServicePort")
        public Integer accessLogServicePort;

        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("EnableDNSProxying")
        public Boolean enableDNSProxying;

        @NameInMap("LimitCPU")
        public String limitCPU;

        @NameInMap("LimitMemory")
        public String limitMemory;

        @NameInMap("RequestCPU")
        public String requestCPU;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("AutoInjectionPolicyEnabled")
        public Boolean autoInjectionPolicyEnabled;

        @NameInMap("EnableNamespacesByDefault")
        public Boolean enableNamespacesByDefault;

        @NameInMap("InitCNIConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjectorInitCNIConfiguration initCNIConfiguration;

        @NameInMap("LimitCPU")
        public String limitCPU;

        @NameInMap("LimitMemory")
        public String limitMemory;

        @NameInMap("RequestCPU")
        public String requestCPU;

        @NameInMap("RequestMemory")
        public String requestMemory;

        @NameInMap("SidecarInjectorNum")
        public Integer sidecarInjectorNum;

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
        @NameInMap("AccessLog")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAccessLog accessLog;

        @NameInMap("Audit")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigAudit audit;

        @NameInMap("ControlPlaneLogInfo")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigControlPlaneLogInfo controlPlaneLogInfo;

        @NameInMap("CustomizedZipkin")
        public Boolean customizedZipkin;

        @NameInMap("Edition")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigEdition edition;

        @NameInMap("EnableLocalityLB")
        public Boolean enableLocalityLB;

        @NameInMap("ExcludeIPRanges")
        public String excludeIPRanges;

        @NameInMap("ExcludeInboundPorts")
        public String excludeInboundPorts;

        @NameInMap("ExcludeOutboundPorts")
        public String excludeOutboundPorts;

        @NameInMap("ExtraConfiguration")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigExtraConfiguration extraConfiguration;

        @NameInMap("IncludeIPRanges")
        public String includeIPRanges;

        @NameInMap("K8sNewAPIsSupport")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigK8sNewAPIsSupport k8sNewAPIsSupport;

        @NameInMap("Kiali")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigKiali kiali;

        @NameInMap("LocalityLB")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigLocalityLB localityLB;

        @NameInMap("MSE")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigMSE MSE;

        @NameInMap("OPA")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigOPA OPA;

        @NameInMap("OutboundTrafficPolicy")
        public String outboundTrafficPolicy;

        @NameInMap("Pilot")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPilot pilot;

        @NameInMap("Prometheus")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigPrometheus prometheus;

        @NameInMap("ProtocolSupport")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProtocolSupport protocolSupport;

        @NameInMap("Proxy")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigProxy proxy;

        @NameInMap("SidecarInjector")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfigSidecarInjector sidecarInjector;

        @NameInMap("Telemetry")
        public Boolean telemetry;

        @NameInMap("Tracing")
        public Boolean tracing;

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
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

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
        @NameInMap("LoadBalancer")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        public DescribeServiceMeshDetailResponseBodyServiceMeshSpecMeshConfig meshConfig;

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
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Endpoints")
        public DescribeServiceMeshDetailResponseBodyServiceMeshEndpoints endpoints;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerType")
        public String ownerType;

        @NameInMap("ServiceMeshInfo")
        public DescribeServiceMeshDetailResponseBodyServiceMeshServiceMeshInfo serviceMeshInfo;

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
