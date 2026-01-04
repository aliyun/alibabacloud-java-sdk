// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTargetGroupResponseBody extends TeaModel {
    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8AA5CE21-2E6A-4530-BDF5-F055849476E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route target group instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rtg-xxxx</p>
     */
    @NameInMap("RouteTargetGroupId")
    public String routeTargetGroupId;

    public static CreateRouteTargetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTargetGroupResponseBody self = new CreateRouteTargetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteTargetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteTargetGroupResponseBody setRouteTargetGroupId(String routeTargetGroupId) {
        this.routeTargetGroupId = routeTargetGroupId;
        return this;
    }
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

}
