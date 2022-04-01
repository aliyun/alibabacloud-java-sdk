// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterShrinkRequest extends TeaModel {
    @NameInMap("createFullClusterParam")
    public String createFullClusterParamShrink;

    public static CreateFullClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterShrinkRequest self = new CreateFullClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterShrinkRequest setCreateFullClusterParamShrink(String createFullClusterParamShrink) {
        this.createFullClusterParamShrink = createFullClusterParamShrink;
        return this;
    }
    public String getCreateFullClusterParamShrink() {
        return this.createFullClusterParamShrink;
    }

}
