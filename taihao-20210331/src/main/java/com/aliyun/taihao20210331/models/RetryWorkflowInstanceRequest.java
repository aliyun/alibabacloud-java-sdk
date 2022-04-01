// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryWorkflowInstanceRequest extends TeaModel {
    @NameInMap("retryWorkflowInstanceParam")
    public RetryWorkflowInstanceParam retryWorkflowInstanceParam;

    public static RetryWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowInstanceRequest self = new RetryWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowInstanceRequest setRetryWorkflowInstanceParam(RetryWorkflowInstanceParam retryWorkflowInstanceParam) {
        this.retryWorkflowInstanceParam = retryWorkflowInstanceParam;
        return this;
    }
    public RetryWorkflowInstanceParam getRetryWorkflowInstanceParam() {
        return this.retryWorkflowInstanceParam;
    }

}
