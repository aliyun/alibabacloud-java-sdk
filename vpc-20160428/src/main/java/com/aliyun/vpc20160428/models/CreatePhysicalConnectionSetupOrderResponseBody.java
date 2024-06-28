// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>202844382740728</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zegmc02v7ss4****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F7A6301A-64BA-41EC-8284-8F4838C15D1F</p>
     */
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
