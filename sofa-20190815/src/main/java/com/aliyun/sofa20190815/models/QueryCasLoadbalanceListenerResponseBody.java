// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryCasLoadbalanceListenerResponseBodyData> data;

    public static QueryCasLoadbalanceListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceListenerResponseBody self = new QueryCasLoadbalanceListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasLoadbalanceListenerResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasLoadbalanceListenerResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasLoadbalanceListenerResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCasLoadbalanceListenerResponseBody setData(java.util.List<QueryCasLoadbalanceListenerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasLoadbalanceListenerResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor extends TeaModel {
        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ConnectPort")
        public Long connectPort;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("Id")
        public String id;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("UnHealthyThreshold")
        public Long unHealthyThreshold;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        public static QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor self = new QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setConnectPort(Long connectPort) {
            this.connectPort = connectPort;
            return this;
        }
        public Long getConnectPort() {
            return this.connectPort;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setUnHealthyThreshold(Long unHealthyThreshold) {
            this.unHealthyThreshold = unHealthyThreshold;
            return this;
        }
        public Long getUnHealthyThreshold() {
            return this.unHealthyThreshold;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

    }

    public static class QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Region")
        public String region;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Zone")
        public String zone;

        public static QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope self = new QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Long autoRenewPeriod;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ShareMode")
        public Boolean shareMode;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("VipAddressType")
        public String vipAddressType;

        @NameInMap("VipType")
        public String vipType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchIaasId")
        public String vswitchIaasId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AppServiceIds")
        public java.util.List<String> appServiceIds;

        @NameInMap("AssignedAppIds")
        public java.util.List<String> assignedAppIds;

        @NameInMap("AssignedAppServiceIds")
        public java.util.List<String> assignedAppServiceIds;

        @NameInMap("Domains")
        public java.util.List<String> domains;

        @NameInMap("VipAddresses")
        public java.util.List<String> vipAddresses;

        @NameInMap("Scope")
        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope scope;

        public static QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer self = new QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setShareMode(Boolean shareMode) {
            this.shareMode = shareMode;
            return this;
        }
        public Boolean getShareMode() {
            return this.shareMode;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setVipAddressType(String vipAddressType) {
            this.vipAddressType = vipAddressType;
            return this;
        }
        public String getVipAddressType() {
            return this.vipAddressType;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setVipType(String vipType) {
            this.vipType = vipType;
            return this;
        }
        public String getVipType() {
            return this.vipType;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setVswitchIaasId(String vswitchIaasId) {
            this.vswitchIaasId = vswitchIaasId;
            return this;
        }
        public String getVswitchIaasId() {
            return this.vswitchIaasId;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setAssignedAppIds(java.util.List<String> assignedAppIds) {
            this.assignedAppIds = assignedAppIds;
            return this;
        }
        public java.util.List<String> getAssignedAppIds() {
            return this.assignedAppIds;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setVipAddresses(java.util.List<String> vipAddresses) {
            this.vipAddresses = vipAddresses;
            return this;
        }
        public java.util.List<String> getVipAddresses() {
            return this.vipAddresses;
        }

        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer setScope(QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope scope) {
            this.scope = scope;
            return this;
        }
        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancerScope getScope() {
            return this.scope;
        }

    }

    public static class QueryCasLoadbalanceListenerResponseBodyData extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("CertificateIaasId")
        public String certificateIaasId;

        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("Description")
        public String description;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("GmCryptoCertIaasId")
        public String gmCryptoCertIaasId;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsHealthMonitor")
        public String isHealthMonitor;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Name")
        public String name;

        @NameInMap("PersistTimeout")
        public Long persistTimeout;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("Status")
        public String status;

        @NameInMap("StickySession")
        public String stickySession;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        @NameInMap("Type")
        public String type;

        @NameInMap("UrlPath")
        public String urlPath;

        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        @NameInMap("HealthMonitor")
        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor healthMonitor;

        @NameInMap("LoadBalancer")
        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer loadBalancer;

        public static QueryCasLoadbalanceListenerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceListenerResponseBodyData self = new QueryCasLoadbalanceListenerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceListenerResponseBodyData setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setCertificateIaasId(String certificateIaasId) {
            this.certificateIaasId = certificateIaasId;
            return this;
        }
        public String getCertificateIaasId() {
            return this.certificateIaasId;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
            this.gmCryptoCertIaasId = gmCryptoCertIaasId;
            return this;
        }
        public String getGmCryptoCertIaasId() {
            return this.gmCryptoCertIaasId;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setIsHealthMonitor(String isHealthMonitor) {
            this.isHealthMonitor = isHealthMonitor;
            return this;
        }
        public String getIsHealthMonitor() {
            return this.isHealthMonitor;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setPersistTimeout(Long persistTimeout) {
            this.persistTimeout = persistTimeout;
            return this;
        }
        public Long getPersistTimeout() {
            return this.persistTimeout;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setUrlPath(String urlPath) {
            this.urlPath = urlPath;
            return this;
        }
        public String getUrlPath() {
            return this.urlPath;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setXForwardedFor(String XForwardedFor) {
            this.XForwardedFor = XForwardedFor;
            return this;
        }
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setHealthMonitor(QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor healthMonitor) {
            this.healthMonitor = healthMonitor;
            return this;
        }
        public QueryCasLoadbalanceListenerResponseBodyDataHealthMonitor getHealthMonitor() {
            return this.healthMonitor;
        }

        public QueryCasLoadbalanceListenerResponseBodyData setLoadBalancer(QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public QueryCasLoadbalanceListenerResponseBodyDataLoadBalancer getLoadBalancer() {
            return this.loadBalancer;
        }

    }

}
