// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCElasticScalingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>264008926210869</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1F7B8B09-36F3-1165-BADB-13E376FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCElasticScalingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCElasticScalingResponseBody self = new ModifyRCElasticScalingResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCElasticScalingResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyRCElasticScalingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
