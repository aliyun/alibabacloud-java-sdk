// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseBindingAckClusterShrinkRequest extends TeaModel {
    // releaseBindingAckClusterParam
    @NameInMap("releaseBindingAckClusterParam")
    public String releaseBindingAckClusterParamShrink;

    public static ReleaseBindingAckClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBindingAckClusterShrinkRequest self = new ReleaseBindingAckClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseBindingAckClusterShrinkRequest setReleaseBindingAckClusterParamShrink(String releaseBindingAckClusterParamShrink) {
        this.releaseBindingAckClusterParamShrink = releaseBindingAckClusterParamShrink;
        return this;
    }
    public String getReleaseBindingAckClusterParamShrink() {
        return this.releaseBindingAckClusterParamShrink;
    }

}
