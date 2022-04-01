// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodePoolsShrinkRequest extends TeaModel {
    // updateAckClusterNodePoolsParam
    @NameInMap("updateAckClusterNodePoolsParam")
    public String updateAckClusterNodePoolsParamShrink;

    public static UpdateAckClusterNodePoolsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodePoolsShrinkRequest self = new UpdateAckClusterNodePoolsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodePoolsShrinkRequest setUpdateAckClusterNodePoolsParamShrink(String updateAckClusterNodePoolsParamShrink) {
        this.updateAckClusterNodePoolsParamShrink = updateAckClusterNodePoolsParamShrink;
        return this;
    }
    public String getUpdateAckClusterNodePoolsParamShrink() {
        return this.updateAckClusterNodePoolsParamShrink;
    }

}
