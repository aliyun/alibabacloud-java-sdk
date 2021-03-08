// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("PreprocessType")
    public String preprocessType;

    public static SubmitPreprocessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsRequest self = new SubmitPreprocessJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitPreprocessJobsRequest setPreprocessType(String preprocessType) {
        this.preprocessType = preprocessType;
        return this;
    }
    public String getPreprocessType() {
        return this.preprocessType;
    }

}
