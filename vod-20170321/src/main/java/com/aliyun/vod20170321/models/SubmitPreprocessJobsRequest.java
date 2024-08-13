// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsRequest extends TeaModel {
    /**
     * <p>The preprocessing type. Set the value to <strong>LivePreprocess</strong>. LivePreprocess specifies that the video is preprocessed in the production studio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LivePreprocess</p>
     */
    @NameInMap("PreprocessType")
    public String preprocessType;

    /**
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>After you upload a video in the ApsaraVideo VOD console, you can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
     * <li>Obtain the VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload videos.</li>
     * <li>Obtain the VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you call to query videos.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d3e680e618708efbf2cae7cc9312****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitPreprocessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsRequest self = new SubmitPreprocessJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsRequest setPreprocessType(String preprocessType) {
        this.preprocessType = preprocessType;
        return this;
    }
    public String getPreprocessType() {
        return this.preprocessType;
    }

    public SubmitPreprocessJobsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
