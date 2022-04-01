// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListOnKubeDedicatedNodesShrinkRequest extends TeaModel {
    // listOnKubeDedicatedNodesParam
    @NameInMap("listOnKubeDedicatedNodesParam")
    public String listOnKubeDedicatedNodesParamShrink;

    public static ListOnKubeDedicatedNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnKubeDedicatedNodesShrinkRequest self = new ListOnKubeDedicatedNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOnKubeDedicatedNodesShrinkRequest setListOnKubeDedicatedNodesParamShrink(String listOnKubeDedicatedNodesParamShrink) {
        this.listOnKubeDedicatedNodesParamShrink = listOnKubeDedicatedNodesParamShrink;
        return this;
    }
    public String getListOnKubeDedicatedNodesParamShrink() {
        return this.listOnKubeDedicatedNodesParamShrink;
    }

}
