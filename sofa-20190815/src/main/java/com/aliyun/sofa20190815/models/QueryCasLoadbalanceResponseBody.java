// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryCasLoadbalanceResponseBodyData> data;

    public static QueryCasLoadbalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceResponseBody self = new QueryCasLoadbalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasLoadbalanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasLoadbalanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasLoadbalanceResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasLoadbalanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasLoadbalanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCasLoadbalanceResponseBody setData(java.util.List<QueryCasLoadbalanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasLoadbalanceResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasLoadbalanceResponseBodyDataScope extends TeaModel {
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

        public static QueryCasLoadbalanceResponseBodyDataScope build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceResponseBodyDataScope self = new QueryCasLoadbalanceResponseBodyDataScope();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceResponseBodyDataScope setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryCasLoadbalanceResponseBodyDataScope setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryCasLoadbalanceResponseBodyDataScope setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryCasLoadbalanceResponseBodyDataScope setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryCasLoadbalanceResponseBodyDataScope setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryCasLoadbalanceResponseBodyDataScope setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryCasLoadbalanceResponseBodyDataScope setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryCasLoadbalanceResponseBodyData extends TeaModel {
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
        public QueryCasLoadbalanceResponseBodyDataScope scope;

        public static QueryCasLoadbalanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceResponseBodyData self = new QueryCasLoadbalanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasLoadbalanceResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasLoadbalanceResponseBodyData setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasLoadbalanceResponseBodyData setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public QueryCasLoadbalanceResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryCasLoadbalanceResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public QueryCasLoadbalanceResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasLoadbalanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasLoadbalanceResponseBodyData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public QueryCasLoadbalanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasLoadbalanceResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasLoadbalanceResponseBodyData setShareMode(Boolean shareMode) {
            this.shareMode = shareMode;
            return this;
        }
        public Boolean getShareMode() {
            return this.shareMode;
        }

        public QueryCasLoadbalanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasLoadbalanceResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasLoadbalanceResponseBodyData setVipAddressType(String vipAddressType) {
            this.vipAddressType = vipAddressType;
            return this;
        }
        public String getVipAddressType() {
            return this.vipAddressType;
        }

        public QueryCasLoadbalanceResponseBodyData setVipType(String vipType) {
            this.vipType = vipType;
            return this;
        }
        public String getVipType() {
            return this.vipType;
        }

        public QueryCasLoadbalanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasLoadbalanceResponseBodyData setVswitchIaasId(String vswitchIaasId) {
            this.vswitchIaasId = vswitchIaasId;
            return this;
        }
        public String getVswitchIaasId() {
            return this.vswitchIaasId;
        }

        public QueryCasLoadbalanceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasLoadbalanceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public QueryCasLoadbalanceResponseBodyData setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryCasLoadbalanceResponseBodyData setAssignedAppIds(java.util.List<String> assignedAppIds) {
            this.assignedAppIds = assignedAppIds;
            return this;
        }
        public java.util.List<String> getAssignedAppIds() {
            return this.assignedAppIds;
        }

        public QueryCasLoadbalanceResponseBodyData setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public QueryCasLoadbalanceResponseBodyData setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public QueryCasLoadbalanceResponseBodyData setVipAddresses(java.util.List<String> vipAddresses) {
            this.vipAddresses = vipAddresses;
            return this;
        }
        public java.util.List<String> getVipAddresses() {
            return this.vipAddresses;
        }

        public QueryCasLoadbalanceResponseBodyData setScope(QueryCasLoadbalanceResponseBodyDataScope scope) {
            this.scope = scope;
            return this;
        }
        public QueryCasLoadbalanceResponseBodyDataScope getScope() {
            return this.scope;
        }

    }

}
