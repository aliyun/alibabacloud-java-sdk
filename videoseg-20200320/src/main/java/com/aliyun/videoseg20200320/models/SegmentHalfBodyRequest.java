// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static SegmentHalfBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyRequest self = new SegmentHalfBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHalfBodyRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
