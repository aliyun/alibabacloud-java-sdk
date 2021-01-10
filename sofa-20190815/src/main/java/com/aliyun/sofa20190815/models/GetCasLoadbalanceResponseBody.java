// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasLoadbalanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetCasLoadbalanceResponseBodyData data;

    public static GetCasLoadbalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCasLoadbalanceResponseBody self = new GetCasLoadbalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCasLoadbalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCasLoadbalanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCasLoadbalanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCasLoadbalanceResponseBody setData(GetCasLoadbalanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCasLoadbalanceResponseBodyData getData() {
        return this.data;
    }

    public static class GetCasLoadbalanceResponseBodyDataScope extends TeaModel {
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

        public static GetCasLoadbalanceResponseBodyDataScope build(java.util.Map<String, ?> map) throws Exception {
            GetCasLoadbalanceResponseBodyDataScope self = new GetCasLoadbalanceResponseBodyDataScope();
            return TeaModel.build(map, self);
        }

        public GetCasLoadbalanceResponseBodyDataScope setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetCasLoadbalanceResponseBodyDataScope setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetCasLoadbalanceResponseBodyDataScope setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetCasLoadbalanceResponseBodyDataScope setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetCasLoadbalanceResponseBodyDataScope setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetCasLoadbalanceResponseBodyDataScope setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public GetCasLoadbalanceResponseBodyDataScope setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class GetCasLoadbalanceResponseBodyData extends TeaModel {
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

        @NameInMap("IaasId")
        public String iaasId;

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

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("RegionId")
        public String regionId;

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

        @NameInMap("VSwitchIaasId")
        public String vSwitchIaasId;

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
        public GetCasLoadbalanceResponseBodyDataScope scope;

        public static GetCasLoadbalanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCasLoadbalanceResponseBodyData self = new GetCasLoadbalanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCasLoadbalanceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCasLoadbalanceResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public GetCasLoadbalanceResponseBodyData setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public GetCasLoadbalanceResponseBodyData setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public GetCasLoadbalanceResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetCasLoadbalanceResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public GetCasLoadbalanceResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public GetCasLoadbalanceResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public GetCasLoadbalanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCasLoadbalanceResponseBodyData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public GetCasLoadbalanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCasLoadbalanceResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetCasLoadbalanceResponseBodyData setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public GetCasLoadbalanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCasLoadbalanceResponseBodyData setShareMode(Boolean shareMode) {
            this.shareMode = shareMode;
            return this;
        }
        public Boolean getShareMode() {
            return this.shareMode;
        }

        public GetCasLoadbalanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCasLoadbalanceResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCasLoadbalanceResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetCasLoadbalanceResponseBodyData setVipAddressType(String vipAddressType) {
            this.vipAddressType = vipAddressType;
            return this;
        }
        public String getVipAddressType() {
            return this.vipAddressType;
        }

        public GetCasLoadbalanceResponseBodyData setVipType(String vipType) {
            this.vipType = vipType;
            return this;
        }
        public String getVipType() {
            return this.vipType;
        }

        public GetCasLoadbalanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetCasLoadbalanceResponseBodyData setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public GetCasLoadbalanceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetCasLoadbalanceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetCasLoadbalanceResponseBodyData setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public GetCasLoadbalanceResponseBodyData setAssignedAppIds(java.util.List<String> assignedAppIds) {
            this.assignedAppIds = assignedAppIds;
            return this;
        }
        public java.util.List<String> getAssignedAppIds() {
            return this.assignedAppIds;
        }

        public GetCasLoadbalanceResponseBodyData setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public GetCasLoadbalanceResponseBodyData setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public GetCasLoadbalanceResponseBodyData setVipAddresses(java.util.List<String> vipAddresses) {
            this.vipAddresses = vipAddresses;
            return this;
        }
        public java.util.List<String> getVipAddresses() {
            return this.vipAddresses;
        }

        public GetCasLoadbalanceResponseBodyData setScope(GetCasLoadbalanceResponseBodyDataScope scope) {
            this.scope = scope;
            return this;
        }
        public GetCasLoadbalanceResponseBodyDataScope getScope() {
            return this.scope;
        }

    }

}
