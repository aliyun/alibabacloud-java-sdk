// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceResponseBody extends TeaModel {
    /**
     * <p>The order number. This parameter is returned if InstanceChargeType is set to PrePaid.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the router interface.</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    public static CreateRouterInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceResponseBody self = new CreateRouterInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateRouterInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouterInterfaceResponseBody setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
