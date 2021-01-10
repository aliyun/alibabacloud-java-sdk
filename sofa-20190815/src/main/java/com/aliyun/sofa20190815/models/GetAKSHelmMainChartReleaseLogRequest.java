// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmMainChartReleaseLogRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static GetAKSHelmMainChartReleaseLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmMainChartReleaseLogRequest self = new GetAKSHelmMainChartReleaseLogRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmMainChartReleaseLogRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
