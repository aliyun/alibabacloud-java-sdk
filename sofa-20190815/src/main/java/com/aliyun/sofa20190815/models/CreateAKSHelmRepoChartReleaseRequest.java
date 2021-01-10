// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSHelmRepoChartReleaseRequest extends TeaModel {
    @NameInMap("ChartNameWithRepo")
    public String chartNameWithRepo;

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

    public static CreateAKSHelmRepoChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSHelmRepoChartReleaseRequest self = new CreateAKSHelmRepoChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSHelmRepoChartReleaseRequest setChartNameWithRepo(String chartNameWithRepo) {
        this.chartNameWithRepo = chartNameWithRepo;
        return this;
    }
    public String getChartNameWithRepo() {
        return this.chartNameWithRepo;
    }

    public CreateAKSHelmRepoChartReleaseRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public CreateAKSHelmRepoChartReleaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateAKSHelmRepoChartReleaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSHelmRepoChartReleaseRequest setReleaseDesc(String releaseDesc) {
        this.releaseDesc = releaseDesc;
        return this;
    }
    public String getReleaseDesc() {
        return this.releaseDesc;
    }

    public CreateAKSHelmRepoChartReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public CreateAKSHelmRepoChartReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
