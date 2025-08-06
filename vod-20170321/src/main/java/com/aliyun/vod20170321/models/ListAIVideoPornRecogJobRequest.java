// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoPornRecogJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AIVideoPornRecogJobIds")
    public String AIVideoPornRecogJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static ListAIVideoPornRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoPornRecogJobRequest self = new ListAIVideoPornRecogJobRequest();
        return TeaModel.build(map, self);
    }

    public ListAIVideoPornRecogJobRequest setAIVideoPornRecogJobIds(String AIVideoPornRecogJobIds) {
        this.AIVideoPornRecogJobIds = AIVideoPornRecogJobIds;
        return this;
    }
    public String getAIVideoPornRecogJobIds() {
        return this.AIVideoPornRecogJobIds;
    }

    public ListAIVideoPornRecogJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAIVideoPornRecogJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListAIVideoPornRecogJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAIVideoPornRecogJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
