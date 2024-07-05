// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsRequest extends TeaModel {
    /**
     * <p>The preprocessing type. Set the value to <strong>LivePreprocess</strong>, which indicates that the video is preprocessed in the production studio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LivePreprocess</p>
     */
    @NameInMap("PreprocessType")
    public String preprocessType;

    /**
     * <p>The ID of the video.</p>
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
