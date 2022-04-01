// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthShrinkRequest extends TeaModel {
    // listResourceHealthParam
    @NameInMap("listResourceHealthParam")
    public String listResourceHealthParamShrink;

    public static ListResourceHealthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthShrinkRequest self = new ListResourceHealthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthShrinkRequest setListResourceHealthParamShrink(String listResourceHealthParamShrink) {
        this.listResourceHealthParamShrink = listResourceHealthParamShrink;
        return this;
    }
    public String getListResourceHealthParamShrink() {
        return this.listResourceHealthParamShrink;
    }

}
