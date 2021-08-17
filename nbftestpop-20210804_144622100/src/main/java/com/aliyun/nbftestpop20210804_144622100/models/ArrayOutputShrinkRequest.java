// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210804_144622100.models;

import com.aliyun.tea.*;

public class ArrayOutputShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static ArrayOutputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayOutputShrinkRequest self = new ArrayOutputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ArrayOutputShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
