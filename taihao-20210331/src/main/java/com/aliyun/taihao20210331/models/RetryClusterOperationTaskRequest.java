// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryClusterOperationTaskRequest extends TeaModel {
    // retryClusterOperationTaskParam
    @NameInMap("retryClusterOperationTaskParam")
    public RetryClusterOperationTaskParam retryClusterOperationTaskParam;

    public static RetryClusterOperationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterOperationTaskRequest self = new RetryClusterOperationTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryClusterOperationTaskRequest setRetryClusterOperationTaskParam(RetryClusterOperationTaskParam retryClusterOperationTaskParam) {
        this.retryClusterOperationTaskParam = retryClusterOperationTaskParam;
        return this;
    }
    public RetryClusterOperationTaskParam getRetryClusterOperationTaskParam() {
        return this.retryClusterOperationTaskParam;
    }

}
