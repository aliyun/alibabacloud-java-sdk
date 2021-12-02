// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenTrafficMirrorServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenTrafficMirrorServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenTrafficMirrorServiceResponseBody self = new OpenTrafficMirrorServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenTrafficMirrorServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenTrafficMirrorServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
