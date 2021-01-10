// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNetworkInterfaceRequest extends TeaModel {
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

    @NameInMap("UisEniId")
    public String uisEniId;

    public static DeleteUisNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNetworkInterfaceRequest self = new DeleteUisNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUisNetworkInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteUisNetworkInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteUisNetworkInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteUisNetworkInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteUisNetworkInterfaceRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public DeleteUisNetworkInterfaceRequest setUisEniId(String uisEniId) {
        this.uisEniId = uisEniId;
        return this;
    }
    public String getUisEniId() {
        return this.uisEniId;
    }

}
