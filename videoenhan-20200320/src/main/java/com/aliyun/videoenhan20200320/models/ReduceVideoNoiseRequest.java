// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ReduceVideoNoiseRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static ReduceVideoNoiseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReduceVideoNoiseRequest self = new ReduceVideoNoiseRequest();
        return TeaModel.build(map, self);
    }

    public ReduceVideoNoiseRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
