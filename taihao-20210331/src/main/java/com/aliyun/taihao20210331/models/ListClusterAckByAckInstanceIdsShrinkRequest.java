// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByAckInstanceIdsShrinkRequest extends TeaModel {
    // listClusterAckByInstanceIdsParam
    @NameInMap("listClusterAckByInstanceIdsParam")
    public String listClusterAckByInstanceIdsParamShrink;

    public static ListClusterAckByAckInstanceIdsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByAckInstanceIdsShrinkRequest self = new ListClusterAckByAckInstanceIdsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByAckInstanceIdsShrinkRequest setListClusterAckByInstanceIdsParamShrink(String listClusterAckByInstanceIdsParamShrink) {
        this.listClusterAckByInstanceIdsParamShrink = listClusterAckByInstanceIdsParamShrink;
        return this;
    }
    public String getListClusterAckByInstanceIdsParamShrink() {
        return this.listClusterAckByInstanceIdsParamShrink;
    }

}
