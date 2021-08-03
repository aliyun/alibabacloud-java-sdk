// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class VoidOutputShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static VoidOutputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VoidOutputShrinkRequest self = new VoidOutputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VoidOutputShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
