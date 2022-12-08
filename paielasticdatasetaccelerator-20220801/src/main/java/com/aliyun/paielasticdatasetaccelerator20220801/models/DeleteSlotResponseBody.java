// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DeleteSlotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlotResponseBody self = new DeleteSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
