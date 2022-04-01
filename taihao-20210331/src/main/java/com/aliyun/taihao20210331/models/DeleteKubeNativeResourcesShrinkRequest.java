// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteKubeNativeResourcesShrinkRequest extends TeaModel {
    // deleteKubeNativeResourcesParam
    @NameInMap("deleteKubeNativeResourcesParam")
    public String deleteKubeNativeResourcesParamShrink;

    public static DeleteKubeNativeResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubeNativeResourcesShrinkRequest self = new DeleteKubeNativeResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKubeNativeResourcesShrinkRequest setDeleteKubeNativeResourcesParamShrink(String deleteKubeNativeResourcesParamShrink) {
        this.deleteKubeNativeResourcesParamShrink = deleteKubeNativeResourcesParamShrink;
        return this;
    }
    public String getDeleteKubeNativeResourcesParamShrink() {
        return this.deleteKubeNativeResourcesParamShrink;
    }

}
