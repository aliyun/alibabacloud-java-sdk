// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateStackApplicationShrinkRequest extends TeaModel {
    // createApplicationParam
    @NameInMap("createStackApplicationParam")
    public String createStackApplicationParamShrink;

    public static CreateStackApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackApplicationShrinkRequest self = new CreateStackApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackApplicationShrinkRequest setCreateStackApplicationParamShrink(String createStackApplicationParamShrink) {
        this.createStackApplicationParamShrink = createStackApplicationParamShrink;
        return this;
    }
    public String getCreateStackApplicationParamShrink() {
        return this.createStackApplicationParamShrink;
    }

}
