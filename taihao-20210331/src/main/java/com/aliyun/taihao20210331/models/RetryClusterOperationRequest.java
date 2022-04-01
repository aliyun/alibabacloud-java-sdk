// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryClusterOperationRequest extends TeaModel {
    // retryClusterOperationParam
    @NameInMap("retryClusterOperationParam")
    public RetryClusterOperationParam retryClusterOperationParam;

    public static RetryClusterOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterOperationRequest self = new RetryClusterOperationRequest();
        return TeaModel.build(map, self);
    }

    public RetryClusterOperationRequest setRetryClusterOperationParam(RetryClusterOperationParam retryClusterOperationParam) {
        this.retryClusterOperationParam = retryClusterOperationParam;
        return this;
    }
    public RetryClusterOperationParam getRetryClusterOperationParam() {
        return this.retryClusterOperationParam;
    }

}
