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

    public ModifyVirtualBorderRouterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Integer getVlanId() {
        return this.vlanId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public ModifyVirtualBorderRouterAttributeRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public ModifyVirtualBorderRouterAttributeRequest setMinTxInterval(Long minTxInterval) {
        this.minTxInterval = minTxInterval;
        return this;
    }
    public Long getMinTxInterval() {
        return this.minTxInterval;
    }

    public ModifyVirtualBorderRouterAttributeRequest setMinRxInterval(Long minRxInterval) {
        this.minRxInterval = minRxInterval;
        return this;
    }
    public Long getMinRxInterval() {
        return this.minRxInterval;
    }

    public ModifyVirtualBorderRouterAttributeRequest setDetectMultiplier(Long detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
        return this;
    }
    public Long getDetectMultiplier() {
        return this.detectMultiplier;
    }

    public ModifyVirtualBorderRouterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVirtualBorderRouterAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVirtualBorderRouterAttributeRequest setAssociatedPhysicalConnections(String associatedPhysicalConnections) {
        this.associatedPhysicalConnections = associatedPhysicalConnections;
        return this;
    }
    public String getAssociatedPhysicalConnections() {
        return this.associatedPhysicalConnections;
    }

    public ModifyVirtualBorderRouterAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVirtualBorderRouterAttributeRequest setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
        this.localIpv6GatewayIp = localIpv6GatewayIp;
        return this;
    }
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
        this.peerIpv6GatewayIp = peerIpv6GatewayIp;
        return this;
    }
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
        this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
        return this;
    }
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    public ModifyVirtualBorderRouterAttributeRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

}
