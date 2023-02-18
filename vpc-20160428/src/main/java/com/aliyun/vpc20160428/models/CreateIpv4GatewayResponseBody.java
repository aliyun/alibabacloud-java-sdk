// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv4GatewayResponseBody extends TeaModel {
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateIpv4GatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv4GatewayResponseBody self = new CreateIpv4GatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpv4GatewayResponseBody setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    public CreateIpv4GatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpv4GatewayResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
