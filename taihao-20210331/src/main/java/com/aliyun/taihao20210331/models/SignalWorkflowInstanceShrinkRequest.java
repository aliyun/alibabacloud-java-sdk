// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SignalWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("SignalWorkflowInstanceParam")
    public String signalWorkflowInstanceParamShrink;

    public static SignalWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SignalWorkflowInstanceShrinkRequest self = new SignalWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SignalWorkflowInstanceShrinkRequest setSignalWorkflowInstanceParamShrink(String signalWorkflowInstanceParamShrink) {
        this.signalWorkflowInstanceParamShrink = signalWorkflowInstanceParamShrink;
        return this;
    }
    public String getSignalWorkflowInstanceParamShrink() {
        return this.signalWorkflowInstanceParamShrink;
    }

}
