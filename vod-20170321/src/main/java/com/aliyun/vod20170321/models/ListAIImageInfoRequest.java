// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoRequest extends TeaModel {
    // The ID of the video. You can use one of the following methods to obtain the ID:
    // 
    // *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
    // *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.
    // *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload media files.
    @NameInMap("VideoId")
    public String videoId;

    public static ListAIImageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIImageInfoRequest self = new ListAIImageInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAIImageInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
