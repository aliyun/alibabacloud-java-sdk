// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SuspendWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("suspendWorkflowInstanceParam")
    public String suspendWorkflowInstanceParamShrink;

    public static SuspendWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendWorkflowInstanceShrinkRequest self = new SuspendWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SuspendWorkflowInstanceShrinkRequest setSuspendWorkflowInstanceParamShrink(String suspendWorkflowInstanceParamShrink) {
        this.suspendWorkflowInstanceParamShrink = suspendWorkflowInstanceParamShrink;
        return this;
    }
    public String getSuspendWorkflowInstanceParamShrink() {
        return this.suspendWorkflowInstanceParamShrink;
    }

}
