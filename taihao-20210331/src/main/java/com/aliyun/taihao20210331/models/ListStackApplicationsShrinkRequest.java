// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListStackApplicationsShrinkRequest extends TeaModel {
    // ListApplicationParam
    @NameInMap("listStackApplicationParam")
    public String listStackApplicationParamShrink;

    public static ListStackApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackApplicationsShrinkRequest self = new ListStackApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListStackApplicationsShrinkRequest setListStackApplicationParamShrink(String listStackApplicationParamShrink) {
        this.listStackApplicationParamShrink = listStackApplicationParamShrink;
        return this;
    }
    public String getListStackApplicationParamShrink() {
        return this.listStackApplicationParamShrink;
    }

}
