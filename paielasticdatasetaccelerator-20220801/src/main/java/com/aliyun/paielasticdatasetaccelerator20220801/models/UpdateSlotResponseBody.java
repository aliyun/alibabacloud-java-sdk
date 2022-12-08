// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class UpdateSlotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlotResponseBody self = new UpdateSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
