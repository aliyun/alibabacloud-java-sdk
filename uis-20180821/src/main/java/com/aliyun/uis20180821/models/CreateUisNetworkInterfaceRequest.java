// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisNetworkInterfaceRequest extends TeaModel {
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

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateUisNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUisNetworkInterfaceRequest self = new CreateUisNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateUisNetworkInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateUisNetworkInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateUisNetworkInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateUisNetworkInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUisNetworkInterfaceRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public CreateUisNetworkInterfaceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateUisNetworkInterfaceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateUisNetworkInterfaceRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateUisNetworkInterfaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUisNetworkInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
