// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("VbrOwnerId")
    public Long vbrOwnerId;

    @NameInMap("VlanId")
    @Validation(required = true)
    public Integer vlanId;

    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    @NameInMap("PeerIpv6GatewayIp")
    public String peerIpv6GatewayIp;

    @NameInMap("PeeringIpv6SubnetMask")
    public String peeringIpv6SubnetMask;

    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    public static CreateVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterRequest self = new CreateVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

}
