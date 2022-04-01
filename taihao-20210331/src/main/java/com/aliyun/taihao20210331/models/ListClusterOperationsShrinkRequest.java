// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationsShrinkRequest extends TeaModel {
    // listClusterOperationsParam
    @NameInMap("listClusterOperationsParam")
    public String listClusterOperationsParamShrink;

    public static ListClusterOperationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationsShrinkRequest self = new ListClusterOperationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationsShrinkRequest setListClusterOperationsParamShrink(String listClusterOperationsParamShrink) {
        this.listClusterOperationsParamShrink = listClusterOperationsParamShrink;
        return this;
    }
    public String getListClusterOperationsParamShrink() {
        return this.listClusterOperationsParamShrink;
    }

}
