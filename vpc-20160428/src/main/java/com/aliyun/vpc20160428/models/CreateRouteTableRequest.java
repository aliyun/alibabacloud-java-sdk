// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableRequest self = new CreateRouteTableRequest();
        return TeaModel.build(map, self);
    }

}
