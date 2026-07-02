// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformInstanceChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The expiration time of the instance.</p>
     * <blockquote>
     * <p>This parameter is returned only when you change the billing method of an instance from pay-as-you-go to subscription.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-05-13T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20881824000****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82C791FB-8979-489E-853D-706D7743****</p>
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
