// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class OpenSaeServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>20485646575****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>559B4247-C41C-4D9E-B866-B55D378B****</p>
     */
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
