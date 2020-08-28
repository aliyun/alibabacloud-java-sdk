// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouteEntryName")
    public String routeEntryName;

    @NameInMap("RouteEntryId")
    @Validation(required = true)
    public String routeEntryId;

    @NameInMap("Description")
    public String description;

    public static ModifyRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteEntryRequest self = new ModifyRouteEntryRequest();
        return TeaModel.build(map, self);
    }

}
