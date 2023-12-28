// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ResetUserExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetUserExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetUserExecutionResponseBody self = new ResetUserExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetUserExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
