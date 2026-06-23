// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayResponseBody extends TeaModel {
    /**
     * <p>The name of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>MYVPN</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order ID.</p>
     * <p>&lt;props=&quot;china&quot;&gt;If you did not enable automatic payment for the VPN gateway bill, go to <a href="https://usercenter2.aliyun.com/home">Expenses and Costs</a> to complete the payment.
     * &lt;props=&quot;intl&quot;&gt;If you did not enable automatic payment for the VPN gateway bill, go to <a href="https://usercenter2-intl.aliyun.com/billing/#/account/overview">Expenses and Costs</a> to complete the payment..</p>
     * 
     * <strong>example:</strong>
     * <p>208240895400460</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB2C156A-41F8-49CC-A756-D55AFC8BFD69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The instance ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-uf68lxhgr7ftbqr3p****</p>
     */
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
