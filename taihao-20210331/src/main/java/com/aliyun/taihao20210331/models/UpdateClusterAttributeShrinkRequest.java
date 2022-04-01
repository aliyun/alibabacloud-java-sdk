// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterAttributeShrinkRequest extends TeaModel {
    @NameInMap("param")
    public String paramShrink;

    public static UpdateClusterAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAttributeShrinkRequest self = new UpdateClusterAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAttributeShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

}
