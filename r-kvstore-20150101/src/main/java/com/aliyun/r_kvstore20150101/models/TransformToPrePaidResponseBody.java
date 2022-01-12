// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToPrePaidResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OrderId")
    public String orderId;

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
