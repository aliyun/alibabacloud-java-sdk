// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCategoryJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AIVideoCategoryJobIds")
    public String AIVideoCategoryJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static ListAIVideoCategoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCategoryJobRequest self = new ListAIVideoCategoryJobRequest();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCategoryJobRequest setAIVideoCategoryJobIds(String AIVideoCategoryJobIds) {
        this.AIVideoCategoryJobIds = AIVideoCategoryJobIds;
        return this;
    }
    public String getAIVideoCategoryJobIds() {
        return this.AIVideoCategoryJobIds;
    }

    public ListAIVideoCategoryJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAIVideoCategoryJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListAIVideoCategoryJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAIVideoCategoryJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
