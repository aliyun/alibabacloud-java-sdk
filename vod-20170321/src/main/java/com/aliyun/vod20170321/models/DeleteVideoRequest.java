// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoRequest extends TeaModel {
    /**
     * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified. You can obtain a video ID in one of the following ways:</p>
     * <ul>
     * <li>If the video is uploaded by using the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, log on to the console and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
     * <li>If the video is uploaded by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the VideoId value in the response.</li>
     * <li>You can also call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to obtain the video ID, which is the VideoId value in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
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

    public DeleteVideoRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
