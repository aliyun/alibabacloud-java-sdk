// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewaySoftwareResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>204595234160786</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3145AF24-1A5E-4AB7-90DA-7201FDD90B8D</p>
     */
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
