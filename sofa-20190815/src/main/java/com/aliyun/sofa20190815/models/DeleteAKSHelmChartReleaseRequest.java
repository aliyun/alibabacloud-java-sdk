// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmChartReleaseRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ReleaseName")
    public String releaseName;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSHelmChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmChartReleaseRequest self = new DeleteAKSHelmChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmChartReleaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteAKSHelmChartReleaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteAKSHelmChartReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public DeleteAKSHelmChartReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
