// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoPornRecogJobRequest extends TeaModel {
    @NameInMap("AIVideoPornRecogConfig")
    public String AIVideoPornRecogConfig;

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

    public static SubmitAIVideoPornRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoPornRecogJobRequest self = new SubmitAIVideoPornRecogJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoPornRecogJobRequest setAIVideoPornRecogConfig(String AIVideoPornRecogConfig) {
        this.AIVideoPornRecogConfig = AIVideoPornRecogConfig;
        return this;
    }
    public String getAIVideoPornRecogConfig() {
        return this.AIVideoPornRecogConfig;
    }

    public SubmitAIVideoPornRecogJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIVideoPornRecogJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIVideoPornRecogJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIVideoPornRecogJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIVideoPornRecogJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIVideoPornRecogJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
