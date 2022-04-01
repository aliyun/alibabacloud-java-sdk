// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseOnEcsClusterShrinkRequest extends TeaModel {
    // releaseOnEcsClusterParam
    @NameInMap("ReleaseOnEcsClusterParam")
    public String releaseOnEcsClusterParamShrink;

    public static ReleaseOnEcsClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseOnEcsClusterShrinkRequest self = new ReleaseOnEcsClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseOnEcsClusterShrinkRequest setReleaseOnEcsClusterParamShrink(String releaseOnEcsClusterParamShrink) {
        this.releaseOnEcsClusterParamShrink = releaseOnEcsClusterParamShrink;
        return this;
    }
    public String getReleaseOnEcsClusterParamShrink() {
        return this.releaseOnEcsClusterParamShrink;
    }

}
