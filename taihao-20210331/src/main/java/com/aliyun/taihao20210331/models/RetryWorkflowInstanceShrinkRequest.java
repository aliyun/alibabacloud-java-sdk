// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("retryWorkflowInstanceParam")
    public String retryWorkflowInstanceParamShrink;

    public static RetryWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowInstanceShrinkRequest self = new RetryWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowInstanceShrinkRequest setRetryWorkflowInstanceParamShrink(String retryWorkflowInstanceParamShrink) {
        this.retryWorkflowInstanceParamShrink = retryWorkflowInstanceParamShrink;
        return this;
    }
    public String getRetryWorkflowInstanceParamShrink() {
        return this.retryWorkflowInstanceParamShrink;
    }

}
