// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupRequest extends TeaModel {
    // increaseNodeGroupParam
    @NameInMap("increaseNodeGroupParam")
    public IncreaseNodeGroupParam increaseNodeGroupParam;

    public static IncreaseNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupRequest self = new IncreaseNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupRequest setIncreaseNodeGroupParam(IncreaseNodeGroupParam increaseNodeGroupParam) {
        this.increaseNodeGroupParam = increaseNodeGroupParam;
        return this;
    }
    public IncreaseNodeGroupParam getIncreaseNodeGroupParam() {
        return this.increaseNodeGroupParam;
    }

}
