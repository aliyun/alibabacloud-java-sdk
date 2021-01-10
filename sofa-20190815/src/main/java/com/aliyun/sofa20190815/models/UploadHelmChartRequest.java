// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadHelmChartRequest extends TeaModel {
    @NameInMap("ChartFileName")
    public String chartFileName;

    @NameInMap("Workspace")
    public String workspace;

    public static UploadHelmChartRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadHelmChartRequest self = new UploadHelmChartRequest();
        return TeaModel.build(map, self);
    }

    public UploadHelmChartRequest setChartFileName(String chartFileName) {
        this.chartFileName = chartFileName;
        return this;
    }
    public String getChartFileName() {
        return this.chartFileName;
    }

    public UploadHelmChartRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
