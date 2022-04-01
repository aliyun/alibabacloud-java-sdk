// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateMainVersionShrinkRequest extends TeaModel {
    // CreateMainVersionParam
    @NameInMap("CreateMainVersionParam")
    public String createMainVersionParamShrink;

    public static CreateMainVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMainVersionShrinkRequest self = new CreateMainVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMainVersionShrinkRequest setCreateMainVersionParamShrink(String createMainVersionParamShrink) {
        this.createMainVersionParamShrink = createMainVersionParamShrink;
        return this;
    }
    public String getCreateMainVersionParamShrink() {
        return this.createMainVersionParamShrink;
    }

}
