// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DecreaseNodeGroupShrinkRequest extends TeaModel {
    // DecreaseNodeGroupParam
    @NameInMap("DecreaseNodeGroupParam")
    public String decreaseNodeGroupParamShrink;

    public static DecreaseNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodeGroupShrinkRequest self = new DecreaseNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DecreaseNodeGroupShrinkRequest setDecreaseNodeGroupParamShrink(String decreaseNodeGroupParamShrink) {
        this.decreaseNodeGroupParamShrink = decreaseNodeGroupParamShrink;
        return this;
    }
    public String getDecreaseNodeGroupParamShrink() {
        return this.decreaseNodeGroupParamShrink;
    }

}
