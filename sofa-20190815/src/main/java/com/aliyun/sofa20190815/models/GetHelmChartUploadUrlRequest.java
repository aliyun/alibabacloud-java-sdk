// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHelmChartUploadUrlRequest extends TeaModel {
    @NameInMap("ChartFileName")
    public String chartFileName;

    @NameInMap("Workspace")
    public String workspace;

    public static GetHelmChartUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHelmChartUploadUrlRequest self = new GetHelmChartUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetHelmChartUploadUrlRequest setChartFileName(String chartFileName) {
        this.chartFileName = chartFileName;
        return this;
    }
    public String getChartFileName() {
        return this.chartFileName;
    }

    public GetHelmChartUploadUrlRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
