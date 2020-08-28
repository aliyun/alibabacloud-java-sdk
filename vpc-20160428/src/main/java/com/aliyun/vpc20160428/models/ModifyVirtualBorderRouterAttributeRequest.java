// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("VlanId")
    public Integer vlanId;

    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    @NameInMap("MinTxInterval")
    public Long minTxInterval;

    @NameInMap("MinRxInterval")
    public Long minRxInterval;

    @NameInMap("DetectMultiplier")
    public Long detectMultiplier;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("AssociatedPhysicalConnections")
    public String associatedPhysicalConnections;

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

    public static ModifyVirtualBorderRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeRequest self = new ModifyVirtualBorderRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

}
