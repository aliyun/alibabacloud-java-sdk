// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>203384676330296</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>45F07029-1783-4B2D-B4CE-45B9EAA58440</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewayResponseBody self = new UpgradeSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewayResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpgradeSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
