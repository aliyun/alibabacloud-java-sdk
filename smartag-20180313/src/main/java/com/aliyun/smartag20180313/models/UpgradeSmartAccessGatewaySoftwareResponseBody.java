// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewaySoftwareResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeSmartAccessGatewaySoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewaySoftwareResponseBody self = new UpgradeSmartAccessGatewaySoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewaySoftwareResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpgradeSmartAccessGatewaySoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
