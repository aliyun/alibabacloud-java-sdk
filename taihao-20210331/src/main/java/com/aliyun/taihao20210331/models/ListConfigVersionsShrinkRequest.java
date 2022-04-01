// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigVersionsShrinkRequest extends TeaModel {
    // listConfigVersionsParam
    @NameInMap("listConfigVersionsParam")
    public String listConfigVersionsParamShrink;

    public static ListConfigVersionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigVersionsShrinkRequest self = new ListConfigVersionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigVersionsShrinkRequest setListConfigVersionsParamShrink(String listConfigVersionsParamShrink) {
        this.listConfigVersionsParamShrink = listConfigVersionsParamShrink;
        return this;
    }
    public String getListConfigVersionsParamShrink() {
        return this.listConfigVersionsParamShrink;
    }

}
