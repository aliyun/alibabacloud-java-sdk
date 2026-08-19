// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoRequest extends TeaModel {
    /**
     * <p>The list of custom IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123,1234-1234</p>
     */
    @NameInMap("ReferenceIds")
    public String referenceIds;

    /**
     * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain video IDs by using the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>When you upload a video by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the value of the VideoId parameter in the response.</li>
     * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>e44ebf1147hdsa2d2adbea8b****,e44ebf11oj984adbea8****,73ab850b4f6f4b6e91d24d81d54****</p>
     */
    @NameInMap("VideoIds")
    public String videoIds;

    public static DeleteVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoRequest self = new DeleteVideoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoRequest setReferenceIds(String referenceIds) {
        this.referenceIds = referenceIds;
        return this;
    }
    public String getReferenceIds() {
        return this.referenceIds;
    }

    public DeleteVideoRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
