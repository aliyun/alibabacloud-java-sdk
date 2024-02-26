// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ReloadSlotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReloadSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReloadSlotResponseBody self = new ReloadSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public ReloadSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
