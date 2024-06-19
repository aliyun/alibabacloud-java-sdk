// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToPrePaidResponseBody extends TeaModel {
    /**
     * <p>The time when the instance expires after the billing method of the instance is changed from pay-as-you-go to subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-18T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111111111</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>426F1356-B6EF-4DAD-A1C3-DE53B9DAF586</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformToPrePaidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformToPrePaidResponseBody self = new TransformToPrePaidResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformToPrePaidResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TransformToPrePaidResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransformToPrePaidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
