// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceRequest extends TeaModel {
    @NameInMap("AppIdsRepeatList")
    public java.util.List<String> appIdsRepeatList;

    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<String> appServiceIdsRepeatList;

    @NameInMap("ClusterIdsRepeatList")
    public java.util.List<String> clusterIdsRepeatList;

    @NameInMap("ClusterMode")
    public Boolean clusterMode;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DomainsRepeatList")
    public java.util.List<String> domainsRepeatList;

    @NameInMap("HealthLevelsRepeatList")
    public java.util.List<String> healthLevelsRepeatList;

    @NameInMap("IaasIdsRepeatList")
    public java.util.List<String> iaasIdsRepeatList;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ShareMode")
    public Boolean shareMode;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    @NameInMap("VipAddressesRepeatList")
    public java.util.List<String> vipAddressesRepeatList;

    @NameInMap("VipAddressType")
    public String vipAddressType;

    @NameInMap("VipType")
    public String vipType;

    @NameInMap("VpcIdsRepeatList")
    public java.util.List<String> vpcIdsRepeatList;

    @NameInMap("VswitchIaasIdsRepeatList")
    public java.util.List<String> vswitchIaasIdsRepeatList;

    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceRequest self = new QueryCasLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceRequest setAppIdsRepeatList(java.util.List<String> appIdsRepeatList) {
        this.appIdsRepeatList = appIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppIdsRepeatList() {
        return this.appIdsRepeatList;
    }

    public QueryCasLoadbalanceRequest setAppServiceIdsRepeatList(java.util.List<String> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public QueryCasLoadbalanceRequest setClusterIdsRepeatList(java.util.List<String> clusterIdsRepeatList) {
        this.clusterIdsRepeatList = clusterIdsRepeatList;
        return this;
    }
    public java.util.List<String> getClusterIdsRepeatList() {
        return this.clusterIdsRepeatList;
    }

    public QueryCasLoadbalanceRequest setClusterMode(Boolean clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public Boolean getClusterMode() {
        return this.clusterMode;
    }

    public QueryCasLoadbalanceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasLoadbalanceRequest setDomainsRepeatList(java.util.List<String> domainsRepeatList) {
        this.domainsRepeatList = domainsRepeatList;
        return this;
    }
    public java.util.List<String> getDomainsRepeatList() {
        return this.domainsRepeatList;
    }

    public QueryCasLoadbalanceRequest setHealthLevelsRepeatList(java.util.List<String> healthLevelsRepeatList) {
        this.healthLevelsRepeatList = healthLevelsRepeatList;
        return this;
    }
    public java.util.List<String> getHealthLevelsRepeatList() {
        return this.healthLevelsRepeatList;
    }

    public QueryCasLoadbalanceRequest setIaasIdsRepeatList(java.util.List<String> iaasIdsRepeatList) {
        this.iaasIdsRepeatList = iaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getIaasIdsRepeatList() {
        return this.iaasIdsRepeatList;
    }

    public QueryCasLoadbalanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryCasLoadbalanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public QueryCasLoadbalanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasLoadbalanceRequest setShareMode(Boolean shareMode) {
        this.shareMode = shareMode;
        return this;
    }
    public Boolean getShareMode() {
        return this.shareMode;
    }

    public QueryCasLoadbalanceRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

    public QueryCasLoadbalanceRequest setVipAddressesRepeatList(java.util.List<String> vipAddressesRepeatList) {
        this.vipAddressesRepeatList = vipAddressesRepeatList;
        return this;
    }
    public java.util.List<String> getVipAddressesRepeatList() {
        return this.vipAddressesRepeatList;
    }

    public QueryCasLoadbalanceRequest setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public QueryCasLoadbalanceRequest setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public QueryCasLoadbalanceRequest setVpcIdsRepeatList(java.util.List<String> vpcIdsRepeatList) {
        this.vpcIdsRepeatList = vpcIdsRepeatList;
        return this;
    }
    public java.util.List<String> getVpcIdsRepeatList() {
        return this.vpcIdsRepeatList;
    }

    public QueryCasLoadbalanceRequest setVswitchIaasIdsRepeatList(java.util.List<String> vswitchIaasIdsRepeatList) {
        this.vswitchIaasIdsRepeatList = vswitchIaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getVswitchIaasIdsRepeatList() {
        return this.vswitchIaasIdsRepeatList;
    }

    public QueryCasLoadbalanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
