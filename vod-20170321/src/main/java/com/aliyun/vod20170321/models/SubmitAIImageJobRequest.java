// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageJobRequest extends TeaModel {
    // The ID of the pipeline that is used for the AI processing job.
    // 
    // <props="china">> This parameter is optional if you have specified a default pipeline ID. If you need to submit image AI processing jobs in a batch to a specific pipeline, [submit a ticket](https://smartservice.console.aliyun.com/service/create-ticket?product=vod) to contact Alibaba Cloud technical support.</props>
    // <props="intl">> This parameter is optional if you have specified a default pipeline ID. If you need to submit image AI processing jobs in a batch to a specific pipeline, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.12672711.top-nav.ditem-sub.3cd51fa3WvRsjz#/ticket/add/?productId=1270) to contact Alibaba Cloud technical support.</props>
    @NameInMap("AIPipelineId")
    public String AIPipelineId;

    // The ID of the AI template. You can use one of the following methods to obtain the ID:
    // 
    // *   Obtain the value of TemplateId from the response to the [AddAITemplate](~~102930~~) that you call to create the template.
    // *   Obtain the value of TemplateId from the response to the [ListAITemplate](~~102936~~) operation after you create the template.
    @NameInMap("AITemplateId")
    public String AITemplateId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    // The user data.
    // 
    // *   The value must be a JSON string.
    // *   You must specify the MessageCallback or Extend parameter.
    // *   The value can contain a maximum of 512 bytes.
    // 
    // For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
    @NameInMap("UserData")
    public String userData;

    // The ID of the video. You can use one of the following methods to obtain the ID:
    // 
    // *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
    // *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload the video.
    // *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload the video.
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitAIImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageJobRequest self = new SubmitAIImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageJobRequest setAIPipelineId(String AIPipelineId) {
        this.AIPipelineId = AIPipelineId;
        return this;
    }
    public String getAIPipelineId() {
        return this.AIPipelineId;
    }

    public SubmitAIImageJobRequest setAITemplateId(String AITemplateId) {
        this.AITemplateId = AITemplateId;
        return this;
    }
    public String getAITemplateId() {
        return this.AITemplateId;
    }

    public SubmitAIImageJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIImageJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIImageJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIImageJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIImageJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAIImageJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
