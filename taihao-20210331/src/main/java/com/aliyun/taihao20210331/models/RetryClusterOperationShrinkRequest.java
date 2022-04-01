// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryClusterOperationShrinkRequest extends TeaModel {
    // retryClusterOperationParam
    @NameInMap("retryClusterOperationParam")
    public String retryClusterOperationParamShrink;

    public static RetryClusterOperationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterOperationShrinkRequest self = new RetryClusterOperationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetryClusterOperationShrinkRequest setRetryClusterOperationParamShrink(String retryClusterOperationParamShrink) {
        this.retryClusterOperationParamShrink = retryClusterOperationParamShrink;
        return this;
    }
    public String getRetryClusterOperationParamShrink() {
        return this.retryClusterOperationParamShrink;
    }

}
