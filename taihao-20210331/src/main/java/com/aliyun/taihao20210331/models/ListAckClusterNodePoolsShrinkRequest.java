// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodePoolsShrinkRequest extends TeaModel {
    // listAckClusterNodePoolsParam
    @NameInMap("listAckClusterNodePoolsParam")
    public String listAckClusterNodePoolsParamShrink;

    public static ListAckClusterNodePoolsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodePoolsShrinkRequest self = new ListAckClusterNodePoolsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodePoolsShrinkRequest setListAckClusterNodePoolsParamShrink(String listAckClusterNodePoolsParamShrink) {
        this.listAckClusterNodePoolsParamShrink = listAckClusterNodePoolsParamShrink;
        return this;
    }
    public String getListAckClusterNodePoolsParamShrink() {
        return this.listAckClusterNodePoolsParamShrink;
    }

}
