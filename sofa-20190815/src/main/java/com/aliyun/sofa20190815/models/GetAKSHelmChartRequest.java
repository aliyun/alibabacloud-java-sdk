// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartRequest extends TeaModel {
    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSHelmChartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartRequest self = new GetAKSHelmChartRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartRequest setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public GetAKSHelmChartRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public GetAKSHelmChartRequest setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public GetAKSHelmChartRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
