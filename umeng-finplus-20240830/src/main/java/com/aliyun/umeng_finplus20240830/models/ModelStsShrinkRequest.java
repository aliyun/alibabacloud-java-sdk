// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ModelStsShrinkRequest extends TeaModel {
    @NameInMap("param")
    public String paramShrink;

    public static ModelStsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelStsShrinkRequest self = new ModelStsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModelStsShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

}
