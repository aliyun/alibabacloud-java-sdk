// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCoverJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AIVideoCoverJobIds")
    public String AIVideoCoverJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static ListAIVideoCoverJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCoverJobRequest self = new ListAIVideoCoverJobRequest();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCoverJobRequest setAIVideoCoverJobIds(String AIVideoCoverJobIds) {
        this.AIVideoCoverJobIds = AIVideoCoverJobIds;
        return this;
    }
    public String getAIVideoCoverJobIds() {
        return this.AIVideoCoverJobIds;
    }

    public ListAIVideoCoverJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAIVideoCoverJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListAIVideoCoverJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAIVideoCoverJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
