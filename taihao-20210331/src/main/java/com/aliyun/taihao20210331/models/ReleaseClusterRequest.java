// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseClusterRequest extends TeaModel {
    // releaseClusterParam
    @NameInMap("releaseClusterParam")
    public ReleaseClusterParam releaseClusterParam;

    public static ReleaseClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterRequest self = new ReleaseClusterRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterRequest setReleaseClusterParam(ReleaseClusterParam releaseClusterParam) {
        this.releaseClusterParam = releaseClusterParam;
        return this;
    }
    public ReleaseClusterParam getReleaseClusterParam() {
        return this.releaseClusterParam;
    }

}
