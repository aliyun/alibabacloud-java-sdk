// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseRequest extends TeaModel {
    @NameInMap("AppIdsRepeatList")
    public java.util.List<String> appIdsRepeatList;

    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<String> appServiceIdsRepeatList;

    @NameInMap("ConnectionAddressesRepeatList")
    public java.util.List<String> connectionAddressesRepeatList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("EnginesRepeatList")
    public java.util.List<String> enginesRepeatList;

    @NameInMap("EngineVersionsRepeatList")
    public java.util.List<String> engineVersionsRepeatList;

    @NameInMap("IncludeShared")
    public Boolean includeShared;

    @NameInMap("MasterIdsRepeatList")
    public java.util.List<String> masterIdsRepeatList;

    @NameInMap("MaxCpu")
    public Long maxCpu;

    @NameInMap("MaxMaxConnections")
    public Long maxMaxConnections;

    @NameInMap("MaxMaxIops")
    public Long maxMaxIops;

    @NameInMap("MaxMemory")
    public Long maxMemory;

    @NameInMap("MaxPort")
    public Long maxPort;

    @NameInMap("MaxStorage")
    public Long maxStorage;

    @NameInMap("MinCpu")
    public Long minCpu;

    @NameInMap("MinMaxConnections")
    public Long minMaxConnections;

    @NameInMap("MinMaxIops")
    public Long minMaxIops;

    @NameInMap("MinMemory")
    public Long minMemory;

    @NameInMap("MinPort")
    public Long minPort;

    @NameInMap("MinStorage")
    public Long minStorage;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SpecIaasIdsRepeatList")
    public java.util.List<String> specIaasIdsRepeatList;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    @NameInMap("TypesRepeatList")
    public java.util.List<String> typesRepeatList;

    @NameInMap("VpcIdsRepeatList")
    public java.util.List<String> vpcIdsRepeatList;

    @NameInMap("VSwitchIaasIdsRepeatList")
    public java.util.List<String> vSwitchIaasIdsRepeatList;

    @NameInMap("WorkspaceIdsRepeatList")
    public java.util.List<String> workspaceIdsRepeatList;

    public static QueryCasDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseRequest self = new QueryCasDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseRequest setAppIdsRepeatList(java.util.List<String> appIdsRepeatList) {
        this.appIdsRepeatList = appIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppIdsRepeatList() {
        return this.appIdsRepeatList;
    }

    public QueryCasDatabaseRequest setAppServiceIdsRepeatList(java.util.List<String> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public QueryCasDatabaseRequest setConnectionAddressesRepeatList(java.util.List<String> connectionAddressesRepeatList) {
        this.connectionAddressesRepeatList = connectionAddressesRepeatList;
        return this;
    }
    public java.util.List<String> getConnectionAddressesRepeatList() {
        return this.connectionAddressesRepeatList;
    }

    public QueryCasDatabaseRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasDatabaseRequest setEnginesRepeatList(java.util.List<String> enginesRepeatList) {
        this.enginesRepeatList = enginesRepeatList;
        return this;
    }
    public java.util.List<String> getEnginesRepeatList() {
        return this.enginesRepeatList;
    }

    public QueryCasDatabaseRequest setEngineVersionsRepeatList(java.util.List<String> engineVersionsRepeatList) {
        this.engineVersionsRepeatList = engineVersionsRepeatList;
        return this;
    }
    public java.util.List<String> getEngineVersionsRepeatList() {
        return this.engineVersionsRepeatList;
    }

    public QueryCasDatabaseRequest setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
        return this;
    }
    public Boolean getIncludeShared() {
        return this.includeShared;
    }

    public QueryCasDatabaseRequest setMasterIdsRepeatList(java.util.List<String> masterIdsRepeatList) {
        this.masterIdsRepeatList = masterIdsRepeatList;
        return this;
    }
    public java.util.List<String> getMasterIdsRepeatList() {
        return this.masterIdsRepeatList;
    }

    public QueryCasDatabaseRequest setMaxCpu(Long maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Long getMaxCpu() {
        return this.maxCpu;
    }

    public QueryCasDatabaseRequest setMaxMaxConnections(Long maxMaxConnections) {
        this.maxMaxConnections = maxMaxConnections;
        return this;
    }
    public Long getMaxMaxConnections() {
        return this.maxMaxConnections;
    }

    public QueryCasDatabaseRequest setMaxMaxIops(Long maxMaxIops) {
        this.maxMaxIops = maxMaxIops;
        return this;
    }
    public Long getMaxMaxIops() {
        return this.maxMaxIops;
    }

    public QueryCasDatabaseRequest setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public Long getMaxMemory() {
        return this.maxMemory;
    }

    public QueryCasDatabaseRequest setMaxPort(Long maxPort) {
        this.maxPort = maxPort;
        return this;
    }
    public Long getMaxPort() {
        return this.maxPort;
    }

    public QueryCasDatabaseRequest setMaxStorage(Long maxStorage) {
        this.maxStorage = maxStorage;
        return this;
    }
    public Long getMaxStorage() {
        return this.maxStorage;
    }

    public QueryCasDatabaseRequest setMinCpu(Long minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public Long getMinCpu() {
        return this.minCpu;
    }

    public QueryCasDatabaseRequest setMinMaxConnections(Long minMaxConnections) {
        this.minMaxConnections = minMaxConnections;
        return this;
    }
    public Long getMinMaxConnections() {
        return this.minMaxConnections;
    }

    public QueryCasDatabaseRequest setMinMaxIops(Long minMaxIops) {
        this.minMaxIops = minMaxIops;
        return this;
    }
    public Long getMinMaxIops() {
        return this.minMaxIops;
    }

    public QueryCasDatabaseRequest setMinMemory(Long minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public Long getMinMemory() {
        return this.minMemory;
    }

    public QueryCasDatabaseRequest setMinPort(Long minPort) {
        this.minPort = minPort;
        return this;
    }
    public Long getMinPort() {
        return this.minPort;
    }

    public QueryCasDatabaseRequest setMinStorage(Long minStorage) {
        this.minStorage = minStorage;
        return this;
    }
    public Long getMinStorage() {
        return this.minStorage;
    }

    public QueryCasDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryCasDatabaseRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public QueryCasDatabaseRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public QueryCasDatabaseRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasDatabaseRequest setSpecIaasIdsRepeatList(java.util.List<String> specIaasIdsRepeatList) {
        this.specIaasIdsRepeatList = specIaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getSpecIaasIdsRepeatList() {
        return this.specIaasIdsRepeatList;
    }

    public QueryCasDatabaseRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

    public QueryCasDatabaseRequest setTypesRepeatList(java.util.List<String> typesRepeatList) {
        this.typesRepeatList = typesRepeatList;
        return this;
    }
    public java.util.List<String> getTypesRepeatList() {
        return this.typesRepeatList;
    }

    public QueryCasDatabaseRequest setVpcIdsRepeatList(java.util.List<String> vpcIdsRepeatList) {
        this.vpcIdsRepeatList = vpcIdsRepeatList;
        return this;
    }
    public java.util.List<String> getVpcIdsRepeatList() {
        return this.vpcIdsRepeatList;
    }

    public QueryCasDatabaseRequest setVSwitchIaasIdsRepeatList(java.util.List<String> vSwitchIaasIdsRepeatList) {
        this.vSwitchIaasIdsRepeatList = vSwitchIaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getVSwitchIaasIdsRepeatList() {
        return this.vSwitchIaasIdsRepeatList;
    }

    public QueryCasDatabaseRequest setWorkspaceIdsRepeatList(java.util.List<String> workspaceIdsRepeatList) {
        this.workspaceIdsRepeatList = workspaceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkspaceIdsRepeatList() {
        return this.workspaceIdsRepeatList;
    }

}
