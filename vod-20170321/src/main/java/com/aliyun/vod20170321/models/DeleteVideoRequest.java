// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoRequest extends TeaModel {
    /**
     * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified. You can obtain a video ID in one of the following ways:</p>
     * <br>
     * <p>*   If the video is uploaded by using the [ApsaraVideo VOD console](https://vod.console.aliyun.com), log on to the console and choose **Media Files** > **Audio/Video** to view the ID of the video.</p>
     * <p>*   If the video is uploaded by calling the [CreateUploadVideo](~~55407~~) operation, the video ID is the VideoId value in the response.</p>
     * <p>*   You can also call the [SearchMedia](~~86044~~) operation to obtain the video ID, which is the VideoId value in the response.</p>
     */
    @NameInMap("VideoIds")
    public String videoIds;

    public static DeleteVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoRequest self = new DeleteVideoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
