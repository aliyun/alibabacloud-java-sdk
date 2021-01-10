// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackAKSHelmChartReleaseRequest extends TeaModel {
    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("Workspace")
    public String workspace;

    public static RollbackAKSHelmChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackAKSHelmChartReleaseRequest self = new RollbackAKSHelmChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public RollbackAKSHelmChartReleaseRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public RollbackAKSHelmChartReleaseRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public RollbackAKSHelmChartReleaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RollbackAKSHelmChartReleaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RollbackAKSHelmChartReleaseRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public RollbackAKSHelmChartReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
