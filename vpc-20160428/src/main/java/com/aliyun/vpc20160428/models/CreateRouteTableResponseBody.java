// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableResponseBody extends TeaModel {
    @NameInMap("AssociateType")
    public String associateType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableResponseBody self = new CreateRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteTableResponseBody setAssociateType(String associateType) {
        this.associateType = associateType;
        return this;
    }
    public String getAssociateType() {
        return this.associateType;
    }

    public CreateRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteTableResponseBody setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
