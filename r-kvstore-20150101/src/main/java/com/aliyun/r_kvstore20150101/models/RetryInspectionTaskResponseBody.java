// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RetryInspectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>794120D1-E0CF-4713-BAE4-EBAEA04506AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetryInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryInspectionTaskResponseBody self = new RetryInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
