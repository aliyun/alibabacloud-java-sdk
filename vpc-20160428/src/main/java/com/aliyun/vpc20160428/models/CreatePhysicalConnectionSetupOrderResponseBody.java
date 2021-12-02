// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePhysicalConnectionSetupOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionSetupOrderResponseBody self = new CreatePhysicalConnectionSetupOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionSetupOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreatePhysicalConnectionSetupOrderResponseBody setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreatePhysicalConnectionSetupOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
