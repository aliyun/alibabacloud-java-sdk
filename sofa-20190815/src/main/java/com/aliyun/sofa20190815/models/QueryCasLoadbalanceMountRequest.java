// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceMountRequest extends TeaModel {
    @NameInMap("DomainsRepeatList")
    public java.util.List<String> domainsRepeatList;

    @NameInMap("LoadbalanceIdsRepeatList")
    public java.util.List<String> loadbalanceIdsRepeatList;

    @NameInMap("Mounted")
    public Boolean mounted;

    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceMountRequest self = new QueryCasLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceMountRequest setDomainsRepeatList(java.util.List<String> domainsRepeatList) {
        this.domainsRepeatList = domainsRepeatList;
        return this;
    }
    public java.util.List<String> getDomainsRepeatList() {
        return this.domainsRepeatList;
    }

    public QueryCasLoadbalanceMountRequest setLoadbalanceIdsRepeatList(java.util.List<String> loadbalanceIdsRepeatList) {
        this.loadbalanceIdsRepeatList = loadbalanceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getLoadbalanceIdsRepeatList() {
        return this.loadbalanceIdsRepeatList;
    }

    public QueryCasLoadbalanceMountRequest setMounted(Boolean mounted) {
        this.mounted = mounted;
        return this;
    }
    public Boolean getMounted() {
        return this.mounted;
    }

    public QueryCasLoadbalanceMountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
