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

}
