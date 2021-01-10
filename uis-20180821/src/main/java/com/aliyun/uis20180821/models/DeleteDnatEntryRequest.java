// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteDnatEntryRequest extends TeaModel {
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

    @NameInMap("UisDnatId")
    public String uisDnatId;

    public static DeleteDnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnatEntryRequest self = new DeleteDnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDnatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDnatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDnatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDnatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteDnatEntryRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public DeleteDnatEntryRequest setUisDnatId(String uisDnatId) {
        this.uisDnatId = uisDnatId;
        return this;
    }
    public String getUisDnatId() {
        return this.uisDnatId;
    }

}
