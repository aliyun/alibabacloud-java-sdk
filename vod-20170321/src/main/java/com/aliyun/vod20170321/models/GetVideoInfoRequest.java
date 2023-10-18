// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoRequest extends TeaModel {
    /**
     * <p>The ID of the media file. You can use one of the following methods to obtain the ID of the file:</p>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you called to obtain an upload URL and credential.</p>
     * <p>*   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you called to query the media ID after the media file is uploaded.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoRequest self = new GetVideoInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
