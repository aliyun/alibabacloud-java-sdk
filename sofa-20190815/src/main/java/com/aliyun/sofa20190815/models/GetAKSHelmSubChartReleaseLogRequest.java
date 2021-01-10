// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmSubChartReleaseLogRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static GetAKSHelmSubChartReleaseLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmSubChartReleaseLogRequest self = new GetAKSHelmSubChartReleaseLogRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmSubChartReleaseLogRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
