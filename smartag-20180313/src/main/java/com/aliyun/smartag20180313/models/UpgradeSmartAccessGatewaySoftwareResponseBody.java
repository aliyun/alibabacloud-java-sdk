// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewaySoftwareResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>20697688135****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97A4F8A5-603E-4C3B-A91E-17CD87090EA9</p>
     */
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
