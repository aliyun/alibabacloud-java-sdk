// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentGreenScreenVideoRequest extends TeaModel {
    @NameInMap("VideoURL")
    public String videoURL;

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

}
