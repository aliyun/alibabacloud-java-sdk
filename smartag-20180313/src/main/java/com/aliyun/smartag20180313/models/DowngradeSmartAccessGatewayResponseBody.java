// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static DowngradeSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewayResponseBody self = new DowngradeSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DowngradeSmartAccessGatewayResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
