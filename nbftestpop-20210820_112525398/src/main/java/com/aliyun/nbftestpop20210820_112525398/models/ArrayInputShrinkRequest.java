// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class ArrayInputShrinkRequest extends TeaModel {
    @NameInMap("firstInput")
    public String firstInputShrink;

    public static ArrayInputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayInputShrinkRequest self = new ArrayInputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ArrayInputShrinkRequest setFirstInputShrink(String firstInputShrink) {
        this.firstInputShrink = firstInputShrink;
        return this;
    }
    public String getFirstInputShrink() {
        return this.firstInputShrink;
    }

}
