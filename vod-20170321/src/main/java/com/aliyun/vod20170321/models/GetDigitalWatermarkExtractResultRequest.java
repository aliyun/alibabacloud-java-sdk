// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDigitalWatermarkExtractResultRequest extends TeaModel {
    /**
     * <p>The type of the digital watermark. Valid values:</p>
     * <br>
     * <p>*   TraceMark: tracing watermark</p>
     * <p>*   CopyrightMark: copyright watermark</p>
     */
    @NameInMap("ExtractType")
    public String extractType;

    /**
     * <p>The ID of the job.</p>
     */
    @NameInMap("JobId")
    public String jobId;

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

    public static GetDigitalWatermarkExtractResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalWatermarkExtractResultRequest self = new GetDigitalWatermarkExtractResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDigitalWatermarkExtractResultRequest setExtractType(String extractType) {
        this.extractType = extractType;
        return this;
    }
    public String getExtractType() {
        return this.extractType;
    }

    public GetDigitalWatermarkExtractResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetDigitalWatermarkExtractResultRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetDigitalWatermarkExtractResultRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetDigitalWatermarkExtractResultRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetDigitalWatermarkExtractResultRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetDigitalWatermarkExtractResultRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
