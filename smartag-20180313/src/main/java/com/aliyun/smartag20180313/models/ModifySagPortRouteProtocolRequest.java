// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRouteProtocolRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortName")
    public String portName;

    /**
     * <p>The ID of the region where the Smart Access Gateway (SAG) instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The BGP autonomous system number (ASN) of the peer device.</p>
     * <blockquote>
     * <p> You must set this parameter when you enable BGP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65535</p>
     */
    @NameInMap("RemoteAs")
    public String remoteAs;

    /**
     * <p>The IP address of the peer device.</p>
     * <blockquote>
     * <p> You must set this parameter when you enable BGP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("RemoteIp")
    public String remoteIp;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The routing protocol. Valid values:</p>
     * <ul>
     * <li><strong>STATIC</strong>: uses a static routing protocol.</li>
     * <li><strong>OSPF</strong>: uses the Open Shortest Path First protocol (OSPF).</li>
     * <li><strong>BGP</strong>: uses the Border Gateway Protocol (BGP).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("RouteProtocol")
    public String routeProtocol;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-whfn****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The serial number of the SAG device associated with the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    /**
     * <p>The VLAN ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
