// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

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
