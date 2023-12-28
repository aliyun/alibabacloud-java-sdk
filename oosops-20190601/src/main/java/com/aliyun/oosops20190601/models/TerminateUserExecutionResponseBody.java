// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class TerminateUserExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TerminateUserExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateUserExecutionResponseBody self = new TerminateUserExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateUserExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
