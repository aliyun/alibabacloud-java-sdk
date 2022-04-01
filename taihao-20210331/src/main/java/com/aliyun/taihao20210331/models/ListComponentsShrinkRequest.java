// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentsShrinkRequest extends TeaModel {
    // listComponentsParam
    @NameInMap("listComponentsParam")
    public String listComponentsParamShrink;

    public static ListComponentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsShrinkRequest self = new ListComponentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentsShrinkRequest setListComponentsParamShrink(String listComponentsParamShrink) {
        this.listComponentsParamShrink = listComponentsParamShrink;
        return this;
    }
    public String getListComponentsParamShrink() {
        return this.listComponentsParamShrink;
    }

}
