// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6GatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    public static DeleteIpv6GatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6GatewayRequest self = new DeleteIpv6GatewayRequest();
        return TeaModel.build(map, self);
    }

}
