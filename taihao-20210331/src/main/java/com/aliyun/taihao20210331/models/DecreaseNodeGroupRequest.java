// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DecreaseNodeGroupRequest extends TeaModel {
    // DecreaseNodeGroupParam
    @NameInMap("DecreaseNodeGroupParam")
    public DecreaseNodeGroupParam decreaseNodeGroupParam;

    public static DecreaseNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodeGroupRequest self = new DecreaseNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DecreaseNodeGroupRequest setDecreaseNodeGroupParam(DecreaseNodeGroupParam decreaseNodeGroupParam) {
        this.decreaseNodeGroupParam = decreaseNodeGroupParam;
        return this;
    }
    public DecreaseNodeGroupParam getDecreaseNodeGroupParam() {
        return this.decreaseNodeGroupParam;
    }

}
