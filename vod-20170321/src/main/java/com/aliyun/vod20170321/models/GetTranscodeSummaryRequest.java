// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the audio or video file. You can specify up to 10 IDs. Separate the IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   After you upload a video in the [ApsaraVideo VOD console](https://vod.console.aliyun.com), you can log on to the ApsaraVideo VOD console and choose **Media Files** > **Audio/Video** to view the ID of the video.</p>
     * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to obtain the upload URL and credential.</p>
     * <p>*   Obtain the value of VideoId by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.</p>
     */
    @NameInMap("VideoIds")
    public String videoIds;

    public static GetTranscodeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryRequest self = new GetTranscodeSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeSummaryRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
