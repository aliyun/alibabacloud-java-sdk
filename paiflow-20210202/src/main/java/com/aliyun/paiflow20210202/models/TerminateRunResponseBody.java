// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class TerminateRunResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static TerminateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateRunResponseBody self = new TerminateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
