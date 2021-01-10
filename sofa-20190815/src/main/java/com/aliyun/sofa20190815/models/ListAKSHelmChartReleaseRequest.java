// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSHelmChartReleaseRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PaginationQueryJsonStr")
    public String paginationQueryJsonStr;

    @NameInMap("Workspace")
    public String workspace;

    public static ListAKSHelmChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSHelmChartReleaseRequest self = new ListAKSHelmChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSHelmChartReleaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAKSHelmChartReleaseRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAKSHelmChartReleaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAKSHelmChartReleaseRequest setPaginationQueryJsonStr(String paginationQueryJsonStr) {
        this.paginationQueryJsonStr = paginationQueryJsonStr;
        return this;
    }
    public String getPaginationQueryJsonStr() {
        return this.paginationQueryJsonStr;
    }

    public ListAKSHelmChartReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
