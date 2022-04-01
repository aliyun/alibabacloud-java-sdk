// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodesShrinkRequest extends TeaModel {
    // updateOnKubeDedicatedNodesParam
    @NameInMap("updateOnKubeDedicatedNodesParam")
    public String updateOnKubeDedicatedNodesParamShrink;

    public static UpdateOnKubeDedicatedNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodesShrinkRequest self = new UpdateOnKubeDedicatedNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodesShrinkRequest setUpdateOnKubeDedicatedNodesParamShrink(String updateOnKubeDedicatedNodesParamShrink) {
        this.updateOnKubeDedicatedNodesParamShrink = updateOnKubeDedicatedNodesParamShrink;
        return this;
    }
    public String getUpdateOnKubeDedicatedNodesParamShrink() {
        return this.updateOnKubeDedicatedNodesParamShrink;
    }

}
