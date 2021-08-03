// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputStringShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static PrimitiveOutputStringShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputStringShrinkRequest self = new PrimitiveOutputStringShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputStringShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
