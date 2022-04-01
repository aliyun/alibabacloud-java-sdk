// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    @NameInMap("createClusterParam")
    public String createClusterParamShrink;

    public static CreateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterShrinkRequest self = new CreateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterShrinkRequest setCreateClusterParamShrink(String createClusterParamShrink) {
        this.createClusterParamShrink = createClusterParamShrink;
        return this;
    }
    public String getCreateClusterParamShrink() {
        return this.createClusterParamShrink;
    }

}
