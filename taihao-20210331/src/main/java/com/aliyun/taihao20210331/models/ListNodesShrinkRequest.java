// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodesShrinkRequest extends TeaModel {
    // listNodesParam
    @NameInMap("listNodeParam")
    public String listNodeParamShrink;

    public static ListNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesShrinkRequest self = new ListNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesShrinkRequest setListNodeParamShrink(String listNodeParamShrink) {
        this.listNodeParamShrink = listNodeParamShrink;
        return this;
    }
    public String getListNodeParamShrink() {
        return this.listNodeParamShrink;
    }

}
