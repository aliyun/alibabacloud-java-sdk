// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    public static CreateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableResponse self = new CreateRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteTableResponse setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
