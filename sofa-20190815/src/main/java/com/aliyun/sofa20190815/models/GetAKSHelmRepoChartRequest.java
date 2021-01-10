// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmRepoChartRequest extends TeaModel {
    @NameInMap("ChartNameWithRepo")
    public String chartNameWithRepo;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSHelmRepoChartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmRepoChartRequest self = new GetAKSHelmRepoChartRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmRepoChartRequest setChartNameWithRepo(String chartNameWithRepo) {
        this.chartNameWithRepo = chartNameWithRepo;
        return this;
    }
    public String getChartNameWithRepo() {
        return this.chartNameWithRepo;
    }

    public GetAKSHelmRepoChartRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public GetAKSHelmRepoChartRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
