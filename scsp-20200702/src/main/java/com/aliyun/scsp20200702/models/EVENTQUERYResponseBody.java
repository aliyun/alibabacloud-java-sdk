// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class EVENTQUERYResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static EVENTQUERYResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EVENTQUERYResponseBody self = new EVENTQUERYResponseBody();
        return TeaModel.build(map, self);
    }

    public EVENTQUERYResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
