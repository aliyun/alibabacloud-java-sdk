// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderResponse extends TeaModel {
    // description: ; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: The ID of the order.; 
    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    public static CreatePhysicalConnectionSetupOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionSetupOrderResponse self = new CreatePhysicalConnectionSetupOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionSetupOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhysicalConnectionSetupOrderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreatePhysicalConnectionSetupOrderResponse setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

}
