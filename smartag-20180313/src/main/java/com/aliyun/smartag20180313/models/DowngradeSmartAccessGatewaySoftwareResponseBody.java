// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewaySoftwareResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static DowngradeSmartAccessGatewaySoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewaySoftwareResponseBody self = new DowngradeSmartAccessGatewaySoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewaySoftwareResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DowngradeSmartAccessGatewaySoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
