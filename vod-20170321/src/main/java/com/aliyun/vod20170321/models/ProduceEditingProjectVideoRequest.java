// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoRequest extends TeaModel {
    /**
     * <p>The thumbnail URL of the online editing project.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the online editing project.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The video metadata. The value must be in JSON format. For more information about the parameter structure, see [MediaMetadata](~~52839#title_rtf_ry5\_gjp~~).</p>
     */
    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The configuration of video production. The value must be in JSON format. For more information about the parameter structure, see [ProduceConfig](~~52839#title_ybl\_7cs_y7d~~).</p>
     * <br>
     * <p>> The StorageLocation field is required if you create an online editing project in a region other than the China (Shanghai) region.</p>
     */
    @NameInMap("ProduceConfig")
    public String produceConfig;

    /**
     * <p>The ID of the online editing project. You can use one of the following methods to obtain the ID of the online editing project:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Production Center** > **Video Editing** to view the ID of the online editing project.</p>
     * <p>*   Obtain the value of ProjectId from the response to the [AddEditingProject](~~69048~~) operation.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The timeline of the online editing project. The value must be in JSON format. For more information about the parameter structure, see [Timeline](~~52839#07bc7fe0f2xuh~~).</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The title of the online editing project.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom configurations, such as the callback configuration. The value must be a JSON string. For more information about the parameter structure, see [UserData](~~86952#title_vz7\_xzs\_0c5~~).</p>
     * <br>
     * <p>> The callback configurations take effect only after you specify an HTTP URL for receiving callback notifications and select the event types in the ApsaraVideo VOD console.</p>
     */
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
