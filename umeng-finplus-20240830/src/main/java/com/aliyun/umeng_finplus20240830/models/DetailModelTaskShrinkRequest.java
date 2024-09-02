// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class DetailModelTaskShrinkRequest extends TeaModel {
    @NameInMap("param")
    public String paramShrink;

    public static DetailModelTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailModelTaskShrinkRequest self = new DetailModelTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetailModelTaskShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

}
