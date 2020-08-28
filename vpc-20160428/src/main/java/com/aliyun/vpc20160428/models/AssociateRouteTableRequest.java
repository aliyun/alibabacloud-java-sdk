// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AssociateRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableRequest self = new AssociateRouteTableRequest();
        return TeaModel.build(map, self);
    }

}
