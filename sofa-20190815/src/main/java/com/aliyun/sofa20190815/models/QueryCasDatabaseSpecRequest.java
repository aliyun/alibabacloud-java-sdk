// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseSpecRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("CustomStorage")
    public Boolean customStorage;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("EnginesRepeatList")
    public java.util.List<String> enginesRepeatList;

    @NameInMap("EngineVersionsRepeatList")
    public java.util.List<String> engineVersionsRepeatList;

    @NameInMap("IaasIdsRepeatList")
    public java.util.List<String> iaasIdsRepeatList;

    @NameInMap("IaasTypesRepeatList")
    public java.util.List<String> iaasTypesRepeatList;

    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("MaxCpu")
    public Long maxCpu;

    @NameInMap("MaxMaxConnections")
    public Long maxMaxConnections;

    @NameInMap("MaxMaxIops")
    public Long maxMaxIops;

    @NameInMap("MaxMemory")
    public Long maxMemory;

    @NameInMap("MinCpu")
    public Long minCpu;

    @NameInMap("MinMaxConnections")
    public Long minMaxConnections;

    @NameInMap("MinMaxIops")
    public Long minMaxIops;

    @NameInMap("MinMemory")
    public Long minMemory;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProviderIdsRepeatList")
    public java.util.List<String> providerIdsRepeatList;

    @NameInMap("TypesRepeatList")
    public java.util.List<String> typesRepeatList;

    public static QueryCasDatabaseSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseSpecRequest self = new QueryCasDatabaseSpecRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseSpecRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasDatabaseSpecRequest setCustomStorage(Boolean customStorage) {
        this.customStorage = customStorage;
        return this;
    }
    public Boolean getCustomStorage() {
        return this.customStorage;
    }

    public QueryCasDatabaseSpecRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public QueryCasDatabaseSpecRequest setEnginesRepeatList(java.util.List<String> enginesRepeatList) {
        this.enginesRepeatList = enginesRepeatList;
        return this;
    }
    public java.util.List<String> getEnginesRepeatList() {
        return this.enginesRepeatList;
    }

    public QueryCasDatabaseSpecRequest setEngineVersionsRepeatList(java.util.List<String> engineVersionsRepeatList) {
        this.engineVersionsRepeatList = engineVersionsRepeatList;
        return this;
    }
    public java.util.List<String> getEngineVersionsRepeatList() {
        return this.engineVersionsRepeatList;
    }

    public QueryCasDatabaseSpecRequest setIaasIdsRepeatList(java.util.List<String> iaasIdsRepeatList) {
        this.iaasIdsRepeatList = iaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getIaasIdsRepeatList() {
        return this.iaasIdsRepeatList;
    }

    public QueryCasDatabaseSpecRequest setIaasTypesRepeatList(java.util.List<String> iaasTypesRepeatList) {
        this.iaasTypesRepeatList = iaasTypesRepeatList;
        return this;
    }
    public java.util.List<String> getIaasTypesRepeatList() {
        return this.iaasTypesRepeatList;
    }

    public QueryCasDatabaseSpecRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public QueryCasDatabaseSpecRequest setMaxCpu(Long maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Long getMaxCpu() {
        return this.maxCpu;
    }

    public QueryCasDatabaseSpecRequest setMaxMaxConnections(Long maxMaxConnections) {
        this.maxMaxConnections = maxMaxConnections;
        return this;
    }
    public Long getMaxMaxConnections() {
        return this.maxMaxConnections;
    }

    public QueryCasDatabaseSpecRequest setMaxMaxIops(Long maxMaxIops) {
        this.maxMaxIops = maxMaxIops;
        return this;
    }
    public Long getMaxMaxIops() {
        return this.maxMaxIops;
    }

    public QueryCasDatabaseSpecRequest setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public Long getMaxMemory() {
        return this.maxMemory;
    }

    public QueryCasDatabaseSpecRequest setMinCpu(Long minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public Long getMinCpu() {
        return this.minCpu;
    }

    public QueryCasDatabaseSpecRequest setMinMaxConnections(Long minMaxConnections) {
        this.minMaxConnections = minMaxConnections;
        return this;
    }
    public Long getMinMaxConnections() {
        return this.minMaxConnections;
    }

    public QueryCasDatabaseSpecRequest setMinMaxIops(Long minMaxIops) {
        this.minMaxIops = minMaxIops;
        return this;
    }
    public Long getMinMaxIops() {
        return this.minMaxIops;
    }

    public QueryCasDatabaseSpecRequest setMinMemory(Long minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public Long getMinMemory() {
        return this.minMemory;
    }

    public QueryCasDatabaseSpecRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasDatabaseSpecRequest setProviderIdsRepeatList(java.util.List<String> providerIdsRepeatList) {
        this.providerIdsRepeatList = providerIdsRepeatList;
        return this;
    }
    public java.util.List<String> getProviderIdsRepeatList() {
        return this.providerIdsRepeatList;
    }

    public QueryCasDatabaseSpecRequest setTypesRepeatList(java.util.List<String> typesRepeatList) {
        this.typesRepeatList = typesRepeatList;
        return this;
    }
    public java.util.List<String> getTypesRepeatList() {
        return this.typesRepeatList;
    }

}
