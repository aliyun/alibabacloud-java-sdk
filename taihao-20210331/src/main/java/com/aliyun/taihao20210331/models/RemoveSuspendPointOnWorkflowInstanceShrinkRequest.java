// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RemoveSuspendPointOnWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("removeSuspendPointOnWorkflowInstanceParam")
    public String removeSuspendPointOnWorkflowInstanceParamShrink;

    public static RemoveSuspendPointOnWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSuspendPointOnWorkflowInstanceShrinkRequest self = new RemoveSuspendPointOnWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSuspendPointOnWorkflowInstanceShrinkRequest setRemoveSuspendPointOnWorkflowInstanceParamShrink(String removeSuspendPointOnWorkflowInstanceParamShrink) {
        this.removeSuspendPointOnWorkflowInstanceParamShrink = removeSuspendPointOnWorkflowInstanceParamShrink;
        return this;
    }
    public String getRemoveSuspendPointOnWorkflowInstanceParamShrink() {
        return this.removeSuspendPointOnWorkflowInstanceParamShrink;
    }

}
