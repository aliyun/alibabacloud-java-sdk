// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the audio or video file. You can specify up to 10 IDs. Separate the IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>After you upload a video in the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, you can log on to the ApsaraVideo VOD console and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to obtain the upload URL and credential.</li>
     * <li>Obtain the value of VideoId by calling the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
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
