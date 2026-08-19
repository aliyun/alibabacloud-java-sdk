// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosRequest extends TeaModel {
    /**
     * <p>The media asset IDs, which are audio/video IDs (VideoId). Separate multiple IDs with commas (,). You can specify up to 20 IDs. You can obtain the IDs by using the following methods:</p>
     * <ul>
     * <li>For audio/video files uploaded through the console, log on to the ApsaraVideo VOD console and choose Media Files &gt; Audio/Video to view the audio/video IDs.</li>
     * <li>When you call the operation to obtain the upload URL and credential for audio/video files, the VideoId value is returned as a response parameter.</li>
     * <li>After an audio/video file is uploaded, you can call the SearchMedia operation to query the VideoId value in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61ccbdb06fa83012be4d8083f6****,7d2fbc380b0e08e55f****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The list of custom IDs. Separate multiple custom IDs with commas (,). You can specify up to 20 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123,1234-1234</p>
     */
    @NameInMap("ReferenceIds")
    public String referenceIds;

    public static BatchGetMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediaInfosRequest self = new BatchGetMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public BatchGetMediaInfosRequest setReferenceIds(String referenceIds) {
        this.referenceIds = referenceIds;
        return this;
    }
    public String getReferenceIds() {
        return this.referenceIds;
    }

}
