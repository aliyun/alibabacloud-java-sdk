// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationNodesShrinkRequest extends TeaModel {
    // listClusterOperationNodesParam
    @NameInMap("listClusterOperationNodesParam")
    public String listClusterOperationNodesParamShrink;

    public static ListClusterOperationNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationNodesShrinkRequest self = new ListClusterOperationNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationNodesShrinkRequest setListClusterOperationNodesParamShrink(String listClusterOperationNodesParamShrink) {
        this.listClusterOperationNodesParamShrink = listClusterOperationNodesParamShrink;
        return this;
    }
    public String getListClusterOperationNodesParamShrink() {
        return this.listClusterOperationNodesParamShrink;
    }

}
