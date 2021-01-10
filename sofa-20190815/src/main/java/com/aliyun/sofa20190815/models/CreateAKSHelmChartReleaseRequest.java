// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSHelmChartReleaseRequest extends TeaModel {
    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ReleaseDesc")
    public String releaseDesc;

    @NameInMap("ReleaseName")
    public String releaseName;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateAKSHelmChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSHelmChartReleaseRequest self = new CreateAKSHelmChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSHelmChartReleaseRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public CreateAKSHelmChartReleaseRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public CreateAKSHelmChartReleaseRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public CreateAKSHelmChartReleaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateAKSHelmChartReleaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSHelmChartReleaseRequest setReleaseDesc(String releaseDesc) {
        this.releaseDesc = releaseDesc;
        return this;
    }
    public String getReleaseDesc() {
        return this.releaseDesc;
    }

    public CreateAKSHelmChartReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public CreateAKSHelmChartReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
