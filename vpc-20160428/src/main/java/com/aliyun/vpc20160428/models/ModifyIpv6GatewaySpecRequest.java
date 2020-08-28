// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewaySpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyIpv6GatewaySpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewaySpecRequest self = new ModifyIpv6GatewaySpecRequest();
        return TeaModel.build(map, self);
    }

}
