// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static CreateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceResponse self = new CreateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouterInterfaceResponse setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public CreateRouterInterfaceResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
