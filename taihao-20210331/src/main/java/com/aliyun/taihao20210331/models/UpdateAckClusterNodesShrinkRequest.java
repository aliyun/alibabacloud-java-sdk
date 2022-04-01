// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodesShrinkRequest extends TeaModel {
    // updateAckClusterNodesParam
    @NameInMap("updateAckClusterNodesParam")
    public String updateAckClusterNodesParamShrink;

    public static UpdateAckClusterNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodesShrinkRequest self = new UpdateAckClusterNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodesShrinkRequest setUpdateAckClusterNodesParamShrink(String updateAckClusterNodesParamShrink) {
        this.updateAckClusterNodesParamShrink = updateAckClusterNodesParamShrink;
        return this;
    }
    public String getUpdateAckClusterNodesParamShrink() {
        return this.updateAckClusterNodesParamShrink;
    }

}
