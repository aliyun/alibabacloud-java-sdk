// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>62172DD5-6BAC-45DF-8D44-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the route tables.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp145q7glnuzdvzu2****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableResponseBody self = new CreateRouteTableResponseBody();
        return TeaModel.build(map, self);
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
