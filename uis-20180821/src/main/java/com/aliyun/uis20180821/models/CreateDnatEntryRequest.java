// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateDnatEntryRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UisNodeId")
    public String uisNodeId;

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

    public static CreateDnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDnatEntryRequest self = new CreateDnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDnatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDnatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDnatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDnatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDnatEntryRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public CreateDnatEntryRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public CreateDnatEntryRequest setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    public CreateDnatEntryRequest setOriginalIp(String originalIp) {
        this.originalIp = originalIp;
        return this;
    }
    public String getOriginalIp() {
        return this.originalIp;
    }

    public CreateDnatEntryRequest setOriginalPort(Integer originalPort) {
        this.originalPort = originalPort;
        return this;
    }
    public Integer getOriginalPort() {
        return this.originalPort;
    }

    public CreateDnatEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateDnatEntryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
