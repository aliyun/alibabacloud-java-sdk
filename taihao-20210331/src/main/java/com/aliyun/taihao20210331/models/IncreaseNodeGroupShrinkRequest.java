// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupShrinkRequest extends TeaModel {
    // increaseNodeGroupParam
    @NameInMap("increaseNodeGroupParam")
    public String increaseNodeGroupParamShrink;

    public static IncreaseNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupShrinkRequest self = new IncreaseNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupShrinkRequest setIncreaseNodeGroupParamShrink(String increaseNodeGroupParamShrink) {
        this.increaseNodeGroupParamShrink = increaseNodeGroupParamShrink;
        return this;
    }
    public String getIncreaseNodeGroupParamShrink() {
        return this.increaseNodeGroupParamShrink;
    }

}
