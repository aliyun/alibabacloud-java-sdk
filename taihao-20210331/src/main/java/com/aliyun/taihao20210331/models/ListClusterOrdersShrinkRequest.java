// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOrdersShrinkRequest extends TeaModel {
    // listClusterOrdersParam
    @NameInMap("listClusterOrdersParam")
    public String listClusterOrdersParamShrink;

    public static ListClusterOrdersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOrdersShrinkRequest self = new ListClusterOrdersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOrdersShrinkRequest setListClusterOrdersParamShrink(String listClusterOrdersParamShrink) {
        this.listClusterOrdersParamShrink = listClusterOrdersParamShrink;
        return this;
    }
    public String getListClusterOrdersParamShrink() {
        return this.listClusterOrdersParamShrink;
    }

}
