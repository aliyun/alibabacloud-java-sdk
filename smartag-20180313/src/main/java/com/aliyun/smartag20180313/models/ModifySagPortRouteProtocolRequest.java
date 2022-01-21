// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRouteProtocolRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PortName")
    public String portName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoteAs")
    public String remoteAs;

    @NameInMap("RemoteIp")
    public String remoteIp;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouteProtocol")
    public String routeProtocol;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    @NameInMap("Vlan")
    public String vlan;

    public static ModifySagPortRouteProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagPortRouteProtocolRequest self = new ModifySagPortRouteProtocolRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagPortRouteProtocolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagPortRouteProtocolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagPortRouteProtocolRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public ModifySagPortRouteProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagPortRouteProtocolRequest setRemoteAs(String remoteAs) {
        this.remoteAs = remoteAs;
        return this;
    }
    public String getRemoteAs() {
        return this.remoteAs;
    }

    public ModifySagPortRouteProtocolRequest setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public ModifySagPortRouteProtocolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagPortRouteProtocolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagPortRouteProtocolRequest setRouteProtocol(String routeProtocol) {
        this.routeProtocol = routeProtocol;
        return this;
    }
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    public ModifySagPortRouteProtocolRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagPortRouteProtocolRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public ModifySagPortRouteProtocolRequest setVlan(String vlan) {
        this.vlan = vlan;
        return this;
    }
    public String getVlan() {
        return this.vlan;
    }

}
