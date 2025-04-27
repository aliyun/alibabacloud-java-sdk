// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AcceptRCInquiredSystemEventResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static AcceptRCInquiredSystemEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptRCInquiredSystemEventResponseBody self = new AcceptRCInquiredSystemEventResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptRCInquiredSystemEventResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AcceptRCInquiredSystemEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
