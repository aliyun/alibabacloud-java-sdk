// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterByMainVersionShrinkRequest extends TeaModel {
    @NameInMap("createFullClusterByMainVersionParam")
    public String createFullClusterByMainVersionParamShrink;

    public static CreateFullClusterByMainVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterByMainVersionShrinkRequest self = new CreateFullClusterByMainVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterByMainVersionShrinkRequest setCreateFullClusterByMainVersionParamShrink(String createFullClusterByMainVersionParamShrink) {
        this.createFullClusterByMainVersionParamShrink = createFullClusterByMainVersionParamShrink;
        return this;
    }
    public String getCreateFullClusterByMainVersionParamShrink() {
        return this.createFullClusterByMainVersionParamShrink;
    }

}
