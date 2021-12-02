// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayResponseBody extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static CreateVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayResponseBody self = new CreateVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnGatewayResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnGatewayResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
