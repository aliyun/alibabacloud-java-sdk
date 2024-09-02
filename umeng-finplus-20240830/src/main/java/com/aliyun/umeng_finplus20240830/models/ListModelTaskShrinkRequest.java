// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ListModelTaskShrinkRequest extends TeaModel {
    @NameInMap("param")
    public String paramShrink;

    public static ListModelTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelTaskShrinkRequest self = new ListModelTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelTaskShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

}
