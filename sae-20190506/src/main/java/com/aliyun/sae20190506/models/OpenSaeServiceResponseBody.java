// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class OpenSaeServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenSaeServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenSaeServiceResponseBody self = new OpenSaeServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenSaeServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenSaeServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
