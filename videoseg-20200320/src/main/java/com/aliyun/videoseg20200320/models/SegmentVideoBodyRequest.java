// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("Async")
    public Boolean async;

    public static SegmentVideoBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentVideoBodyRequest self = new SegmentVideoBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentVideoBodyRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public SegmentVideoBodyRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
