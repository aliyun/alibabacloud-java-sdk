// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoRequest extends TeaModel {
    /**
     * <p>>ApsaraVideo VOD sends a FileUploadComplete event notification after video production is complete, which is similar to the action that is performed after video upload. After the produced video is transcoded, ApsaraVideo VOD sends the StreamTranscodeComplete and TranscodeComplete event notifications.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the online editing project.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Produces a video from one or more mezzanine files. You can directly submit mezzanine files by specifying the Timeline parameter. Alternatively, you can submit mezzanine files after you create an online editing project.</p>
     */
    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>朴灵</p>
     */
    @NameInMap("ProduceConfig")
    public String produceConfig;

    /**
     * <p>The thumbnail URL of the online editing project.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the produced video.</p>
     * <br>
     * <p>> *   This operation returns the ID of the produced video in synchronous mode.</p>
     * <p>> *   If this operation returns the MediaId parameter, the video production task is being asynchronously processed.</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The metadata of the produced video, in JSON format. For more information about the structure, see [MediaMetadata](~~52839~~).</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static ProduceEditingProjectVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoRequest self = new ProduceEditingProjectVideoRequest();
        return TeaModel.build(map, self);
    }

    public ProduceEditingProjectVideoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public ProduceEditingProjectVideoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProduceEditingProjectVideoRequest setMediaMetadata(String mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    public ProduceEditingProjectVideoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ProduceEditingProjectVideoRequest setProduceConfig(String produceConfig) {
        this.produceConfig = produceConfig;
        return this;
    }
    public String getProduceConfig() {
        return this.produceConfig;
    }

    public ProduceEditingProjectVideoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProduceEditingProjectVideoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ProduceEditingProjectVideoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ProduceEditingProjectVideoRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public ProduceEditingProjectVideoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ProduceEditingProjectVideoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
