// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCensorJobRequest extends TeaModel {
    @NameInMap("AIVideoCensorConfig")
    public String AIVideoCensorConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitAIVideoCensorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCensorJobRequest self = new SubmitAIVideoCensorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCensorJobRequest setAIVideoCensorConfig(String AIVideoCensorConfig) {
        this.AIVideoCensorConfig = AIVideoCensorConfig;
        return this;
    }
    public String getAIVideoCensorConfig() {
        return this.AIVideoCensorConfig;
    }

    public SubmitAIVideoCensorJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIVideoCensorJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIVideoCensorJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIVideoCensorJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIVideoCensorJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIVideoCensorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
