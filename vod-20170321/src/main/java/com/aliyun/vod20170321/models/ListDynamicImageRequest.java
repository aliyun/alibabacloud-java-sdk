// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageRequest extends TeaModel {
    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded by using the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the value of the VideoId response parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
     * <li>After the video is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID. The video ID is the value of the VideoId response parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e114f1100590c3193918fd449a****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static ListDynamicImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageRequest self = new ListDynamicImageRequest();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
