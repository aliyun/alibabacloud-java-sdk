// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartReleaseStatusRequest extends TeaModel {
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

    public static GetAKSHelmChartReleaseStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartReleaseStatusRequest self = new GetAKSHelmChartReleaseStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartReleaseStatusRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public GetAKSHelmChartReleaseStatusRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public GetAKSHelmChartReleaseStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAKSHelmChartReleaseStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetAKSHelmChartReleaseStatusRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public GetAKSHelmChartReleaseStatusRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
