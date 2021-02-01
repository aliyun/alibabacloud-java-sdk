// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentGreenScreenVideoRequest extends TeaModel {
    // A short description of struct
    @NameInMap("VideoURL")
    public String videoURL;

    @NameInMap("Async")
    public Boolean async;

    public static SegmentGreenScreenVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentGreenScreenVideoRequest self = new SegmentGreenScreenVideoRequest();
        return TeaModel.build(map, self);
    }

    public SegmentGreenScreenVideoRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

    public SegmentGreenScreenVideoRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
