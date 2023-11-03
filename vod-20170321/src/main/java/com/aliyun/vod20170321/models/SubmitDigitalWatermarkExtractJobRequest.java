// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDigitalWatermarkExtractJobRequest extends TeaModel {
    /**
     * <p>The type of the digital watermark that you want to extract. Valid values:</p>
     * <br>
     * <p>*   TraceMark: tracing watermark</p>
     * <p>*   CopyrightMark: copyright watermark</p>
     */
    @NameInMap("ExtractType")
    public String extractType;

    /**
     * <p>The ID of the video file. You can query the video ID by using the ApsaraVideo VOD console or calling the SearchMedia operation.</p>
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

    public static SubmitDigitalWatermarkExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalWatermarkExtractJobRequest self = new SubmitDigitalWatermarkExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalWatermarkExtractJobRequest setExtractType(String extractType) {
        this.extractType = extractType;
        return this;
    }
    public String getExtractType() {
        return this.extractType;
    }

    public SubmitDigitalWatermarkExtractJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitDigitalWatermarkExtractJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitDigitalWatermarkExtractJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitDigitalWatermarkExtractJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitDigitalWatermarkExtractJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
