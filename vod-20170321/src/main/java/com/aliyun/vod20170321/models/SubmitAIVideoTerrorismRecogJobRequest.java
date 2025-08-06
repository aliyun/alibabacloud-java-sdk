// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTerrorismRecogJobRequest extends TeaModel {
    @NameInMap("AIVideoTerrorismRecogConfig")
    public String AIVideoTerrorismRecogConfig;

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

    public static SubmitAIVideoTerrorismRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTerrorismRecogJobRequest self = new SubmitAIVideoTerrorismRecogJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoTerrorismRecogJobRequest setAIVideoTerrorismRecogConfig(String AIVideoTerrorismRecogConfig) {
        this.AIVideoTerrorismRecogConfig = AIVideoTerrorismRecogConfig;
        return this;
    }
    public String getAIVideoTerrorismRecogConfig() {
        return this.AIVideoTerrorismRecogConfig;
    }

    public SubmitAIVideoTerrorismRecogJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIVideoTerrorismRecogJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIVideoTerrorismRecogJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIVideoTerrorismRecogJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIVideoTerrorismRecogJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIVideoTerrorismRecogJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
