// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class StopSlotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopSlotResponseBody self = new StopSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public StopSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
