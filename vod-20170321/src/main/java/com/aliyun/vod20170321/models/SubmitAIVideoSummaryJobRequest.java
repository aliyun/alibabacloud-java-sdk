// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoSummaryJobRequest extends TeaModel {
    @NameInMap("AIVideoSummaryConfig")
    public String AIVideoSummaryConfig;

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

    public static SubmitAIVideoSummaryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoSummaryJobRequest self = new SubmitAIVideoSummaryJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoSummaryJobRequest setAIVideoSummaryConfig(String AIVideoSummaryConfig) {
        this.AIVideoSummaryConfig = AIVideoSummaryConfig;
        return this;
    }
    public String getAIVideoSummaryConfig() {
        return this.AIVideoSummaryConfig;
    }

    public SubmitAIVideoSummaryJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIVideoSummaryJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIVideoSummaryJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIVideoSummaryJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIVideoSummaryJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIVideoSummaryJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
