// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterUserShrinkRequest extends TeaModel {
    @NameInMap("updateClusterUserParam")
    public String updateClusterUserParamShrink;

    public static UpdateClusterUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterUserShrinkRequest self = new UpdateClusterUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterUserShrinkRequest setUpdateClusterUserParamShrink(String updateClusterUserParamShrink) {
        this.updateClusterUserParamShrink = updateClusterUserParamShrink;
        return this;
    }
    public String getUpdateClusterUserParamShrink() {
        return this.updateClusterUserParamShrink;
    }

}
