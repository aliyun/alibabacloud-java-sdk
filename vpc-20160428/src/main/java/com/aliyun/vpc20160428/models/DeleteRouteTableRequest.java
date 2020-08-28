// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteTableRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    public static DeleteRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteTableRequest self = new DeleteRouteTableRequest();
        return TeaModel.build(map, self);
    }

}
