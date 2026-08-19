// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDigitalWatermarkExtractResultRequest extends TeaModel {
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
     * <p>The ID of the watermark extraction job.</p>
     * <ul>
     * <li>The job ID is returned after you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation.</li>
     * <li>If you specify this parameter, the result of the specified watermark extraction job is returned. If you do not specify this parameter, the results of all historical watermark extraction jobs for the video are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2bf4390af9e5491c09cc720ad****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the video to query. Only a single video ID is supported. You can obtain the video ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Call the <a href="~~SearchMedia~~">SearchMedia</a> operation. The video ID (VideoId) is returned in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f6f54b6e91d24d81d4****</p>
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
