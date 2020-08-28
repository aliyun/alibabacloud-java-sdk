// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6GatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    public static CreateIpv6GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6GatewayResponse self = new CreateIpv6GatewayResponse();
        return TeaModel.build(map, self);
    }

}
