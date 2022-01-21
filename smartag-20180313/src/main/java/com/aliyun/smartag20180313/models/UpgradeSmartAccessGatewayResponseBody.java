// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

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
