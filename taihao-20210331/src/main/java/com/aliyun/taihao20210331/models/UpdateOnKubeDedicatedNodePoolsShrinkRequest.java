// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodePoolsShrinkRequest extends TeaModel {
    // updateOnKubeDedicatedNodePoolsParam
    @NameInMap("updateOnKubeDedicatedNodePoolsParam")
    public String updateOnKubeDedicatedNodePoolsParamShrink;

    public static UpdateOnKubeDedicatedNodePoolsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodePoolsShrinkRequest self = new UpdateOnKubeDedicatedNodePoolsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodePoolsShrinkRequest setUpdateOnKubeDedicatedNodePoolsParamShrink(String updateOnKubeDedicatedNodePoolsParamShrink) {
        this.updateOnKubeDedicatedNodePoolsParamShrink = updateOnKubeDedicatedNodePoolsParamShrink;
        return this;
    }
    public String getUpdateOnKubeDedicatedNodePoolsParamShrink() {
        return this.updateOnKubeDedicatedNodePoolsParamShrink;
    }

}
