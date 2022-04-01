// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class TerminateWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("terminateWorkflowInstanceParam")
    public String terminateWorkflowInstanceParamShrink;

    public static TerminateWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateWorkflowInstanceShrinkRequest self = new TerminateWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TerminateWorkflowInstanceShrinkRequest setTerminateWorkflowInstanceParamShrink(String terminateWorkflowInstanceParamShrink) {
        this.terminateWorkflowInstanceParamShrink = terminateWorkflowInstanceParamShrink;
        return this;
    }
    public String getTerminateWorkflowInstanceParamShrink() {
        return this.terminateWorkflowInstanceParamShrink;
    }

}
