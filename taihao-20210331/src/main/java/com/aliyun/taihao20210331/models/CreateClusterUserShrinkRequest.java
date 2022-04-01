// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterUserShrinkRequest extends TeaModel {
    @NameInMap("createClusterUserParam")
    public String createClusterUserParamShrink;

    public static CreateClusterUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterUserShrinkRequest self = new CreateClusterUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterUserShrinkRequest setCreateClusterUserParamShrink(String createClusterUserParamShrink) {
        this.createClusterUserParamShrink = createClusterUserParamShrink;
        return this;
    }
    public String getCreateClusterUserParamShrink() {
        return this.createClusterUserParamShrink;
    }

}
