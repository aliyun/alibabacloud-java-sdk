// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("AITemplateId")
    public String AITemplateId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("AIPipelineId")
    public String AIPipelineId;

    public static SubmitAIImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageJobRequest self = new SubmitAIImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIImageJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIImageJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIImageJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIImageJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitAIImageJobRequest setAITemplateId(String AITemplateId) {
        this.AITemplateId = AITemplateId;
        return this;
    }
    public String getAITemplateId() {
        return this.AITemplateId;
    }

    public SubmitAIImageJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAIImageJobRequest setAIPipelineId(String AIPipelineId) {
        this.AIPipelineId = AIPipelineId;
        return this;
    }
    public String getAIPipelineId() {
        return this.AIPipelineId;
    }

}
