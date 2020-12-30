// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6GatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    public static CreateIpv6GatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6GatewayResponseBody self = new CreateIpv6GatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpv6GatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpv6GatewayResponseBody setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

}
