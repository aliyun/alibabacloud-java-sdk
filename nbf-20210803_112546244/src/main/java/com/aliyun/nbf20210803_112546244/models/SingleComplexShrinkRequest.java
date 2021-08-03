// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class SingleComplexShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static SingleComplexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleComplexShrinkRequest self = new SingleComplexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SingleComplexShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
