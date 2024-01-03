// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformInstanceChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The time when the instance expires.</p>
     * <br>
     * <p>>  A value is returned for this parameter only if the instance was changed from pay-as-you-go to subscription.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformInstanceChargeTypeResponseBody self = new TransformInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformInstanceChargeTypeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TransformInstanceChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransformInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
