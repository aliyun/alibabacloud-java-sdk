// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosRequest extends TeaModel {
    /**
     * <p>The media asset IDs, namely the audio or video IDs (VideoId). Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain the IDs by using one of the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the ApsaraVideo VOD console and choose Media Library &gt; Audio/Video to view the audio or video IDs.</li>
     * <li>When you call the operation to obtain the upload URL and credential for an audio or video file, the ID is the value of the VideoId response parameter.</li>
     * <li>After an audio or video file is uploaded, you can call the operation to search for media asset information. The ID is the value of the VideoId response parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61ccbdb06fa83012be4d8083f6****,7d2fbc380b0e08e55f****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The custom ID list. It consists of one or more custom IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported.</p>
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
