// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdatePolarDBXInstanceNodeResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolarDBXInstanceNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarDBXInstanceNodeResponseBody self = new UpdatePolarDBXInstanceNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolarDBXInstanceNodeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdatePolarDBXInstanceNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
