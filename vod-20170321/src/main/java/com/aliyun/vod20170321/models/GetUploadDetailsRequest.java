// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the media file, namely, the audio or video ID. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the audio or video ID:</p>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the audio or video ID. Use this method if the audio or video file is uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   View the value of the VideoId parameter returned by the [CreateUploadVideo](~~55407~~) operation that you called to obtain an upload URL and credential.</p>
     * <p>*   View the value of the VideoId parameter returned by the [SearchMedia](~~86044~~) operation that you called to query media information after the audio or video file is uploaded.</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The type of the media file. Set the value to **video**, which indicates audio and video files.</p>
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
