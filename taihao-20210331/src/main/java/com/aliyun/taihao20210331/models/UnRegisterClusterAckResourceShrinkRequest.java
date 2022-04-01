// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UnRegisterClusterAckResourceShrinkRequest extends TeaModel {
    // unRegisterClusterAckResourceParam
    @NameInMap("unRegisterClusterAckResourceParam")
    public String unRegisterClusterAckResourceParamShrink;

    public static UnRegisterClusterAckResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterClusterAckResourceShrinkRequest self = new UnRegisterClusterAckResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnRegisterClusterAckResourceShrinkRequest setUnRegisterClusterAckResourceParamShrink(String unRegisterClusterAckResourceParamShrink) {
        this.unRegisterClusterAckResourceParamShrink = unRegisterClusterAckResourceParamShrink;
        return this;
    }
    public String getUnRegisterClusterAckResourceParamShrink() {
        return this.unRegisterClusterAckResourceParamShrink;
    }

}
