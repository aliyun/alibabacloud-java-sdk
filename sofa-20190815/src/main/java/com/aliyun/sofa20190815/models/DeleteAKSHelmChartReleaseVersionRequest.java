// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmChartReleaseVersionRequest extends TeaModel {
    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSHelmChartReleaseVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmChartReleaseVersionRequest self = new DeleteAKSHelmChartReleaseVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmChartReleaseVersionRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public DeleteAKSHelmChartReleaseVersionRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public DeleteAKSHelmChartReleaseVersionRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public DeleteAKSHelmChartReleaseVersionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
