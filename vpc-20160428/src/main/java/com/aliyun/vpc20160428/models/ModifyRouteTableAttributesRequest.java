// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesRequest extends TeaModel {
    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyRouteTableAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesRequest self = new ModifyRouteTableAttributesRequest();
        return TeaModel.build(map, self);
    }

}
