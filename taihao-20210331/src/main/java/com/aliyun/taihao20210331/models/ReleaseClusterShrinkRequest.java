// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseClusterShrinkRequest extends TeaModel {
    // releaseClusterParam
    @NameInMap("releaseClusterParam")
    public String releaseClusterParamShrink;

    public static ReleaseClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterShrinkRequest self = new ReleaseClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterShrinkRequest setReleaseClusterParamShrink(String releaseClusterParamShrink) {
        this.releaseClusterParamShrink = releaseClusterParamShrink;
        return this;
    }
    public String getReleaseClusterParamShrink() {
        return this.releaseClusterParamShrink;
    }

}
