// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OpenOnsServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>2068689****0272</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8C5B4603-8977-4513-AB60-9C3E2F88****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenOnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenOnsServiceResponseBody self = new OpenOnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenOnsServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenOnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
