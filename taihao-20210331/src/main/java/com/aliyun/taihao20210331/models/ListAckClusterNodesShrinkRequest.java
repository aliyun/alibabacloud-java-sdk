// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodesShrinkRequest extends TeaModel {
    // listAckClusterNodesParam
    @NameInMap("listAckClusterNodesParam")
    public String listAckClusterNodesParamShrink;

    public static ListAckClusterNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodesShrinkRequest self = new ListAckClusterNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodesShrinkRequest setListAckClusterNodesParamShrink(String listAckClusterNodesParamShrink) {
        this.listAckClusterNodesParamShrink = listAckClusterNodesParamShrink;
        return this;
    }
    public String getListAckClusterNodesParamShrink() {
        return this.listAckClusterNodesParamShrink;
    }

}
