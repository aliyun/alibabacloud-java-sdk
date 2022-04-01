// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryClusterOperationTaskShrinkRequest extends TeaModel {
    // retryClusterOperationTaskParam
    @NameInMap("retryClusterOperationTaskParam")
    public String retryClusterOperationTaskParamShrink;

    public static RetryClusterOperationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterOperationTaskShrinkRequest self = new RetryClusterOperationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetryClusterOperationTaskShrinkRequest setRetryClusterOperationTaskParamShrink(String retryClusterOperationTaskParamShrink) {
        this.retryClusterOperationTaskParamShrink = retryClusterOperationTaskParamShrink;
        return this;
    }
    public String getRetryClusterOperationTaskParamShrink() {
        return this.retryClusterOperationTaskParamShrink;
    }

}
