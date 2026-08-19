// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDigitalWatermarkExtractJobRequest extends TeaModel {
    /**
     * <p>The type of watermark extraction. Valid values:</p>
     * <ul>
     * <li><strong>TraceMark</strong>: tracing watermark.</li>
     * <li><strong>CopyrightMark</strong>: copyright watermark.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TraceMark</p>
     */
    @NameInMap("ExtractType")
    public String extractType;

    /**
     * <p>The video ID of the video from which you want to extract the watermark. Only a single video ID is supported. You can obtain the video ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436559.html">SearchMedia</a> operation. The video ID (VideoId) is returned in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0222e203cf80f9c22870a4d2c****</p>
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
