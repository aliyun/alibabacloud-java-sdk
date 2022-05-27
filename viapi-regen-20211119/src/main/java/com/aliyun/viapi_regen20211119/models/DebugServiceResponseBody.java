// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DebugServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DebugServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugServiceResponseBody self = new DebugServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
