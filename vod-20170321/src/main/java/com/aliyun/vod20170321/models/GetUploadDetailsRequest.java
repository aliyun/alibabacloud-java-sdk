// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsRequest extends TeaModel {
    /**
     * <p>The media IDs, which are audio or video IDs (VideoId). Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain the IDs by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential, the video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61ccbdb06fa83012be4d8083f6****,7d2fbc380b0e08e55f****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The media type. Set the value to <strong>video</strong> (audio/video).</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    public static GetUploadDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDetailsRequest self = new GetUploadDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadDetailsRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public GetUploadDetailsRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

}
