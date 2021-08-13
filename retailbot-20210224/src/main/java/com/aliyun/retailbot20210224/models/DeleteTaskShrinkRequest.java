// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteTaskShrinkRequest extends TeaModel {
    @NameInMap("DigDeleteParam")
    public String digDeleteParamShrink;

    public static DeleteTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskShrinkRequest self = new DeleteTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskShrinkRequest setDigDeleteParamShrink(String digDeleteParamShrink) {
        this.digDeleteParamShrink = digDeleteParamShrink;
        return this;
    }
    public String getDigDeleteParamShrink() {
        return this.digDeleteParamShrink;
    }

}
