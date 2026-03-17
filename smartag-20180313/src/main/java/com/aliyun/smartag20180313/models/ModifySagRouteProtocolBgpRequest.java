// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolBgpRequest extends TeaModel {
    /**
     * <p>The hold time.</p>
     * <p>Valid values: <strong>3 to 65535</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> When the SAG device establishes a peering connection with a peer device, the hold time of both devices must be the same. If the SAG device does not receive a keepalive or update message from the peer device within the hold time, the connection between the BGP peers is closed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("HoldTime")
    public Integer holdTime;

    /**
     * <p>The time interval at which keep-alive packets are sent.</p>
     * <p>Valid values: <strong>0 to 65535</strong>. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("KeepAlive")
    public Integer keepAlive;

    /**
     * <p>The autonomous system number (ASN) to which the SAG device belongs.</p>
     * <p>Valid values: <strong>1 to 4294967295</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>65535</p>
     */
    @NameInMap("LocalAs")
    public Long localAs;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
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
     * <p>The ID of the BGP router.</p>
     * <p>Set the value to an IPv4 address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.1</p>
     */
    @NameInMap("RouterId")
    public String routerId;

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
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagRouteProtocolBgpRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolBgpRequest self = new ModifySagRouteProtocolBgpRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolBgpRequest setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    public Integer getHoldTime() {
        return this.holdTime;
    }

    public ModifySagRouteProtocolBgpRequest setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    public ModifySagRouteProtocolBgpRequest setLocalAs(Long localAs) {
        this.localAs = localAs;
        return this;
    }
    public Long getLocalAs() {
        return this.localAs;
    }

    public ModifySagRouteProtocolBgpRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagRouteProtocolBgpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagRouteProtocolBgpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagRouteProtocolBgpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagRouteProtocolBgpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagRouteProtocolBgpRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ModifySagRouteProtocolBgpRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagRouteProtocolBgpRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
