// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class CreateModelTaskShrinkRequest extends TeaModel {
    @NameInMap("param")
    public String paramShrink;

    public static CreateModelTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelTaskShrinkRequest self = new CreateModelTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelTaskShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

}
