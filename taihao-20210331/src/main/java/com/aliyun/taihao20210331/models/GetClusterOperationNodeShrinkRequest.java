// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationNodeShrinkRequest extends TeaModel {
    // getClusterOperationNodeParam
    @NameInMap("getClusterOperationNodeParam")
    public String getClusterOperationNodeParamShrink;

    public static GetClusterOperationNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationNodeShrinkRequest self = new GetClusterOperationNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationNodeShrinkRequest setGetClusterOperationNodeParamShrink(String getClusterOperationNodeParamShrink) {
        this.getClusterOperationNodeParamShrink = getClusterOperationNodeParamShrink;
        return this;
    }
    public String getGetClusterOperationNodeParamShrink() {
        return this.getClusterOperationNodeParamShrink;
    }

}
