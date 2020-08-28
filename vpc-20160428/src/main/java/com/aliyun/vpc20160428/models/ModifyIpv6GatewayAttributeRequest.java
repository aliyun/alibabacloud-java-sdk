// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewayAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyIpv6GatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewayAttributeRequest self = new ModifyIpv6GatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

}
