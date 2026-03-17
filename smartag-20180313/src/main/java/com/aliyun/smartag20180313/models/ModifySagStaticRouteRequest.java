// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagStaticRouteRequest extends TeaModel {
    /**
     * <p>The destination CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.0/24</p>
     */
    @NameInMap("DestinationCidr")
    public String destinationCidr;

    /**
     * <p>The IP address of the next hop.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <p>Valid values: <strong>0</strong> indicates a physical port. <strong>1 to 4094</strong> indicates that VLANs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Vlan")
    public String vlan;

    public static ModifySagStaticRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagStaticRouteRequest self = new ModifySagStaticRouteRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagStaticRouteRequest setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
        return this;
    }
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    public ModifySagStaticRouteRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ModifySagStaticRouteRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagStaticRouteRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagStaticRouteRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public ModifySagStaticRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagStaticRouteRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagStaticRouteRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagStaticRouteRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagStaticRouteRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public ModifySagStaticRouteRequest setVlan(String vlan) {
        this.vlan = vlan;
        return this;
    }
    public String getVlan() {
        return this.vlan;
    }

}
