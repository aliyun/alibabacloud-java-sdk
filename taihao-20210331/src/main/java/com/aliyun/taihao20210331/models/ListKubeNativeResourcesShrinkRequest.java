// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeNativeResourcesShrinkRequest extends TeaModel {
    // listKubeNativeResourcesParam
    @NameInMap("listKubeNativeResourcesParam")
    public String listKubeNativeResourcesParamShrink;

    public static ListKubeNativeResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKubeNativeResourcesShrinkRequest self = new ListKubeNativeResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListKubeNativeResourcesShrinkRequest setListKubeNativeResourcesParamShrink(String listKubeNativeResourcesParamShrink) {
        this.listKubeNativeResourcesParamShrink = listKubeNativeResourcesParamShrink;
        return this;
    }
    public String getListKubeNativeResourcesParamShrink() {
        return this.listKubeNativeResourcesParamShrink;
    }

}
