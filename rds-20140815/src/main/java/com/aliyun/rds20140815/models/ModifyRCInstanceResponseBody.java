// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100789370230206</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF82B07-28D2-48D1-B5D6-7E78FED277C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceResponseBody self = new ModifyRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
