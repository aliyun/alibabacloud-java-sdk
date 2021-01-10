// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyDnatEntryRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UisNodeId")
    public String uisNodeId;

    @NameInMap("UisDnatId")
    public String uisDnatId;

    @NameInMap("DestinationIp")
    public String destinationIp;

    @NameInMap("DestinationPort")
    public Integer destinationPort;

    @NameInMap("OriginalIp")
    public String originalIp;

    @NameInMap("OriginalPort")
    public Integer originalPort;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("Name")
    public String name;

    public static ModifyDnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDnatEntryRequest self = new ModifyDnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDnatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDnatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDnatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDnatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDnatEntryRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public ModifyDnatEntryRequest setUisDnatId(String uisDnatId) {
        this.uisDnatId = uisDnatId;
        return this;
    }
    public String getUisDnatId() {
        return this.uisDnatId;
    }

    public ModifyDnatEntryRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public ModifyDnatEntryRequest setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    public ModifyDnatEntryRequest setOriginalIp(String originalIp) {
        this.originalIp = originalIp;
        return this;
    }
    public String getOriginalIp() {
        return this.originalIp;
    }

    public ModifyDnatEntryRequest setOriginalPort(Integer originalPort) {
        this.originalPort = originalPort;
        return this;
    }
    public Integer getOriginalPort() {
        return this.originalPort;
    }

    public ModifyDnatEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyDnatEntryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
