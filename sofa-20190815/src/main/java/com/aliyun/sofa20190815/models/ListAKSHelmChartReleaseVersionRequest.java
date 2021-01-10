// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSHelmChartReleaseVersionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PaginationQueryJsonStr")
    public String paginationQueryJsonStr;

    @NameInMap("ReleaseName")
    public String releaseName;

    @NameInMap("Workspace")
    public String workspace;

    public static ListAKSHelmChartReleaseVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSHelmChartReleaseVersionRequest self = new ListAKSHelmChartReleaseVersionRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSHelmChartReleaseVersionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAKSHelmChartReleaseVersionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAKSHelmChartReleaseVersionRequest setPaginationQueryJsonStr(String paginationQueryJsonStr) {
        this.paginationQueryJsonStr = paginationQueryJsonStr;
        return this;
    }
    public String getPaginationQueryJsonStr() {
        return this.paginationQueryJsonStr;
    }

    public ListAKSHelmChartReleaseVersionRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public ListAKSHelmChartReleaseVersionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
