// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    public static ActivateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceRequest self = new ActivateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
