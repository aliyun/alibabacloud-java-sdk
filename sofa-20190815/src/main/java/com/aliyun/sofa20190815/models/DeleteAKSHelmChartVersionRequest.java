// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmChartVersionRequest extends TeaModel {
    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSHelmChartVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmChartVersionRequest self = new DeleteAKSHelmChartVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmChartVersionRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public DeleteAKSHelmChartVersionRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public DeleteAKSHelmChartVersionRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public DeleteAKSHelmChartVersionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
