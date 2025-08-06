// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoFaceRecogJobRequest extends TeaModel {
    @NameInMap("AIVideoFaceRecogConfig")
    public String AIVideoFaceRecogConfig;

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

    public static SubmitAIVideoFaceRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoFaceRecogJobRequest self = new SubmitAIVideoFaceRecogJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoFaceRecogJobRequest setAIVideoFaceRecogConfig(String AIVideoFaceRecogConfig) {
        this.AIVideoFaceRecogConfig = AIVideoFaceRecogConfig;
        return this;
    }
    public String getAIVideoFaceRecogConfig() {
        return this.AIVideoFaceRecogConfig;
    }

    public SubmitAIVideoFaceRecogJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIVideoFaceRecogJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIVideoFaceRecogJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIVideoFaceRecogJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIVideoFaceRecogJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIVideoFaceRecogJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
