// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelAKSHelmChartReleaseRequest extends TeaModel {
    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ReleaseName")
    public String releaseName;

    @NameInMap("Workspace")
    public String workspace;

    public static CancelAKSHelmChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAKSHelmChartReleaseRequest self = new CancelAKSHelmChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CancelAKSHelmChartReleaseRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public CancelAKSHelmChartReleaseRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public CancelAKSHelmChartReleaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CancelAKSHelmChartReleaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CancelAKSHelmChartReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public CancelAKSHelmChartReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
