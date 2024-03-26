// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the audio or video file. You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Media Files** > **Audio/Video** in the left-side navigation pane to view the ID.</p>
     * <p>*   View the value of the VideoId parameter returned by the [CreateUploadVideo](~~55407~~) operation that you called to upload the audio or video file.</p>
     * <p>*   After an audio or video file is uploaded, obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you call to query the audio or video ID.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static RefreshUploadVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadVideoRequest self = new RefreshUploadVideoRequest();
        return TeaModel.build(map, self);
    }

    public RefreshUploadVideoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshUploadVideoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RefreshUploadVideoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RefreshUploadVideoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
