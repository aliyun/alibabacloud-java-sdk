// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigsShrinkRequest extends TeaModel {
    // listConfigsParam
    @NameInMap("listConfigsParam")
    public String listConfigsParamShrink;

    public static ListConfigsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsShrinkRequest self = new ListConfigsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigsShrinkRequest setListConfigsParamShrink(String listConfigsParamShrink) {
        this.listConfigsParamShrink = listConfigsParamShrink;
        return this;
    }
    public String getListConfigsParamShrink() {
        return this.listConfigsParamShrink;
    }

}
