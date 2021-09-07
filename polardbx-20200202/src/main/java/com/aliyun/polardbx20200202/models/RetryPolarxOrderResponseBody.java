// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RetryPolarxOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RetryPolarxOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryPolarxOrderResponseBody self = new RetryPolarxOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryPolarxOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
