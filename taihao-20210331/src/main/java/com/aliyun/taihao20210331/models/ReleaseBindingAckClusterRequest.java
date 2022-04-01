// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseBindingAckClusterRequest extends TeaModel {
    // releaseBindingAckClusterParam
    @NameInMap("releaseBindingAckClusterParam")
    public ReleaseBindingAckClusterParam releaseBindingAckClusterParam;

    public static ReleaseBindingAckClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBindingAckClusterRequest self = new ReleaseBindingAckClusterRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseBindingAckClusterRequest setReleaseBindingAckClusterParam(ReleaseBindingAckClusterParam releaseBindingAckClusterParam) {
        this.releaseBindingAckClusterParam = releaseBindingAckClusterParam;
        return this;
    }
    public ReleaseBindingAckClusterParam getReleaseBindingAckClusterParam() {
        return this.releaseBindingAckClusterParam;
    }

}
