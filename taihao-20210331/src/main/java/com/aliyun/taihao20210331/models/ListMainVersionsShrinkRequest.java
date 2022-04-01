// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListMainVersionsShrinkRequest extends TeaModel {
    @NameInMap("listMainVersionsParam")
    public String listMainVersionsParamShrink;

    public static ListMainVersionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionsShrinkRequest self = new ListMainVersionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMainVersionsShrinkRequest setListMainVersionsParamShrink(String listMainVersionsParamShrink) {
        this.listMainVersionsParamShrink = listMainVersionsParamShrink;
        return this;
    }
    public String getListMainVersionsParamShrink() {
        return this.listMainVersionsParamShrink;
    }

}
