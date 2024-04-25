// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobRequest extends TeaModel {
    /**
     * <p>The configurations of the AI job. The value is a JSON string.</p>
     * <br>
     * <p>*   If you set `Types` to `AIVideoTag`, you can specify `AnalyseTypes` for `Config` to set the analysis algorithm of a smart tagging job. Valid values:</p>
     * <br>
     * <p>    *   ASR: automatic speech recognition (ASR)</p>
     * <p>    *   OCR: image optical character recognition (OCR)</p>
     * <br>
     * <p>*   If you set `Types` to `AIMediaDNA`, you can specify `DNADBId` for `Config` to set the ID of the media fingerprint library for video fingerprinting jobs.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.</p>
     * <p>*   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload media files.</p>
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

    /**
     * <p>The type of the AI job. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **AIMediaDNA**: The media fingerprinting job.</p>
     * <p>*   **AIVideoTag**: The smart tagging job.</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The custom settings. The value is a JSON string. For more information, see [Request parameters](~~86952#h2--userdata-div-id-userdata-div-3~~).</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobRequest self = new SubmitAIJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SubmitAIJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIJobRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public SubmitAIJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
