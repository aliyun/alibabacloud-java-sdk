// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RetryAgentlessTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetryAgentlessTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryAgentlessTaskResponseBody self = new RetryAgentlessTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryAgentlessTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
