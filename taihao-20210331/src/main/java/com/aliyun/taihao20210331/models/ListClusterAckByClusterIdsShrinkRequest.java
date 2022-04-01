// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByClusterIdsShrinkRequest extends TeaModel {
    // listClusterAckClusterByClusterIdsParam
    @NameInMap("listClusterAckClusterByClusterIdsParam")
    public String listClusterAckClusterByClusterIdsParamShrink;

    public static ListClusterAckByClusterIdsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByClusterIdsShrinkRequest self = new ListClusterAckByClusterIdsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByClusterIdsShrinkRequest setListClusterAckClusterByClusterIdsParamShrink(String listClusterAckClusterByClusterIdsParamShrink) {
        this.listClusterAckClusterByClusterIdsParamShrink = listClusterAckClusterByClusterIdsParamShrink;
        return this;
    }
    public String getListClusterAckClusterByClusterIdsParamShrink() {
        return this.listClusterAckClusterByClusterIdsParamShrink;
    }

}
