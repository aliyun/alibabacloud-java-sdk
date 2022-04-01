// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeDisksShrinkRequest extends TeaModel {
    // listNodeDiskParam
    @NameInMap("listNodeDiskParam")
    public String listNodeDiskParamShrink;

    public static ListNodeDisksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDisksShrinkRequest self = new ListNodeDisksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeDisksShrinkRequest setListNodeDiskParamShrink(String listNodeDiskParamShrink) {
        this.listNodeDiskParamShrink = listNodeDiskParamShrink;
        return this;
    }
    public String getListNodeDiskParamShrink() {
        return this.listNodeDiskParamShrink;
    }

}
