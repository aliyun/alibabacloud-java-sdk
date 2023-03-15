// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class StackDetailResult extends TeaModel {
    @NameInMap("stacks")
    public java.util.List<StackInfo> stacks;

    public static StackDetailResult build(java.util.Map<String, ?> map) throws Exception {
        StackDetailResult self = new StackDetailResult();
        return TeaModel.build(map, self);
    }

    public StackDetailResult setStacks(java.util.List<StackInfo> stacks) {
        this.stacks = stacks;
        return this;
    }
    public java.util.List<StackInfo> getStacks() {
        return this.stacks;
    }

}
