// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryRequest extends TeaModel {
    /**
     * <p>The audio or video IDs. You can specify a maximum of 10 IDs, separated by commas (,). You can obtain the audio or video ID by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>Obtain the video ID from the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation when you request an upload URL and credential.</li>
     * <li>After the audio or video file is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId parameter in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;d4860fcc6ae9fed52e8938244****,e1db68cc586644b83e562bcd94****,hhhhhhh&quot;</p>
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
