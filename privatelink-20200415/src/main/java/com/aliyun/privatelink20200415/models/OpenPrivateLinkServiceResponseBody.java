// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class OpenPrivateLinkServiceResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3245****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenPrivateLinkServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenPrivateLinkServiceResponseBody self = new OpenPrivateLinkServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenPrivateLinkServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenPrivateLinkServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
