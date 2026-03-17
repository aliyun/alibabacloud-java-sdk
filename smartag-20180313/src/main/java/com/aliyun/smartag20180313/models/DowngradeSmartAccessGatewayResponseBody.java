// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>20337777855****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A6B9EB0F-57DB-4843-A372-04678ABF490E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DowngradeSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewayResponseBody self = new DowngradeSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewayResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DowngradeSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
