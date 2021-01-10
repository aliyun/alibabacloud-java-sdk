// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceListenerRequest extends TeaModel {
    @NameInMap("BackendServerPortsRepeatList")
    public java.util.List<Long> backendServerPortsRepeatList;

    @NameInMap("CertificateIaasIdsRepeatList")
    public java.util.List<String> certificateIaasIdsRepeatList;

    @NameInMap("CertificateIdsRepeatList")
    public java.util.List<String> certificateIdsRepeatList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("GmCryptoCertIaasIdsRepeatList")
    public java.util.List<String> gmCryptoCertIaasIdsRepeatList;

    @NameInMap("GmSignCertIaasIdsRepeatList")
    public java.util.List<String> gmSignCertIaasIdsRepeatList;

    @NameInMap("ListenerPortsRepeatList")
    public java.util.List<Long> listenerPortsRepeatList;

    @NameInMap("LoadBalancerIdsRepeatList")
    public java.util.List<String> loadBalancerIdsRepeatList;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TypesRepeatList")
    public java.util.List<String> typesRepeatList;

    @NameInMap("VComputerGroupIdsRepeatList")
    public java.util.List<String> VComputerGroupIdsRepeatList;

    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceListenerRequest self = new QueryCasLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceListenerRequest setBackendServerPortsRepeatList(java.util.List<Long> backendServerPortsRepeatList) {
        this.backendServerPortsRepeatList = backendServerPortsRepeatList;
        return this;
    }
    public java.util.List<Long> getBackendServerPortsRepeatList() {
        return this.backendServerPortsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setCertificateIaasIdsRepeatList(java.util.List<String> certificateIaasIdsRepeatList) {
        this.certificateIaasIdsRepeatList = certificateIaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getCertificateIaasIdsRepeatList() {
        return this.certificateIaasIdsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setCertificateIdsRepeatList(java.util.List<String> certificateIdsRepeatList) {
        this.certificateIdsRepeatList = certificateIdsRepeatList;
        return this;
    }
    public java.util.List<String> getCertificateIdsRepeatList() {
        return this.certificateIdsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasLoadbalanceListenerRequest setGmCryptoCertIaasIdsRepeatList(java.util.List<String> gmCryptoCertIaasIdsRepeatList) {
        this.gmCryptoCertIaasIdsRepeatList = gmCryptoCertIaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getGmCryptoCertIaasIdsRepeatList() {
        return this.gmCryptoCertIaasIdsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setGmSignCertIaasIdsRepeatList(java.util.List<String> gmSignCertIaasIdsRepeatList) {
        this.gmSignCertIaasIdsRepeatList = gmSignCertIaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getGmSignCertIaasIdsRepeatList() {
        return this.gmSignCertIaasIdsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setListenerPortsRepeatList(java.util.List<Long> listenerPortsRepeatList) {
        this.listenerPortsRepeatList = listenerPortsRepeatList;
        return this;
    }
    public java.util.List<Long> getListenerPortsRepeatList() {
        return this.listenerPortsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setLoadBalancerIdsRepeatList(java.util.List<String> loadBalancerIdsRepeatList) {
        this.loadBalancerIdsRepeatList = loadBalancerIdsRepeatList;
        return this;
    }
    public java.util.List<String> getLoadBalancerIdsRepeatList() {
        return this.loadBalancerIdsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasLoadbalanceListenerRequest setTypesRepeatList(java.util.List<String> typesRepeatList) {
        this.typesRepeatList = typesRepeatList;
        return this;
    }
    public java.util.List<String> getTypesRepeatList() {
        return this.typesRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setVComputerGroupIdsRepeatList(java.util.List<String> VComputerGroupIdsRepeatList) {
        this.VComputerGroupIdsRepeatList = VComputerGroupIdsRepeatList;
        return this;
    }
    public java.util.List<String> getVComputerGroupIdsRepeatList() {
        return this.VComputerGroupIdsRepeatList;
    }

    public QueryCasLoadbalanceListenerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
