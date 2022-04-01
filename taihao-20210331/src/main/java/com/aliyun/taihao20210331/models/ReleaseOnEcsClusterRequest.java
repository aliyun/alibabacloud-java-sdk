// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseOnEcsClusterRequest extends TeaModel {
    // releaseOnEcsClusterParam
    @NameInMap("ReleaseOnEcsClusterParam")
    public ReleaseOnEcsClusterParam releaseOnEcsClusterParam;

    public static ReleaseOnEcsClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseOnEcsClusterRequest self = new ReleaseOnEcsClusterRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseOnEcsClusterRequest setReleaseOnEcsClusterParam(ReleaseOnEcsClusterParam releaseOnEcsClusterParam) {
        this.releaseOnEcsClusterParam = releaseOnEcsClusterParam;
        return this;
    }
    public ReleaseOnEcsClusterParam getReleaseOnEcsClusterParam() {
        return this.releaseOnEcsClusterParam;
    }

}
