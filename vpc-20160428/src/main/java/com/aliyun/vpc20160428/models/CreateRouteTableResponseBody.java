// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableResponseBody extends TeaModel {
    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableResponseBody self = new CreateRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteTableResponseBody setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
