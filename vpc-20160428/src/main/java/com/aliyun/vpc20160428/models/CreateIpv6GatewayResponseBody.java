// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6GatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the IPv6 gateway.</p>
     */
    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IPv6 gateway belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateIpv6GatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6GatewayResponseBody self = new CreateIpv6GatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpv6GatewayResponseBody setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public CreateIpv6GatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpv6GatewayResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
