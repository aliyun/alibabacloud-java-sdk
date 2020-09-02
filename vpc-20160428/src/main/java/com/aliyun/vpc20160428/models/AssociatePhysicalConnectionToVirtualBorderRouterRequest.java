// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociatePhysicalConnectionToVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("VlanId")
    @Validation(required = true)
    public String vlanId;

    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    @NameInMap("PeerIpv6GatewayIp")
    public String peerIpv6GatewayIp;

    @NameInMap("PeeringIpv6SubnetMask")
    public String peeringIpv6SubnetMask;

    @NameInMap("EnableIpv6")
    public String enableIpv6;

    public static AssociatePhysicalConnectionToVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociatePhysicalConnectionToVirtualBorderRouterRequest self = new AssociatePhysicalConnectionToVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
        this.localIpv6GatewayIp = localIpv6GatewayIp;
        return this;
    }
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
        this.peerIpv6GatewayIp = peerIpv6GatewayIp;
        return this;
    }
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
        this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
        return this;
    }
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public String getEnableIpv6() {
        return this.enableIpv6;
    }

}
