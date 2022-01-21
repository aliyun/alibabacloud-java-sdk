// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSagExpressConnectInterfaceRequest extends TeaModel {
    @NameInMap("IP")
    public String IP;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PortName")
    public String portName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    @NameInMap("Vlan")
    public String vlan;

    public static CreateSagExpressConnectInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSagExpressConnectInterfaceRequest self = new CreateSagExpressConnectInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSagExpressConnectInterfaceRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public CreateSagExpressConnectInterfaceRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public CreateSagExpressConnectInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSagExpressConnectInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSagExpressConnectInterfaceRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public CreateSagExpressConnectInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSagExpressConnectInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSagExpressConnectInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSagExpressConnectInterfaceRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public CreateSagExpressConnectInterfaceRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public CreateSagExpressConnectInterfaceRequest setVlan(String vlan) {
        this.vlan = vlan;
        return this;
    }
    public String getVlan() {
        return this.vlan;
    }

}
