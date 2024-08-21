// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResizeRCInstanceDiskResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ResizeRCInstanceDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeRCInstanceDiskResponseBody self = new ResizeRCInstanceDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeRCInstanceDiskResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ResizeRCInstanceDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
