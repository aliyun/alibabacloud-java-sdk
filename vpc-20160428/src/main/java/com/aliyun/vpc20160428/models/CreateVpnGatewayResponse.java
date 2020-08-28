// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static CreateVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayResponse self = new CreateVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

}
